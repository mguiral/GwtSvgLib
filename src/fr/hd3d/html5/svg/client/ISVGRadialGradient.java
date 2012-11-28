package fr.hd3d.html5.svg.client;

import com.google.gwt.dom.client.Style.Unit;

import fr.hd3d.html5.svg.client.core.SVGAnimatedLength;

public interface ISVGRadialGradient extends ISVGGradientElement {
    /**
     * "cx", "cy" and "r" define the largest (i.e., outermost) circle for the radial gradient. The gradient will be
     * drawn such that the 100% gradient stop is mapped to the perimeter of this largest (i.e., outermost) circle. If
     * the attribute is not specified, the effect is as if a value of '50%' were specified.
     * 
     */
    SVGAnimatedLength getCx();

    /**
     * "cx", "cy" and "r" define the largest (i.e., outermost) circle for the radial gradient. The gradient will be
     * drawn such that the 100% gradient stop is mapped to the perimeter of this largest (i.e., outermost) circle. If
     * the attribute is not specified, the effect is as if a value of '50%' were specified.
     */
    SVGAnimatedLength getCy();

    /**
     * "cx", "cy" and "r" define the largest (i.e., outermost) circle for the radial gradient. The gradient will be
     * drawn such that the 100% gradient stop is mapped to the perimeter of this largest (i.e., outermost) circle. If
     * the attribute is not specified, the effect is as if a value of '50%' were specified.
     */
    SVGAnimatedLength getR();

    /**
     * "fx" and "fy" define the focal point for the radial gradient. The gradient will be drawn such that the 0%
     * gradient stop is mapped to (fx, fy). If attribute "fx" is not specified, "fx" will coincide with the
     * presentational value of "cx" for the element whether the value for 'cx' was inherited or not. If the element
     * references an element that specifies a value for 'fx', then the value of 'fx' is inherited from the referenced
     * element
     */
    SVGAnimatedLength getFx();

    /**
     * "fx" and "fy" define the focal point for the radial gradient. The gradient will be drawn such that the 0%
     * gradient stop is mapped to (fx, fy). If attribute "fx" is not specified, "fx" will coincide with the
     * presentational value of "cx" for the element whether the value for 'cx' was inherited or not. If the element
     * references an element that specifies a value for 'fx', then the value of 'fx' is inherited from the referenced
     * element If attribute "fy" is not specified, "fy" will coincide with the presentational vlaue of "cy" for the
     * element whether the value for 'cy' was inherited or not. If the element references an element that specifies a
     * value for 'fy', then the value of 'fy' is inherited from the reference
     */
    SVGAnimatedLength getFy();

    /**
     * @param cx
     * @param unit
     */
    void setCx(float cx, Unit unit);

    /**
     * @param cy
     * @param unit
     */
    void setCy(float cy, Unit unit);

    /**
     * @param r
     * @param unit
     */
    void setR(float r, Unit unit);

    /**
     * @param fx
     * @param unit
     */
    void setFx(float fx, Unit unit);

    /**
     * @param fy
     * @param unit
     */
    void setFy(float fy, Unit unit);
}
