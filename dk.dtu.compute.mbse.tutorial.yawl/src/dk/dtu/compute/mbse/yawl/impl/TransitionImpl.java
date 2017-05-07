package dk.dtu.compute.mbse.yawl.impl;

import dk.dtu.compute.mbse.yawl.Transition;
import dk.dtu.compute.mbse.yawl.TransitionType;
import dk.dtu.compute.mbse.yawl.YawlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mbse.yawl.impl.ArcImpl#getArctype <em>Arctype</em>}</li>
 * </ul>
 *
 * @generated
 * @author Tolga
 */
public class TransitionImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.TransitionImpl implements Transition {
	/**
	 * The cached value of the '{@link #getPlacetype() <em>Arctype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacetype()
	 * @generated
	 * @ordered
	 */
	protected TransitionType splitType;
	
	/**
	 * The cached value of the '{@link #getPlacetype() <em>Arctype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacetype()
	 * @generated
	 * @ordered
	 */
	protected TransitionType joinType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YawlPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType getSplitType() {
		return splitType;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType getJoinType() {
		return joinType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSplitType(TransitionType newSplitType, NotificationChain msgs) {
		TransitionType oldSplitType = splitType;
		splitType = newSplitType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YawlPackage.TRANSITION_SPLIT_TYPE, oldSplitType, newSplitType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoinType(TransitionType newJoinType, NotificationChain msgs) {
		TransitionType oldJoinType = joinType;
		joinType = newJoinType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YawlPackage.TRANSITION_JOIN_TYPE, oldJoinType, newJoinType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplitType(TransitionType newSplitType) {
		if (newSplitType != splitType) {
			NotificationChain msgs = null;
			if (splitType != null)
				msgs = ((InternalEObject)splitType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YawlPackage.TRANSITION_SPLIT_TYPE, null, msgs);
			if (newSplitType != null)
				msgs = ((InternalEObject)newSplitType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YawlPackage.TRANSITION_SPLIT_TYPE, null, msgs);
			msgs = basicSetSplitType(newSplitType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawlPackage.TRANSITION_SPLIT_TYPE, newSplitType, newSplitType));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinType(TransitionType newJoinType) {
		if (newJoinType != joinType) {
			NotificationChain msgs = null;
			if (joinType != null)
				msgs = ((InternalEObject)joinType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YawlPackage.TRANSITION_JOIN_TYPE, null, msgs);
			if (newJoinType != null)
				msgs = ((InternalEObject)newJoinType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YawlPackage.TRANSITION_JOIN_TYPE, null, msgs);
			msgs = basicSetJoinType(newJoinType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawlPackage.TRANSITION_JOIN_TYPE, newJoinType, newJoinType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YawlPackage.TRANSITION_SPLIT_TYPE:
				return basicSetSplitType(null, msgs);
			case YawlPackage.TRANSITION_JOIN_TYPE:
				return basicSetJoinType(null, msgs);
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
			case YawlPackage.TRANSITION_SPLIT_TYPE:
				return getSplitType();
			case YawlPackage.TRANSITION_JOIN_TYPE:
				return getJoinType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case YawlPackage.TRANSITION_SPLIT_TYPE:
				setSplitType((TransitionType)newValue);
				return;
			case YawlPackage.TRANSITION_JOIN_TYPE:
				setJoinType((TransitionType)newValue);
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
			case YawlPackage.TRANSITION_SPLIT_TYPE:
				setSplitType((TransitionType)null);
				return;
			case YawlPackage.TRANSITION_JOIN_TYPE:
				setJoinType((TransitionType)null);
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
			case YawlPackage.TRANSITION_SPLIT_TYPE:
				return splitType != null;
			case YawlPackage.TRANSITION_JOIN_TYPE:
				return joinType != null;
		}
		return super.eIsSet(featureID);
	}
} //PlaceImpl
