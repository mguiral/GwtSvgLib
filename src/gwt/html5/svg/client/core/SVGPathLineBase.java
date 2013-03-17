package gwt.html5.svg.client.core;

abstract class SVGPathLineBase extends SVGPathSeg {
    protected SVGPathLineBase() {
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
