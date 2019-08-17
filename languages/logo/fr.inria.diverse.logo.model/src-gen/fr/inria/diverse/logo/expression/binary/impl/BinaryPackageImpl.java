/**
 */
package fr.inria.diverse.logo.expression.binary.impl;

import fr.inria.diverse.logo.LogoPackage;

import fr.inria.diverse.logo.expression.ExpressionPackage;

import fr.inria.diverse.logo.expression.binary.BinaryFactory;
import fr.inria.diverse.logo.expression.binary.BinaryPackage;
import fr.inria.diverse.logo.expression.binary.Div;
import fr.inria.diverse.logo.expression.binary.Equals;
import fr.inria.diverse.logo.expression.binary.Greater;
import fr.inria.diverse.logo.expression.binary.Lower;
import fr.inria.diverse.logo.expression.binary.Minus;
import fr.inria.diverse.logo.expression.binary.Mult;
import fr.inria.diverse.logo.expression.binary.Plus;

import fr.inria.diverse.logo.expression.constant.ConstantPackage;

import fr.inria.diverse.logo.expression.constant.impl.ConstantPackageImpl;

import fr.inria.diverse.logo.expression.extended.ExtendedPackage;

import fr.inria.diverse.logo.expression.extended.impl.ExtendedPackageImpl;

import fr.inria.diverse.logo.expression.impl.ExpressionPackageImpl;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryPackageImpl extends EPackageImpl implements BinaryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lowerEClass = null;

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
	 * @see fr.inria.diverse.logo.expression.binary.BinaryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BinaryPackageImpl() {
		super(eNS_URI, BinaryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BinaryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BinaryPackage init() {
		if (isInited)
			return (BinaryPackage) EPackage.Registry.INSTANCE.getEPackage(BinaryPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBinaryPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BinaryPackageImpl theBinaryPackage = registeredBinaryPackage instanceof BinaryPackageImpl
				? (BinaryPackageImpl) registeredBinaryPackage
				: new BinaryPackageImpl();

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
		theBinaryPackage.createPackageContents();
		theLogoPackage.createPackageContents();
		theStatementPackage.createPackageContents();
		theControlPackage.createPackageContents();
		theExpressionPackage.createPackageContents();
		theConstantPackage.createPackageContents();
		theUnaryPackage.createPackageContents();
		theExtendedPackage.createPackageContents();
		theSymbolPackage.createPackageContents();
		theValuePackage.createPackageContents();

		// Initialize created meta-data
		theBinaryPackage.initializePackageContents();
		theLogoPackage.initializePackageContents();
		theStatementPackage.initializePackageContents();
		theControlPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theConstantPackage.initializePackageContents();
		theUnaryPackage.initializePackageContents();
		theExtendedPackage.initializePackageContents();
		theSymbolPackage.initializePackageContents();
		theValuePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBinaryPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BinaryPackage.eNS_URI, theBinaryPackage);
		return theBinaryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinus() {
		return minusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlus() {
		return plusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMult() {
		return multEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiv() {
		return divEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquals() {
		return equalsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreater() {
		return greaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLower() {
		return lowerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryFactory getBinaryFactory() {
		return (BinaryFactory) getEFactoryInstance();
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
		minusEClass = createEClass(MINUS);

		plusEClass = createEClass(PLUS);

		multEClass = createEClass(MULT);

		divEClass = createEClass(DIV);

		equalsEClass = createEClass(EQUALS);

		greaterEClass = createEClass(GREATER);

		lowerEClass = createEClass(LOWER);
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
		ExpressionPackage theExpressionPackage = (ExpressionPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExpressionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		minusEClass.getESuperTypes().add(theExpressionPackage.getBinaryExpression());
		plusEClass.getESuperTypes().add(theExpressionPackage.getBinaryExpression());
		multEClass.getESuperTypes().add(theExpressionPackage.getBinaryExpression());
		divEClass.getESuperTypes().add(theExpressionPackage.getBinaryExpression());
		equalsEClass.getESuperTypes().add(theExpressionPackage.getBinaryExpression());
		greaterEClass.getESuperTypes().add(theExpressionPackage.getBinaryExpression());
		lowerEClass.getESuperTypes().add(theExpressionPackage.getBinaryExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(minusEClass, Minus.class, "Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(plusEClass, Plus.class, "Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multEClass, Mult.class, "Mult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divEClass, Div.class, "Div", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equalsEClass, Equals.class, "Equals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterEClass, Greater.class, "Greater", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lowerEClass, Lower.class, "Lower", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //BinaryPackageImpl
