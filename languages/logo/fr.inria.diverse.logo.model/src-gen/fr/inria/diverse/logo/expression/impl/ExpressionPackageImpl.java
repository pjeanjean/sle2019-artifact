/**
 */
package fr.inria.diverse.logo.expression.impl;

import fr.inria.diverse.logo.LogoPackage;

import fr.inria.diverse.logo.expression.BinaryExpression;
import fr.inria.diverse.logo.expression.Constant;
import fr.inria.diverse.logo.expression.ExpressionFactory;
import fr.inria.diverse.logo.expression.ExpressionPackage;
import fr.inria.diverse.logo.expression.ExtendedExpression;
import fr.inria.diverse.logo.expression.UnaryExpression;
import fr.inria.diverse.logo.expression.VariableRead;

import fr.inria.diverse.logo.expression.binary.BinaryPackage;

import fr.inria.diverse.logo.expression.binary.impl.BinaryPackageImpl;

import fr.inria.diverse.logo.expression.constant.ConstantPackage;

import fr.inria.diverse.logo.expression.constant.impl.ConstantPackageImpl;

import fr.inria.diverse.logo.expression.extended.ExtendedPackage;

import fr.inria.diverse.logo.expression.extended.impl.ExtendedPackageImpl;

import fr.inria.diverse.logo.expression.unary.UnaryPackage;

import fr.inria.diverse.logo.expression.unary.impl.UnaryPackageImpl;

import fr.inria.diverse.logo.impl.LogoPackageImpl;

import fr.inria.diverse.logo.statement.StatementPackage;

import fr.inria.diverse.logo.statement.control.ControlPackage;

import fr.inria.diverse.logo.statement.control.impl.ControlPackageImpl;

import fr.inria.diverse.logo.statement.impl.StatementPackageImpl;

import fr.inria.diverse.logo.symbol.SymbolPackage;

import fr.inria.diverse.logo.symbol.impl.SymbolPackageImpl;

import fr.inria.diverse.logo.value.ValuePackage;

import fr.inria.diverse.logo.value.impl.ValuePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionPackageImpl extends EPackageImpl implements ExpressionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableReadEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.inria.diverse.logo.expression.ExpressionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExpressionPackageImpl() {
		super(eNS_URI, ExpressionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ExpressionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExpressionPackage init() {
		if (isInited)
			return (ExpressionPackage) EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredExpressionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ExpressionPackageImpl theExpressionPackage = registeredExpressionPackage instanceof ExpressionPackageImpl
				? (ExpressionPackageImpl) registeredExpressionPackage
				: new ExpressionPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogoPackage.eNS_URI);
		LogoPackageImpl theLogoPackage = (LogoPackageImpl) (registeredPackage instanceof LogoPackageImpl
				? registeredPackage
				: LogoPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StatementPackage.eNS_URI);
		StatementPackageImpl theStatementPackage = (StatementPackageImpl) (registeredPackage instanceof StatementPackageImpl
				? registeredPackage
				: StatementPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ControlPackage.eNS_URI);
		ControlPackageImpl theControlPackage = (ControlPackageImpl) (registeredPackage instanceof ControlPackageImpl
				? registeredPackage
				: ControlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConstantPackage.eNS_URI);
		ConstantPackageImpl theConstantPackage = (ConstantPackageImpl) (registeredPackage instanceof ConstantPackageImpl
				? registeredPackage
				: ConstantPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UnaryPackage.eNS_URI);
		UnaryPackageImpl theUnaryPackage = (UnaryPackageImpl) (registeredPackage instanceof UnaryPackageImpl
				? registeredPackage
				: UnaryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BinaryPackage.eNS_URI);
		BinaryPackageImpl theBinaryPackage = (BinaryPackageImpl) (registeredPackage instanceof BinaryPackageImpl
				? registeredPackage
				: BinaryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExtendedPackage.eNS_URI);
		ExtendedPackageImpl theExtendedPackage = (ExtendedPackageImpl) (registeredPackage instanceof ExtendedPackageImpl
				? registeredPackage
				: ExtendedPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SymbolPackage.eNS_URI);
		SymbolPackageImpl theSymbolPackage = (SymbolPackageImpl) (registeredPackage instanceof SymbolPackageImpl
				? registeredPackage
				: SymbolPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI);
		ValuePackageImpl theValuePackage = (ValuePackageImpl) (registeredPackage instanceof ValuePackageImpl
				? registeredPackage
				: ValuePackage.eINSTANCE);

		// Create package meta-data objects
		theExpressionPackage.createPackageContents();
		theLogoPackage.createPackageContents();
		theStatementPackage.createPackageContents();
		theControlPackage.createPackageContents();
		theConstantPackage.createPackageContents();
		theUnaryPackage.createPackageContents();
		theBinaryPackage.createPackageContents();
		theExtendedPackage.createPackageContents();
		theSymbolPackage.createPackageContents();
		theValuePackage.createPackageContents();

		// Initialize created meta-data
		theExpressionPackage.initializePackageContents();
		theLogoPackage.initializePackageContents();
		theStatementPackage.initializePackageContents();
		theControlPackage.initializePackageContents();
		theConstantPackage.initializePackageContents();
		theUnaryPackage.initializePackageContents();
		theBinaryPackage.initializePackageContents();
		theExtendedPackage.initializePackageContents();
		theSymbolPackage.initializePackageContents();
		theValuePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExpressionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExpressionPackage.eNS_URI, theExpressionPackage);
		return theExpressionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_LeftExpression() {
		return (EReference) binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_RightExpression() {
		return (EReference) binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Expression() {
		return (EReference) unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedExpression() {
		return extendedExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedExpression_Expressions() {
		return (EReference) extendedExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableRead() {
		return variableReadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableRead_Name() {
		return (EAttribute) variableReadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionFactory getExpressionFactory() {
		return (ExpressionFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT_EXPRESSION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT_EXPRESSION);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__EXPRESSION);

		constantEClass = createEClass(CONSTANT);

		extendedExpressionEClass = createEClass(EXTENDED_EXPRESSION);
		createEReference(extendedExpressionEClass, EXTENDED_EXPRESSION__EXPRESSIONS);

		variableReadEClass = createEClass(VARIABLE_READ);
		createEAttribute(variableReadEClass, VARIABLE_READ__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ConstantPackage theConstantPackage = (ConstantPackage) EPackage.Registry.INSTANCE
				.getEPackage(ConstantPackage.eNS_URI);
		UnaryPackage theUnaryPackage = (UnaryPackage) EPackage.Registry.INSTANCE.getEPackage(UnaryPackage.eNS_URI);
		BinaryPackage theBinaryPackage = (BinaryPackage) EPackage.Registry.INSTANCE.getEPackage(BinaryPackage.eNS_URI);
		ExtendedPackage theExtendedPackage = (ExtendedPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExtendedPackage.eNS_URI);
		LogoPackage theLogoPackage = (LogoPackage) EPackage.Registry.INSTANCE.getEPackage(LogoPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theConstantPackage);
		getESubpackages().add(theUnaryPackage);
		getESubpackages().add(theBinaryPackage);
		getESubpackages().add(theExtendedPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		binaryExpressionEClass.getESuperTypes().add(theLogoPackage.getExpression());
		unaryExpressionEClass.getESuperTypes().add(theLogoPackage.getExpression());
		constantEClass.getESuperTypes().add(theLogoPackage.getExpression());
		extendedExpressionEClass.getESuperTypes().add(theLogoPackage.getExpression());
		variableReadEClass.getESuperTypes().add(theLogoPackage.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryExpression_LeftExpression(), theLogoPackage.getExpression(), null, "leftExpression",
				null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_RightExpression(), theLogoPackage.getExpression(), null, "rightExpression",
				null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryExpression_Expression(), theLogoPackage.getExpression(), null, "expression", null, 1, 1,
				UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extendedExpressionEClass, ExtendedExpression.class, "ExtendedExpression", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtendedExpression_Expressions(), theLogoPackage.getExpression(), null, "expressions", null,
				2, -1, ExtendedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableReadEClass, VariableRead.class, "VariableRead", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableRead_Name(), ecorePackage.getEString(), "name", null, 1, 1, VariableRead.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ExpressionPackageImpl
