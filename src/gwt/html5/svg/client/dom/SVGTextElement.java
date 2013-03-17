package gwt.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

@TagName(SVGTextElement.TAG)
public class SVGTextElement extends SVGTextPositioningElement {
    public static final String TAG = "text";

    public static SVGTextElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGTextElement) elem;
    }

    protected SVGTextElement() {
    }
}
