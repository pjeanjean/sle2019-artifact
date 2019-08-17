/**
 */
package org.tetrabox.minijava.xtext.miniJava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interpreter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.Interpreter#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getInterpreter()
 * @model
 * @generated
 */
public interface Interpreter extends EObject {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' reference list.
	 * The list contents are of type {@link org.tetrabox.minijava.xtext.miniJava.InterpretableInstruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' reference list.
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getInterpreter_Instructions()
	 * @model
	 * @generated
	 */
	EList<InterpretableInstruction> getInstructions();

} // Interpreter
