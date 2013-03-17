package gwt.html5.svg.client.core;

abstract class SVGPathSegArcBase extends SVGPathLineBase {
    protected SVGPathSegArcBase() {
    }

    /**
     * @return The x-axis radius for the ellipse (i.e., r1).
     */
    public final native float getR1() /*-{
                                      return this.r1;
                                      }-*/;

    /**
     * @param r1
     *            The x-axis radius for the ellipse
     */
    public final native void setR1(float r1) /*-{
                                             this.r1 = r1;
                                             }-*/;

    /**
     * @return The y-axis radius for the ellipse (i.e., r2).
     */
    public final native float getR2() /*-{
                                      return this.r2;
                                      }-*/;

    /**
     * @param r2
     *            The y-axis radius for the ellipse
     */
    public final native void setR2(float r2) /*-{
                                             this.r2 = r2;
                                             }-*/;

    /**
     * @return The rotation angle in degrees for the ellipse's x-axis relative to the x-axis of the user coordinate
     *         system.
     */
    public final native float getAngle() /*-{
                                         return this.angle;
                                         }-*/;

    /**
     * @param angle
     *            The rotation angle in degrees for the ellipse's x-axis relative to the x-axis of the user coordinate
     *            system.
     */
    public final native void setAngle(float angle) /*-{
                                                   this.angle = angle;
                                                   }-*/;

    /**
     * @return The value of the large-arc-flag parameter.
     */
    public final native boolean isLargeArcFlag() /*-{
                                                 return this.largeArcFlag;
                                                 }-*/;

    /**
     * @param largeArcFlag
     *            The value of the large-arc-flag parameter.
     */
    public final native void setLargeArcFlag(boolean largeArcFlag) /*-{
                                                                   this.largeArcFlag = largeArcFlag;
                                                                   }-*/;

    /**
     * @return The value of the sweep-flag parameter
     */
    public final native boolean isSweepFlag() /*-{
                                              return this.sweepFlag;
                                              }-*/;

    /**
     * @param sweepFlag
     *            The value of the sweep-flag parameter
     */
    public final native void setSweepFlag(boolean sweepFlag) /*-{
                                                             this.sweepFlag = sweepFlag;
                                                             }-*/;
}
