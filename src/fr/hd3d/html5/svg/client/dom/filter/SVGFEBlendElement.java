package fr.hd3d.html5.svg.client.dom.filter;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

import fr.hd3d.html5.svg.client.core.SVGAnimatedEnumeration;
import fr.hd3d.html5.svg.client.core.SVGAnimatedString;

@TagName(SVGFEBlendElement.TAG)
public class SVGFEBlendElement extends SVGFilterPrimitiveStandardAttributesElement {
    public static final String TAG = "feBlend";

    public static SVGFEBlendElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGFEBlendElement) elem;
    }

    protected SVGFEBlendElement() {
    }

    public final native SVGAnimatedString getIn1() /*-{
                                                   
                                                   return this.in1;
                                                   }-*/;

    public final native SVGAnimatedString getIn2() /*-{
                                                   
                                                   return this.in2;
                                                   }-*/;

    public final native SVGAnimatedEnumeration getMode() /*-{
                                                         
                                                         return this.mode;
                                                         }-*/;
}
