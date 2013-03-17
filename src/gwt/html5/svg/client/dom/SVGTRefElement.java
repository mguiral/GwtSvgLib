package gwt.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;

import gwt.html5.svg.client.core.SVGAnimatedString;

public class SVGTRefElement extends SVGTextPositioningElement {
    public static final String TAG = "tref";

    public static SVGTRefElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGTRefElement) elem;
    }

    protected SVGTRefElement() {
    }

    public final native SVGAnimatedString getHref() /*-{
                                                    
                                                    return this.href;
                                                    }-*/;
}
