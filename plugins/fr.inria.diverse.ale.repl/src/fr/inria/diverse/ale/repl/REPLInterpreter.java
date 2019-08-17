package fr.inria.diverse.ale.repl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecoretools.ale.ALEInterpreter;
import org.eclipse.emf.ecoretools.ale.core.parser.Dsl;
import org.eclipse.emf.ecoretools.ale.core.parser.DslBuilder;
import org.eclipse.emf.ecoretools.ale.core.parser.visitor.ParseResult;
import org.eclipse.emf.ecoretools.ale.implementation.ExtendedClass;
import org.eclipse.emf.ecoretools.ale.implementation.Method;
import org.eclipse.emf.ecoretools.ale.implementation.ModelUnit;
import org.eclipse.sirius.common.tools.api.resource.ResourceSetFactory;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.Issue;

public class REPLInterpreter {
	
	private Dsl environment;
	private String xtextExtension;
	private EObject caller;
	
	private ALEInterpreter interpreter;
	
	private LinkedList<String> modelHistory;
	private LinkedList<String> outputHistory;
	
	private String output;
	private String errors;
	
	private ResourceSetFactory resourceSetFactory;
	private ResourceSet mainResourceSet;
	private Resource mainResource;
	private List<ParseResult<ModelUnit>> parsedSemantics;
	
	private Pattern outputHistoryPattern;
	
	
	public REPLInterpreter(Dsl environment, String xtextExtension) {		
		this.environment = environment;
		this.xtextExtension = xtextExtension;
		
		this.output = "";
		this.errors = "";
		
		this.modelHistory = new LinkedList<>();
		this.outputHistory = new LinkedList<>();
		
		this.outputHistoryPattern = Pattern.compile("^([0-9]+).*$");
		
		this.init();
	}
	
	
	public REPLInterpreter(String ecorePath, String alePath, String xtextExtension) {
		this(new Dsl(Arrays.asList(URI.createFileURI(ecorePath).toString()),
				Arrays.asList(alePath)), xtextExtension);	
	}
	
	
	public String getModelHistory(int index) {
		return this.modelHistory.get(index);
	}
	
	
	public int getModelHistorySize() {
		return this.modelHistory.size();
	}
	
	
	public String getOutput() {
		return this.output;
	}
	
	
	public String getErrors() {
		return this.errors;
	}
	
	
	private void init() {		
		this.interpreter = new ALEInterpreter();
		
		URI modelUri = URI.createURI("dummy:/interpreter." + this.xtextExtension);
		
		// Factory to get resource sets for the models
		this.resourceSetFactory = ResourceSetFactory.createFactory();
		this.mainResourceSet = this.resourceSetFactory.createResourceSet(modelUri);
		this.mainResourceSet.getLoadOptions().put("org.eclipse.xtext.scoping.LIVE_SCOPE", false);

		this.mainResource = this.mainResourceSet.createResource(modelUri);
		try {
			// Load an empty model to initialize the engine
			this.mainResource.load(new ByteArrayInputStream(new byte[] {}), this.mainResourceSet.getLoadOptions());
		} catch (IOException e1) {
			e1.printStackTrace();
			return;
		}	
		
		this.caller = this.mainResource.getContents().get(0);
		this.parsedSemantics = new DslBuilder(this.interpreter.getQueryEnvironment(), this.mainResourceSet)
				.parse(this.environment);
		
		// Search the root class in the parsed semantics
		List<ExtendedClass> classes = this.parsedSemantics.stream().map(p -> p.getRoot()).filter(e -> e != null)
				.flatMap(unit -> unit.getClassExtensions().stream())
				.filter(ext -> ext.getBaseClass().getName().equals(caller.eClass().getName()))
				.collect(Collectors.toList());
		
		// Get the 'init' tagged method
		Optional<Method> init = classes.stream().flatMap(cls -> cls.getMethods().stream())
				.filter(mtd -> mtd.getTags().contains("init")).findFirst();

		// If not found, get the 'init' tagged method from parents
		List<ExtendedClass> classExtends = classes;
		while (!init.isPresent() && classExtends.size() > 0) {
			classExtends = classExtends.stream().flatMap(cls -> cls.getExtends().stream())
					.collect(Collectors.toList());
			if (!init.isPresent()) {
				init = classExtends.stream().flatMap(cls -> cls.getMethods().stream())
						.filter(mtd -> mtd.getTags().contains("init")).findFirst();
			}
		}
		
		// Eval the init method
		this.interpreter.eval(caller, init.get(), Arrays.asList(), this.parsedSemantics);
	}
	
	
	public boolean interpret(String model) {
		this.output = "";
		this.errors = "";
		
		this.modelHistory.addFirst(model);
		
		String splittedModel[] = model.split("\\$");
		for (int i = 1; i < splittedModel.length; i++) {
			Matcher matcher = this.outputHistoryPattern.matcher(splittedModel[i]);
			if (matcher.find()) {				
				int wantedOutput = Integer.parseInt(matcher.group(1));
				if (wantedOutput > 0 && wantedOutput <= this.outputHistory.size()) {
					model = model.replace("$" + wantedOutput, this.outputHistory.get(wantedOutput - 1));
				}
			}
		}
		
		// New resource set for the model to interpret
		URI modelUri = URI.createURI("dummy:/instruction." + this.xtextExtension);
		
		Resource resource = this.mainResourceSet.createResource(modelUri);
		try {
			// Load the complete model after adding the model given as parameter
			resource.load(new ByteArrayInputStream(model.getBytes()), this.mainResourceSet.getLoadOptions());
		} catch (IOException e1) {
			e1.printStackTrace();
			return false;
		}
		
		// Print parsing errors before resolution and exit if any
		if (resource.getErrors().size() > 0) {
			for (Diagnostic error : resource.getErrors()) {				
				this.errors += error;
			}
			this.mainResourceSet.getResources().remove(resource);
			return false;
		}
		
		// Check that the parsed model is actually an instruction
		if (!resource.getContents().get(0).eClass().getEAllSuperTypes()
				.stream().anyMatch(c -> c.getName().equals("InterpretableInstruction"))) {
			this.mainResourceSet.getResources().remove(resource);
			return false;
		}
		
		EObject newInstruction = resource.getContents().get(0);
		
		// Set history before resolving proxies
		EStructuralFeature instructionFeature = this.caller.eClass().getEStructuralFeature("instruction");
		EStructuralFeature previousFeature = newInstruction.eClass().getEStructuralFeature("previous");
		if (newInstruction != null) {
			newInstruction.eSet(previousFeature, this.caller.eGet(instructionFeature));
		}
		EcoreUtil2.resolveAll(resource);
		
		// Validate the resource
		List<Issue> validationErrors = ((XtextResource) resource).getResourceServiceProvider()
				.getResourceValidator().validate(resource, CheckMode.ALL, null).stream()
				.filter(i -> i.getSeverity().equals(Severity.ERROR)).collect(Collectors.toList());
			
		// Print parsing errors after resolution and exit if any
		if (resource.getErrors().size() > 0) {
			for (Diagnostic error : resource.getErrors()) {				
				this.errors += error;
			}
			this.mainResourceSet.getResources().remove(resource);
			return false;
		}
		
		// Print validation errors if any
		if (!validationErrors.isEmpty()) {
			for (Issue issue : validationErrors) {
				if (!this.errors.contains(issue.getMessage()))
					this.errors += issue.getMessage();
			}
			this.mainResourceSet.getResources().remove(resource);
			return false;
		}
		
		// Get the caller from the main resource
		this.caller.eSet(instructionFeature, resource.getContents().get(0));
		
		// Search the root class in the parsed semantics
		List<ExtendedClass> classes = this.parsedSemantics.stream().map(p -> p.getRoot()).filter(e -> e != null)
				.flatMap(unit -> unit.getClassExtensions().stream())
				.filter(ext -> ext.getBaseClass().getName().equals(this.caller.eClass().getName()))
				.collect(Collectors.toList());
				
		// Get the 'main' tagged method
		Optional<Method> main = classes.stream().flatMap(cls -> cls.getMethods().stream())
				.filter(mtd -> mtd.getTags().contains("main")).findFirst();
	
		// If not found, get the 'main' tagged method from parents
		List<ExtendedClass> classExtends = classes;
		while (!main.isPresent() && classExtends.size() > 0) {
			classExtends = classExtends.stream().flatMap(cls -> cls.getExtends().stream())
					.collect(Collectors.toList());
			if (!main.isPresent()) {
			main = classExtends.stream().flatMap(cls -> cls.getMethods().stream())
					.filter(mtd -> mtd.getTags().contains("main")).findFirst();
			}
		}
		
		PrintStream stdOut = System.out;
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));
		
		// Eval the main method
		this.interpreter.getCurrentEngine().eval(this.caller, main.get(), Arrays.asList());
		this.output = outputStream.toString().trim();
		this.outputHistory.addFirst(this.output);
		
		this.mainResourceSet.getResources().remove(resource);
		System.out.flush();
		System.setOut(stdOut);
		
		return true;
	}

}
