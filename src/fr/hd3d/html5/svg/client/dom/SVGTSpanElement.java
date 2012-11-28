package fr.hd3d.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

@TagName(SVGTSpanElement.TAG)
public class SVGTSpanElement extends SVGTextPositioningElement {
    public static final String TAG = "tspan";

    public static SVGTSpanElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGTSpanElement) elem;
    }

    protected SVGTSpanElement() {
    }
}
