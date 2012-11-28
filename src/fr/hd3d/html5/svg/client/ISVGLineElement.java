package fr.hd3d.html5.svg.client;

import com.google.gwt.dom.client.Style.Unit;

import fr.hd3d.html5.svg.client.core.SVGAnimatedLength;

public interface ISVGLineElement extends ISVGGraphicalElement {
    /**
     * @return The x-axis coordinate of the start of the line.
     */
    SVGAnimatedLength getX1();

    /**
     * @param x1
     *            The x-axis coordinate of the start of the line.
     */
    void setX1(float x1, Unit unit);

    /**
     * @return The x-axis coordinate of the end of the line.
     */
    SVGAnimatedLength getX2();

    /**
     * @param x2
     *            The x-axis coordinate of the end of the line.
     */
    void setX2(float x2, Unit unit);

    /**
     * @return The y-axis coordinate of the start of the line.
     */
    SVGAnimatedLength getY1();

    /**
     * @param y1
     *            The y-axis coordinate of the start of the line.
     */
    void setY1(float y1, Unit unit);

    /**
     * @return The y-axis coordinate of the end of the line.
     */
    SVGAnimatedLength getY2();

    /**
     * @param y2
     *            The y-axis coordinate of the end of the line.
     */
    void setY2(float y2, Unit unit);
}
