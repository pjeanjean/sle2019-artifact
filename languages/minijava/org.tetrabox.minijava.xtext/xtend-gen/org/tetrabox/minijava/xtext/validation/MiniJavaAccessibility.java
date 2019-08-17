package org.tetrabox.minijava.xtext.validation;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Extension;
import org.tetrabox.minijava.xtext.miniJava.AccessLevel;
import org.tetrabox.minijava.xtext.miniJava.Clazz;
import org.tetrabox.minijava.xtext.miniJava.Member;
import org.tetrabox.minijava.xtext.typing.MiniJavaTypeConformance;

@SuppressWarnings("all")
public class MiniJavaAccessibility {
  @Inject
  @Extension
  private MiniJavaTypeConformance _miniJavaTypeConformance;
  
  public boolean isAccessibleFrom(final Member member, final EObject context) {
    boolean _xblockexpression = false;
    {
      final Clazz contextClass = EcoreUtil2.<Clazz>getContainerOfType(context, Clazz.class);
      final Clazz memberClass = EcoreUtil2.<Clazz>getContainerOfType(member, Clazz.class);
      boolean _switchResult = false;
      boolean _matched = false;
      if ((contextClass == memberClass)) {
        _matched=true;
        _switchResult = true;
      }
      if (!_matched) {
        if (((contextClass != null) && this._miniJavaTypeConformance.isSubclassOf(contextClass, memberClass))) {
          _matched=true;
          AccessLevel _access = member.getAccess();
          _switchResult = (!Objects.equal(_access, AccessLevel.PRIVATE));
        }
      }
      if (!_matched) {
        AccessLevel _access_1 = member.getAccess();
        _switchResult = Objects.equal(_access_1, AccessLevel.PUBLIC);
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
}
