package fr.hd3d.html5.svg.client.core;

abstract class SVGPathQuadraticBase extends SVGPathLineBase {
    protected SVGPathQuadraticBase() {
    }

    /**
     * @return The absolute X coordinate for the first control point.
     */
    public final native float getX1() /*-{
                                      return this.x1;
                                      }-*/;

    /**
     * @param x1
     *            The absolute X coordinate for the first control point.
     */
    public final native void setX1(float x1) /*-{
                                             this.x1 = x1;
                                             }-*/;

    /**
     * @return The absolute Y coordinate for the first control point.
     */
    public final native float getY1() /*-{
                                      return this.y1;
                                      }-*/;

    /**
     * @param y1
     *            The absolute Y coordinate for the first control point.
     */
    public final native void setY1(float y1) /*-{
                                             this.y1 = y1;
                                             }-*/;

    public final String getPathData() {
        return getX1() + " " + getY1() + " " + getX() + " " + getY();
    }
}
