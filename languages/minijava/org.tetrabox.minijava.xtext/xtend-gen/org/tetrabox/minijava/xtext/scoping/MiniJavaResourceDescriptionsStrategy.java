package org.tetrabox.minijava.xtext.scoping;

import com.google.inject.Singleton;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;
import org.tetrabox.minijava.xtext.miniJava.Block;

@Singleton
@SuppressWarnings("all")
public class MiniJavaResourceDescriptionsStrategy extends DefaultResourceDescriptionStrategy {
  @Override
  public boolean createEObjectDescriptions(final EObject e, final IAcceptor<IEObjectDescription> acceptor) {
    boolean _xifexpression = false;
    if ((e instanceof Block)) {
      _xifexpression = false;
    } else {
      _xifexpression = super.createEObjectDescriptions(e, acceptor);
    }
    return _xifexpression;
  }
}
