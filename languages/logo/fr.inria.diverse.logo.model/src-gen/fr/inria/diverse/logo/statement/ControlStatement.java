/**
 */
package fr.inria.diverse.logo.statement;

import fr.inria.diverse.logo.Expression;
import fr.inria.diverse.logo.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.logo.statement.ControlStatement#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.logo.statement.StatementPackage#getControlStatement()
 * @model abstract="true"
 * @generated
 */
public interface ControlStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see fr.inria.diverse.logo.statement.StatementPackage#getControlStatement_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.logo.statement.ControlStatement#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

} // ControlStatement
