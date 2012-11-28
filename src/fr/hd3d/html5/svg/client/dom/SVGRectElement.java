package fr.hd3d.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

import fr.hd3d.html5.svg.client.core.SVGAnimatedLength;

@TagName(SVGRectElement.TAG)
public class SVGRectElement extends SVGGraphicalElement {
    public static final String TAG = "rect";

    public static SVGRectElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGRectElement) elem;
    }

    protected SVGRectElement() {
    }

    /**
     * @return For rounded rectangles, the x-axis radius of the ellipse used to round off the corners of the rectangle.
     */
    public final native SVGAnimatedLength getRx() /*-{
                                                  
                                                  return this.rx;
                                                  }-*/;

    /**
     * @return For rounded rectangles, the y-axis radius of the ellipse used to round off the corners of the rectangle.
     */
    public final native SVGAnimatedLength getRy() /*-{
                                                  
                                                  return this.ry;
                                                  }-*/;
}