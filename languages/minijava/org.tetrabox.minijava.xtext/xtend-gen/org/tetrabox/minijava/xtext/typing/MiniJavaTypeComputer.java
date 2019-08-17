package org.tetrabox.minijava.xtext.typing;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.tetrabox.minijava.xtext.miniJava.Assignee;
import org.tetrabox.minijava.xtext.miniJava.Assignment;
import org.tetrabox.minijava.xtext.miniJava.BoolConstant;
import org.tetrabox.minijava.xtext.miniJava.BooleanTypeRef;
import org.tetrabox.minijava.xtext.miniJava.ClassRef;
import org.tetrabox.minijava.xtext.miniJava.Clazz;
import org.tetrabox.minijava.xtext.miniJava.Expression;
import org.tetrabox.minijava.xtext.miniJava.FieldAccess;
import org.tetrabox.minijava.xtext.miniJava.IntConstant;
import org.tetrabox.minijava.xtext.miniJava.IntegerTypeRef;
import org.tetrabox.minijava.xtext.miniJava.Method;
import org.tetrabox.minijava.xtext.miniJava.MethodCall;
import org.tetrabox.minijava.xtext.miniJava.MiniJavaFactory;
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage;
import org.tetrabox.minijava.xtext.miniJava.NewObject;
import org.tetrabox.minijava.xtext.miniJava.Null;
import org.tetrabox.minijava.xtext.miniJava.Return;
import org.tetrabox.minijava.xtext.miniJava.StringConstant;
import org.tetrabox.minijava.xtext.miniJava.StringTypeRef;
import org.tetrabox.minijava.xtext.miniJava.Super;
import org.tetrabox.minijava.xtext.miniJava.SymbolRef;
import org.tetrabox.minijava.xtext.miniJava.This;
import org.tetrabox.minijava.xtext.miniJava.TypeDeclaration;
import org.tetrabox.minijava.xtext.miniJava.TypeRef;
import org.tetrabox.minijava.xtext.miniJava.VariableDeclaration;
import org.tetrabox.minijava.xtext.miniJava.VoidTypeRef;

@SuppressWarnings("all")
public class MiniJavaTypeComputer {
  private final static MiniJavaFactory factory = MiniJavaFactory.eINSTANCE;
  
  public final static Clazz STRING_TYPE = ObjectExtensions.<Clazz>operator_doubleArrow(MiniJavaTypeComputer.factory.createClazz(), ((Procedure1<Clazz>) (Clazz it) -> {
    it.setName("stringType");
  }));
  
  public final static Clazz INT_TYPE = ObjectExtensions.<Clazz>operator_doubleArrow(MiniJavaTypeComputer.factory.createClazz(), ((Procedure1<Clazz>) (Clazz it) -> {
    it.setName("intType");
  }));
  
  public final static Clazz BOOLEAN_TYPE = ObjectExtensions.<Clazz>operator_doubleArrow(MiniJavaTypeComputer.factory.createClazz(), ((Procedure1<Clazz>) (Clazz it) -> {
    it.setName("booleanType");
  }));
  
  public final static Clazz NULL_TYPE = ObjectExtensions.<Clazz>operator_doubleArrow(MiniJavaTypeComputer.factory.createClazz(), ((Procedure1<Clazz>) (Clazz it) -> {
    it.setName("nullType");
  }));
  
  private final static MiniJavaPackage ep = MiniJavaPackage.eINSTANCE;
  
  public TypeDeclaration getType(final TypeRef r) {
    TypeDeclaration _switchResult = null;
    boolean _matched = false;
    if (r instanceof ClassRef) {
      _matched=true;
      _switchResult = ((ClassRef)r).getReferencedClass();
    }
    if (!_matched) {
      if (r instanceof IntegerTypeRef) {
        _matched=true;
        _switchResult = MiniJavaTypeComputer.INT_TYPE;
      }
    }
    if (!_matched) {
      if (r instanceof BooleanTypeRef) {
        _matched=true;
        _switchResult = MiniJavaTypeComputer.BOOLEAN_TYPE;
      }
    }
    if (!_matched) {
      if (r instanceof StringTypeRef) {
        _matched=true;
        _switchResult = MiniJavaTypeComputer.STRING_TYPE;
      }
    }
    if (!_matched) {
      if (r instanceof VoidTypeRef) {
        _matched=true;
        _switchResult = MiniJavaTypeComputer.NULL_TYPE;
      }
    }
    return _switchResult;
  }
  
  public TypeDeclaration typeFor(final Expression e) {
    TypeDeclaration _switchResult = null;
    boolean _matched = false;
    if (e instanceof SymbolRef) {
      _matched=true;
      _switchResult = this.getType(((SymbolRef)e).getSymbol().getTypeRef());
    }
    if (!_matched) {
      if (e instanceof FieldAccess) {
        _matched=true;
        _switchResult = this.getType(((FieldAccess)e).getField().getTypeRef());
      }
    }
    if (!_matched) {
      if (e instanceof MethodCall) {
        _matched=true;
        _switchResult = this.getType(((MethodCall)e).getMethod().getTypeRef());
      }
    }
    if (!_matched) {
      if (e instanceof NewObject) {
        _matched=true;
        _switchResult = ((NewObject)e).getType();
      }
    }
    if (!_matched) {
      if (e instanceof This) {
        _matched=true;
        _switchResult = EcoreUtil2.<Clazz>getContainerOfType(e, Clazz.class);
      }
    }
    if (!_matched) {
      if (e instanceof Super) {
        _matched=true;
        _switchResult = EcoreUtil2.<Clazz>getContainerOfType(e, Clazz.class).getSuperClass();
      }
    }
    if (!_matched) {
      if (e instanceof Null) {
        _matched=true;
        _switchResult = MiniJavaTypeComputer.NULL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof StringConstant) {
        _matched=true;
        _switchResult = MiniJavaTypeComputer.STRING_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof IntConstant) {
        _matched=true;
        _switchResult = MiniJavaTypeComputer.INT_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        _switchResult = MiniJavaTypeComputer.BOOLEAN_TYPE;
      }
    }
    return _switchResult;
  }
  
  public boolean isPrimitive(final TypeDeclaration c) {
    Resource _eResource = c.eResource();
    return (_eResource == null);
  }
  
  public TypeDeclaration expectedType(final Expression e) {
    TypeDeclaration _xblockexpression = null;
    {
      final EObject c = e.eContainer();
      final EStructuralFeature f = e.eContainingFeature();
      TypeDeclaration _switchResult = null;
      boolean _matched = false;
      if (c instanceof VariableDeclaration) {
        _matched=true;
        _switchResult = this.getType(((VariableDeclaration)c).getTypeRef());
      }
      if (!_matched) {
        if (c instanceof Assignment) {
          EReference _assignment_Value = MiniJavaTypeComputer.ep.getAssignment_Value();
          boolean _equals = Objects.equal(f, _assignment_Value);
          if (_equals) {
            _matched=true;
            TypeDeclaration _xblockexpression_1 = null;
            {
              final Assignee assignee = ((Assignment)c).getAssignee();
              TypeDeclaration _switchResult_1 = null;
              boolean _matched_1 = false;
              if (assignee instanceof VariableDeclaration) {
                _matched_1=true;
                _switchResult_1 = this.getType(((VariableDeclaration)assignee).getTypeRef());
              }
              if (!_matched_1) {
                if (assignee instanceof FieldAccess) {
                  _matched_1=true;
                  _switchResult_1 = this.typeFor(((Expression)assignee));
                }
              }
              _xblockexpression_1 = _switchResult_1;
            }
            _switchResult = _xblockexpression_1;
          }
        }
      }
      if (!_matched) {
        if (c instanceof Return) {
          _matched=true;
          _switchResult = this.getType(EcoreUtil2.<Method>getContainerOfType(c, Method.class).getTypeRef());
        }
      }
      if (!_matched) {
        EReference _ifStatement_Expression = MiniJavaTypeComputer.ep.getIfStatement_Expression();
        boolean _equals = Objects.equal(f, _ifStatement_Expression);
        if (_equals) {
          _matched=true;
          _switchResult = MiniJavaTypeComputer.BOOLEAN_TYPE;
        }
      }
      if (!_matched) {
        if (c instanceof MethodCall) {
          EReference _methodCall_Args = MiniJavaTypeComputer.ep.getMethodCall_Args();
          boolean _equals_1 = Objects.equal(f, _methodCall_Args);
          if (_equals_1) {
            _matched=true;
            TypeDeclaration _xifexpression = null;
            Method _method = ((MethodCall)c).getMethod();
            boolean _tripleNotEquals = (_method != null);
            if (_tripleNotEquals) {
              TypeDeclaration _xifexpression_1 = null;
              int _size = ((MethodCall)c).getMethod().getParams().size();
              int _indexOf = ((MethodCall)c).getArgs().indexOf(e);
              boolean _greaterThan = (_size > _indexOf);
              if (_greaterThan) {
                _xifexpression_1 = this.getType(((MethodCall)c).getMethod().getParams().get(((MethodCall)c).getArgs().indexOf(e)).getTypeRef());
              }
              _xifexpression = _xifexpression_1;
            }
            _switchResult = _xifexpression;
          }
        }
      }
      if (!_matched) {
        if (c instanceof NewObject) {
          EReference _newObject_Args = MiniJavaTypeComputer.ep.getNewObject_Args();
          boolean _equals_1 = Objects.equal(f, _newObject_Args);
          if (_equals_1) {
            _matched=true;
            final Function1<Method, Boolean> _function = (Method it) -> {
              return Boolean.valueOf(((it.getName() == null) && (it.getParams().size() == ((NewObject)c).getArgs().size())));
            };
            _switchResult = this.getType(IterableExtensions.<Method>findFirst(Iterables.<Method>filter(((NewObject)c).getType().getMembers(), Method.class), _function).getParams().get(((NewObject)c).getArgs().indexOf(e)).getTypeRef());
          }
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
}
