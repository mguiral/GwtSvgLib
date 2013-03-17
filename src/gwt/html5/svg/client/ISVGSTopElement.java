package gwt.html5.svg.client;

import gwt.html5.svg.client.core.SVGAnimatedNumber;

public interface ISVGSTopElement extends ISVGElement {
    /**
     * The "offset" attribute is either a <number> (usually ranging from 0 to 1) which indicates where the gradient stop
     * is placed. For linear gradients, the "offset" attribute represents a location along the gradient vector. For
     * radial gradients, it represents a percentage distance from (fx,fy) to the edge of the outermost/largest circle.
     * 
     */
    SVGAnimatedNumber getOffset();

    /**
     * The "offset" attribute is either a <number> (usually ranging from 0 to 1) which indicates where the gradient stop
     * is placed. For linear gradients, the "offset" attribute represents a location along the gradient vector. For
     * radial gradients, it represents a percentage distance from (fx,fy) to the edge of the outermost/largest circle.
     * 
     */
    void setOffset(int offset);

    void setOffset(int offset, String color);
}
