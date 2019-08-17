/**
 */
package fr.inria.diverse.logo.expression;

import fr.inria.diverse.logo.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Read</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.logo.expression.VariableRead#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.logo.expression.ExpressionPackage#getVariableRead()
 * @model
 * @generated
 */
public interface VariableRead extends Expression {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.inria.diverse.logo.expression.ExpressionPackage#getVariableRead_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.logo.expression.VariableRead#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // VariableRead
