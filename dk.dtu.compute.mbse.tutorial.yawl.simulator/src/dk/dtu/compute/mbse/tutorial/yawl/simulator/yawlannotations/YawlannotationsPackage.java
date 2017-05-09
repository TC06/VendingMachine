/**
 */
package dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.pnml.tools.epnk.annotations.netannotations.NetannotationsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.YawlannotationsFactory
 * @model kind="package"
 * @generated
 */
public interface YawlannotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "yawlannotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mbse.compute.dtu.dk/yawlannotations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ya";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	YawlannotationsPackage eINSTANCE = dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.YawlannotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.MarkingImpl <em>Marking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.MarkingImpl
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.YawlannotationsPackageImpl#getMarking()
	 * @generated
	 */
	int MARKING = 0;

	/**
	 * The feature id for the '<em><b>Net Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING__NET_ANNOTATIONS = NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING__OBJECT = NetannotationsPackage.OBJECT_ANNOTATION__OBJECT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING__VALUE = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_FEATURE_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING___GET_DESCRIPTION = NetannotationsPackage.OBJECT_ANNOTATION___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Get Annotation Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING___GET_ANNOTATION_ATTRIBUTE = NetannotationsPackage.OBJECT_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Marking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKING_OPERATION_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.EnabledTransitionImpl <em>Enabled Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.EnabledTransitionImpl
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.YawlannotationsPackageImpl#getEnabledTransition()
	 * @generated
	 */
	int ENABLED_TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Net Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION__NET_ANNOTATIONS = NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION__OBJECT = NetannotationsPackage.OBJECT_ANNOTATION__OBJECT;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION__IN = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION__OUT = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resolve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION__RESOLVE = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION__REFS = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION__ENABLED = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Enabled Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION_FEATURE_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION___GET_DESCRIPTION = NetannotationsPackage.OBJECT_ANNOTATION___GET_DESCRIPTION;

	/**
	 * The number of operations of the '<em>Enabled Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITION_OPERATION_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.InvolvedArcImpl <em>Involved Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.InvolvedArcImpl
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.YawlannotationsPackageImpl#getInvolvedArc()
	 * @generated
	 */
	int INVOLVED_ARC = 2;

	/**
	 * The feature id for the '<em><b>Net Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVED_ARC__NET_ANNOTATIONS = NetannotationsPackage.OBJECT_ANNOTATION__NET_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVED_ARC__OBJECT = NetannotationsPackage.OBJECT_ANNOTATION__OBJECT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVED_ARC__TARGET = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVED_ARC__SOURCE = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVED_ARC__ACTIVE = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Involved Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVED_ARC_FEATURE_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVED_ARC___GET_DESCRIPTION = NetannotationsPackage.OBJECT_ANNOTATION___GET_DESCRIPTION;

	/**
	 * The number of operations of the '<em>Involved Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVED_ARC_OPERATION_COUNT = NetannotationsPackage.OBJECT_ANNOTATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.Marking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marking</em>'.
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.Marking
	 * @generated
	 */
	EClass getMarking();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.Marking#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.Marking#getValue()
	 * @see #getMarking()
	 * @generated
	 */
	EAttribute getMarking_Value();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition <em>Enabled Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enabled Transition</em>'.
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition
	 * @generated
	 */
	EClass getEnabledTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In</em>'.
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#getIn()
	 * @see #getEnabledTransition()
	 * @generated
	 */
	EReference getEnabledTransition_In();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out</em>'.
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#getOut()
	 * @see #getEnabledTransition()
	 * @generated
	 */
	EReference getEnabledTransition_Out();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#getResolve <em>Resolve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolve</em>'.
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#getResolve()
	 * @see #getEnabledTransition()
	 * @generated
	 */
	EReference getEnabledTransition_Resolve();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#getRefs <em>Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refs</em>'.
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#getRefs()
	 * @see #getEnabledTransition()
	 * @generated
	 */
	EReference getEnabledTransition_Refs();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition#isEnabled()
	 * @see #getEnabledTransition()
	 * @generated
	 */
	EAttribute getEnabledTransition_Enabled();

	/**
	 * Returns the meta object for class '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.InvolvedArc <em>Involved Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Involved Arc</em>'.
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.InvolvedArc
	 * @generated
	 */
	EClass getInvolvedArc();

	/**
	 * Returns the meta object for the container reference '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.InvolvedArc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Target</em>'.
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.InvolvedArc#getTarget()
	 * @see #getInvolvedArc()
	 * @generated
	 */
	EReference getInvolvedArc_Target();

	/**
	 * Returns the meta object for the container reference '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.InvolvedArc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.InvolvedArc#getSource()
	 * @see #getInvolvedArc()
	 * @generated
	 */
	EReference getInvolvedArc_Source();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.InvolvedArc#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.InvolvedArc#isActive()
	 * @see #getInvolvedArc()
	 * @generated
	 */
	EAttribute getInvolvedArc_Active();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	YawlannotationsFactory getYawlannotationsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.MarkingImpl <em>Marking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.MarkingImpl
		 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.YawlannotationsPackageImpl#getMarking()
		 * @generated
		 */
		EClass MARKING = eINSTANCE.getMarking();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKING__VALUE = eINSTANCE.getMarking_Value();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.EnabledTransitionImpl <em>Enabled Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.EnabledTransitionImpl
		 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.YawlannotationsPackageImpl#getEnabledTransition()
		 * @generated
		 */
		EClass ENABLED_TRANSITION = eINSTANCE.getEnabledTransition();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENABLED_TRANSITION__IN = eINSTANCE.getEnabledTransition_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENABLED_TRANSITION__OUT = eINSTANCE.getEnabledTransition_Out();

		/**
		 * The meta object literal for the '<em><b>Resolve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENABLED_TRANSITION__RESOLVE = eINSTANCE.getEnabledTransition_Resolve();

		/**
		 * The meta object literal for the '<em><b>Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENABLED_TRANSITION__REFS = eINSTANCE.getEnabledTransition_Refs();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLED_TRANSITION__ENABLED = eINSTANCE.getEnabledTransition_Enabled();

		/**
		 * The meta object literal for the '{@link dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.InvolvedArcImpl <em>Involved Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.InvolvedArcImpl
		 * @see dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.impl.YawlannotationsPackageImpl#getInvolvedArc()
		 * @generated
		 */
		EClass INVOLVED_ARC = eINSTANCE.getInvolvedArc();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOLVED_ARC__TARGET = eINSTANCE.getInvolvedArc_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOLVED_ARC__SOURCE = eINSTANCE.getInvolvedArc_Source();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOLVED_ARC__ACTIVE = eINSTANCE.getInvolvedArc_Active();

	}

} //YawlannotationsPackage
