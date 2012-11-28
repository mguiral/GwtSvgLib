package fr.hd3d.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

import fr.hd3d.html5.svg.client.core.SVGAnimatedLength;

@TagName(SVGLineElement.TAG)
public class SVGLineElement extends SVGGraphicalElement {
    public static final String TAG = "line";

    public static SVGLineElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGLineElement) elem;
    }

    protected SVGLineElement() {
    }

    /**
     * @return The x-axis coordinate of the start of the line.
     */
    public final native SVGAnimatedLength getX1() /*-{
                                                  return this.x1;
                                                  }-*/;

    /**
     * @return The x-axis coordinate of the end of the line.
     */
    public final native SVGAnimatedLength getX2() /*-{
                                                  return this.x2;
                                                  }-*/;

    /**
     * @return The y-axis coordinate of the start of the line.
     */
    public final native SVGAnimatedLength getY1() /*-{
                                                  return this.y1;
                                                  }-*/;

    /**
     * @return The y-axis coordinate of the end of the line.
     */
    public final native SVGAnimatedLength getY2() /*-{
                                                  return this.y2;
                                                  }-*/;
}
