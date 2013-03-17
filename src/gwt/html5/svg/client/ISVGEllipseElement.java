package gwt.html5.svg.client;

import com.google.gwt.dom.client.Style.Unit;

import gwt.html5.svg.client.core.SVGAnimatedLength;

/**
 * Corresponds to the "ellipse" element.
 * 
 * @author michael.guiral
 * 
 */
public interface ISVGEllipseElement extends ISVGGraphicalElement {
    /**
     * @return The x-axis coordinate of the center of the ellipse.
     */
    SVGAnimatedLength getCx();

    /**
     * @param cx
     *            The x-axis coordinate of the center of the ellipse.
     */
    void setCx(int cx, Unit unit);

    /**
     * @return The y-axis coordinate of the center of the ellipse.
     */
    SVGAnimatedLength getCy();

    /**
     * @param cy
     *            The y-axis coordinate of the center of the ellipse.
     */
    void setCy(int cy, Unit unit);

    /**
     * @return The x-axis radius of the ellipse.
     */
    SVGAnimatedLength getRx();

    /**
     * @param rx
     *            The x-axis radius of the ellipse.
     */
    void setRx(int rx, Unit unit);

    /**
     * @return The y-axis radius of the ellipse.
     */
    SVGAnimatedLength getRy();

    /**
     * @param ry
     *            The y-axis radius of the ellipse.
     */
    void setRy(int ry, Unit unit);
}
