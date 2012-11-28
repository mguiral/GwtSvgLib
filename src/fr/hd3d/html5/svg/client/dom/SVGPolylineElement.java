package fr.hd3d.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

import fr.hd3d.html5.svg.client.core.SVGPointList;

@TagName(SVGPolylineElement.TAG)
public class SVGPolylineElement extends SVGGraphicalElement {
    public final static String TAG = "polyline";

    public static SVGPolylineElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGPolylineElement) elem;
    }

    protected SVGPolylineElement() {
    }

    /**
     * @return The points that make up the polyline. All coordinate values are in the user coordinate system.
     */
    public final native SVGPointList getPoints() /*-{
                                                 return this.points ? @fr.hd3d.html5.svg.client.core.SVGPointList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(this.points) : null;
                                                 }-*/;

    /**
     * @return The points that make up the polyline. All coordinate values are in the user coordinate system.
     */
    public final native SVGPointList getAnimatedPoints() /*-{
                                                         return this.animatedPoints ? @fr.hd3d.html5.svg.client.core.SVGPointList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(this.animatedPoints) : null;
                                                         }-*/;
}
