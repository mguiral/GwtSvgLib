package gwt.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

@TagName(SVGDescElement.TAG)
public class SVGDescElement extends SVGElement {
    public static final String TAG = "desc";

    protected SVGDescElement() {
    }

    public static SVGDescElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGDescElement) elem;
    }
}
