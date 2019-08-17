/**
 */
package fr.inria.diverse.logo.statement;

import fr.inria.diverse.logo.LogoPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.logo.statement.StatementFactory
 * @model kind="package"
 * @generated
 */
public interface StatementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "statement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/logo/statement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "statement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatementPackage eINSTANCE = fr.inria.diverse.logo.statement.impl.StatementPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.diverse.logo.statement.impl.RightImpl <em>Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.logo.statement.impl.RightImpl
	 * @see fr.inria.diverse.logo.statement.impl.StatementPackageImpl#getRight()
	 * @generated
	 */
	int RIGHT = 0;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__ANGLE = LogoPackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_FEATURE_COUNT = LogoPackage.STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OPERATION_COUNT = LogoPackage.STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.logo.statement.impl.LeftImpl <em>Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.logo.statement.impl.LeftImpl
	 * @see fr.inria.diverse.logo.statement.impl.StatementPackageImpl#getLeft()
	 * @generated
	 */
	int LEFT = 1;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT__ANGLE = LogoPackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_FEATURE_COUNT = LogoPackage.STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_OPERATION_COUNT = LogoPackage.STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.logo.statement.impl.ForwardImpl <em>Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.logo.statement.impl.ForwardImpl
	 * @see fr.inria.diverse.logo.statement.impl.StatementPackageImpl#getForward()
	 * @generated
	 */
	int FORWARD = 2;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD__STEP = LogoPackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_FEATURE_COUNT = LogoPackage.STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_OPERATION_COUNT = LogoPackage.STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.logo.statement.impl.PenDownImpl <em>Pen Down</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.logo.statement.impl.PenDownImpl
	 * @see fr.inria.diverse.logo.statement.impl.StatementPackageImpl#getPenDown()
	 * @generated
	 */
	int PEN_DOWN = 3;

	/**
	 * The number of structural features of the '<em>Pen Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEN_DOWN_FEATURE_COUNT = LogoPackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pen Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEN_DOWN_OPERATION_COUNT = LogoPackage.STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.logo.statement.impl.PenUpImpl <em>Pen Up</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.logo.statement.impl.PenUpImpl
	 * @see fr.inria.diverse.logo.statement.impl.StatementPackageImpl#getPenUp()
	 * @generated
	 */
	int PEN_UP = 4;

	/**
	 * The number of structural features of the '<em>Pen Up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEN_UP_FEATURE_COUNT = LogoPackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pen Up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEN_UP_OPERATION_COUNT = LogoPackage.STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.logo.statement.impl.ProcedureDefinitionImpl <em>Procedure Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.logo.statement.impl.ProcedureDefinitionImpl
	 * @see fr.inria.diverse.logo.statement.impl.StatementPackageImpl#getProcedureDefinition()
	 * @generated
	 */
	int PROCEDURE_DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DEFINITION__PARAMETERS = LogoPackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DEFINITION__STATEMENTS = LogoPackage.STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DEFINITION__NAME = LogoPackage.STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Procedure Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DEFINITION_FEATURE_COUNT = LogoPackage.STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Procedure Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DEFINITION_OPERATION_COUNT = LogoPackage.STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.logo.statement.impl.ProcedureCallImpl <em>Procedure Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.logo.statement.impl.ProcedureCallImpl
	 * @see fr.inria.diverse.logo.statement.impl.StatementPackageImpl#getProcedureCall()
	 * @generated
	 */
	int PROCEDURE_CALL = 6;

	/**
	 * The feature id for the '<em><b>Parameter Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__PARAMETER_VALUES = LogoPackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL__DEFINITION = LogoPackage.STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Procedure Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL_FEATURE_COUNT = LogoPackage.STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Procedure Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_CALL_OPERATION_COUNT = LogoPackage.STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.logo.statement.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.logo.statement.impl.BlockImpl
	 * @see fr.inria.diverse.logo.statement.impl.StatementPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 7;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATEMENTS = LogoPackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = LogoPackage.STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = LogoPackage.STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.logo.statement.impl.ControlStatementImpl <em>Control Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.logo.statement.impl.ControlStatementImpl
	 * @see fr.inria.diverse.logo.statement.impl.StatementPackageImpl#getControlStatement()
	 * @generated
	 */
	int CONTROL_STATEMENT = 8;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT__CONDITION = LogoPackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT_FEATURE_COUNT = LogoPackage.STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Control Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STATEMENT_OPERATION_COUNT = LogoPackage.STATEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.logo.statement.Right <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right</em>'.
	 * @see fr.inria.diverse.logo.statement.Right
	 * @generated
	 */
	EClass getRight();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.logo.statement.Right#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angle</em>'.
	 * @see fr.inria.diverse.logo.statement.Right#getAngle()
	 * @see #getRight()
	 * @generated
	 */
	EReference getRight_Angle();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.logo.statement.Left <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left</em>'.
	 * @see fr.inria.diverse.logo.statement.Left
	 * @generated
	 */
	EClass getLeft();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.logo.statement.Left#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angle</em>'.
	 * @see fr.inria.diverse.logo.statement.Left#getAngle()
	 * @see #getLeft()
	 * @generated
	 */
	EReference getLeft_Angle();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.logo.statement.Forward <em>Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forward</em>'.
	 * @see fr.inria.diverse.logo.statement.Forward
	 * @generated
	 */
	EClass getForward();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.logo.statement.Forward#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Step</em>'.
	 * @see fr.inria.diverse.logo.statement.Forward#getStep()
	 * @see #getForward()
	 * @generated
	 */
	EReference getForward_Step();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.logo.statement.PenDown <em>Pen Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pen Down</em>'.
	 * @see fr.inria.diverse.logo.statement.PenDown
	 * @generated
	 */
	EClass getPenDown();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.logo.statement.PenUp <em>Pen Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pen Up</em>'.
	 * @see fr.inria.diverse.logo.statement.PenUp
	 * @generated
	 */
	EClass getPenUp();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.logo.statement.ProcedureDefinition <em>Procedure Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Definition</em>'.
	 * @see fr.inria.diverse.logo.statement.ProcedureDefinition
	 * @generated
	 */
	EClass getProcedureDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.logo.statement.ProcedureDefinition#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see fr.inria.diverse.logo.statement.ProcedureDefinition#getParameters()
	 * @see #getProcedureDefinition()
	 * @generated
	 */
	EReference getProcedureDefinition_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.logo.statement.ProcedureDefinition#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see fr.inria.diverse.logo.statement.ProcedureDefinition#getStatements()
	 * @see #getProcedureDefinition()
	 * @generated
	 */
	EReference getProcedureDefinition_Statements();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.logo.statement.ProcedureDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.logo.statement.ProcedureDefinition#getName()
	 * @see #getProcedureDefinition()
	 * @generated
	 */
	EAttribute getProcedureDefinition_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.logo.statement.ProcedureCall <em>Procedure Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Call</em>'.
	 * @see fr.inria.diverse.logo.statement.ProcedureCall
	 * @generated
	 */
	EClass getProcedureCall();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.logo.statement.ProcedureCall#getParameterValues <em>Parameter Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Values</em>'.
	 * @see fr.inria.diverse.logo.statement.ProcedureCall#getParameterValues()
	 * @see #getProcedureCall()
	 * @generated
	 */
	EReference getProcedureCall_ParameterValues();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.logo.statement.ProcedureCall#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see fr.inria.diverse.logo.statement.ProcedureCall#getDefinition()
	 * @see #getProcedureCall()
	 * @generated
	 */
	EReference getProcedureCall_Definition();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.logo.statement.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see fr.inria.diverse.logo.statement.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.logo.statement.Block#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see fr.inria.diverse.logo.statement.Block#getStatements()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Statements();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.logo.statement.ControlStatement <em>Control Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Statement</em>'.
	 * @see fr.inria.diverse.logo.statement.ControlStatement
	 * @generated
	 */
	EClass getControlStatement();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.logo.statement.ControlStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see fr.inria.diverse.logo.statement.ControlStatement#getCondition()
	 * @see #getControlStatement()
	 * @generated
	 */
	EReference getControlStatement_Condition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatementFactory getStatementFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.diverse.logo.statement.impl.RightImpl <em>Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.logo.statement.impl.RightImpl
		 * @see fr.inria.diverse.logo.statement.impl.StatementPackageImpl#getRight()
		 * @generated
		 */
		EClass RIGHT = eINSTANCE.getRight();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT__ANGLE = eINSTANCE.getRight_Angle();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.logo.statement.impl.LeftImpl <em>Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.logo.statement.impl.LeftImpl
		 * @see fr.inria.diverse.logo.statement.impl.StatementPackageImpl#getLeft()
		 * @generated
		 */
		EClass LEFT = eINSTANCE.getLeft();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEFT__ANGLE = eINSTANCE.getLeft_Angle();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.logo.statement.impl.ForwardImpl <em>Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.logo.statement.impl.ForwardImpl
		 * @see fr.inria.diverse.logo.statement.impl.StatementPackageImpl#getForward()
		 * @generated
		 */
		EClass FORWARD = eINSTANCE.getForward();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORWARD__STEP = eINSTANCE.getForward_Step();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.logo.statement.impl.PenDownImpl <em>Pen Down</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.logo.statement.impl.PenDownImpl
		 * @see fr.inria.diverse.logo.statement.impl.StatementPackageImpl#getPenDown()
		 * @generated
		 */
		EClass PEN_DOWN = eINSTANCE.getPenDown();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.logo.statement.impl.PenUpImpl <em>Pen Up</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.logo.statement.impl.PenUpImpl
		 * @see fr.inria.diverse.logo.statement.impl.StatementPackageImpl#getPenUp()
		 * @generated
		 */
		EClass PEN_UP = eINSTANCE.getPenUp();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.logo.statement.impl.ProcedureDefinitionImpl <em>Procedure Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.logo.statement.impl.ProcedureDefinitionImpl
		 * @see fr.inria.diverse.logo.statement.impl.StatementPackageImpl#getProcedureDefinition()
		 * @generated
		 */
		EClass PROCEDURE_DEFINITION = eINSTANCE.getProcedureDefinition();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE_DEFINITION__PARAMETERS = eINSTANCE.getProcedureDefinition_Parameters();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE_DEFINITION__STATEMENTS = eINSTANCE.getProcedureDefinition_Statements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE_DEFINITION__NAME = eINSTANCE.getProcedureDefinition_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.logo.statement.impl.ProcedureCallImpl <em>Procedure Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.logo.statement.impl.ProcedureCallImpl
		 * @see fr.inria.diverse.logo.statement.impl.StatementPackageImpl#getProcedureCall()
		 * @generated
		 */
		EClass PROCEDURE_CALL = eINSTANCE.getProcedureCall();

		/**
		 * The meta object literal for the '<em><b>Parameter Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE_CALL__PARAMETER_VALUES = eINSTANCE.getProcedureCall_ParameterValues();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE_CALL__DEFINITION = eINSTANCE.getProcedureCall_Definition();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.logo.statement.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.logo.statement.impl.BlockImpl
		 * @see fr.inria.diverse.logo.statement.impl.StatementPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__STATEMENTS = eINSTANCE.getBlock_Statements();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.logo.statement.impl.ControlStatementImpl <em>Control Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.logo.statement.impl.ControlStatementImpl
		 * @see fr.inria.diverse.logo.statement.impl.StatementPackageImpl#getControlStatement()
		 * @generated
		 */
		EClass CONTROL_STATEMENT = eINSTANCE.getControlStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STATEMENT__CONDITION = eINSTANCE.getControlStatement_Condition();

	}

} //StatementPackage
