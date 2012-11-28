package fr.hd3d.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

@TagName(SVGGroupElement.TAG)
public class SVGGroupElement extends SVGGraphicalElement {
    public static final String TAG = "g";

    public static SVGGroupElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGGroupElement) elem;
    }

    protected SVGGroupElement() {
    }
}
