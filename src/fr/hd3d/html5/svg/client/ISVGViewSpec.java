package fr.hd3d.html5.svg.client;

import fr.hd3d.html5.svg.client.core.SVGTransformList;
import fr.hd3d.html5.svg.client.dom.SVGElement;

public interface ISVGViewSpec extends ISVGZoomAndPan, ISVGFitToViewBox {
    /**
     * @return the transform setting on the SVG View Specification.
     */
    public SVGTransformList getTransform();

    /**
     * @return the viewTarget setting on the SVG View Specification.
     */
    public SVGElement getViewTarget();

    /**
     * @return the viewBox setting on the SVG View Specification.
     */
    public String getViewBoxString();

    /**
     * @return the preserveAspectRatio setting on the SVG View Specification.
     */
    public String getPreserveAspectRatioString();

    /**
     * @return the transform setting on the SVG View Specification.
     */
    public String getTransformString();

    /**
     * @return the viewTarget setting on the SVG View Specification.
     */
    public String getViewTargetString();
}
