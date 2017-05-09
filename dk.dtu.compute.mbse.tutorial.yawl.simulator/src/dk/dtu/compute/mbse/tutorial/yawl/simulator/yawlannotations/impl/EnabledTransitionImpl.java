/**
 */
package dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl;

import dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition;
import dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.InvolvedArc;
import dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.YawlannotationsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.pnml.tools.epnk.annotations.netannotations.impl.ObjectAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enabled Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.EnabledTransitionImpl#getIn <em>In</em>}</li>
 *   <li>{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.EnabledTransitionImpl#getOut <em>Out</em>}</li>
 *   <li>{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.EnabledTransitionImpl#getResolve <em>Resolve</em>}</li>
 *   <li>{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.EnabledTransitionImpl#getRefs <em>Refs</em>}</li>
 *   <li>{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.EnabledTransitionImpl#isEnabled <em>Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnabledTransitionImpl extends ObjectAnnotationImpl implements EnabledTransition {
	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<InvolvedArc> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<InvolvedArc> out;

	/**
	 * The cached value of the '{@link #getResolve() <em>Resolve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolve()
	 * @generated
	 * @ordered
	 */
	protected EnabledTransition resolve;

	/**
	 * The cached value of the '{@link #getRefs() <em>Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<EnabledTransition> refs;

	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnabledTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YawlannotationsPackage.Literals.ENABLED_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InvolvedArc> getIn() {
		if (in == null) {
			in = new EObjectContainmentWithInverseEList<InvolvedArc>(InvolvedArc.class, this, YawlannotationsPackage.ENABLED_TRANSITION__IN, YawlannotationsPackage.INVOLVED_ARC__TARGET);
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InvolvedArc> getOut() {
		if (out == null) {
			out = new EObjectContainmentWithInverseEList<InvolvedArc>(InvolvedArc.class, this, YawlannotationsPackage.ENABLED_TRANSITION__OUT, YawlannotationsPackage.INVOLVED_ARC__SOURCE);
		}
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledTransition getResolve() {
		if (resolve != null && resolve.eIsProxy()) {
			InternalEObject oldResolve = (InternalEObject)resolve;
			resolve = (EnabledTransition)eResolveProxy(oldResolve);
			if (resolve != oldResolve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YawlannotationsPackage.ENABLED_TRANSITION__RESOLVE, oldResolve, resolve));
			}
		}
		return resolve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledTransition basicGetResolve() {
		return resolve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResolve(EnabledTransition newResolve, NotificationChain msgs) {
		EnabledTransition oldResolve = resolve;
		resolve = newResolve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YawlannotationsPackage.ENABLED_TRANSITION__RESOLVE, oldResolve, newResolve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolve(EnabledTransition newResolve) {
		if (newResolve != resolve) {
			NotificationChain msgs = null;
			if (resolve != null)
				msgs = ((InternalEObject)resolve).eInverseRemove(this, YawlannotationsPackage.ENABLED_TRANSITION__REFS, EnabledTransition.class, msgs);
			if (newResolve != null)
				msgs = ((InternalEObject)newResolve).eInverseAdd(this, YawlannotationsPackage.ENABLED_TRANSITION__REFS, EnabledTransition.class, msgs);
			msgs = basicSetResolve(newResolve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawlannotationsPackage.ENABLED_TRANSITION__RESOLVE, newResolve, newResolve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnabledTransition> getRefs() {
		if (refs == null) {
			refs = new EObjectWithInverseResolvingEList<EnabledTransition>(EnabledTransition.class, this, YawlannotationsPackage.ENABLED_TRANSITION__REFS, YawlannotationsPackage.ENABLED_TRANSITION__RESOLVE);
		}
		return refs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawlannotationsPackage.ENABLED_TRANSITION__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YawlannotationsPackage.ENABLED_TRANSITION__IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIn()).basicAdd(otherEnd, msgs);
			case YawlannotationsPackage.ENABLED_TRANSITION__OUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOut()).basicAdd(otherEnd, msgs);
			case YawlannotationsPackage.ENABLED_TRANSITION__RESOLVE:
				if (resolve != null)
					msgs = ((InternalEObject)resolve).eInverseRemove(this, YawlannotationsPackage.ENABLED_TRANSITION__REFS, EnabledTransition.class, msgs);
				return basicSetResolve((EnabledTransition)otherEnd, msgs);
			case YawlannotationsPackage.ENABLED_TRANSITION__REFS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YawlannotationsPackage.ENABLED_TRANSITION__IN:
				return ((InternalEList<?>)getIn()).basicRemove(otherEnd, msgs);
			case YawlannotationsPackage.ENABLED_TRANSITION__OUT:
				return ((InternalEList<?>)getOut()).basicRemove(otherEnd, msgs);
			case YawlannotationsPackage.ENABLED_TRANSITION__RESOLVE:
				return basicSetResolve(null, msgs);
			case YawlannotationsPackage.ENABLED_TRANSITION__REFS:
				return ((InternalEList<?>)getRefs()).basicRemove(otherEnd, msgs);
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
			case YawlannotationsPackage.ENABLED_TRANSITION__IN:
				return getIn();
			case YawlannotationsPackage.ENABLED_TRANSITION__OUT:
				return getOut();
			case YawlannotationsPackage.ENABLED_TRANSITION__RESOLVE:
				if (resolve) return getResolve();
				return basicGetResolve();
			case YawlannotationsPackage.ENABLED_TRANSITION__REFS:
				return getRefs();
			case YawlannotationsPackage.ENABLED_TRANSITION__ENABLED:
				return isEnabled();
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
			case YawlannotationsPackage.ENABLED_TRANSITION__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends InvolvedArc>)newValue);
				return;
			case YawlannotationsPackage.ENABLED_TRANSITION__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends InvolvedArc>)newValue);
				return;
			case YawlannotationsPackage.ENABLED_TRANSITION__RESOLVE:
				setResolve((EnabledTransition)newValue);
				return;
			case YawlannotationsPackage.ENABLED_TRANSITION__REFS:
				getRefs().clear();
				getRefs().addAll((Collection<? extends EnabledTransition>)newValue);
				return;
			case YawlannotationsPackage.ENABLED_TRANSITION__ENABLED:
				setEnabled((Boolean)newValue);
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
			case YawlannotationsPackage.ENABLED_TRANSITION__IN:
				getIn().clear();
				return;
			case YawlannotationsPackage.ENABLED_TRANSITION__OUT:
				getOut().clear();
				return;
			case YawlannotationsPackage.ENABLED_TRANSITION__RESOLVE:
				setResolve((EnabledTransition)null);
				return;
			case YawlannotationsPackage.ENABLED_TRANSITION__REFS:
				getRefs().clear();
				return;
			case YawlannotationsPackage.ENABLED_TRANSITION__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
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
			case YawlannotationsPackage.ENABLED_TRANSITION__IN:
				return in != null && !in.isEmpty();
			case YawlannotationsPackage.ENABLED_TRANSITION__OUT:
				return out != null && !out.isEmpty();
			case YawlannotationsPackage.ENABLED_TRANSITION__RESOLVE:
				return resolve != null;
			case YawlannotationsPackage.ENABLED_TRANSITION__REFS:
				return refs != null && !refs.isEmpty();
			case YawlannotationsPackage.ENABLED_TRANSITION__ENABLED:
				return enabled != ENABLED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (enabled: ");
		result.append(enabled);
		result.append(')');
		return result.toString();
	}

} //EnabledTransitionImpl
