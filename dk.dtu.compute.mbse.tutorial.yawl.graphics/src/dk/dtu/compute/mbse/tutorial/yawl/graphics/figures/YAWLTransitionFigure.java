package dk.dtu.compute.mbse.tutorial.yawl.graphics.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.TransitionFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

import dk.dtu.compute.mbse.yawl.PType;
import dk.dtu.compute.mbse.yawl.TType;
import dk.dtu.compute.mbse.yawl.functions.YAWLFunctions;

public class YAWLTransitionFigure extends TransitionFigure {

	private TType[] transitionType;

	public YAWLTransitionFigure(Transition transition) {
		super(transition);
		transitionType = YAWLFunctions.getTransitionType(transition);
	}

	/**
	 * This method is called whenever some attribute of the transition which
	 * might influence the graphical appearance of the transition changes.
	 */
	@Override
	public void update() {
		TType[] oldTypes = transitionType;
		transitionType = YAWLFunctions.getTransitionType(transition);
		if (oldTypes[0] != transitionType[0] || oldTypes[1] != transitionType[1]) {
			// only call the repaint() method, when there was a change that has
			// an effect to the graphical appearance of the transition
			this.repaint();
		}
	}

	/**
	 * @author s133959 - Tolga Cetin, s153403 - Umais Usman Shoaib
	 */
	@Override
	protected void fillShape(Graphics graphics) {
		super.fillShape(graphics);
		Rectangle rectangle = this.getClientArea();
		int w = rectangle.width;
		int h = rectangle.height;
		int thirdWidth = w / 3;
		int halfHeight = h / 2;
		int x = rectangle.x;
		int y = rectangle.y;

		graphics.pushState();
		graphics.setLineWidth(1);
		switch (transitionType[0]) {
		case XOR:
			graphics.drawPolygon(new int[] { x + thirdWidth, y, x, y + halfHeight, x + thirdWidth, y + h });
			break;
		case OR:
			graphics.drawPolygon(new int[] { x + thirdWidth / 2, y, x, y + halfHeight, x + thirdWidth / 2, y + h,
					x + thirdWidth, y + halfHeight });
			graphics.drawLine(x + thirdWidth, y, x + thirdWidth, y + h);
			break;
		case AND:
			graphics.drawLine(x + thirdWidth, y, x + thirdWidth, y + h);
			graphics.drawLine(x, y, x + thirdWidth, y + halfHeight);
			graphics.drawLine(x + thirdWidth, y + halfHeight, x, y + h);
			break;
		default:
			break;
		}

		switch (transitionType[1]) {
		case XOR:
			graphics.drawPolygon(new int[] { x + thirdWidth * 2, y, x + w, y + halfHeight, x + thirdWidth * 2, y + h });
			break;
		case OR:
			graphics.drawPolygon(new int[] { x + thirdWidth * 2 + thirdWidth / 2, y, x + w, y + halfHeight,
					x + thirdWidth * 2 + thirdWidth / 2, y + h, x + thirdWidth * 2, y + halfHeight });
			graphics.drawLine(x + thirdWidth * 2, y, x + thirdWidth * 2, y + h);
			break;
		case AND:
			graphics.drawLine(x + thirdWidth * 2, y, x + thirdWidth * 2, y + h);
			graphics.drawLine(x + w, y, x + thirdWidth * 2, y + halfHeight);
			graphics.drawLine(x + thirdWidth * 2, y + halfHeight, x + w, y + h);
			break;
		default:
			break;
		}
		graphics.popState();
	}
}
