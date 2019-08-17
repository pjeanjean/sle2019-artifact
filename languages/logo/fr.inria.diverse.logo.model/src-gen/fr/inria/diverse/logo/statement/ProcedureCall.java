/**
 */
package fr.inria.diverse.logo.statement;

import fr.inria.diverse.logo.Expression;
import fr.inria.diverse.logo.Statement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.logo.statement.ProcedureCall#getParameterValues <em>Parameter Values</em>}</li>
 *   <li>{@link fr.inria.diverse.logo.statement.ProcedureCall#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.logo.statement.StatementPackage#getProcedureCall()
 * @model
 * @generated
 */
public interface ProcedureCall extends Statement {
	/**
	 * Returns the value of the '<em><b>Parameter Values</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.logo.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Values</em>' containment reference list.
	 * @see fr.inria.diverse.logo.statement.StatementPackage#getProcedureCall_ParameterValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getParameterValues();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(ProcedureDefinition)
	 * @see fr.inria.diverse.logo.statement.StatementPackage#getProcedureCall_Definition()
	 * @model required="true"
	 * @generated
	 */
	ProcedureDefinition getDefinition();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.logo.statement.ProcedureCall#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(ProcedureDefinition value);

} // ProcedureCall
