package fr.hd3d.html5.svg.client.core;

import com.google.gwt.core.client.JavaScriptObject;

public class SVGPoint extends JavaScriptObject {
    protected SVGPoint() {
    }

    /**
     * @return The x coordinate.
     */
    public final native int getX() /*-{
                                   return this.x;
                                   }-*/;

    /**
     * @param x
     *            The x coordinate.
     */
    public final native void setX(int x) /*-{
                                         this.x = x;
                                         }-*/;

    /**
     * @return The y coordinate.
     */
    public final native int getY() /*-{
                                   return this.y;
                                   }-*/;

    /**
     * @param y
     *            The y coordinate.
     */
    public final native void setY(int y) /*-{
                                         this.y = y;
                                         }-*/;

    /**
     * Applies a 2x3 matrix transformation on this SVGPoint object and returns a new, transformed SVGPoint object:
     * 
     * @param matrix
     *            The matrix which is to be applied to this SVGPoint object.
     * @return A new SVGPoint object.
     */
    public final native SVGPoint matrixTransform(SVGMatrix matrix) /*-{
                                                                   return this.matrixTransform(matrix);
                                                                   }-*/;
}
