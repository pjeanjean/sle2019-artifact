/**
 */
package fr.inria.diverse.logo.expression.binary;

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
 * @see fr.inria.diverse.logo.expression.binary.BinaryFactory
 * @model kind="package"
 * @generated
 */
public interface BinaryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "binary";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/logo/expression/binary";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "binary";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BinaryPackage eINSTANCE = fr.inria.diverse.logo.expression.binary.impl.BinaryPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.diverse.logo.expression.binary.impl.MinusImpl <em>Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.logo.expression.binary.impl.MinusImpl
	 * @see fr.inria.diverse.logo.expression.binary.impl.BinaryPackageImpl#getMinus()
	 * @generated
	 */
	int MINUS = 0;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__LEFT_EXPRESSION = ExpressionPackage.BINARY_EXPRESSION__LEFT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__RIGHT_EXPRESSION = ExpressionPackage.BINARY_EXPRESSION__RIGHT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_FEATURE_COUNT = ExpressionPackage.BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATION_COUNT = ExpressionPackage.BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.logo.expression.binary.impl.PlusImpl <em>Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.logo.expression.binary.impl.PlusImpl
	 * @see fr.inria.diverse.logo.expression.binary.impl.BinaryPackageImpl#getPlus()
	 * @generated
	 */
	int PLUS = 1;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__LEFT_EXPRESSION = ExpressionPackage.BINARY_EXPRESSION__LEFT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__RIGHT_EXPRESSION = ExpressionPackage.BINARY_EXPRESSION__RIGHT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FEATURE_COUNT = ExpressionPackage.BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATION_COUNT = ExpressionPackage.BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.logo.expression.binary.impl.MultImpl <em>Mult</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.logo.expression.binary.impl.MultImpl
	 * @see fr.inria.diverse.logo.expression.binary.impl.BinaryPackageImpl#getMult()
	 * @generated
	 */
	int MULT = 2;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT__LEFT_EXPRESSION = ExpressionPackage.BINARY_EXPRESSION__LEFT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT__RIGHT_EXPRESSION = ExpressionPackage.BINARY_EXPRESSION__RIGHT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Mult</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT_FEATURE_COUNT = ExpressionPackage.BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mult</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT_OPERATION_COUNT = ExpressionPackage.BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.logo.expression.binary.impl.DivImpl <em>Div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.logo.expression.binary.impl.DivImpl
	 * @see fr.inria.diverse.logo.expression.binary.impl.BinaryPackageImpl#getDiv()
	 * @generated
	 */
	int DIV = 3;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__LEFT_EXPRESSION = ExpressionPackage.BINARY_EXPRESSION__LEFT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__RIGHT_EXPRESSION = ExpressionPackage.BINARY_EXPRESSION__RIGHT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_FEATURE_COUNT = ExpressionPackage.BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_OPERATION_COUNT = ExpressionPackage.BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.logo.expression.binary.impl.EqualsImpl <em>Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.logo.expression.binary.impl.EqualsImpl
	 * @see fr.inria.diverse.logo.expression.binary.impl.BinaryPackageImpl#getEquals()
	 * @generated
	 */
	int EQUALS = 4;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__LEFT_EXPRESSION = ExpressionPackage.BINARY_EXPRESSION__LEFT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__RIGHT_EXPRESSION = ExpressionPackage.BINARY_EXPRESSION__RIGHT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FEATURE_COUNT = ExpressionPackage.BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_OPERATION_COUNT = ExpressionPackage.BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.logo.expression.binary.impl.GreaterImpl <em>Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.logo.expression.binary.impl.GreaterImpl
	 * @see fr.inria.diverse.logo.expression.binary.impl.BinaryPackageImpl#getGreater()
	 * @generated
	 */
	int GREATER = 5;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__LEFT_EXPRESSION = ExpressionPackage.BINARY_EXPRESSION__LEFT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__RIGHT_EXPRESSION = ExpressionPackage.BINARY_EXPRESSION__RIGHT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_FEATURE_COUNT = ExpressionPackage.BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATION_COUNT = ExpressionPackage.BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.logo.expression.binary.impl.LowerImpl <em>Lower</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.logo.expression.binary.impl.LowerImpl
	 * @see fr.inria.diverse.logo.expression.binary.impl.BinaryPackageImpl#getLower()
	 * @generated
	 */
	int LOWER = 6;

	/**
	 * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER__LEFT_EXPRESSION = ExpressionPackage.BINARY_EXPRESSION__LEFT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER__RIGHT_EXPRESSION = ExpressionPackage.BINARY_EXPRESSION__RIGHT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Lower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_FEATURE_COUNT = ExpressionPackage.BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_OPERATION_COUNT = ExpressionPackage.BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.logo.expression.binary.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus</em>'.
	 * @see fr.inria.diverse.logo.expression.binary.Minus
	 * @generated
	 */
	EClass getMinus();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.logo.expression.binary.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see fr.inria.diverse.logo.expression.binary.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.logo.expression.binary.Mult <em>Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mult</em>'.
	 * @see fr.inria.diverse.logo.expression.binary.Mult
	 * @generated
	 */
	EClass getMult();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.logo.expression.binary.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div</em>'.
	 * @see fr.inria.diverse.logo.expression.binary.Div
	 * @generated
	 */
	EClass getDiv();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.logo.expression.binary.Equals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equals</em>'.
	 * @see fr.inria.diverse.logo.expression.binary.Equals
	 * @generated
	 */
	EClass getEquals();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.logo.expression.binary.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater</em>'.
	 * @see fr.inria.diverse.logo.expression.binary.Greater
	 * @generated
	 */
	EClass getGreater();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.logo.expression.binary.Lower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower</em>'.
	 * @see fr.inria.diverse.logo.expression.binary.Lower
	 * @generated
	 */
	EClass getLower();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BinaryFactory getBinaryFactory();

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
		 * The meta object literal for the '{@link fr.inria.diverse.logo.expression.binary.impl.MinusImpl <em>Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.logo.expression.binary.impl.MinusImpl
		 * @see fr.inria.diverse.logo.expression.binary.impl.BinaryPackageImpl#getMinus()
		 * @generated
		 */
		EClass MINUS = eINSTANCE.getMinus();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.logo.expression.binary.impl.PlusImpl <em>Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.logo.expression.binary.impl.PlusImpl
		 * @see fr.inria.diverse.logo.expression.binary.impl.BinaryPackageImpl#getPlus()
		 * @generated
		 */
		EClass PLUS = eINSTANCE.getPlus();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.logo.expression.binary.impl.MultImpl <em>Mult</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.logo.expression.binary.impl.MultImpl
		 * @see fr.inria.diverse.logo.expression.binary.impl.BinaryPackageImpl#getMult()
		 * @generated
		 */
		EClass MULT = eINSTANCE.getMult();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.logo.expression.binary.impl.DivImpl <em>Div</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.logo.expression.binary.impl.DivImpl
		 * @see fr.inria.diverse.logo.expression.binary.impl.BinaryPackageImpl#getDiv()
		 * @generated
		 */
		EClass DIV = eINSTANCE.getDiv();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.logo.expression.binary.impl.EqualsImpl <em>Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.logo.expression.binary.impl.EqualsImpl
		 * @see fr.inria.diverse.logo.expression.binary.impl.BinaryPackageImpl#getEquals()
		 * @generated
		 */
		EClass EQUALS = eINSTANCE.getEquals();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.logo.expression.binary.impl.GreaterImpl <em>Greater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.logo.expression.binary.impl.GreaterImpl
		 * @see fr.inria.diverse.logo.expression.binary.impl.BinaryPackageImpl#getGreater()
		 * @generated
		 */
		EClass GREATER = eINSTANCE.getGreater();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.logo.expression.binary.impl.LowerImpl <em>Lower</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.logo.expression.binary.impl.LowerImpl
		 * @see fr.inria.diverse.logo.expression.binary.impl.BinaryPackageImpl#getLower()
		 * @generated
		 */
		EClass LOWER = eINSTANCE.getLower();

	}

} //BinaryPackage
