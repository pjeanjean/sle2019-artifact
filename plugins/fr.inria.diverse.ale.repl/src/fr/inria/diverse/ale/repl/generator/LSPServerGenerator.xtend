package fr.inria.diverse.ale.repl.generator

import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.xtext.ui.XtextProjectHelper
import org.eclipse.jdt.core.JavaCore
import java.io.File
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.Path
import java.io.ByteArrayInputStream
import org.eclipse.jdt.launching.JavaRuntime
import org.eclipse.pde.internal.core.plugin.WorkspacePluginModel
import org.eclipse.pde.internal.ui.wizards.tools.UpdateClasspathJob

class LSPServerGenerator {
	
	var xtextBasePackage = ""
	var languageName = ""
	var languageNamePkg = ""
	
	
	new(String xtextBasePackage, String languageName) {
		this.xtextBasePackage = xtextBasePackage
		this.languageName = languageName.substring(0, 1).toUpperCase + languageName.substring(1)
		this.languageNamePkg = languageName.substring(0, 1).toUpperCase + languageName.substring(1).toLowerCase
	}
	
	
	def generateProject() {	
		val workspaceRoot = ResourcesPlugin.getWorkspace().getRoot()
		val projectName = xtextBasePackage + ".server"
		
		val project = workspaceRoot.getProject(projectName)
		if (project.exists()) {
			try {
				project.delete(true, null)
			} catch (CoreException e) {
				e.printStackTrace()
			}
		}
		
		try {
			val projectDescription = workspaceRoot.workspace.newProjectDescription(projectName)
			projectDescription.setNatureIds(#{XtextProjectHelper.NATURE_ID, JavaCore.NATURE_ID,
				"org.eclipse.pde.PluginNature"
			})
			val builders = #{JavaCore.BUILDER_ID, "org.eclipse.pde.ManifestBuilder"}			
			val commands = newArrayList;
			for (builder : builders) {
				val command = projectDescription.newCommand();
				command.setBuilderName(builder);
				commands.add(command);
			}
			projectDescription.setBuildSpec(commands);
			
			project.create(projectDescription, null)
			
			if (!project.open) {
				project.open(null)
			}
			
			val srcFolder = project.getFolder("src");
			srcFolder.create(false, true, null);
			
			val javaProject = JavaCore.create(project)
			
		    val entries = newArrayList
		    val vmInstall = JavaRuntime.getDefaultVMInstall()
		    val locations = JavaRuntime.getLibraryLocations(vmInstall)
		    for (element : locations) {
		        entries.add(JavaCore.newLibraryEntry(element.systemLibraryPath, null, null))
		    }
		    entries.add(JavaCore.newSourceEntry(javaProject.getPackageFragmentRoot(srcFolder).getPath()))
			javaProject.setRawClasspath(entries, null)
			
			generateManifest(projectName)
			generateProjectXml(projectName)
			
			val updateClasspath = new UpdateClasspathJob(
					#{new WorkspacePluginModel(project.getFile("META-INF/MANIFEST.MF"), false)})
			updateClasspath.schedule
			updateClasspath.join
		} catch (CoreException e) {
			e.printStackTrace
			return null
		}
		
		return workspaceRoot.getProject(projectName)
	}
	
	
	def generateManifest(String projectName) {
		val content = '''
			Manifest-Version: 1.0
			Bundle-ManifestVersion: 2
			Bundle-Name: «xtextBasePackage».server
			Bundle-SymbolicName: «xtextBasePackage».server; singleton:=true
			Bundle-Version: 1.0.0
			Automatic-Module-Name: «xtextBasePackage».server
			Bundle-RequiredExecutionEnvironment: JavaSE-1.8
			Require-Bundle: com.google.inject,
			 fr.inria.diverse.ale.repl,
			 org.eclipse.lsp4j,
			 org.eclipse.lsp4j.jsonrpc,
			 org.eclipse.xtext.ide,
			 «xtextBasePackage»,
			 «xtextBasePackage».ide
		'''
		
		val metaInf = ResourcesPlugin.workspace.root.getProject(projectName).getFolder("META-INF")
		metaInf.create(false, true, null)
		metaInf.getFile("MANIFEST.MF").create(new ByteArrayInputStream(content.bytes), true, null)
	}
	
	
	def generateProjectXml(String projectName) {
		val content = '''
			<?xml version="1.0" encoding="UTF-8"?>
			<?eclipse version="3.4"?>
			<plugin>
			   <extension
			         point="fr.inria.diverse.ale.repl.lsp">
			      <server
			            class="«xtextBasePackage».server.«languageName»LspServer"
			            languageName="«languageName»">
			      </server>
			   </extension>
			</plugin>
		'''
		
		ResourcesPlugin.workspace.root.getProject(projectName).getFile("plugin.xml")
				.create(new ByteArrayInputStream(content.bytes), true, null)
	}
	
	
	def generateImports() {
		return '''
			import com.google.inject.Injector;
			import fr.inria.diverse.ale.repl.server.ReplLspServer;
			import java.net.ServerSocket;
			import java.net.Socket;
			import org.eclipse.lsp4j.InitializedParams;
			import org.eclipse.lsp4j.InitializeParams;
			import org.eclipse.lsp4j.jsonrpc.Launcher;
			import org.eclipse.lsp4j.launch.LSPLauncher;
			import org.eclipse.lsp4j.services.LanguageClient;
			import org.eclipse.xtext.ide.server.LanguageServerImpl;
			import org.eclipse.xtext.resource.IResourceServiceProvider;

			import «xtextBasePackage».«languageName.toLowerCase».«languageNamePkg»Package;
		'''
	}
	
	def generateAttributes() {
		return '''
			private static Injector injector = null;
			private static «languageNamePkg»Package pkg = null;
			
			private LanguageServerImpl server;
			private Socket clientSocket;
			private ServerSocket serverSocket;
		'''
	}
	
	def generateStartStop() {
		return '''
			public void runServer(int port) {
				if (pkg == null) {
					pkg = «languageNamePkg»Package.eINSTANCE;
				}
				if (injector == null) {
					injector = new «languageName»LspServerSetup().createInjectorAndDoEMFRegistration();
					// Keeping `ecl` leads to a NullPointerException when getting
					//   the resourceServiceProvider for each language
					injector.getInstance(IResourceServiceProvider.Registry.class)
							.getExtensionToFactoryMap().remove("ecl");
				}
				this.server = injector.getInstance(LanguageServerImpl.class);
				
				try {
					this.serverSocket = new ServerSocket(port);
					this.clientSocket = this.serverSocket.accept();
					Launcher<LanguageClient> launcher = LSPLauncher.createServerLauncher(
							server, this.clientSocket.getInputStream(), this.clientSocket.getOutputStream());
					this.server.connect(launcher.getRemoteProxy());
					launcher.startListening();
				
					this.server.initialize(new InitializeParams());
					this.server.initialized(new InitializedParams());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			public void stopServer() {
				this.server.shutdown();
				this.server = null;
				try {
					this.serverSocket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		'''
	}
	
	
	def generateSetupClass(String projectName) {
		var setup = '''
			package «xtextBasePackage».server;

			import org.eclipse.xtext.ide.server.DefaultProjectDescriptionFactory;
			import org.eclipse.xtext.ide.server.IProjectDescriptionFactory;
			import org.eclipse.xtext.ide.server.IWorkspaceConfigFactory;
			import org.eclipse.xtext.ide.server.ProjectWorkspaceConfigFactory;
			import org.eclipse.xtext.util.Modules2;
			
			import com.google.inject.Binder;
			import com.google.inject.Guice;
			import com.google.inject.Injector;
			
			import «xtextBasePackage».«languageName»RuntimeModule;
			import «xtextBasePackage».ide.«languageName»IdeModule;
			import «xtextBasePackage».ide.«languageName»IdeSetup;
			
			public class «languageName»LspServerSetup extends «languageName»IdeSetup {
				
				@Override
				public Injector createInjector() {
					return Guice.createInjector(Modules2.mixin(new «languageName»RuntimeModule(),
						new «languageName»IdeModule(),
			  	    	(Binder b) -> {
			  	    		b.bind(IWorkspaceConfigFactory.class).to(ProjectWorkspaceConfigFactory.class);
							b.bind(IProjectDescriptionFactory.class).to(DefaultProjectDescriptionFactory.class);
			  	    	}));
				}
			
			}
		'''
		
		val project = ResourcesPlugin.workspace.root.getProject(projectName)
		val projectFileStr = project.location.toOSString
		val serverFile = new File(projectFileStr + "/"
				+ "src/" + projectName.replace(".", "/") + "/" + languageName + "LspServerSetup.java")
		serverFile.parentFile.mkdirs
		serverFile.createNewFile
		project.refreshLocal(IResource.DEPTH_INFINITE, null)
		val serverIFile = ResourcesPlugin.workspace.root
				.getFileForLocation(Path.fromOSString(serverFile.absolutePath))
				
		serverIFile.setContents(new ByteArrayInputStream(setup.bytes), true, false, null)
	}
	
	
	def generateServerClass(String projectName) {
		var server = '''
			package «xtextBasePackage».server;
			
			«generateImports»
			
			public class «languageName»LspServer implements ReplLspServer {
				«generateAttributes»
				
				«generateStartStop»
			}
		'''
		
		val project = ResourcesPlugin.workspace.root.getProject(projectName)
		val projectFileStr = project.location.toOSString
		val serverFile = new File(projectFileStr + "/"
				+ "src/" + projectName.replace(".", "/") + "/" + languageName + "LspServer.java")
		serverFile.parentFile.mkdirs
		serverFile.createNewFile
		project.refreshLocal(IResource.DEPTH_INFINITE, null)
		val serverIFile = ResourcesPlugin.workspace.root
				.getFileForLocation(Path.fromOSString(serverFile.absolutePath))
				
		serverIFile.setContents(new ByteArrayInputStream(server.bytes), true, false, null)
	}
	
}