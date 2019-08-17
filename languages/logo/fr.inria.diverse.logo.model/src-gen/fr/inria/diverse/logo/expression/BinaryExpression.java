/**
 */
package fr.inria.diverse.logo.expression;

import fr.inria.diverse.logo.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.logo.expression.BinaryExpression#getLeftExpression <em>Left Expression</em>}</li>
 *   <li>{@link fr.inria.diverse.logo.expression.BinaryExpression#getRightExpression <em>Right Expression</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.logo.expression.ExpressionPackage#getBinaryExpression()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BinaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Expression</em>' containment reference.
	 * @see #setLeftExpression(Expression)
	 * @see fr.inria.diverse.logo.expression.ExpressionPackage#getBinaryExpression_LeftExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeftExpression();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.logo.expression.BinaryExpression#getLeftExpression <em>Left Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Expression</em>' containment reference.
	 * @see #getLeftExpression()
	 * @generated
	 */
	void setLeftExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Expression</em>' containment reference.
	 * @see #setRightExpression(Expression)
	 * @see fr.inria.diverse.logo.expression.ExpressionPackage#getBinaryExpression_RightExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRightExpression();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.logo.expression.BinaryExpression#getRightExpression <em>Right Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Expression</em>' containment reference.
	 * @see #getRightExpression()
	 * @generated
	 */
	void setRightExpression(Expression value);

} // BinaryExpression
