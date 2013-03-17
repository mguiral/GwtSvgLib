package gwt.html5.svg.client.core;

abstract class SVGPathSegLinetoHorizontalBase extends SVGPathSeg {
    protected SVGPathSegLinetoHorizontalBase() {
    }

    /**
     * @return The absolute X coordinate for the end point of this path segment.
     */
    public final native float getX() /*-{
                                     return this.x;
                                     }-*/;

    /**
     * @param x
     *            The absolute X coordinate for the end point of this path segment.
     */
    public final native void setX(float x) /*-{
                                           this.x = x;
                                           }-*/;
}
