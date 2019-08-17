package fr.inria.diverse.ale.repl.generator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;

public class REPLGenerator {
	
	private String v2rPath;
	private String ecorePath;
	private String alePath;
	private String xtextPath; 

	
	public REPLGenerator(String v2rPath, String ecorePath, String alePath, String xtextPath) {
		this.v2rPath = v2rPath;
		this.ecorePath = ecorePath;
		this.alePath = alePath;
		this.xtextPath = xtextPath;
	}
	
	
	public void generate(String baseName) {
		String languageName = this.ecorePath.substring(this.ecorePath.lastIndexOf("/") + 1)
				.replace(".ecore", "_repl");
		baseName += "." + languageName.toLowerCase();
		URI ecoreBaseUri = URI.createURI("platform:/resource" + ResourcesPlugin.getWorkspace()
				.getRoot().getFileForLocation(new Path(this.ecorePath)).getFullPath().toString());
		URI aleBaseUri = URI.createURI("platform:/resource" + ResourcesPlugin.getWorkspace()
				.getRoot().getFileForLocation(new Path(this.alePath)).getFullPath().toString());
		AbstractSyntaxGenerator asGenerator = new AbstractSyntaxGenerator(this.ecorePath, this.v2rPath);
		IProject asProject = asGenerator.createProject(baseName + ".model");
		URI ecoreUri = asGenerator.generateEcore(asProject.getName(), languageName);
		asGenerator.registerNsUris(ecoreBaseUri);
		asGenerator.registerNsUris(ecoreUri);
		
		ConcreteSyntaxGenerator csGenerator = new ConcreteSyntaxGenerator(this.xtextPath, this.ecorePath);
		IProject csProject = csGenerator.createProject(asProject.getName(), baseName + ".xtext", languageName);
		csGenerator.createGrammar(csProject.getName(), ecoreUri, languageName);
		URI generatedEcoreUri = csGenerator.generateGrammar(csProject.getName(), languageName);
		asGenerator.registerNsUris(generatedEcoreUri);
		asGenerator.alterEcore(generatedEcoreUri);
		asGenerator.generateModelCode(URI.createURI(generatedEcoreUri.toString()
				.replaceAll("ecore$", "genmodel")));
		csGenerator.createScope(csProject.getName(), languageName);

		SemanticGenerator semGenerator = new SemanticGenerator(this.alePath, this.v2rPath);
		URI generatedAleUri = URI.createURI(generatedEcoreUri.toString().replaceAll("ecore$", "ale"));
		semGenerator.createDsl(csProject.getName(), languageName, new URI[] {generatedEcoreUri, ecoreBaseUri},
				new URI[] {generatedAleUri, aleBaseUri});
		semGenerator.generateAle(generatedEcoreUri, ecoreBaseUri);
		
		LSPServerGenerator lspServerGenerator = new LSPServerGenerator(csProject.getName(), languageName);
		String lspProjectName = lspServerGenerator.generateProject().getName();
		lspServerGenerator.generateSetupClass(lspProjectName);
		lspServerGenerator.generateServerClass(lspProjectName);
	}
	
}
