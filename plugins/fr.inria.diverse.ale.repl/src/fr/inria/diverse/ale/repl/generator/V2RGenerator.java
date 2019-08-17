package fr.inria.diverse.ale.repl.generator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecoretools.AleRuntimeModule;
import org.eclipse.emf.ecoretools.ale.ALEInterpreter;
import org.eclipse.emf.ecoretools.ale.AleFactory;
import org.eclipse.emf.ecoretools.ale.Attribute;
import org.eclipse.emf.ecoretools.ale.BehavioredClass;
import org.eclipse.emf.ecoretools.ale.Call;
import org.eclipse.emf.ecoretools.ale.ClassifierType;
import org.eclipse.emf.ecoretools.ale.Expression;
import org.eclipse.emf.ecoretools.ale.Feature;
import org.eclipse.emf.ecoretools.ale.Operation;
import org.eclipse.emf.ecoretools.ale.Unit;
import org.eclipse.emf.ecoretools.ale.VarRef;
import org.eclipse.emf.ecoretools.ale.core.parser.Dsl;
import org.eclipse.emf.ecoretools.ale.core.parser.DslBuilder;
import org.eclipse.emf.ecoretools.ale.core.parser.visitor.ParseResult;
import org.eclipse.emf.ecoretools.ale.implementation.ExtendedClass;
import org.eclipse.emf.ecoretools.ale.implementation.Method;
import org.eclipse.emf.ecoretools.ale.implementation.ModelUnit;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parsetree.reconstr.ICommentAssociater;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Guice;
import com.google.inject.Injector;

import fr.inria.diverse.ale.repl.Visitor2replRuntimeModule;
import fr.inria.diverse.ale.repl.visitor2repl.Help;
import fr.inria.diverse.ale.repl.visitor2repl.Instruction;
import fr.inria.diverse.ale.repl.visitor2repl.Interpreter;
import fr.inria.diverse.ale.repl.visitor2repl.Model;
import fr.inria.diverse.ale.repl.visitor2repl.REPL;
import fr.inria.diverse.ale.repl.visitor2repl.Visitor2replFactory;

public class V2RGenerator {

	private String languageName;
	private String ecorePath;
	private String alePath;
	
	
	public V2RGenerator(String languageName, String ecorePath, String alePath) {
		this.languageName = languageName;
		this.ecorePath = ecorePath;
		this.alePath = alePath;
	}
	
	public URI generateV2R(String v2rPath) {
		URI ecoreUri = URI.createURI("platform:/resource" + ResourcesPlugin.getWorkspace()
				.getRoot().getFileForLocation(new Path(this.ecorePath)).getFullPath().toString());
		URI aleUri = URI.createURI("platform:/resource" + ResourcesPlugin.getWorkspace()
				.getRoot().getFileForLocation(new Path(this.alePath)).getFullPath().toString());
		
		ALEInterpreter interpreter = new ALEInterpreter();
		Dsl environment = new Dsl(Arrays.asList(ecoreUri.toString()), Arrays.asList(alePath));	
		
		Injector aleInjector = Guice.createInjector(new AleRuntimeModule());
		XtextResourceSet resourceSet = aleInjector.getInstance(XtextResourceSet.class);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",
				new EcoreResourceFactoryImpl());
		
		// Load the referenced ecore and ale files
		List<ParseResult<ModelUnit>> parsedSemantics = new DslBuilder(interpreter.getQueryEnvironment(),
				resourceSet).parse(environment);
		Resource ecoreResource = resourceSet.getResource(ecoreUri, true);
		Resource aleResource = resourceSet.getResource(aleUri, true);
		
		Unit unit = (Unit) aleResource.getContents().get(0);
		
		// List methods annotated with the `@repl` tag in the referenced ale file
		List<Method> steps = parsedSemantics.get(0).getRoot().eContents().stream()
			.flatMap(obj -> obj.eContents().stream())
			.filter(met -> (met instanceof Method)
					&& ((Method) met).getTags().stream().anyMatch(t -> t.startsWith("repl")))
			.map(met -> (Method) met).collect(Collectors.toList());
		
		// Store all ecore packages
		List<EPackage> ecorePackages = new ArrayList<>();
		ecoreResource.getAllContents().forEachRemaining(el -> {
			if (el instanceof EPackage) {
				ecorePackages.add((EPackage) el);
			}
		});
		Model v2rModel = Visitor2replFactory.eINSTANCE.createModel();
		v2rModel.setImportURI(ecoreUri.toString());
			
		// Find the class that contains the init method
		BehavioredClass entryPointClass = unit.getXtendedClasses().stream()
				.filter(c -> c.getOperations().stream()
						.anyMatch(o -> o.getTag().stream()
								.anyMatch(t -> t.getName().equals("init")))).findFirst().get();
		
		// Store attributes and init method of entrypoint
		Operation initMethod = entryPointClass.getOperations().stream()
				.filter(m -> m.getTag().stream().anyMatch(t -> t.getName().equals("init")))
				.findFirst().get();
		Operation initMethodCopy = EcoreUtil.copy(initMethod);
		initMethodCopy.getTag().clear();
		List<Attribute> attributes = entryPointClass.getAttributes();
		Interpreter v2rInterpreter = Visitor2replFactory.eINSTANCE.createInterpreter();
		v2rInterpreter.setName(this.languageName + "_repl");
		v2rInterpreter.getAttributes().addAll(EcoreUtil.copyAll(attributes));
		v2rInterpreter.setInitMethod(initMethodCopy);
		
		List<Instruction> instructions = new ArrayList<>();
		steps.stream().forEach(m -> {
			Instruction v2rInstruction = Visitor2replFactory.eINSTANCE.createInstruction();
			ExtendedClass aleExtendedClass = (ExtendedClass) m.eContainer();
			EClassifier aleEcoreClass = aleExtendedClass.getBaseClass();
			EClassifier actualEcoreClass = ecorePackages.stream()
					.filter(p -> p.getNsPrefix().equals(aleEcoreClass.getEPackage().getNsPrefix())).findFirst()
					.get().getEClassifier(aleEcoreClass.getName());
			v2rInstruction.setClassifier(actualEcoreClass);
			
			BehavioredClass actualAleClass = unit.getXtendedClasses().stream()
					.filter(c -> c.getName().equals(aleExtendedClass.getName())).findFirst().get();
			ICommentAssociater commentAssociater = aleInjector.getInstance(ICommentAssociater.class);
			Map<ILeafNode, EObject> comments = commentAssociater.associateCommentsWithSemanticEObjects(
					actualAleClass, Collections.singleton(NodeModelUtils.getNode(actualAleClass)));
			comments.keySet().forEach(commentNode -> {
				String comment = commentNode.getText();
				if (comment.startsWith("/**\n")) {
					comment = comment.substring(4, comment.length() - 2);
					String helpComments[] = comment.split("\\* ");
					for (String helpComment : helpComments) {
						String helpCommentSplitted[] = helpComment.trim().split(":", 2);
						if (helpCommentSplitted.length == 2) {
							Help help = Visitor2replFactory.eINSTANCE.createHelp();
							help.setId(helpCommentSplitted[0]);
							help.setMessage(helpCommentSplitted[1].trim().replaceAll("'", ""));
							v2rInstruction.getHelp().add(help);
						}
					}
				}
			});
			
			v2rInstruction.setEvalMethod(m.getOperationRef().getName());
			Map<String, Expression> actualParameters = new HashMap<>();
			// Find parameters from the attributes of Interpreter
			for (EParameter formalParameter : m.getOperationRef().getEParameters()) {
				Attribute attribute = v2rInterpreter.getAttributes().stream()
						.filter(a -> ((ClassifierType) a.getType()).getClassName()
								.equals(formalParameter.getEType().getName()))
						.findFirst().get();
				Feature attributeRef = AleFactory.eINSTANCE.createFeature();
				VarRef interpreterRef = AleFactory.eINSTANCE.createVarRef();
				interpreterRef.setID(v2rInterpreter.getName());
				attributeRef.setTarget(interpreterRef);
				attributeRef.setFeature(attribute.getName());
				v2rInstruction.getEvalParams().add(attributeRef);
				actualParameters.put(formalParameter.getName(), attributeRef);
			}
			instructions.add(v2rInstruction);
			
			String splittedTag[] = m.getTags().stream()
					.filter(t -> t.startsWith("repl")).findFirst().get().split("__");
			
			if (splittedTag.length > 1) {
				Call call = AleFactory.eINSTANCE.createCall();
				call.setName(splittedTag[splittedTag.length-1]);
				Feature feature = null;
				for (int i = splittedTag.length-2; i > 1; i--) {
					Feature previousFeature = (feature != null) ? feature : null;
					feature = AleFactory.eINSTANCE.createFeature();
					feature.setFeature(splittedTag[i]);
					if (previousFeature != null) {
						previousFeature.setTarget(feature);
					} else {
						call.setTarget(feature);
					}
				}
				
				if (splittedTag[1].equals("output")) {
					VarRef outputRef = AleFactory.eINSTANCE.createVarRef();
					outputRef.setID("output");
					if (feature != null) {
						feature.setTarget(outputRef);
					} else {
						call.setTarget(outputRef);
					}
				} else if (actualParameters.containsKey(splittedTag[1])) {
					if (feature != null) {
						feature.setTarget(EcoreUtil.copy(actualParameters.get(splittedTag[1])));
					} else {
						call.setTarget(EcoreUtil.copy(actualParameters.get(splittedTag[1])));
					}
				}
				v2rInstruction.setEvalResult(call);
			}
		});
		
		Injector injector = Guice.createInjector(new Visitor2replRuntimeModule());
		if (!resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().containsKey("v2r")) {
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("v2r",
					injector.getInstance(IResourceFactory.class));
		}
		if (!IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().containsKey("v2r")) {
			IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("v2r",
					injector.getInstance(IResourceServiceProvider.class));
		}
		
		Resource v2rResource =
				resourceSet.createResource(URI.createFileURI(v2rPath));
		
		REPL v2rTransformation = Visitor2replFactory.eINSTANCE.createREPL();
		v2rTransformation.setInterpreter(v2rInterpreter);
		v2rTransformation.getModel().add(v2rModel);
		v2rTransformation.getInstructions().addAll(instructions);
		v2rResource.getContents().add(v2rTransformation);
		
		try {
			v2rResource.save(null);
			ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(v2rPath))
					.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (IOException | CoreException e) {
			e.printStackTrace();
		}
		
		return v2rResource.getURI();
	}
	
}
