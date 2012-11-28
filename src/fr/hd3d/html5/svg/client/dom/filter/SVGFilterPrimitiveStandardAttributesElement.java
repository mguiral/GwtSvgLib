package fr.hd3d.html5.svg.client.dom.filter;

import fr.hd3d.html5.svg.client.core.SVGAnimatedLength;
import fr.hd3d.html5.svg.client.core.SVGAnimatedString;
import fr.hd3d.html5.svg.client.dom.SVGElement;

public abstract class SVGFilterPrimitiveStandardAttributesElement extends SVGElement {
    protected SVGFilterPrimitiveStandardAttributesElement() {
    }

    public final native SVGAnimatedLength getX() /*-{
                                                 return this.x;
                                                 }-*/;

    public final native SVGAnimatedLength getY() /*-{
                                                 return this.y;
                                                 }-*/;

    public final native SVGAnimatedLength getWidth() /*-{
                                                     return this.width;
                                                     }-*/;

    public final native SVGAnimatedLength getHeight() /*-{
                                                      return this.height;
                                                      }-*/;

    public final native SVGAnimatedString getResult() /*-{
                                                      return this.result;
                                                      }-*/;
}
