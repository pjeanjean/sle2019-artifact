/**
 */
package fr.inria.diverse.logo.expression;

import fr.inria.diverse.logo.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.logo.expression.ExtendedExpression#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.logo.expression.ExpressionPackage#getExtendedExpression()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ExtendedExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.logo.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see fr.inria.diverse.logo.expression.ExpressionPackage#getExtendedExpression_Expressions()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Expression> getExpressions();

} // ExtendedExpression
