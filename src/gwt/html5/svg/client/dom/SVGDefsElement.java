package gwt.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

@TagName(SVGDefsElement.TAG)
public class SVGDefsElement extends SVGGraphicalElement {
    public static final String TAG = "defs";

    public static SVGDefsElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGDefsElement) elem;
    }

    protected SVGDefsElement() {
    }
}
