package gwt.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

import gwt.html5.svg.client.core.SVGAnimatedPreserveAspectRatio;
import gwt.html5.svg.client.core.SVGAnimatedString;

@TagName(SVGImageElement.TAG)
public class SVGImageElement extends SVGGraphicalElement {
    public static final String TAG = "image";

    public static SVGImageElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGImageElement) elem;
    }

    protected SVGImageElement() {
    }

    public final native SVGAnimatedPreserveAspectRatio getPreserveAspectRatio()/*-{
                                                                               return this.preserveAspectRatio;
                                                                               }-*/;

    public final native void setPreserveAspectRatio(String preserveAspectRatio) /*-{
                                                                                this.preserveAspectRatio = preserveAspectRatio;
                                                                                }-*/;

    public final native SVGAnimatedString getHref() /*-{
                                                    return this.href;
                                                    }-*/;

    public final native void setHref(String href) /*-{
                                                  this.href = href;
                                                  }-*/;
}
