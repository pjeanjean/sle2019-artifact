/**
 */
package fr.inria.diverse.logo.expression.unary.impl;

import fr.inria.diverse.logo.LogoPackage;

import fr.inria.diverse.logo.expression.ExpressionPackage;

import fr.inria.diverse.logo.expression.binary.BinaryPackage;

import fr.inria.diverse.logo.expression.binary.impl.BinaryPackageImpl;

import fr.inria.diverse.logo.expression.constant.ConstantPackage;

import fr.inria.diverse.logo.expression.constant.impl.ConstantPackageImpl;

import fr.inria.diverse.logo.expression.extended.ExtendedPackage;

import fr.inria.diverse.logo.expression.extended.impl.ExtendedPackageImpl;

import fr.inria.diverse.logo.expression.impl.ExpressionPackageImpl;

import fr.inria.diverse.logo.expression.unary.Not;
import fr.inria.diverse.logo.expression.unary.Opposite;
import fr.inria.diverse.logo.expression.unary.UnaryFactory;
import fr.inria.diverse.logo.expression.unary.UnaryPackage;

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
public class UnaryPackageImpl extends EPackageImpl implements UnaryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oppositeEClass = null;

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
	 * @see fr.inria.diverse.logo.expression.unary.UnaryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UnaryPackageImpl() {
		super(eNS_URI, UnaryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UnaryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UnaryPackage init() {
		if (isInited)
			return (UnaryPackage) EPackage.Registry.INSTANCE.getEPackage(UnaryPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUnaryPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UnaryPackageImpl theUnaryPackage = registeredUnaryPackage instanceof UnaryPackageImpl
				? (UnaryPackageImpl) registeredUnaryPackage
				: new UnaryPackageImpl();

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
		theUnaryPackage.createPackageContents();
		theLogoPackage.createPackageContents();
		theStatementPackage.createPackageContents();
		theControlPackage.createPackageContents();
		theExpressionPackage.createPackageContents();
		theConstantPackage.createPackageContents();
		theBinaryPackage.createPackageContents();
		theExtendedPackage.createPackageContents();
		theSymbolPackage.createPackageContents();
		theValuePackage.createPackageContents();

		// Initialize created meta-data
		theUnaryPackage.initializePackageContents();
		theLogoPackage.initializePackageContents();
		theStatementPackage.initializePackageContents();
		theControlPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theConstantPackage.initializePackageContents();
		theBinaryPackage.initializePackageContents();
		theExtendedPackage.initializePackageContents();
		theSymbolPackage.initializePackageContents();
		theValuePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUnaryPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UnaryPackage.eNS_URI, theUnaryPackage);
		return theUnaryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpposite() {
		return oppositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryFactory getUnaryFactory() {
		return (UnaryFactory) getEFactoryInstance();
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
		notEClass = createEClass(NOT);

		oppositeEClass = createEClass(OPPOSITE);
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
		notEClass.getESuperTypes().add(theExpressionPackage.getUnaryExpression());
		oppositeEClass.getESuperTypes().add(theExpressionPackage.getUnaryExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oppositeEClass, Opposite.class, "Opposite", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
	}

} //UnaryPackageImpl
