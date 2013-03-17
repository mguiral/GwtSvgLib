package gwt.html5.svg.client;

import com.google.gwt.dom.client.Style.Unit;

import gwt.html5.svg.client.core.SVGAnimatedLength;

/**
 * @author michael.guiral
 * 
 */
public interface ISVGLinearGradientElement extends ISVGGradientElement {
    /**
     * @return Corresponds to attribute "x1" on the given "linearGradient" element.
     */
    SVGAnimatedLength getX1();

    /**
     * "x1", "y1", "x2" and "y2" define a gradient vector for the linear gradient. This gradient vector provides
     * starting and ending points onto which the gradient stops are mapped. The values of "x1", "y1", "x2" and "y2" can
     * be either numbers or percentages. If the attribute is not specified, the effect is as if a value of '0%' were
     * specified.
     * 
     * @param x
     * @param unit
     */
    void setX1(float x, Unit unit);

    /**
     * @return Corresponds to attribute "x2" on the given "linearGradient" element
     */
    SVGAnimatedLength getX2();

    /**
     * "x1", "y1", "x2" and "y2" define a gradient vector for the linear gradient. This gradient vector provides
     * starting and ending points onto which the gradient stops are mapped. The values of "x1", "y1", "x2" and "y2" can
     * be either numbers or percentages. If the attribute is not specified, the effect is as if a value of '0%' were
     * specified.
     * 
     * @param x
     * @param unit
     */
    void setX2(float x, Unit unit);

    /**
     * @return Corresponds to attribute "y1" on the given "linearGradient" element
     */
    SVGAnimatedLength getY1();

    /**
     * "x1", "y1", "x2" and "y2" define a gradient vector for the linear gradient. This gradient vector provides
     * starting and ending points onto which the gradient stops are mapped. The values of "x1", "y1", "x2" and "y2" can
     * be either numbers or percentages. If the attribute is not specified, the effect is as if a value of '0%' were
     * specified.
     * 
     * @param x
     * @param unit
     */
    void setY1(float x, Unit unit);

    /**
     * @return Corresponds to attribute "y2" on the given "linearGradient" element
     */
    SVGAnimatedLength getY2();

    /**
     * "x1", "y1", "x2" and "y2" define a gradient vector for the linear gradient. This gradient vector provides
     * starting and ending points onto which the gradient stops are mapped. The values of "x1", "y1", "x2" and "y2" can
     * be either numbers or percentages. If the attribute is not specified, the effect is as if a value of '0%' were
     * specified.
     * 
     * @param x
     * @param unit
     */
    void setY2(float x, Unit unit);
}
