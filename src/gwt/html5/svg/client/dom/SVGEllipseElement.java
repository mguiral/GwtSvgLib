package gwt.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

import gwt.html5.svg.client.core.SVGAnimatedLength;

@TagName(SVGEllipseElement.TAG)
public class SVGEllipseElement extends SVGGraphicalElement {
    public static final String TAG = "ellipse";

    public static SVGEllipseElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGEllipseElement) elem;
    }

    protected SVGEllipseElement() {
    }

    /**
     * @return The x-axis coordinate of the center of the ellipse.
     */
    public final native SVGAnimatedLength getCx() /*-{
                                                  return this.cx;
                                                  }-*/;

    /**
     * @return The y-axis coordinate of the center of the ellipse.
     */
    public final native SVGAnimatedLength getCy() /*-{
                                                  return this.cy;
                                                  }-*/;

    /**
     * @return The x-axis radius of the ellipse.
     */
    public final native SVGAnimatedLength getRx() /*-{
                                                  return this.rx;
                                                  }-*/;

    /**
     * @return The y-axis radius of the ellipse.
     */
    public final native SVGAnimatedLength getRy() /*-{
                                                  return this.ry;
                                                  }-*/;
}
