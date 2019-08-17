package org.tetrabox.minijava.xtext.scoping;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage;

@SuppressWarnings("all")
public class MiniJavaIndex {
  @Inject
  private ResourceDescriptionsProvider rdp;
  
  @Inject
  private IContainer.Manager cm;
  
  public Map<QualifiedName, IEObjectDescription> getVisibleExternalClassesDescriptions(final EObject o) {
    final Iterable<IEObjectDescription> allVisibleClasses = this.getVisibleClassesDescriptions(o);
    final Iterable<IEObjectDescription> allExportedClasses = this.getExportedClassesEObjectDescriptions(o);
    final Set<IEObjectDescription> difference = IterableExtensions.<IEObjectDescription>toSet(allVisibleClasses);
    difference.removeAll(IterableExtensions.<IEObjectDescription>toSet(allExportedClasses));
    final Function1<IEObjectDescription, QualifiedName> _function = (IEObjectDescription it) -> {
      return it.getQualifiedName();
    };
    return IterableExtensions.<QualifiedName, IEObjectDescription>toMap(difference, _function);
  }
  
  public Iterable<IEObjectDescription> getVisibleClassesDescriptions(final EObject o) {
    return this.getVisibleEObjectDescriptions(o, MiniJavaPackage.eINSTANCE.getClazz());
  }
  
  public Iterable<IEObjectDescription> getVisibleEObjectDescriptions(final EObject o, final EClass type) {
    final Function1<IContainer, Iterable<IEObjectDescription>> _function = (IContainer container) -> {
      return container.getExportedObjectsByType(type);
    };
    return Iterables.<IEObjectDescription>concat(ListExtensions.<IContainer, Iterable<IEObjectDescription>>map(this.getVisibleContainers(o), _function));
  }
  
  public List<IContainer> getVisibleContainers(final EObject o) {
    List<IContainer> _xblockexpression = null;
    {
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(o.eResource());
      final IResourceDescription rd = index.getResourceDescription(o.eResource().getURI());
      _xblockexpression = this.cm.getVisibleContainers(rd, index);
    }
    return _xblockexpression;
  }
  
  public IResourceDescription getResourceDescription(final EObject o) {
    IResourceDescription _xblockexpression = null;
    {
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(o.eResource());
      _xblockexpression = index.getResourceDescription(o.eResource().getURI());
    }
    return _xblockexpression;
  }
  
  public Iterable<IEObjectDescription> getExportedEObjectDescriptions(final EObject o) {
    return this.getResourceDescription(o).getExportedObjects();
  }
  
  public Iterable<IEObjectDescription> getExportedClassesEObjectDescriptions(final EObject o) {
    return this.getResourceDescription(o).getExportedObjectsByType(MiniJavaPackage.eINSTANCE.getClazz());
  }
}
