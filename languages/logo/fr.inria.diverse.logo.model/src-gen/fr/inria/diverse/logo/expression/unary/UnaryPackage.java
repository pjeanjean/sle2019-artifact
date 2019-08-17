/**
 */
package fr.inria.diverse.logo.expression.unary;

import fr.inria.diverse.logo.expression.ExpressionPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see fr.inria.diverse.logo.expression.unary.UnaryFactory
 * @model kind="package"
 * @generated
 */
public interface UnaryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "unary";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/logo/expression/unary";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "unary";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UnaryPackage eINSTANCE = fr.inria.diverse.logo.expression.unary.impl.UnaryPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.diverse.logo.expression.unary.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.logo.expression.unary.impl.NotImpl
	 * @see fr.inria.diverse.logo.expression.unary.impl.UnaryPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__EXPRESSION = ExpressionPackage.UNARY_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = ExpressionPackage.UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = ExpressionPackage.UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.logo.expression.unary.impl.OppositeImpl <em>Opposite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.logo.expression.unary.impl.OppositeImpl
	 * @see fr.inria.diverse.logo.expression.unary.impl.UnaryPackageImpl#getOpposite()
	 * @generated
	 */
	int OPPOSITE = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE__EXPRESSION = ExpressionPackage.UNARY_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Opposite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_FEATURE_COUNT = ExpressionPackage.UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Opposite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_OPERATION_COUNT = ExpressionPackage.UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.logo.expression.unary.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see fr.inria.diverse.logo.expression.unary.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.logo.expression.unary.Opposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opposite</em>'.
	 * @see fr.inria.diverse.logo.expression.unary.Opposite
	 * @generated
	 */
	EClass getOpposite();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UnaryFactory getUnaryFactory();

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
		 * The meta object literal for the '{@link fr.inria.diverse.logo.expression.unary.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.logo.expression.unary.impl.NotImpl
		 * @see fr.inria.diverse.logo.expression.unary.impl.UnaryPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.logo.expression.unary.impl.OppositeImpl <em>Opposite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.logo.expression.unary.impl.OppositeImpl
		 * @see fr.inria.diverse.logo.expression.unary.impl.UnaryPackageImpl#getOpposite()
		 * @generated
		 */
		EClass OPPOSITE = eINSTANCE.getOpposite();

	}

} //UnaryPackage
