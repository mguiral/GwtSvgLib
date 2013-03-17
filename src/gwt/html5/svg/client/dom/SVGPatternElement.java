package gwt.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

import gwt.html5.svg.client.core.SVGAnimatedEnumeration;
import gwt.html5.svg.client.core.SVGAnimatedLength;
import gwt.html5.svg.client.core.SVGAnimatedPreserveAspectRatio;
import gwt.html5.svg.client.core.SVGAnimatedRect;
import gwt.html5.svg.client.core.SVGAnimatedString;
import gwt.html5.svg.client.core.SVGAnimatedTransformList;

@TagName(SVGPatternElement.TAG)
public class SVGPatternElement extends SVGConditionalProcessingElement {
    public static final String TAG = "pattern";

    public static SVGPatternElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGPatternElement) elem;
    }

    protected SVGPatternElement() {
    }

    public final native SVGAnimatedEnumeration getPatternUnits() /*-{
                                                                 return this.patternUnits;
                                                                 }-*/;

    public final native SVGAnimatedEnumeration getPatternContentUnits() /*-{
                                                                        return this.patternContentUnits;
                                                                        }-*/;

    public final native SVGAnimatedTransformList getPatternTransform() /*-{
                                                                       return this.patternTransform;
                                                                       }-*/;

    public final native SVGAnimatedLength getX() /*-{
                                                 return this.x;
                                                 }-*/;

    public final native SVGAnimatedLength getY() /*-{
                                                 return this.y;
                                                 }-*/;

    public final native SVGAnimatedLength getWidth() /*-{
                                                     return this.width;
                                                     }-*/;

    public final native SVGAnimatedLength getHeight() /*-{
                                                      return this.height;
                                                      }-*/;

    public final native SVGAnimatedString getHref() /*-{
                                                    return this.href;
                                                    }-*/;

    public final native SVGAnimatedRect getViewBox() /*-{
                                                     return this.viewBox;
                                                     }-*/;

    public final native SVGAnimatedPreserveAspectRatio getPreserveAspectRatio() /*-{
                                                                                return this.preserveAspectRatio;
                                                                                }-*/;
}
