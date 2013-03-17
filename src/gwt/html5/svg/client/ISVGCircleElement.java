package gwt.html5.svg.client;

import com.google.gwt.dom.client.Style.Unit;

import gwt.html5.svg.client.core.SVGAnimatedLength;

public interface ISVGCircleElement extends ISVGGraphicalElement {
    /**
     * @return The x-axis coordinate of the center of the circle.
     */
    SVGAnimatedLength getCx();

    /**
     * @param cx
     *            The x-axis coordinate of the center of the circle.
     */
    void setCx(float cx, Unit unit);

    /**
     * @return The y-axis coordinate of the center of the circle.
     */
    SVGAnimatedLength getCy();

    /**
     * @param cy
     *            The y-axis coordinate of the center of the circle.
     */
    void setCy(float cy, Unit unit);

    /**
     * @return The radius of the circle.
     */
    SVGAnimatedLength getRadius();

    /**
     * @param r
     *            The radius of the circle.
     */
    void setRadius(int r, Unit px);
}
