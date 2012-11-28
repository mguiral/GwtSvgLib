package fr.hd3d.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

import fr.hd3d.html5.svg.client.core.SVGAnimatedLength;

@TagName(SVGRadialGradientElement.TAG)
public class SVGRadialGradientElement extends SVGGradientElement {
    public static final String TAG = "radialGradient";

    public static SVGRadialGradientElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGRadialGradientElement) elem;
    }

    protected SVGRadialGradientElement() {
    }

    public final native SVGAnimatedLength getCx() /*-{
                                                  return this.cx;
                                                  }-*/;

    public final native SVGAnimatedLength getCy() /*-{
                                                  return this.cy;
                                                  }-*/;

    public final native SVGAnimatedLength getR() /*-{
                                                 return this.r;
                                                 }-*/;

    public final native SVGAnimatedLength getFx() /*-{
                                                  return this.fx;
                                                  }-*/;

    public final native SVGAnimatedLength getFy() /*-{
                                                  return this.fy;
                                                  }-*/;
}
