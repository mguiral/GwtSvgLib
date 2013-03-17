package gwt.html5.svg.client.dom;

import gwt.html5.svg.client.core.SVGAnimatedEnumeration;
import gwt.html5.svg.client.core.SVGAnimatedString;
import gwt.html5.svg.client.core.SVGAnimatedTransformList;

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
