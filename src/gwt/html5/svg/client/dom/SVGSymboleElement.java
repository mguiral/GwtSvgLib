package gwt.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

import gwt.html5.svg.client.core.SVGAnimatedPreserveAspectRatio;
import gwt.html5.svg.client.core.SVGAnimatedRect;

@TagName(SVGSymboleElement.TAG)
public class SVGSymboleElement extends SVGElement {
    public static final String TAG = "symbol";

    public static SVGSymboleElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGSymboleElement) elem;
    }

    protected SVGSymboleElement() {
    }

    public final native SVGAnimatedRect getViewBox() /*-{
                                                     return this.viewBox;
                                                     }-*/;

    public final native SVGAnimatedPreserveAspectRatio getPreserveAspectRatio() /*-{
                                                                                return this.preserveAspectRatio;
                                                                                }-*/;
}
