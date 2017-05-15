package dk.dtu.compute.mbse.yawl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mbse.yawl.Transition#getTransitiontype <em>Transitiontype</em>}</li>
 * </ul>
 *
 * @see mbse.yawl.YawlPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends org.pnml.tools.epnk.pnmlcoremodel.Transition {
	
	/**
	 * Returns the value of the '<em><b>Transitiontype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitiontype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitiontype</em>' containment reference.
	 * @see #setTransitiontype(TransitionType)
	 * @see mbse.yawl.YawlPackage#getTransition_Transitiontype()
	 * @model containment="true"
	 * @generated
	 */
	TransitionType getSplitType();
	
	/**
	 * Sets the value of the '{@link mbse.yawl.Transition#getTransitiontype <em>Transitiontype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitiontype</em>' containment reference.
	 * @see #getTransitiontype()
	 * @generated
	 */
	void setSplitType(TransitionType value);
	
	TransitionType getJoinType();
	
	void setJoinType(TransitionType value);

} // Transition