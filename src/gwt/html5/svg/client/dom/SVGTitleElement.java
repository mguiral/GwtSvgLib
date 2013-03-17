package gwt.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

@TagName(SVGTitleElement.TAG)
public class SVGTitleElement extends SVGElement {
    public static final String TAG = "title";

    public static SVGTitleElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGTitleElement) elem;
    }

    protected SVGTitleElement() {
    }
}
