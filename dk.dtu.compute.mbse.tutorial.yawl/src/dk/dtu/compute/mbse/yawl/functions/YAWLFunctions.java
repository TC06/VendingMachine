package dk.dtu.compute.mbse.yawl.functions;

import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;

import dk.dtu.compute.mbse.yawl.AType;
import dk.dtu.compute.mbse.yawl.ArcType;
import dk.dtu.compute.mbse.yawl.PType;
import dk.dtu.compute.mbse.yawl.PlaceType;
import dk.dtu.compute.mbse.yawl.TType;
import dk.dtu.compute.mbse.yawl.TransitionType;

public class YAWLFunctions {

	/**
	 * @author s133959 - Tolga Cetin
	 */
	public static PType getPlaceType(Place place) {
		if (place instanceof Place) {
			dk.dtu.compute.mbse.yawl.Place p = (dk.dtu.compute.mbse.yawl.Place) place;
			PlaceType type = p.getPlacetype();
			if (type != null) {
				return type.getText();
			} else {
				return PType.NORMAL;
			}
		} else {
			return PType.NORMAL;
		}
	}

	/**
	 * @author s133959 - Tolga Cetin, s153403 - Umais Usman Shoaib
	 */
	public static AType getArcType(Arc arc) {
		if (arc.getSource() instanceof TransitionNode) {
			return AType.NORMAL;
		}
		if (arc instanceof dk.dtu.compute.mbse.yawl.Arc) {
			dk.dtu.compute.mbse.yawl.Arc a = (dk.dtu.compute.mbse.yawl.Arc) arc;
			ArcType type = a.getArctype();
			if (type != null) {
				return type.getText();
			}
		}

		return AType.NORMAL;
	}

	/**
	 * @author s133959 - Tolga Cetin
	 */
	public static boolean isResetArc(Arc arc) {
		return getArcType(arc).equals(AType.RESET);
	}

	/**
	 * @author s133959 - Tolga Cetin, s153403 - Umais Usman Shoaib
	 */
	public static TType[] getTransitionType(Transition transition) {
		TType[] types = new TType[2];
		types[0] = TType.NORMAL;
		types[1] = TType.NORMAL;
		if (transition instanceof Transition) {
			Transition YawlTransition = (Transition) transition;
			if (((dk.dtu.compute.mbse.yawl.Transition) YawlTransition).getSplitType() != null) {
				TransitionType type = ((dk.dtu.compute.mbse.yawl.Transition) YawlTransition).getSplitType();
				switch (type.getText()) {
				case OR:
					types[1] = TType.OR;
					break;
				case XOR:
					types[1] = TType.XOR;
					break;
				case AND:
					types[1] = TType.AND;
				default:
					break;
				}
			}
			if (((dk.dtu.compute.mbse.yawl.Transition) YawlTransition).getJoinType() != null) {
				TransitionType type = ((dk.dtu.compute.mbse.yawl.Transition) YawlTransition).getJoinType();
				switch (type.getText()) {
				case OR:
					types[0] = TType.OR;
					
					break;
				case XOR:
					types[0] = TType.XOR;
					break;
				case AND:
					types[0] = TType.AND;
				default:
					break;
				}
			}
			return types;
		} else
			return types;
	}

	/*
	 * public static getJoinType(Transition transition) { FlatAccess flat =
	 * FlatAccess.getFlatAccess(NetFunctions.getPetriNet(transition));
	 * if(transition instanceof Action && flat != null) { int count = 0; for(Arc
	 * a: flat.getIn(action)) { if(a instanceof dk.dtu.compute.mbse.yawl.Arc) {
	 * dk.dtu.compute.mbse.yawl.Arc arc = (dk.dtu.compute.mbse.yawl.Arc) a;
	 * if(arc.getArctype() == null ||
	 * arc.getArctype().getText().equals(AType.NORMAL)) { count++; } } }
	 * if(count > 1) { TransitionType joinType = action.getJoinType();
	 * if(joinType != null) { if(joinType.getText().equals(TT ype.XOR)) { return
	 * ControlFlowType.XOR; } else if(joinType.getText().equals(TType.OR)) {
	 * return ControlFlowType.OR; } } return ControlFlowType.AND; } else
	 * if(count == 1) { return ControlFlowType.SINGLE; } } return
	 * ControlFlowType.NULL; }
	 */

}
