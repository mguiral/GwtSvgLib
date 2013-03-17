package gwt.html5.svg.client.core;

abstract class SVGPathSegLinetoVerticalBase extends SVGPathSeg {
    protected SVGPathSegLinetoVerticalBase() {
    }

    /**
     * @return The absolute Y coordinate for the end point of this path segment.
     */
    public final native float getY() /*-{
                                     return this.y;
                                     }-*/;

    /**
     * @param y
     *            The absolute Y coordinate for the end point of this path segment.
     */
    public final native void setY(float y) /*-{
                                           this.y = y;
                                           }-*/;
}
