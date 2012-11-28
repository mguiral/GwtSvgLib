package fr.hd3d.html5.svg.client.dom;

import fr.hd3d.html5.svg.client.core.SVGAnimatedEnumeration;
import fr.hd3d.html5.svg.client.core.SVGAnimatedString;
import fr.hd3d.html5.svg.client.core.SVGAnimatedTransformList;

public abstract class SVGGradientElement extends SVGElement {
    protected SVGGradientElement() {
    }

    public final native SVGAnimatedEnumeration getGradientUnits() /*-{
                                                                  return this.gradientUnits;
                                                                  }-*/;

    public final native SVGAnimatedTransformList getGradientTransform() /*-{
                                                                        return this.gradientTransform;
                                                                        }-*/;

    public final native SVGAnimatedEnumeration getSpreadMethod() /*-{
                                                                 return this.spreadMethod;
                                                                 }-*/;

    public final native SVGAnimatedString getHref() /*-{
                                                    return this.href;
                                                    }-*/;
}
