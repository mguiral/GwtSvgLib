package fr.hd3d.html5.svg.client;

import com.google.gwt.dom.client.Style.Unit;

import fr.hd3d.html5.svg.client.core.SVGAnimatedLength;

public interface ISVGRectElement extends ISVGGraphicalElement {
    /**
     * @return For rounded rectangles, the x-axis radius of the ellipse used to round off the corners of the rectangle.
     */
    SVGAnimatedLength getRx();

    /**
     * @param rx
     *            For rounded rectangles, the x-axis radius of the ellipse used to round off the corners of the
     *            rectangle.
     */
    void setRx(int rx, Unit unit);

    /**
     * @return For rounded rectangles, the y-axis radius of the ellipse used to round off the corners of the rectangle.
     */
    SVGAnimatedLength getRy();

    /**
     * @param ry
     *            For rounded rectangles, the y-axis radius of the ellipse used to round off the corners of the
     *            rectangle.
     */
    void setRy(int ry, Unit unit);

    /**
     * @return The x-axis coordinate of the side of the rectangle which has the smaller x-axis coordinate value in the
     *         current user coordinate system.
     */
    SVGAnimatedLength getX();

    /**
     * @param x
     *            The x-axis coordinate of the side of the rectangle which has the smaller x-axis coordinate value in
     *            the current user coordinate system.
     * @param unit
     *            the unit of x
     */
    void setX(float x, Unit unit);

    /**
     * @return The y-axis coordinate of the side of the rectangle which has the smaller y-axis coordinate value in the
     *         current user coordinate system.
     */
    SVGAnimatedLength getY();

    /**
     * @param y
     *            The y-axis coordinate of the side of the rectangle which has the smaller y-axis coordinate value in
     *            the current user coordinate system.
     * @param unit
     *            the unit of y
     */
    void setY(float y, Unit unit);

    /**
     * @return The width of the rectangle.
     */
    SVGAnimatedLength getWidth();

    /**
     * @param width
     *            The width of the rectangle.
     * @param unit
     *            the width's unit
     */
    void setWidth(int width, Unit unit);

    /**
     * @return The height of the rectangle
     */
    SVGAnimatedLength getHeight();

    /**
     * @param height
     *            The height of the rectangle
     * @param unit
     *            the unit the height's unit
     */
    void setHeight(int height, Unit unit);
}
