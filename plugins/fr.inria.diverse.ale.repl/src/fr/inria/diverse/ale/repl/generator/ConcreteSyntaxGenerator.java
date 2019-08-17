package fr.inria.diverse.ale.repl.generator;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Semaphore;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import java.util.stream.Collectors;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchesListener2;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.mwe2.launch.ui.shortcut.Mwe2LaunchShortcut;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.core.ClasspathEntry;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.pde.internal.core.plugin.WorkspacePluginModel;
import org.eclipse.pde.internal.ui.wizards.tools.UpdateClasspathJob;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.AbstractMetamodelDeclaration;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.GeneratedMetamodel;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TypeRef;
import org.eclipse.xtext.XtextFactory;
import org.eclipse.xtext.XtextRuntimeModule;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.util.XtextVersion;
import org.eclipse.xtext.xtext.wizard.LanguageDescriptor.FileExtensions;
import org.eclipse.xtext.xtext.wizard.ProjectLayout;
import org.eclipse.xtext.xtext.wizard.WizardConfiguration;
import org.eclipse.xtext.xtext.wizard.cli.CliProjectsCreator;

import com.google.common.base.Charsets;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class ConcreteSyntaxGenerator {
	
	private String xtextPath;
	private String ecorePath;

	
	public ConcreteSyntaxGenerator(String xtextPath, String ecorePath) {
		this.xtextPath = xtextPath;
		this.ecorePath = ecorePath;
	}
	
	
	/**
	 * Create a Xtext project and its subprojects for the specified language
	 * 
	 * Delete any existing project and open all the newly created ones
	 * @param modelProjectName the model project that defines the language
	 * @param projectName the name of the newly created project
	 * @param languageName the name of the language
	 * @return the newly created main xtext project
	 */
	public IProject createProject(String modelProjectName, String projectName, String languageName) {
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		String projectNames[] = new String[] {projectName, projectName + ".ide", projectName + ".ui"};
		
		// Delete any existing project
		IProject project;
		try {
			for (String currProjectName : projectNames) {
				project = workspaceRoot.getProject(currProjectName);
				if (project.exists()) {
					project.delete(true, null);
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		
		File targetLocation = new File(workspaceRoot.getLocation().toString());
		
		// Create the projects using Xtext projects creator
		WizardConfiguration conf = new WizardConfiguration();
		conf.setRootLocation(targetLocation.getPath());
		conf.getLanguage().setName(projectName + "." + languageName.substring(0, 1).toUpperCase()
				+ languageName.substring(1));
		conf.getLanguage().setFileExtensions(FileExtensions.fromString(languageName.toLowerCase()));
		conf.setXtextVersion(XtextVersion.getCurrent());
		conf.setEncoding(Charsets.UTF_8);
		conf.setBaseName(projectName);
		conf.setProjectLayout(ProjectLayout.FLAT);
		conf.getIdeProject().setEnabled(true);
		conf.getUiProject().setEnabled(true);
		
		CliProjectsCreator projectsCreator = new CliProjectsCreator();
		projectsCreator.setLineDelimiter("\n");
		projectsCreator.createProjects(conf);
		
		List<WorkspacePluginModel> pluginModels = new ArrayList<WorkspacePluginModel>();
		
		try {
			// Convert the projects to Eclipse projects and open them
			for (String currProjectName : projectNames) {				
				project = workspaceRoot.getProject(currProjectName);
				if (!project.exists()) {
					IProjectDescription projectDescription = workspaceRoot.getWorkspace()
							.newProjectDescription(currProjectName);
					projectDescription.setLocation(workspaceRoot.getLocation().append("/" + currProjectName));
					projectDescription.setNatureIds(new String[] {XtextProjectHelper.NATURE_ID,
							JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature"});
					String[] builders = new String[]{JavaCore.BUILDER_ID, "org.eclipse.pde.ManifestBuilder",
							"org.eclipse.pde.SchemaBuilder", XtextProjectHelper.BUILDER_ID};
					ICommand commands[] = new ICommand[builders.length];
					for (int i = 0; i < builders.length; i++) {
						ICommand command = projectDescription.newCommand();
						command.setBuilderName(builders[i]);
						commands[i] = command;
					}
					projectDescription.setBuildSpec(commands);
				
					project.create(projectDescription, null);
				}
				if (!project.isOpen()) {
					project.open(null);
					JavaCore.create(project).setRawClasspath(new ClasspathEntry[0], null);
					pluginModels.add(new WorkspacePluginModel(project.getFile("META-INF/MANIFEST.MF"), false));
				}
			}
			
			// Add dependency to model project and old xtext project for each
			String ecoreProjectName = ResourcesPlugin.getWorkspace().getRoot()
					.getFileForLocation(new Path(this.ecorePath)).getProject().getName();
			String oldXtextProjectName = ResourcesPlugin.getWorkspace().getRoot()
					.getFileForLocation(new Path(this.xtextPath)).getProject().getName();
			try {
				for (int i = 0; i < 3; i++) {
					IFile manifestFile = pluginModels.get(i).getFile();
					Manifest manifest = new Manifest(manifestFile.getContents());
					Attributes.Name requireBundle = new Attributes.Name("Require-Bundle");
					Attributes.Name exportPackage = new Attributes.Name("Export-Package");
					manifest.getMainAttributes().put(requireBundle,
							manifest.getMainAttributes().get(requireBundle) + "," + ecoreProjectName
							+ "," + oldXtextProjectName);
					if (i == 1) {
						manifest.getMainAttributes().put(exportPackage, projectNames[i]);
					} else if (i == 2) {
						String baseXtextProjectName = ResourcesPlugin.getWorkspace().getRoot()
								.getFileForLocation(new Path(this.xtextPath)).getProject().getName();
						manifest.getMainAttributes().put(requireBundle,
								manifest.getMainAttributes().get(requireBundle) + ","
										+ baseXtextProjectName + ".ui");
					}
					ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
					manifest.write(outputStream);
					manifestFile.setContents(new ByteArrayInputStream(outputStream.toByteArray()),
							true, false, null);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}	
			
			// Update the classpath for all the projects
			Job updateClasspath = new UpdateClasspathJob(pluginModels.toArray(new WorkspacePluginModel[0]));
			updateClasspath.schedule();
			try {
				updateClasspath.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		return workspaceRoot.getProject(projectName);
	}
	
	
	/**
	 * Generate a xtext file for REPL execution based on the one referenced by this instance
	 * @param projectName the project in which to create the file
	 * @param ecoreUri the URI to the ecore file defining the language
	 * @param languageName the name of the language
	 * @return the URI of the newly created file
	 */
	public URI createGrammar(String projectName, URI ecoreUri, String languageName) {
		Injector injector = Guice.createInjector(new XtextRuntimeModule());
		XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
		
		if (!rs.getResourceFactoryRegistry().getExtensionToFactoryMap().containsKey("ecore")) {
			rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put("ecore", new EcoreResourceFactoryImpl());
		}
		if (!rs.getResourceFactoryRegistry().getExtensionToFactoryMap().containsKey("xtext")) {
			rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put("xtext", injector.getInstance(IResourceFactory.class));
		}
		if (!IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().containsKey("xtext")) {
			IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap()
					.put("xtext", injector.getInstance(IResourceServiceProvider.class));
		}
		
		rs.getResource(URI.createURI("platform:/resource" + ResourcesPlugin.getWorkspace().getRoot()
				.getFileForLocation(new Path(ecorePath)).getFullPath().toOSString()), true);
		Resource ecoreResource = rs.getResource(ecoreUri, true);
		Resource xtextResource = rs.getResource(URI.createFileURI(this.xtextPath), true);
		EcoreUtil2.resolveAll(ecoreResource);
		EcoreUtil2.resolveAll(xtextResource);
		
		Grammar eRoot = (Grammar) xtextResource.getContents().get(0);
			
		EPackage ecoreRoot = (EPackage) ecoreResource.getContents().get(0);
		
		Grammar newRoot = XtextFactory.eINSTANCE.createGrammar();
		EList<AbstractRule> rules = newRoot.getRules();
		
		// Change the name of the grammar
		newRoot.setName(projectName + "." + languageName.substring(0, 1).toUpperCase() + languageName.substring(1));
		
		// Add extend to old grammar
		newRoot.getUsedGrammars().clear();
		newRoot.getUsedGrammars().add(eRoot);
		
		Optional<AbstractMetamodelDeclaration> oEcoreMetamodel = newRoot.getMetamodelDeclarations().stream()
				.filter(m -> (m.getAlias() != null) && m.getAlias().equals("ecore")).findFirst();
		AbstractMetamodelDeclaration ecoreMetamodel;
		if (oEcoreMetamodel.isPresent()) {
			ecoreMetamodel = oEcoreMetamodel.get();
		} else {
			ecoreMetamodel = XtextFactory.eINSTANCE.createReferencedMetamodel();
			ecoreMetamodel.setEPackage(EcorePackage.eINSTANCE);
			ecoreMetamodel.setAlias("ecore");
			newRoot.getMetamodelDeclarations().add(ecoreMetamodel);
		}
		
		GeneratedMetamodel newMetamodel = XtextFactory.eINSTANCE.createGeneratedMetamodel();
		newMetamodel.setName(languageName.toLowerCase());
		newMetamodel.setEPackage(ecoreRoot);
		newRoot.getMetamodelDeclarations().add(newMetamodel);
		
		EClass eObjectClass = (EClass) ecoreMetamodel.getEPackage().getEClassifier("EObject");
		
		// EntryPoint rule
		TypeRef entryPointType = XtextFactory.eINSTANCE.createTypeRef();
		entryPointType.setMetamodel(ecoreMetamodel);
		entryPointType.setClassifier(eObjectClass);
		
		ParserRule entryPointRule = XtextFactory.eINSTANCE.createParserRule();
		entryPointRule.setName("EntryPoint");
		entryPointRule.setType(entryPointType);
		entryPointRule.getHiddenTokens();
		rules.add(entryPointRule);
		
		Alternatives entryPointAlternatives = XtextFactory.eINSTANCE.createAlternatives();
		entryPointRule.setAlternatives(entryPointAlternatives);
		
		// InterpretableInstruction rule
		EClass interpretableInstructionClass = (EClass) ecoreRoot.getEClassifier("InterpretableInstruction");
		
		TypeRef interpretableInstructionType = XtextFactory.eINSTANCE.createTypeRef();
		interpretableInstructionType.setMetamodel(newMetamodel);
		interpretableInstructionType.setClassifier(interpretableInstructionClass);
		
		ParserRule interpretableInstructionRule = XtextFactory.eINSTANCE.createParserRule();
		interpretableInstructionRule.setName("InterpretableInstruction");
		interpretableInstructionRule.setType(interpretableInstructionType);
		interpretableInstructionRule.getHiddenTokens();
		
		Alternatives interpretableInstructionAlternatives = XtextFactory.eINSTANCE.createAlternatives();
		ecoreRoot.getEClassifiers().stream()
				.filter(c -> (c instanceof EClass)
						&& ((EClass) c).getESuperTypes().contains(interpretableInstructionClass))
				.forEach(c -> {
					Group group = XtextFactory.eINSTANCE.createGroup();
					Action action = XtextFactory.eINSTANCE.createAction();
					TypeRef type = XtextFactory.eINSTANCE.createTypeRef();
					type.setClassifier(c);
					type.setMetamodel(newMetamodel);
					action.setType(type);
					group.getElements().add(action);
					Assignment assignment = XtextFactory.eINSTANCE.createAssignment();
					assignment.setFeature("original");
					assignment.setOperator("=");
					RuleCall ruleCall = XtextFactory.eINSTANCE.createRuleCall();
					Optional<AbstractRule> rule = eRoot.getRules().stream()
							.filter(r -> r.getType().getClassifier()
									.equals(((EClass) c).getEStructuralFeatures().get(0).getEType()))
							.findFirst();
					if (rule.isPresent()) {
						ruleCall.setRule(rule.get());
					} else {
						System.err.println(c.eClass().getEReferences().get(0).getEType().getName() + " not found!");
					}
					assignment.setTerminal(ruleCall);
					group.getElements().add(assignment);
					interpretableInstructionAlternatives.getElements().add(group);
				});
		
		EEnum helpEnum = (EEnum) ecoreRoot.getEClassifiers().stream().filter(c -> c.getName().equals("HelpID"))
				.findFirst().get();
		if (helpEnum.getELiterals().size() > 0) {
			// HelpID in order to remove conflict between ID and keywords
			ParserRule helpIdRule = XtextFactory.eINSTANCE.createParserRule();
			TypeRef eStringRef = XtextFactory.eINSTANCE.createTypeRef();
			eStringRef.setClassifier(EcorePackage.Literals.ESTRING);
			eStringRef.setMetamodel(ecoreMetamodel);
			helpIdRule.setType(eStringRef);
			helpIdRule.setName("HelpID");
			rules.add(helpIdRule);
			Alternatives helpIdAlternatives = XtextFactory.eINSTANCE.createAlternatives();
			for (EEnumLiteral literal : helpEnum.getELiterals()) {
				Keyword literalKeyword = XtextFactory.eINSTANCE.createKeyword();
				literalKeyword.setValue(literal.getLiteral());
				helpIdAlternatives.getElements().add(literalKeyword);
			}
			
			if (!helpIdAlternatives.getElements().isEmpty()) {
				rules.add(helpIdRule);
			}
			
			helpIdRule.setAlternatives(helpIdAlternatives);
			
			// Help command
			Group group = XtextFactory.eINSTANCE.createGroup();
			Action action = XtextFactory.eINSTANCE.createAction();
			TypeRef type = XtextFactory.eINSTANCE.createTypeRef();
			type.setClassifier(ecoreRoot.getEClassifiers().stream().filter(c -> c.getName().equals("Help"))
					.findFirst().get());
			type.setMetamodel(newMetamodel);
			action.setType(type);
			group.getElements().add(action);
			Keyword keyword = XtextFactory.eINSTANCE.createKeyword();
			keyword.setValue("help");
			group.getElements().add(keyword);
			Assignment assignment = XtextFactory.eINSTANCE.createAssignment();
			RuleCall helpRc = XtextFactory.eINSTANCE.createRuleCall();
			helpRc.setRule(helpIdRule);
			assignment.setFeature("command");
			assignment.setOperator("=");
			assignment.setTerminal(helpRc);
			group.getElements().add(assignment);
			interpretableInstructionAlternatives.getElements().add(group);
		}
		
		
		RuleCall interpretableInstructionRuleCall = XtextFactory.eINSTANCE.createRuleCall();
		interpretableInstructionRuleCall.setRule(interpretableInstructionRule);
		interpretableInstructionRule.setAlternatives(interpretableInstructionAlternatives);
		rules.add(interpretableInstructionRule);
		
		entryPointAlternatives.getElements().add(EcoreUtil.copy(interpretableInstructionRuleCall));
		
		// Interpreter rule
		EClass interpreterClass = (EClass) ecoreRoot.getEClassifier("Interpreter");
		
		TypeRef interpreterType = XtextFactory.eINSTANCE.createTypeRef();
		interpreterType.setMetamodel(newMetamodel);
		interpreterType.setClassifier(interpreterClass);
				
		ParserRule interpreterRule = XtextFactory.eINSTANCE.createParserRule();
		interpreterRule.setName("Interpreter");
		interpreterRule.setType(interpreterType);
		interpreterRule.getHiddenTokens();
		
		Action interpreterAction = XtextFactory.eINSTANCE.createAction();
		interpreterAction.setType(EcoreUtil.copy(interpreterType));
		interpreterRule.setAlternatives(interpreterAction);
		
		rules.add(interpreterRule);
		
		RuleCall interpreterRuleCall = XtextFactory.eINSTANCE.createRuleCall();
		interpreterRuleCall.setRule(interpreterRule);
		entryPointAlternatives.getElements().add(interpreterRuleCall);
		
		// Create resource for new xtext file
		Resource newResource = rs.createResource(URI.createURI("platform:/resource/" + projectName
				+ "/src/" + projectName.replace(".", "/")
				+ "/" + languageName.substring(0, 1).toUpperCase() + languageName.substring(1) + ".xtext"));
		
		newResource.getContents().add(newRoot);
		
		// Add referencedResource to mwe2 file
		try {
			IFile mweFile = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName)
					.getFile("/src/" + projectName.replace(".", "/") + "/Generate"
					+ languageName.substring(0, 1).toUpperCase() + languageName.substring(1) + ".mwe2");
			List<String> mweLines = new BufferedReader(new InputStreamReader(mweFile.getContents()))
					.lines().collect(Collectors.toList());
			mweLines.add(mweLines.size() - 3, "\t\t\tparserGenerator = { options = { backtrack = true } }");
			mweLines.add(mweLines.size() - 3, "\t\t\treferencedResource = \"file:"
					+ this.ecorePath.replace(".ecore", ".genmodel") + "\"");
			mweFile.setContents(new ByteArrayInputStream(mweLines.stream().collect(Collectors.joining("\n"))
					.getBytes()), true, false, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		// Save the xtext resource
		try {
			newResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return newResource.getURI();
	}
			
	
	private Semaphore semaphore;
	/**
	 * Generate a grammar by running a MWE2 workflow
	 * @param projectName the project in which the grammar is defined
	 * @param languageName the name of the language that the grammar defines
	 * @return the URI of the generated ecore metamodel from the grammar
	 */
	public URI generateGrammar(String projectName, String languageName) {
		String upperLanguageName = languageName.substring(0, 1).toUpperCase() + languageName.substring(1);
		this.semaphore = new Semaphore(0);		
		// Launch the MWE2 workflow (needs to be done in UI thread)
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				new Mwe2LaunchShortcut().launch(new StructuredSelection(ResourcesPlugin.getWorkspace().getRoot()
						.getFile(new Path(projectName + "/src/" + projectName.replace(".", "/") + "/Generate"
								+ languageName.substring(0, 1).toUpperCase() + languageName.substring(1)
								+ ".mwe2"))), "run");
				semaphore.release();
			}
		});
		try {
			semaphore.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		DebugPlugin.getDefault().getLaunchManager().addLaunchListener(new ILaunchesListener2() {
			@Override
			public void launchesRemoved(ILaunch[] launches) {}
			
			@Override
			public void launchesChanged(ILaunch[] launches) {}
			
			@Override
			public void launchesAdded(ILaunch[] launches) {}
			
			@Override
			public void launchesTerminated(ILaunch[] launches) {
				// Set the global scoping after the workflow ends
				if (Arrays.stream(launches).anyMatch(l -> l.getLaunchConfiguration()
						.getName().startsWith("Generate" + upperLanguageName + ".mwe2"))) {
					try {
						IProject xtextProject =
								ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
						xtextProject.refreshLocal(IResource.DEPTH_INFINITE, null);
					} catch (CoreException e) {
						e.printStackTrace();
					}
					DebugPlugin.getDefault().getLaunchManager().removeLaunchListener(this);
					semaphore.release();
				}
			}
		});
		try {
			semaphore.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
			return null;
		}
		return URI.createURI("platform:/resource/" + projectName + "/model/generated/"
				+ languageName.substring(0, 1).toUpperCase() + languageName.substring(1) + ".ecore");
	}
	
	
	/**
	 * Create scope provider for root REPL elements
	 * @param projectName the name of the xtext project
	 * @param languageName the name of the language
	 */
	public void createScope(String projectName, String languageName) {
		String upperLanguageName = languageName.substring(0, 1).toUpperCase() + languageName.substring(1);
		String fileContent = String.join("\n",
				"package " + projectName + ".scoping",
				"",
				"import org.eclipse.emf.ecore.EObject", 
				"import org.eclipse.emf.ecore.EReference", 
				"import org.eclipse.xtext.scoping.IScope",
				"import org.eclipse.xtext.scoping.Scopes",
				"import java.util.Collections",
				"",
				"class " + upperLanguageName + "ScopeProvider extends Abstract" + upperLanguageName
						+ "ScopeProvider {",
				"	override getScope(EObject context, EReference reference) {",
				"		var baseScope = super.getScope(context, reference)",
				"		var interpreterScope = scopeForInterpretableInstruction(context)",
				"		",
				"		return Scopes.scopeFor(baseScope.allElements.map[it.EObjectOrProxy], interpreterScope)",
				"	}",
				"	",
				"	def protected IScope scopeForInterpretableInstruction(EObject context) {",
				"		if (context.eClass.EAllSuperTypes.exists[it.name.equals(\"InterpretableInstruction\")]) {",
				"			var previous = context.eGet(context.eClass.getEStructuralFeature(\"previous\")) "
						+ "as EObject",
				"			if (previous === null) {",
				"				return IScope.NULLSCOPE",
				"			}",
				"			return Scopes.scopeFor(",
				"					Collections.singleton(",
				"							previous.eGet(previous.eClass.getEStructuralFeature(\"original\")) "
						+ "as EObject),",
				"					scopeForInterpretableInstruction(previous))",
				"		}",
				"		if (context.eContainer === null) {",
				"			return IScope.NULLSCOPE",
				"		}",
				"		return scopeForInterpretableInstruction(context.eContainer)",
				"	}",
				"}"
				);
		
		IFile scopeFile = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName)
				.getFile("src/" + projectName.replace(".", "/") + "/scoping/"
						+ upperLanguageName + "ScopeProvider.xtend");
		try {
			scopeFile.setContents(new ByteArrayInputStream(fileContent.getBytes()), true, false, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
	}
		
}
