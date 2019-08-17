package fr.inria.diverse.ale.repl.generator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Guice;
import com.google.inject.Injector;

import fr.inria.diverse.ale.repl.Visitor2replRuntimeModule;
import fr.inria.diverse.ale.repl.visitor2repl.Help;
import fr.inria.diverse.ale.repl.visitor2repl.Instruction;
import fr.inria.diverse.ale.repl.visitor2repl.REPL;

public class AbstractSyntaxGenerator {
	
	private String ecorePath;
	private String v2rPath;
	
	private XtextResourceSet resourceSet;
	
	
	public AbstractSyntaxGenerator(String ecorePath, String v2rPath) {
		this.ecorePath = ecorePath;
		this.v2rPath = v2rPath;
	}
	
	
	/**
	 * Create a modeling project with the specified name
	 * 
	 * Remove any existing project with the same name
	 * and open the project in the current workspace after it creation
	 * @param projectName the name of the project
	 * @return the created project
	 */
	public IProject createProject(String projectName) {
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		
		IProject project = workspaceRoot.getProject(projectName);
		
		// Delete any existing project
		if (project.exists()) {
			try {
				project.delete(true, null);
			} catch (CoreException e) {
				e.printStackTrace();
				return null;
			}
		}
		
		// Create and return the new project
		try {
			project.create(null);
			project.open(null);
			
			IProjectDescription projectDescription = project.getDescription();
			projectDescription.setNatureIds(new String[] {"org.eclipse.sirius.nature.modelingproject",
					"org.eclipse.jdt.core.javanature", "org.eclipse.pde.PluginNature",
					"org.eclipse.gemoc.execution.sequential.javaxdsml.ide.ui.GemocSequentialLanguageNature"
					});
			project.setDescription(projectDescription, null);
			
			IFolder modelFolder = project.getFolder("model");
			modelFolder.create(false, true, null);	
			IFolder srcgenFolder = project.getFolder("src-gen");
			srcgenFolder.create(false, true, null);
			IFolder binFolder = project.getFolder("bin");
			binFolder.create(false, true, null);
			
			IJavaProject javaProject = JavaCore.create(project);
			
		    List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();
		    IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();
		    LibraryLocation[] locations = JavaRuntime.getLibraryLocations(vmInstall);
		    for (LibraryLocation element : locations) {
		        entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
		    } 
		    entries.add(JavaCore.newSourceEntry(javaProject.getPackageFragmentRoot(srcgenFolder).getPath()));
		    javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), null);
			
			javaProject.setOutputLocation(binFolder.getFullPath(), null);
			
			return project;
		} catch (CoreException e) {
			e.printStackTrace();
			return null;
		}
	}
	

	/**
	 * Generate a ecore file for REPL execution based on the one referenced by this instance
	 * 
	 * The necessary data is extracted from the ale file referenced in this instance
	 * @param projectName the project in which to create the file
	 * @param languageName the name of the language defined in the file
	 * @return a URI of the generated file
	 */
	public URI generateEcore(String projectName, String languageName) {
		URI ecoreUri = URI.createURI("platform:/resource" + ResourcesPlugin.getWorkspace().getRoot()
				.getFileForLocation(new Path(ecorePath)).getFullPath().toOSString());
		
		Injector injector = Guice.createInjector(new Visitor2replRuntimeModule());
		this.resourceSet = injector.getInstance(XtextResourceSet.class);
		this.resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		// Load the referenced ecore file and v2r file
		Resource ecoreResource = this.resourceSet.getResource(ecoreUri, true);
		Resource v2rResource = this.resourceSet.getResource(URI.createURI(this.v2rPath), true);
		
		REPL replTransformation = (REPL) v2rResource.getContents().get(0);
		
		// Get classifiers for repl instructions
		List<EClassifier> replClassifiers = replTransformation.getInstructions().stream()
				.map(i -> i.getClassifier()).collect(Collectors.toList());
		
		EPackage rootPackage = (EPackage) ecoreResource.getContents().get(0);
		EPackage newPackage = EcoreFactory.eINSTANCE.createEPackage();
		
		newPackage.setName(languageName.toLowerCase());
		newPackage.setNsPrefix(languageName.toLowerCase());
		String splitted[] = rootPackage.getNsURI().split("/");
		splitted[2] = splitted[2] + "/repl";
		newPackage.setNsURI(String.join("/", splitted));
		
		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;
	
		// Create the InterpretableInstruction interface
		EClass interpretableInstructionClass = ecoreFactory.createEClass();
		interpretableInstructionClass.setName("InterpretableInstruction");
		interpretableInstructionClass.setAbstract(true);
		interpretableInstructionClass.setInterface(false);
		EReference previousInstructionReference = EcoreFactory.eINSTANCE.createEReference();
		previousInstructionReference.setName("previous");
		previousInstructionReference.setLowerBound(0);
		previousInstructionReference.setUpperBound(1);
		previousInstructionReference.setEType(interpretableInstructionClass);
		previousInstructionReference.setContainment(true);
		newPackage.getEClassifiers().add(interpretableInstructionClass);
		
		// Create the Interpreter class
		EClass interpreterClass = ecoreFactory.createEClass();
		interpreterClass.setName("Interpreter");
		EReference currentInstructionReference = ecoreFactory.createEReference();
		currentInstructionReference.setName("instruction");
		currentInstructionReference.setLowerBound(0);
		currentInstructionReference.setUpperBound(1);
		currentInstructionReference.setEType(interpretableInstructionClass);
		currentInstructionReference.setContainment(false);
		interpreterClass.getEStructuralFeatures().add(currentInstructionReference);
		newPackage.getEClassifiers().add(interpreterClass);
		
		EClass helpClass = ecoreFactory.createEClass();
		helpClass.setName("Help");
		EAttribute commandAttribute = ecoreFactory.createEAttribute();
		commandAttribute.setEType(EcorePackage.Literals.ESTRING);
		helpClass.getEStructuralFeatures().add(commandAttribute);
		newPackage.getEClassifiers().add(helpClass);
		
		// Valid IDs for Help command
		int enumValue = 0;
		EEnum helpEnum = ecoreFactory.createEEnum();
		helpEnum.setName("HelpID");
		for (Instruction i : replTransformation.getInstructions()) {
			for (Help h : i.getHelp()) {
				EEnumLiteral literal = ecoreFactory.createEEnumLiteral();
				literal.setLiteral(h.getId());
				literal.setValue(enumValue++);
				helpEnum.getELiterals().add(literal);
			}
		}
		newPackage.getEClassifiers().add(helpEnum);
		
		// For each repl instruction, create a proxy
		for (EClassifier classifier : replClassifiers) {
			if (classifier instanceof EClass) {
				EClass originalClass = (EClass) classifier;
				EClass newClass = EcoreFactory.eINSTANCE.createEClass();
				newClass.setName(originalClass.getName() + "_Instruction");
				newClass.getESuperTypes().add(interpretableInstructionClass);
				EReference original = EcoreFactory.eINSTANCE.createEReference();
				original.setName("original");
				original.setEType(originalClass);
				original.setContainment(true);
				original.setLowerBound(1);
				original.setUpperBound(1);
				newClass.getEStructuralFeatures().add(original);
				newPackage.getEClassifiers().add(newClass);
			}
		}
		
		// Save the newly created ecore file
		try {
			Resource newResource = this.resourceSet.createResource(
					URI.createURI("platform:/resource/" + projectName + "/model/" + languageName + ".ecore", true));
			newResource.getContents().add(newPackage);
			newResource.save(null);
			return newResource.getURI();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	/**
	 * Create a genmodel file for the specified ecore file
	 * @param languageName the name of the language defined in the file
	 * @param projectName the project in which to create the file
	 * @param ecoreUri the uri of the ecore file
	 * @return the uri of the generated file
	 */
	public URI generateGenmodel(String languageName, String projectName, URI ecoreUri) {
		GenModel genmodel = GenModelFactory.eINSTANCE.createGenModel();
		genmodel.setComplianceLevel(GenJDKLevel.JDK80_LITERAL);
		genmodel.setModelDirectory("/" + projectName + "/src-gen");
		genmodel.getForeignModel().add(ecoreUri.toString());
		genmodel.setModelName(languageName);
		genmodel.setModelPluginID(projectName);
		genmodel.initialize(this.resourceSet.getResource(ecoreUri, true).getContents().stream()
				.map(p -> (EPackage) p).collect(Collectors.toList()));
		genmodel.getGenPackages().stream()
			.forEach(pkg -> pkg.setBasePackage(projectName.replace("." + languageName, "")));
		Resource genmodelRes = this.resourceSet.createResource(URI.createURI("platform:/resource/" + projectName
				+ "/model/" + languageName + ".genmodel"));
		genmodelRes.getContents().add(genmodel);
		try {
			genmodelRes.save(null);
			return genmodelRes.getURI();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	/**
	 * Generate model code for the specified genmodel file
	 * @param genmodelUri the uri of the genmodel file
	 */
	public void generateModelCode(URI genmodelUri) {
		GenModel genmodel = (GenModel) this.resourceSet.getResource(genmodelUri, true).getContents().get(0);
		genmodel.reconcile();
		Generator generator = new Generator();
		generator.requestInitialize();
		generator.setInput(genmodel);
		genmodel.setCanGenerate(true);
		generator.generate(genmodel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE,
				new BasicMonitor.Printing(System.out));
	}
	
	
	/**
	 * Register in the package registry the Ns URIs defined in the specified ecore file
	 * @param ecoreUri the uri of the ecore file
	 */
	public void registerNsUris(URI ecoreUri) {
		Resource ecoreResource = this.resourceSet.getResource(ecoreUri, true);
		ecoreResource.getAllContents().forEachRemaining(el -> {
			if (el instanceof EPackage) {
				String nsUri = (String) el.eGet(el.eClass().getEStructuralFeature("nsURI"));
				EPackage.Registry.INSTANCE.put(nsUri, el);
			}
		});
	}
	
	
	/**
	 * Add necessary EReferences to xtext generated repl ecore metamodel
	 * @param ecoreUri the uri og the xtext generated ecore metamodel
	 */
	public void alterEcore(URI ecoreUri) {		
		Resource ecoreResource = this.resourceSet.getResource(ecoreUri, true);
		EPackage rootPackage = (EPackage) ecoreResource.getContents().get(0);
	
		EClass interpretableInstruction = (EClass) rootPackage.getEClassifier("InterpretableInstruction");
		EClass interpreter = (EClass) rootPackage.getEClassifier("Interpreter");
		
		EReference previousReference = EcoreFactory.eINSTANCE.createEReference();
		previousReference.setName("previous");
		previousReference.setLowerBound(0);
		previousReference.setUpperBound(1);
		previousReference.setEType(interpretableInstruction);
		previousReference.setContainment(true);
		interpretableInstruction.getEStructuralFeatures().add(previousReference);
		
		EReference instructionReference = EcoreFactory.eINSTANCE.createEReference();
		instructionReference.setName("instruction");
		instructionReference.setLowerBound(0);
		instructionReference.setUpperBound(1);
		instructionReference.setEType(interpretableInstruction);
		instructionReference.setContainment(false);
		interpreter.getEStructuralFeatures().add(instructionReference);
		
		try {
			ecoreResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
}
