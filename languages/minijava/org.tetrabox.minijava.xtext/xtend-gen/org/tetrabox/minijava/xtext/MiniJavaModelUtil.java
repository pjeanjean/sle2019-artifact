package org.tetrabox.minijava.xtext;

import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.tetrabox.minijava.xtext.miniJava.Block;
import org.tetrabox.minijava.xtext.miniJava.BooleanTypeRef;
import org.tetrabox.minijava.xtext.miniJava.ClassRef;
import org.tetrabox.minijava.xtext.miniJava.Clazz;
import org.tetrabox.minijava.xtext.miniJava.Field;
import org.tetrabox.minijava.xtext.miniJava.IntegerTypeRef;
import org.tetrabox.minijava.xtext.miniJava.Interface;
import org.tetrabox.minijava.xtext.miniJava.Member;
import org.tetrabox.minijava.xtext.miniJava.Method;
import org.tetrabox.minijava.xtext.miniJava.Parameter;
import org.tetrabox.minijava.xtext.miniJava.Return;
import org.tetrabox.minijava.xtext.miniJava.StringTypeRef;
import org.tetrabox.minijava.xtext.miniJava.TypeDeclaration;
import org.tetrabox.minijava.xtext.miniJava.TypeRef;

@SuppressWarnings("all")
public class MiniJavaModelUtil {
  protected Iterable<Field> _fields(final Clazz c) {
    return Iterables.<Field>filter(c.getMembers(), Field.class);
  }
  
  protected Iterable<Field> _fields(final Interface i) {
    return Collections.<Field>unmodifiableList(CollectionLiterals.<Field>newArrayList());
  }
  
  public Iterable<Method> methods(final TypeDeclaration c) {
    return Iterables.<Method>filter(c.getMembers(), Method.class);
  }
  
  public Return returnStatement(final Method m) {
    return this.returnStatement(m.getBody());
  }
  
  public Return returnStatement(final Block block) {
    return IterableExtensions.<Return>head(Iterables.<Return>filter(block.getStatements(), Return.class));
  }
  
  public Set<TypeDeclaration> getSuperTypes(final TypeDeclaration c) {
    final Set<TypeDeclaration> current = CollectionLiterals.<TypeDeclaration>newLinkedHashSet();
    if ((c instanceof Clazz)) {
      Clazz _superClass = ((Clazz)c).getSuperClass();
      boolean _tripleNotEquals = (_superClass != null);
      if (_tripleNotEquals) {
        current.add(((Clazz)c).getSuperClass());
      }
    }
    current.addAll(c.getImplementz());
    return current;
  }
  
  public Set<TypeDeclaration> classHierarchy(final TypeDeclaration c) {
    Set<TypeDeclaration> _xblockexpression = null;
    {
      final Set<TypeDeclaration> visited = CollectionLiterals.<TypeDeclaration>newLinkedHashSet();
      final Set<TypeDeclaration> current = this.getSuperTypes(c);
      while ((!current.isEmpty())) {
        {
          visited.addAll(current);
          final LinkedHashSet<TypeDeclaration> copy = CollectionLiterals.<TypeDeclaration>newLinkedHashSet();
          copy.addAll(current);
          current.clear();
          final Function1<TypeDeclaration, Set<TypeDeclaration>> _function = (TypeDeclaration it) -> {
            return this.getSuperTypes(it);
          };
          final Function1<TypeDeclaration, Boolean> _function_1 = (TypeDeclaration it) -> {
            boolean _contains = visited.contains(it);
            return Boolean.valueOf((!_contains));
          };
          Iterables.<TypeDeclaration>addAll(current, IterableExtensions.<TypeDeclaration>filter(Iterables.<TypeDeclaration>concat(IterableExtensions.<TypeDeclaration, Set<TypeDeclaration>>map(copy, _function)), _function_1));
        }
      }
      _xblockexpression = visited;
    }
    return _xblockexpression;
  }
  
  public Map<String, Method> classHierarchyMethods(final TypeDeclaration c) {
    final Function1<TypeDeclaration, Iterable<Method>> _function = (TypeDeclaration it) -> {
      return this.methods(it);
    };
    final Function1<Method, String> _function_1 = (Method it) -> {
      return it.getName();
    };
    return IterableExtensions.<String, Method>toMap(Iterables.<Method>concat(ListExtensions.<TypeDeclaration, Iterable<Method>>map(ListExtensions.<TypeDeclaration>reverseView(IterableExtensions.<TypeDeclaration>toList(this.classHierarchy(c))), _function)), _function_1);
  }
  
  public Iterable<Member> classHierarchyMembers(final TypeDeclaration c) {
    final Function1<TypeDeclaration, EList<Member>> _function = (TypeDeclaration it) -> {
      return it.getMembers();
    };
    return Iterables.<Member>concat(IterableExtensions.<TypeDeclaration, EList<Member>>map(this.classHierarchy(c), _function));
  }
  
  public String memberAsString(final Member m) {
    String _xifexpression = null;
    if ((m instanceof Member)) {
      String _xifexpression_1 = null;
      String _name = m.getName();
      boolean _tripleEquals = (_name == null);
      if (_tripleEquals) {
        _xifexpression_1 = this.getName(m.getTypeRef());
      } else {
        _xifexpression_1 = m.getName();
      }
      String _xifexpression_2 = null;
      if ((m instanceof Method)) {
        final Function1<Parameter, String> _function = (Parameter it) -> {
          return this.getName(it.getTypeRef());
        };
        String _join = IterableExtensions.join(ListExtensions.<Parameter, String>map(((Method)m).getParams(), _function), ", ");
        String _plus = ("(" + _join);
        _xifexpression_2 = (_plus + ")");
      } else {
        _xifexpression_2 = "";
      }
      _xifexpression = (_xifexpression_1 + _xifexpression_2);
    }
    return _xifexpression;
  }
  
  public String memberAsStringWithType(final Member m) {
    String _memberAsString = this.memberAsString(m);
    String _plus = (_memberAsString + " : ");
    String _name = this.getName(m.getTypeRef());
    return (_plus + _name);
  }
  
  public String getName(final TypeRef r) {
    String _switchResult = null;
    boolean _matched = false;
    if (r instanceof ClassRef) {
      _matched=true;
      _switchResult = ((ClassRef)r).getReferencedClass().getName();
    }
    if (!_matched) {
      if (r instanceof IntegerTypeRef) {
        _matched=true;
        _switchResult = "int";
      }
    }
    if (!_matched) {
      if (r instanceof StringTypeRef) {
        _matched=true;
        _switchResult = "String";
      }
    }
    if (!_matched) {
      if (r instanceof BooleanTypeRef) {
        _matched=true;
        _switchResult = "boolean";
      }
    }
    final String test = _switchResult;
    return test;
  }
  
  public Iterable<Field> fields(final TypeDeclaration c) {
    if (c instanceof Clazz) {
      return _fields((Clazz)c);
    } else if (c instanceof Interface) {
      return _fields((Interface)c);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c).toString());
    }
  }
}
