/**
 */
package org.tetrabox.minijava.xtext.miniJava.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tetrabox.minijava.xtext.miniJava.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiniJavaFactoryImpl extends EFactoryImpl implements MiniJavaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MiniJavaFactory init() {
		try {
			MiniJavaFactory theMiniJavaFactory = (MiniJavaFactory)EPackage.Registry.INSTANCE.getEFactory(MiniJavaPackage.eNS_URI);
			if (theMiniJavaFactory != null) {
				return theMiniJavaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MiniJavaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiniJavaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MiniJavaPackage.PROGRAM: return createProgram();
			case MiniJavaPackage.IMPORT: return createImport();
			case MiniJavaPackage.TYPE_DECLARATION: return createTypeDeclaration();
			case MiniJavaPackage.CLAZZ: return createClazz();
			case MiniJavaPackage.INTERFACE: return createInterface();
			case MiniJavaPackage.MEMBER: return createMember();
			case MiniJavaPackage.METHOD: return createMethod();
			case MiniJavaPackage.PARAMETER: return createParameter();
			case MiniJavaPackage.FIELD: return createField();
			case MiniJavaPackage.BLOCK: return createBlock();
			case MiniJavaPackage.STATEMENT: return createStatement();
			case MiniJavaPackage.PRINT_STATEMENT: return createPrintStatement();
			case MiniJavaPackage.RETURN: return createReturn();
			case MiniJavaPackage.IF_STATEMENT: return createIfStatement();
			case MiniJavaPackage.WHILE_STATEMENT: return createWhileStatement();
			case MiniJavaPackage.FOR_STATEMENT: return createForStatement();
			case MiniJavaPackage.TYPE_REF: return createTypeRef();
			case MiniJavaPackage.SINGLE_TYPE_REF: return createSingleTypeRef();
			case MiniJavaPackage.CLASS_REF: return createClassRef();
			case MiniJavaPackage.NAMED_ELEMENT: return createNamedElement();
			case MiniJavaPackage.TYPED_DECLARATION: return createTypedDeclaration();
			case MiniJavaPackage.SYMBOL: return createSymbol();
			case MiniJavaPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
			case MiniJavaPackage.ASSIGNMENT: return createAssignment();
			case MiniJavaPackage.ASSIGNEE: return createAssignee();
			case MiniJavaPackage.EXPRESSION: return createExpression();
			case MiniJavaPackage.ARRAY_TYPE_REF: return createArrayTypeRef();
			case MiniJavaPackage.INTEGER_TYPE_REF: return createIntegerTypeRef();
			case MiniJavaPackage.BOOLEAN_TYPE_REF: return createBooleanTypeRef();
			case MiniJavaPackage.STRING_TYPE_REF: return createStringTypeRef();
			case MiniJavaPackage.VOID_TYPE_REF: return createVoidTypeRef();
			case MiniJavaPackage.OR: return createOr();
			case MiniJavaPackage.AND: return createAnd();
			case MiniJavaPackage.EQUALITY: return createEquality();
			case MiniJavaPackage.INEQUALITY: return createInequality();
			case MiniJavaPackage.SUPERIOR_OR_EQUAL: return createSuperiorOrEqual();
			case MiniJavaPackage.INFERIOR_OR_EQUAL: return createInferiorOrEqual();
			case MiniJavaPackage.SUPERIOR: return createSuperior();
			case MiniJavaPackage.INFERIOR: return createInferior();
			case MiniJavaPackage.PLUS: return createPlus();
			case MiniJavaPackage.MINUS: return createMinus();
			case MiniJavaPackage.MULTIPLICATION: return createMultiplication();
			case MiniJavaPackage.DIVISION: return createDivision();
			case MiniJavaPackage.ARRAY_ACCESS: return createArrayAccess();
			case MiniJavaPackage.ARRAY_LENGTH: return createArrayLength();
			case MiniJavaPackage.NOT: return createNot();
			case MiniJavaPackage.NEG: return createNeg();
			case MiniJavaPackage.FIELD_ACCESS: return createFieldAccess();
			case MiniJavaPackage.METHOD_CALL: return createMethodCall();
			case MiniJavaPackage.STRING_CONSTANT: return createStringConstant();
			case MiniJavaPackage.INT_CONSTANT: return createIntConstant();
			case MiniJavaPackage.BOOL_CONSTANT: return createBoolConstant();
			case MiniJavaPackage.THIS: return createThis();
			case MiniJavaPackage.SUPER: return createSuper();
			case MiniJavaPackage.NULL: return createNull();
			case MiniJavaPackage.NEW_OBJECT: return createNewObject();
			case MiniJavaPackage.NEW_ARRAY: return createNewArray();
			case MiniJavaPackage.SYMBOL_REF: return createSymbolRef();
			case MiniJavaPackage.CONTEXT: return createContext();
			case MiniJavaPackage.VALUE: return createValue();
			case MiniJavaPackage.INTEGER_VALUE: return createIntegerValue();
			case MiniJavaPackage.SYMBOL_BINDING: return createSymbolBinding();
			case MiniJavaPackage.FIELD_BINDING: return createFieldBinding();
			case MiniJavaPackage.STRING_VALUE: return createStringValue();
			case MiniJavaPackage.BOOLEAN_VALUE: return createBooleanValue();
			case MiniJavaPackage.OUTPUT_STREAM: return createOutputStream();
			case MiniJavaPackage.STATE: return createState();
			case MiniJavaPackage.FRAME: return createFrame();
			case MiniJavaPackage.NULL_VALUE: return createNullValue();
			case MiniJavaPackage.NEW_CALL: return createNewCall();
			case MiniJavaPackage.METHOD_CALL2: return createMethodCall2();
			case MiniJavaPackage.OBJECT_INSTANCE: return createObjectInstance();
			case MiniJavaPackage.ARRAY_INSTANCE: return createArrayInstance();
			case MiniJavaPackage.OBJECT_REF_VALUE: return createObjectRefValue();
			case MiniJavaPackage.ARRAY_REF_VALUE: return createArrayRefValue();
			case MiniJavaPackage.SYMBOL_TO_SYMBOL_BINDING_MAP: return (EObject)createSymbolToSymbolBindingMap();
			case MiniJavaPackage.CLAZZ_TO_METHOD_MAP: return (EObject)createClazzToMethodMap();
			case MiniJavaPackage.MODULO: return createModulo();
			case MiniJavaPackage.NATIVE_EXPRESSION: return createNativeExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MiniJavaPackage.ACCESS_LEVEL:
				return createAccessLevelFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MiniJavaPackage.ACCESS_LEVEL:
				return convertAccessLevelToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDeclaration createTypeDeclaration() {
		TypeDeclarationImpl typeDeclaration = new TypeDeclarationImpl();
		return typeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clazz createClazz() {
		ClazzImpl clazz = new ClazzImpl();
		return clazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Member createMember() {
		MemberImpl member = new MemberImpl();
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrintStatement createPrintStatement() {
		PrintStatementImpl printStatement = new PrintStatementImpl();
		return printStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Return createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhileStatement createWhileStatement() {
		WhileStatementImpl whileStatement = new WhileStatementImpl();
		return whileStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForStatement createForStatement() {
		ForStatementImpl forStatement = new ForStatementImpl();
		return forStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeRef createTypeRef() {
		TypeRefImpl typeRef = new TypeRefImpl();
		return typeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleTypeRef createSingleTypeRef() {
		SingleTypeRefImpl singleTypeRef = new SingleTypeRefImpl();
		return singleTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassRef createClassRef() {
		ClassRefImpl classRef = new ClassRefImpl();
		return classRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypedDeclaration createTypedDeclaration() {
		TypedDeclarationImpl typedDeclaration = new TypedDeclarationImpl();
		return typedDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Symbol createSymbol() {
		SymbolImpl symbol = new SymbolImpl();
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclaration createVariableDeclaration() {
		VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assignee createAssignee() {
		AssigneeImpl assignee = new AssigneeImpl();
		return assignee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayTypeRef createArrayTypeRef() {
		ArrayTypeRefImpl arrayTypeRef = new ArrayTypeRefImpl();
		return arrayTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerTypeRef createIntegerTypeRef() {
		IntegerTypeRefImpl integerTypeRef = new IntegerTypeRefImpl();
		return integerTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanTypeRef createBooleanTypeRef() {
		BooleanTypeRefImpl booleanTypeRef = new BooleanTypeRefImpl();
		return booleanTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringTypeRef createStringTypeRef() {
		StringTypeRefImpl stringTypeRef = new StringTypeRefImpl();
		return stringTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VoidTypeRef createVoidTypeRef() {
		VoidTypeRefImpl voidTypeRef = new VoidTypeRefImpl();
		return voidTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Equality createEquality() {
		EqualityImpl equality = new EqualityImpl();
		return equality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inequality createInequality() {
		InequalityImpl inequality = new InequalityImpl();
		return inequality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperiorOrEqual createSuperiorOrEqual() {
		SuperiorOrEqualImpl superiorOrEqual = new SuperiorOrEqualImpl();
		return superiorOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InferiorOrEqual createInferiorOrEqual() {
		InferiorOrEqualImpl inferiorOrEqual = new InferiorOrEqualImpl();
		return inferiorOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Superior createSuperior() {
		SuperiorImpl superior = new SuperiorImpl();
		return superior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inferior createInferior() {
		InferiorImpl inferior = new InferiorImpl();
		return inferior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Plus createPlus() {
		PlusImpl plus = new PlusImpl();
		return plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Minus createMinus() {
		MinusImpl minus = new MinusImpl();
		return minus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multiplication createMultiplication() {
		MultiplicationImpl multiplication = new MultiplicationImpl();
		return multiplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Division createDivision() {
		DivisionImpl division = new DivisionImpl();
		return division;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayAccess createArrayAccess() {
		ArrayAccessImpl arrayAccess = new ArrayAccessImpl();
		return arrayAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayLength createArrayLength() {
		ArrayLengthImpl arrayLength = new ArrayLengthImpl();
		return arrayLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Neg createNeg() {
		NegImpl neg = new NegImpl();
		return neg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldAccess createFieldAccess() {
		FieldAccessImpl fieldAccess = new FieldAccessImpl();
		return fieldAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodCall createMethodCall() {
		MethodCallImpl methodCall = new MethodCallImpl();
		return methodCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringConstant createStringConstant() {
		StringConstantImpl stringConstant = new StringConstantImpl();
		return stringConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntConstant createIntConstant() {
		IntConstantImpl intConstant = new IntConstantImpl();
		return intConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoolConstant createBoolConstant() {
		BoolConstantImpl boolConstant = new BoolConstantImpl();
		return boolConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public This createThis() {
		ThisImpl this_ = new ThisImpl();
		return this_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Super createSuper() {
		SuperImpl super_ = new SuperImpl();
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Null createNull() {
		NullImpl null_ = new NullImpl();
		return null_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NewObject createNewObject() {
		NewObjectImpl newObject = new NewObjectImpl();
		return newObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NewArray createNewArray() {
		NewArrayImpl newArray = new NewArrayImpl();
		return newArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymbolRef createSymbolRef() {
		SymbolRefImpl symbolRef = new SymbolRefImpl();
		return symbolRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerValue createIntegerValue() {
		IntegerValueImpl integerValue = new IntegerValueImpl();
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymbolBinding createSymbolBinding() {
		SymbolBindingImpl symbolBinding = new SymbolBindingImpl();
		return symbolBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldBinding createFieldBinding() {
		FieldBindingImpl fieldBinding = new FieldBindingImpl();
		return fieldBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringValue createStringValue() {
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputStream createOutputStream() {
		OutputStreamImpl outputStream = new OutputStreamImpl();
		return outputStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Frame createFrame() {
		FrameImpl frame = new FrameImpl();
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullValue createNullValue() {
		NullValueImpl nullValue = new NullValueImpl();
		return nullValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NewCall createNewCall() {
		NewCallImpl newCall = new NewCallImpl();
		return newCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodCall2 createMethodCall2() {
		MethodCall2Impl methodCall2 = new MethodCall2Impl();
		return methodCall2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectInstance createObjectInstance() {
		ObjectInstanceImpl objectInstance = new ObjectInstanceImpl();
		return objectInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayInstance createArrayInstance() {
		ArrayInstanceImpl arrayInstance = new ArrayInstanceImpl();
		return arrayInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectRefValue createObjectRefValue() {
		ObjectRefValueImpl objectRefValue = new ObjectRefValueImpl();
		return objectRefValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayRefValue createArrayRefValue() {
		ArrayRefValueImpl arrayRefValue = new ArrayRefValueImpl();
		return arrayRefValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Symbol, SymbolBinding> createSymbolToSymbolBindingMap() {
		SymbolToSymbolBindingMapImpl symbolToSymbolBindingMap = new SymbolToSymbolBindingMapImpl();
		return symbolToSymbolBindingMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Clazz, Method> createClazzToMethodMap() {
		ClazzToMethodMapImpl clazzToMethodMap = new ClazzToMethodMapImpl();
		return clazzToMethodMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modulo createModulo() {
		ModuloImpl modulo = new ModuloImpl();
		return modulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NativeExpression createNativeExpression() {
		NativeExpressionImpl nativeExpression = new NativeExpressionImpl();
		return nativeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessLevel createAccessLevelFromString(EDataType eDataType, String initialValue) {
		AccessLevel result = AccessLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MiniJavaPackage getMiniJavaPackage() {
		return (MiniJavaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MiniJavaPackage getPackage() {
		return MiniJavaPackage.eINSTANCE;
	}

} //MiniJavaFactoryImpl
