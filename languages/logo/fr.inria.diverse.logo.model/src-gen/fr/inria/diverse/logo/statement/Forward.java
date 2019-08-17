/**
 */
package fr.inria.diverse.logo.statement;

import fr.inria.diverse.logo.Expression;
import fr.inria.diverse.logo.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forward</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.logo.statement.Forward#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.logo.statement.StatementPackage#getForward()
 * @model
 * @generated
 */
public interface Forward extends Statement {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference.
	 * @see #setStep(Expression)
	 * @see fr.inria.diverse.logo.statement.StatementPackage#getForward_Step()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getStep();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.logo.statement.Forward#getStep <em>Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' containment reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(Expression value);

} // Forward
