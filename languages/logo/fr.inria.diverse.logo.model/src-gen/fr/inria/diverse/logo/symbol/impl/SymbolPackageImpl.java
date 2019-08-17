/**
 */
package fr.inria.diverse.logo.symbol.impl;

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

import fr.inria.diverse.logo.statement.control.ControlPackage;

import fr.inria.diverse.logo.statement.control.impl.ControlPackageImpl;

import fr.inria.diverse.logo.statement.impl.StatementPackageImpl;

import fr.inria.diverse.logo.symbol.Procedure;
import fr.inria.diverse.logo.symbol.SymbolFactory;
import fr.inria.diverse.logo.symbol.SymbolPackage;
import fr.inria.diverse.logo.symbol.Variable;

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
public class SymbolPackageImpl extends EPackageImpl implements SymbolPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureEClass = null;

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
	 * @see fr.inria.diverse.logo.symbol.SymbolPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SymbolPackageImpl() {
		super(eNS_URI, SymbolFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SymbolPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SymbolPackage init() {
		if (isInited)
			return (SymbolPackage) EPackage.Registry.INSTANCE.getEPackage(SymbolPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSymbolPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SymbolPackageImpl theSymbolPackage = registeredSymbolPackage instanceof SymbolPackageImpl
				? (SymbolPackageImpl) registeredSymbolPackage
				: new SymbolPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BinaryPackage.eNS_URI);
		BinaryPackageImpl theBinaryPackage = (BinaryPackageImpl) (registeredPackage instanceof BinaryPackageImpl
				? registeredPackage
				: BinaryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExtendedPackage.eNS_URI);
		ExtendedPackageImpl theExtendedPackage = (ExtendedPackageImpl) (registeredPackage instanceof ExtendedPackageImpl
				? registeredPackage
				: ExtendedPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ValuePackage.eNS_URI);
		ValuePackageImpl theValuePackage = (ValuePackageImpl) (registeredPackage instanceof ValuePackageImpl
				? registeredPackage
				: ValuePackage.eINSTANCE);

		// Create package meta-data objects
		theSymbolPackage.createPackageContents();
		theLogoPackage.createPackageContents();
		theStatementPackage.createPackageContents();
		theControlPackage.createPackageContents();
		theExpressionPackage.createPackageContents();
		theConstantPackage.createPackageContents();
		theUnaryPackage.createPackageContents();
		theBinaryPackage.createPackageContents();
		theExtendedPackage.createPackageContents();
		theValuePackage.createPackageContents();

		// Initialize created meta-data
		theSymbolPackage.initializePackageContents();
		theLogoPackage.initializePackageContents();
		theStatementPackage.initializePackageContents();
		theControlPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theConstantPackage.initializePackageContents();
		theUnaryPackage.initializePackageContents();
		theBinaryPackage.initializePackageContents();
		theExtendedPackage.initializePackageContents();
		theValuePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymbolPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SymbolPackage.eNS_URI, theSymbolPackage);
		return theSymbolPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedure() {
		return procedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolFactory getSymbolFactory() {
		return (SymbolFactory) getEFactoryInstance();
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
		variableEClass = createEClass(VARIABLE);

		procedureEClass = createEClass(PROCEDURE);
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
		LogoPackage theLogoPackage = (LogoPackage) EPackage.Registry.INSTANCE.getEPackage(LogoPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		variableEClass.getESuperTypes().add(theLogoPackage.getSymbol());
		procedureEClass.getESuperTypes().add(theLogoPackage.getSymbol());

		// Initialize classes, features, and operations; add parameters
		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(procedureEClass, Procedure.class, "Procedure", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
	}

} //SymbolPackageImpl
