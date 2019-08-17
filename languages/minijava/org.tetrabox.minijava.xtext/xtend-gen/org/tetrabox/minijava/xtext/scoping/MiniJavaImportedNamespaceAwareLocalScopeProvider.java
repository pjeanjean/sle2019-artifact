package org.tetrabox.minijava.xtext.scoping;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.tetrabox.minijava.xtext.miniJava.Program;

@SuppressWarnings("all")
public class MiniJavaImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public List<ImportNormalizer> getImplicitImports(final boolean ignoreCase) {
    QualifiedName _create = QualifiedName.create("minijava", "lang");
    ImportNormalizer _importNormalizer = new ImportNormalizer(_create, 
      true, ignoreCase);
    return CollectionLiterals.<ImportNormalizer>newArrayList(_importNormalizer);
  }
  
  @Override
  protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(final EObject context, final boolean ignoreCase) {
    final List<ImportNormalizer> resolvers = super.internalGetImportedNamespaceResolvers(context, ignoreCase);
    if ((context instanceof Program)) {
      final QualifiedName fqn = this._iQualifiedNameProvider.getFullyQualifiedName(context);
      if ((fqn != null)) {
        ImportNormalizer _importNormalizer = new ImportNormalizer(fqn, 
          true, ignoreCase);
        resolvers.add(_importNormalizer);
      }
    }
    return resolvers;
  }
}
