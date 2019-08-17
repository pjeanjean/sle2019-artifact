/**
 */
package fr.inria.diverse.logo.statement.impl;

import fr.inria.diverse.logo.Expression;

import fr.inria.diverse.logo.statement.ProcedureCall;
import fr.inria.diverse.logo.statement.ProcedureDefinition;
import fr.inria.diverse.logo.statement.StatementPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.logo.statement.impl.ProcedureCallImpl#getParameterValues <em>Parameter Values</em>}</li>
 *   <li>{@link fr.inria.diverse.logo.statement.impl.ProcedureCallImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureCallImpl extends MinimalEObjectImpl.Container implements ProcedureCall {
	/**
	 * The cached value of the '{@link #getParameterValues() <em>Parameter Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> parameterValues;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected ProcedureDefinition definition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.PROCEDURE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getParameterValues() {
		if (parameterValues == null) {
			parameterValues = new EObjectContainmentEList<Expression>(Expression.class, this,
					StatementPackage.PROCEDURE_CALL__PARAMETER_VALUES);
		}
		return parameterValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureDefinition getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject) definition;
			definition = (ProcedureDefinition) eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatementPackage.PROCEDURE_CALL__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureDefinition basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(ProcedureDefinition newDefinition) {
		ProcedureDefinition oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.PROCEDURE_CALL__DEFINITION,
					oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatementPackage.PROCEDURE_CALL__PARAMETER_VALUES:
			return ((InternalEList<?>) getParameterValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StatementPackage.PROCEDURE_CALL__PARAMETER_VALUES:
			return getParameterValues();
		case StatementPackage.PROCEDURE_CALL__DEFINITION:
			if (resolve)
				return getDefinition();
			return basicGetDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StatementPackage.PROCEDURE_CALL__PARAMETER_VALUES:
			getParameterValues().clear();
			getParameterValues().addAll((Collection<? extends Expression>) newValue);
			return;
		case StatementPackage.PROCEDURE_CALL__DEFINITION:
			setDefinition((ProcedureDefinition) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case StatementPackage.PROCEDURE_CALL__PARAMETER_VALUES:
			getParameterValues().clear();
			return;
		case StatementPackage.PROCEDURE_CALL__DEFINITION:
			setDefinition((ProcedureDefinition) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case StatementPackage.PROCEDURE_CALL__PARAMETER_VALUES:
			return parameterValues != null && !parameterValues.isEmpty();
		case StatementPackage.PROCEDURE_CALL__DEFINITION:
			return definition != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcedureCallImpl
