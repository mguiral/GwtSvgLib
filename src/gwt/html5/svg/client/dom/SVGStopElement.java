package gwt.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

import gwt.html5.svg.client.core.SVGAnimatedNumber;

@TagName(SVGStopElement.TAG)
public class SVGStopElement extends SVGElement {
    public static final String TAG = "stop";

    public static SVGStopElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGStopElement) elem;
    }

    protected SVGStopElement() {
    }

    public final native SVGAnimatedNumber getOffset()/*-{
                                                     return this.offset;
                                                     }-*/;
}
