package fr.hd3d.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

import fr.hd3d.html5.svg.client.core.SVGAnimatedLength;

@TagName(SVGLinearGradientElement.TAG)
public class SVGLinearGradientElement extends SVGGradientElement {
    public static final String TAG = "linearGradient";

    public static SVGLinearGradientElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGLinearGradientElement) elem;
    }

    protected SVGLinearGradientElement() {
    }

    public final native SVGAnimatedLength getX1() /*-{
                                                  
                                                  return this.x1;
                                                  }-*/;

    public final native SVGAnimatedLength getY1() /*-{
                                                  
                                                  return this.y1;
                                                  }-*/;

    public final native SVGAnimatedLength getX2() /*-{
                                                  
                                                  return this.x2;
                                                  }-*/;

    public final native SVGAnimatedLength getY2() /*-{
                                                  
                                                  return this.y2;
                                                  }-*/;
}
