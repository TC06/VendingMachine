/**
 */
package dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations;

import org.eclipse.emf.common.util.EList;

import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enabled Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#getIn <em>In</em>}</li>
 *   <li>{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#getOut <em>Out</em>}</li>
 *   <li>{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#getResolve <em>Resolve</em>}</li>
 *   <li>{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#getRefs <em>Refs</em>}</li>
 *   <li>{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#isEnabled <em>Enabled</em>}</li>
 * </ul>
 *
 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.YawlannotationsPackage#getEnabledTransition()
 * @model
 * @generated
 */
public interface EnabledTransition extends ObjectAnnotation {
	/**
	 * Returns the value of the '<em><b>In</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.InvolvedArc}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.InvolvedArc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' containment reference list.
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.YawlannotationsPackage#getEnabledTransition_In()
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.InvolvedArc#getTarget
	 * @model opposite="target" containment="true"
	 * @generated
	 */
	EList<InvolvedArc> getIn();

	/**
	 * Returns the value of the '<em><b>Out</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.InvolvedArc}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.InvolvedArc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' containment reference list.
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.YawlannotationsPackage#getEnabledTransition_Out()
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.InvolvedArc#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<InvolvedArc> getOut();

	/**
	 * Returns the value of the '<em><b>Resolve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#getRefs <em>Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolve</em>' reference.
	 * @see #setResolve(EnabledTransition)
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.YawlannotationsPackage#getEnabledTransition_Resolve()
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#getRefs
	 * @model opposite="refs"
	 * @generated
	 */
	EnabledTransition getResolve();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#getResolve <em>Resolve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolve</em>' reference.
	 * @see #getResolve()
	 * @generated
	 */
	void setResolve(EnabledTransition value);

	/**
	 * Returns the value of the '<em><b>Refs</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#getResolve <em>Resolve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refs</em>' reference list.
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.YawlannotationsPackage#getEnabledTransition_Refs()
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#getResolve
	 * @model opposite="resolve"
	 * @generated
	 */
	EList<EnabledTransition> getRefs();

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.YawlannotationsPackage#getEnabledTransition_Enabled()
	 * @model required="true"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

} // EnabledTransition
