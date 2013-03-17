package gwt.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

import gwt.html5.svg.client.core.SVGAnimatedLength;

@TagName(SVGCircleElement.TAG)
public class SVGCircleElement extends SVGGraphicalElement {
    public static final String TAG = "circle";

    public static SVGCircleElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGCircleElement) elem;
    }

    protected SVGCircleElement() {
    }

    /**
     * @return The x-axis coordinate of the center of the circle.
     */
    public final native SVGAnimatedLength getCx() /*-{
                                                  return this.cx;
                                                  }-*/;

    /**
     * @return The y-axis coordinate of the center of the circle.
     */
    public final native SVGAnimatedLength getCy() /*-{
                                                  
                                                  return this.cy;
                                                  }-*/;

    /**
     * @return The radius of the circle.
     */
    public final native SVGAnimatedLength getRadius() /*-{
                                                      
                                                      return this.r;
                                                      }-*/;
}
