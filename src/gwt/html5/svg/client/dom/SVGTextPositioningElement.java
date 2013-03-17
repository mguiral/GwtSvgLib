package gwt.html5.svg.client.dom;

import gwt.html5.svg.client.core.SVGAnimatedLengthList;
import gwt.html5.svg.client.core.SVGAnimatedNumberList;

public abstract class SVGTextPositioningElement extends SVGTextContentElement {
    protected SVGTextPositioningElement() {
    }

    public final native SVGAnimatedLengthList getX()/*-{
                                                    return this.x;
                                                    }-*/;

    public final native SVGAnimatedLengthList getY() /*-{
                                                     return this.y;
                                                     }-*/;

    public final native SVGAnimatedLengthList getDx() /*-{
                                                      return this.dx;
                                                      }-*/;

    public final native SVGAnimatedLengthList getDy() /*-{
                                                      return this.dy;
                                                      }-*/;

    public final native SVGAnimatedNumberList getRotate() /*-{
                                                          return this.rotate;
                                                          }-*/;
}
