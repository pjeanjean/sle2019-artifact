package fr.inria.diverse.ale.repl.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gemoc.DslRuntimeModule;
import org.eclipse.gemoc.dsl.Dsl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Guice;

import fr.inria.diverse.ale.repl.generator.V2RGenerator;

public class GenerateV2R extends AbstractHandler {
		
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ISelectionService service = window.getSelectionService();
		IStructuredSelection selection = (IStructuredSelection) service.getSelection();
		
		XtextResourceSet rs = Guice.createInjector(new DslRuntimeModule()).getInstance(XtextResourceSet.class);
		
		if (selection.getFirstElement() instanceof IFile) {
			IFile dslFile = (IFile) selection.getFirstElement();
			Dsl dsl = (Dsl) rs.getResource(URI.createFileURI(dslFile.getLocation().toString()), true)
					.getContents().get(0);
			String languageName = dsl.getEntries().stream().filter(e -> e.getKey().equals("name"))
					.findFirst().get().getValue();
			URI ecoreUri = URI.createURI(dsl.getEntries().stream().filter(e -> e.getKey().equals("ecore"))
					.findFirst().get().getValue());
			URI aleUri = URI.createURI(dsl.getEntries().stream().filter(e -> e.getKey().equals("ale"))
					.findFirst().get().getValue());
			
			new V2RGenerator(
					languageName.toLowerCase(),
					ResourcesPlugin.getWorkspace().getRoot()
							.getFile(new Path(ecoreUri.toPlatformString(true))).getRawLocation().toOSString(),
					ResourcesPlugin.getWorkspace().getRoot()
							.getFile(new Path(aleUri.toPlatformString(true))).getRawLocation().toOSString()
			).generateV2R(dslFile.getLocation().toOSString().replaceAll("dsl$", "v2r"));
		}
		
		return null;
	}

}
