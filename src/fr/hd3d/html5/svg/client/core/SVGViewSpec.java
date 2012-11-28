package fr.hd3d.html5.svg.client.core;

import com.google.gwt.core.client.JavaScriptObject;

import fr.hd3d.html5.svg.client.dom.SVGElement;

public class SVGViewSpec extends JavaScriptObject {
    protected SVGViewSpec() {
    }

    /**
     * @return Corresponds to the transform setting on the SVG View Specification.
     */
    public final native SVGTransformList getTransform() /*-{
                                                        return this.transform ? @fr.hd3d.html5.svg.client.core.SVGTransformList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(this.transform) : null;
                                                        }-*/;

    /**
     * @return Corresponds to the viewTarget setting on the SVG View Specification.
     */
    public final native SVGElement getViewTarget() /*-{
                                                   return this.viewTarget;
                                                   }-*/;

    /**
     * @return Corresponds to the viewBox setting on the SVG View Specification.
     */
    public final native String getViewBoxString() /*-{
                                                  return this.viewBoxString;
                                                  }-*/;

    /**
     * @return Corresponds to the preserveAspectRatio setting on the SVG View Specificatio
     */
    public final native String getPreserveAspectRatioString() /*-{
                                                              return this.preserveAspectRatioString;
                                                              }-*/;

    /**
     * @return Corresponds to the transform setting on the SVG View Specification.
     */
    public final native String getTransformString() /*-{
                                                    return this.transformString;
                                                    }-*/;

    /**
     * @return Corresponds to the viewTarget setting on the SVG View Specification.
     */
    public final native String getViewTargetString() /*-{
                                                     return this.viewTargetString;
                                                     }-*/;

    /**
     * @return Corresponds to attribute �viewBox� on the given element.
     */
    public final native SVGAnimatedRect getViewBox() /*-{
                                                     return this.viewBox;
                                                     }-*/;

    /**
     * @return Corresponds to attribute "preserveAspectRatio" on the given element
     */
    public final native SVGAnimatedPreserveAspectRatio getPreserveAspectRatio() /*-{
                                                                                return this.preserveAspectRatio;
                                                                                }-*/;

    /**
     * @return Corresponds to attribute "zoomAndPan" on the given element. The value must be one of the SVG_ZOOMANDPAN_*
     *         constants.
     */
    public final native short getZoomAndPan() /*-{
                                              return this.zoomAndPan;
                                              }-*/;

    /**
     * @param value
     *            Corresponds to attribute "zoomAndPan" on the given element. The value must be one of the
     *            SVG_ZOOMANDPAN_* constants.
     */
    public final native void setZoomAndPan(short value) /*-{
                                                        this.zoomAndPan = value;
                                                        }-*/;
}
