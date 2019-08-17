package org.tetrabox.minijava.xtext.typing;

import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.tetrabox.minijava.xtext.MiniJavaModelUtil;
import org.tetrabox.minijava.xtext.miniJava.TypeDeclaration;
import org.tetrabox.minijava.xtext.typing.MiniJavaTypeComputer;

@SuppressWarnings("all")
public class MiniJavaTypeConformance {
  @Inject
  @Extension
  private MiniJavaModelUtil _miniJavaModelUtil;
  
  public boolean isConformant(final TypeDeclaration c1, final TypeDeclaration c2) {
    return (((c1 == MiniJavaTypeComputer.NULL_TYPE) || 
      (c1 == c2)) || this.isSubclassOf(c1, c2));
  }
  
  public boolean isSubclassOf(final TypeDeclaration c1, final TypeDeclaration c2) {
    return this._miniJavaModelUtil.classHierarchy(c1).contains(c2);
  }
}
