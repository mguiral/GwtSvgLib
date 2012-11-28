package fr.hd3d.html5.svg.client.dom.filter;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

import fr.hd3d.html5.svg.client.core.SVGAnimatedEnumeration;
import fr.hd3d.html5.svg.client.core.SVGAnimatedInteger;
import fr.hd3d.html5.svg.client.core.SVGAnimatedLength;
import fr.hd3d.html5.svg.client.core.SVGAnimatedString;
import fr.hd3d.html5.svg.client.dom.SVGElement;

@TagName(SVGFilterElement.TAG)
public class SVGFilterElement extends SVGElement {
    public static final String TAG = "filter";

    public static SVGFilterElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGFilterElement) elem;
    }

    protected SVGFilterElement() {
    }

    public final native SVGAnimatedEnumeration getFilterUnits() /*-{
                                                                return this.filterUnits;
                                                                }-*/;

    public final native SVGAnimatedEnumeration getPrimitiveUnits() /*-{
                                                                   return this.primitiveUnits;
                                                                   }-*/;

    public final native SVGAnimatedLength getX() /*-{
                                                 return this.x;
                                                 }-*/;

    public final native SVGAnimatedLength getY() /*-{
                                                 return this.y;
                                                 }-*/;

    public final native SVGAnimatedLength getWidth() /*-{
                                                     return this.width;
                                                     }-*/;

    public final native SVGAnimatedLength getHeight()/*-{
                                                     return this.height;
                                                     }-*/;

    public final native SVGAnimatedInteger getFilterResX() /*-{
                                                           return this.filterResX;
                                                           }-*/;

    public final native SVGAnimatedInteger getFilterResY() /*-{
                                                           return this.filterResY;
                                                           }-*/;

    public final native void setFilterRes(int filterResX, int filterResY) /*-{
                                                                          this.setFilterRes(filterResX, filterResY);
                                                                          }-*/;

    public final native SVGAnimatedString getHref() /*-{
                                                    return this.href;
                                                    }-*/;
}
