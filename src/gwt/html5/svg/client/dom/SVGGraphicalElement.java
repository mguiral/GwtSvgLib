package gwt.html5.svg.client.dom;

import gwt.html5.svg.client.core.SVGAnimatedLength;
import gwt.html5.svg.client.core.SVGAnimatedTransformList;
import gwt.html5.svg.client.core.SVGMatrix;
import gwt.html5.svg.client.core.SVGRect;

public class SVGGraphicalElement extends SVGConditionalProcessingElement {
    protected SVGGraphicalElement() {
    }

    /**
     * @return The x-axis coordinate of the side of the rectangle which has the smaller x-axis coordinate value in the
     *         current user coordinate system.
     */
    public final native SVGAnimatedLength getX() /*-{
                                                 return this.x;
                                                 }-*/;

    /**
     * @param x
     *            The x-axis coordinate of the side of the rectangle which has the smaller x-axis coordinate value in
     *            the current user coordinate system.
     */
    public final native void setX(String x) /*-{
                                            this.x = x;
                                            }-*/;

    /**
     * @return The y-axis coordinate of the side of the rectangle which has the smaller y-axis coordinate value in the
     *         current user coordinate system.
     */
    public final native SVGAnimatedLength getY() /*-{
                                                 return this.y
                                                 }-*/;

    /**
     * @param y
     *            The y-axis coordinate of the side of the rectangle which has the smaller y-axis coordinate value in
     *            the current user coordinate system.
     */
    public final native void setY(String y) /*-{
                                            this.y = y;
                                            }-*/;

    /**
     * @return The width of the rectangle.
     */
    public final native SVGAnimatedLength getWidth() /*-{
                                                     return this.width;
                                                     }-*/;

    /**
     * @param width
     *            The width of the rectangle.
     */
    public final native void setWidth(String width) /*-{
                                                    this.width = width;
                                                    }-*/;

    /**
     * @return The height of the rectangle.
     */
    public final native SVGAnimatedLength getHeight() /*-{
                                                      return this.height;
                                                      }-*/;

    /**
     * @param heigth
     *            The height of the rectangle.
     */
    public final native void setHeight(String height) /*-{
                                                      this.height = height;
                                                      }-*/;

    public final native SVGAnimatedTransformList getTransform() /*-{
                                                                return this.transform;
                                                                }-*/;

    public final native SVGElement getNearestViewportElement() /*-{
                                                               return this.nearestViewportElement;
                                                               }-*/;

    public final native SVGElement getFarthestViewportElement() /*-{
                                                                return this.farthestViewportElement;
                                                                }-*/;

    public final native SVGRect getBBox() /*-{
                                          return this.getBBox();
                                          }-*/;

    public final native SVGMatrix getCTM() /*-{
                                           return this.getCTM();
                                           }-*/;

    public final native SVGMatrix getScreenCTM() /*-{
                                                 return this.getScreenCTM();
                                                 }-*/;

    public final native SVGMatrix getTransformToElement(SVGElement element) /*-{
                                                                            return this.getTransformToElement(element);
                                                                            }-*/;
}
