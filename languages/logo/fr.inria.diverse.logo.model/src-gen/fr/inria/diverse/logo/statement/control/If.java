/**
 */
package fr.inria.diverse.logo.statement.control;

import fr.inria.diverse.logo.statement.Block;
import fr.inria.diverse.logo.statement.ControlStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.logo.statement.control.If#getIfBlock <em>If Block</em>}</li>
 *   <li>{@link fr.inria.diverse.logo.statement.control.If#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.logo.statement.control.ControlPackage#getIf()
 * @model
 * @generated
 */
public interface If extends ControlStatement {
	/**
	 * Returns the value of the '<em><b>If Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Block</em>' containment reference.
	 * @see #setIfBlock(Block)
	 * @see fr.inria.diverse.logo.statement.control.ControlPackage#getIf_IfBlock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Block getIfBlock();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.logo.statement.control.If#getIfBlock <em>If Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Block</em>' containment reference.
	 * @see #getIfBlock()
	 * @generated
	 */
	void setIfBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Else Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Block</em>' containment reference.
	 * @see #setElseBlock(Block)
	 * @see fr.inria.diverse.logo.statement.control.ControlPackage#getIf_ElseBlock()
	 * @model containment="true"
	 * @generated
	 */
	Block getElseBlock();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.logo.statement.control.If#getElseBlock <em>Else Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Block</em>' containment reference.
	 * @see #getElseBlock()
	 * @generated
	 */
	void setElseBlock(Block value);

} // If
