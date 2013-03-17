package gwt.html5.svg.client.core;

import com.google.gwt.dom.client.Element;

public class SVGRect extends Element {
    protected SVGRect() {
    }

    /**
     * @return The x coordinate of the rectangle, in user units.
     */
    public final native float getX() /*-{
                                     return this.x;
                                     }-*/;

    /**
     * @param value
     *            The x coordinate of the rectangle, in user units.
     */
    public final native void setX(float value) /*-{
                                               this.x = value;
                                               }-*/;

    /**
     * @return The y coordinate of the rectangle, in user units.
     */
    public final native float getY() /*-{
                                     return this.y;
                                     }-*/;

    /**
     * @param value
     *            The y coordinate of the rectangle, in user units.
     */
    public final native void setY(float value) /*-{
                                               this.y = value;
                                               }-*/;

    /**
     * @return The width coordinate of the rectangle, in user units.
     */
    public final native float getWidth() /*-{
                                         return this.width;
                                         }-*/;

    /**
     * @param value
     *            The width coordinate of the rectangle, in user units.
     */
    public final native void setWidth(float value) /*-{
                                                   this.width = value;
                                                   }-*/;

    /**
     * @return The height coordinate of the rectangle, in user units.
     */
    public final native float getHeight() /*-{
                                          return this.height;
                                          }-*/;

    /**
     * @param value
     *            The height coordinate of the rectangle, in user units.
     */
    public final native void setHeight(float value) /*-{
                                                    this.height = value;
                                                    }-*/;

    public final String getValue() {
        return this.getX() + " " + this.getY() + " " + this.getWidth() + " " + this.getHeight();
    }
}
