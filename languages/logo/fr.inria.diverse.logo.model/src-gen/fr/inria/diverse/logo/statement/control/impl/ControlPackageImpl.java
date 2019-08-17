/**
 */
package fr.inria.diverse.logo.statement.control.impl;

import fr.inria.diverse.logo.LogoPackage;

import fr.inria.diverse.logo.expression.ExpressionPackage;

import fr.inria.diverse.logo.expression.binary.BinaryPackage;

import fr.inria.diverse.logo.expression.binary.impl.BinaryPackageImpl;

import fr.inria.diverse.logo.expression.constant.ConstantPackage;

import fr.inria.diverse.logo.expression.constant.impl.ConstantPackageImpl;

import fr.inria.diverse.logo.expression.extended.ExtendedPackage;

import fr.inria.diverse.logo.expression.extended.impl.ExtendedPackageImpl;

import fr.inria.diverse.logo.expression.impl.ExpressionPackageImpl;

import fr.inria.diverse.logo.expression.unary.UnaryPackage;

import fr.inria.diverse.logo.expression.unary.impl.UnaryPackageImpl;

import fr.inria.diverse.logo.impl.LogoPackageImpl;

import fr.inria.diverse.logo.statement.StatementPackage;

import fr.inria.diverse.logo.statement.control.ControlFactory;
import fr.inria.diverse.logo.statement.control.ControlPackage;
import fr.inria.diverse.logo.statement.control.If;
import fr.inria.diverse.logo.statement.control.Repeat;
import fr.inria.diverse.logo.statement.control.While;

import fr.inria.diverse.logo.statement.impl.StatementPackageImpl;

import fr.inria.diverse.logo.symbol.SymbolPackage;

import fr.inria.diverse.logo.symbol.impl.SymbolPackageImpl;

import fr.inria.diverse.logo.value.ValuePackage;

import fr.inria.diverse.logo.value.impl.ValuePackageImpl;

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
public class ControlPackageImpl extends EPackageImpl implements ControlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatEClass = null;

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
	 * @see fr.inria.diverse.logo.statement.control.ControlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ControlPackageImpl() {
		super(eNS_URI, ControlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ControlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ControlPackage init() {
		if (isInited)
			return (ControlPackage) EPackage.Registry.INSTANCE.getEPackage(ControlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredControlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ControlPackageImpl theControlPackage = registeredControlPackage instanceof ControlPackageImpl
				? (ControlPackageImpl) registeredControlPackage
				: new ControlPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl) (registeredPackage instanceof ExpressionPackageImpl
				? registeredPackage
				: ExpressionPackage.eINSTANCE);
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
		theControlPackage.createPackageContents();
		theLogoPackage.createPackageContents();
		theStatementPackage.createPackageContents();
		theExpressionPackage.createPackageContents();
		theConstantPackage.createPackageContents();
		theUnaryPackage.createPackageContents();
		theBinaryPackage.createPackageContents();
		theExtendedPackage.createPackageContents();
		theSymbolPackage.createPackageContents();
		theValuePackage.createPackageContents();

		// Initialize created meta-data
		theControlPackage.initializePackageContents();
		theLogoPackage.initializePackageContents();
		theStatementPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theConstantPackage.initializePackageContents();
		theUnaryPackage.initializePackageContents();
		theBinaryPackage.initializePackageContents();
		theExtendedPackage.initializePackageContents();
		theSymbolPackage.initializePackageContents();
		theValuePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theControlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ControlPackage.eNS_URI, theControlPackage);
		return theControlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIf() {
		return ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_IfBlock() {
		return (EReference) ifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_ElseBlock() {
		return (EReference) ifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhile() {
		return whileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhile_Block() {
		return (EReference) whileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeat() {
		return repeatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeat_Block() {
		return (EReference) repeatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFactory getControlFactory() {
		return (ControlFactory) getEFactoryInstance();
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
		ifEClass = createEClass(IF);
		createEReference(ifEClass, IF__IF_BLOCK);
		createEReference(ifEClass, IF__ELSE_BLOCK);

		whileEClass = createEClass(WHILE);
		createEReference(whileEClass, WHILE__BLOCK);

		repeatEClass = createEClass(REPEAT);
		createEReference(repeatEClass, REPEAT__BLOCK);
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
		StatementPackage theStatementPackage = (StatementPackage) EPackage.Registry.INSTANCE
				.getEPackage(StatementPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ifEClass.getESuperTypes().add(theStatementPackage.getControlStatement());
		whileEClass.getESuperTypes().add(theStatementPackage.getControlStatement());
		repeatEClass.getESuperTypes().add(theStatementPackage.getControlStatement());

		// Initialize classes, features, and operations; add parameters
		initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIf_IfBlock(), theStatementPackage.getBlock(), null, "ifBlock", null, 1, 1, If.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIf_ElseBlock(), theStatementPackage.getBlock(), null, "elseBlock", null, 0, 1, If.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileEClass, While.class, "While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhile_Block(), theStatementPackage.getBlock(), null, "block", null, 1, 1, While.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatEClass, Repeat.class, "Repeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepeat_Block(), theStatementPackage.getBlock(), null, "block", null, 1, 1, Repeat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ControlPackageImpl
