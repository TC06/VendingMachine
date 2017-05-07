package dk.dtu.compute.mbse.tutorial.yawl.graphics.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.TransitionFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import dk.dtu.compute.mbse.yawl.PType;
import dk.dtu.compute.mbse.yawl.TType;
import dk.dtu.compute.mbse.yawl.Transition;
import dk.dtu.compute.mbse.yawl.functions.YAWLFunctions;

public class YAWLTransitionFigure extends TransitionFigure {

	private TType[] types;

	public YAWLTransitionFigure(Transition transition) {
		super(transition);
		types = YAWLFunctions.getTransitionType(transition);
	}

	/**
	 * This method is called whenever some attribute of the transition which
	 * might influence the graphical appearance of the transition changes.
	 */
	@Override
	public void update() {
		TType[] oldTypes = types;
		types = YAWLFunctions.getTransitionType(transition);
		if (oldTypes[0] != types[0] || oldTypes[1] != types[1]) {
			// only call the repaint() method, when there was a change that has
			// an effect to the graphical appearance of the transition
			this.repaint();
		}
	}

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
		graphics.setLineWidth(2);
		switch (types[0]) {
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

		switch (types[1]) {
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
