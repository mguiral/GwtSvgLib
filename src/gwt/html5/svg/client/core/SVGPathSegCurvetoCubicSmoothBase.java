package gwt.html5.svg.client.core;

abstract class SVGPathSegCurvetoCubicSmoothBase extends SVGPathLineBase {
    protected SVGPathSegCurvetoCubicSmoothBase() {
    }

    /**
     * @return The absolute X coordinate for the second control point.
     */
    public final native float getX2() /*-{
                                      return this.x2;
                                      }-*/;

    /**
     * @return The absolute X coordinate for the second control point.
     */
    public final native void setX2(float x2) /*-{
                                             this.x2 = x2;
                                             }-*/;

    public final native float getY2() /*-{
                                      
                                      return this.y2;
                                      }-*/;

    public final native void setY2(float y2) /*-{
                                             
                                             this.y2 = y2;
                                             }-*/;
}
