package fr.hd3d.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

import fr.hd3d.html5.svg.client.core.SVGAnimatedString;
import fr.hd3d.html5.svg.client.core.SVGElementInstance;

@TagName(SVGUseElement.TAG)
public class SVGUseElement extends SVGGraphicalElement {
    public static final String TAG = "use";

    public static SVGUseElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGUseElement) elem;
    }

    protected SVGUseElement() {
    }

    public final native SVGElementInstance getInstanceRoot() /*-{
                                                             this.instanceRoot;
                                                             }-*/;

    public final native SVGElementInstance getAnimatedInstanceRoot() /*-{
                                                                     return this.animatedInstanceRoot;
                                                                     }-*/;

    public final native SVGAnimatedString getHref() /*-{
                                                    return this.href;
                                                    }-*/;

    public final native void setHref(String href) /*-{
                                                  
                                                  }-*/;
}
