package fr.hd3d.html5.svg.client;

import fr.hd3d.html5.svg.client.core.SVGMatrix;
import fr.hd3d.html5.svg.client.core.SVGRect;
import fr.hd3d.html5.svg.client.dom.SVGElement;

public interface ISVGLocatable {
    /**
     * @return The {@link SVGElement} which established the current viewport. Often, the nearest ancestor "svg" element.
     *         Null if the current element is the outermost svg element.
     */
    public SVGElement getNearestViewportElement();

    /**
     * @return The farthest ancestor �svg� element. Null if the current element is the outermost svg element.
     */
    public SVGElement getFarthestViewportElement();

    /**
     * Returns the tight bounding box in current user space (i.e., after application of the "transform" attribute, if
     * any) on the geometry of all contained graphics elements, exclusive of stroking, clipping, masking and filter
     * effects). Note that getBBox must return the actual bounding box at the time the method was called, even in case
     * the element has not yet been rendered.
     * 
     * @return An {@link SVGRect} object that defines the bounding box
     */
    public SVGRect getBoundingBox();

    /**
     * Returns the transformation matrix from current user units (i.e., after application of the "transform" attribute,
     * if any) to the viewport coordinate system for the nearestViewportElement.
     * 
     * @return An {@link SVGMatrix} object that defines the CTM.
     */
    public SVGMatrix getCTM();

    /**
     * Returns the transformation matrix from current user units (i.e., after application of the "transform" attribute,
     * if any) to the parent user agent's notice of a "pixel". For display devices, ideally this represents a physical
     * screen pixel. For other devices or environments where physical pixel sizes are not known, then an algorithm
     * similar to the CSS2 definition of a "pixel" can be used instead. Note that null is returned if this element is
     * not hooked into the document tree. This method would have been more aptly named as getClientCTM, but the name
     * getScreenCTM is kept for historical reasons.
     * 
     * @return An {@link SVGMatrix} object that defines the given transformation matrix.
     */
    public SVGMatrix getScreenCTM();

    /**
     * Returns the transformation matrix from the user coordinate system on the current element (after application of
     * the "transform" attribute, if any) to the user coordinate system on parameter element (after application of its
     * "transform" attribute, if any).
     * 
     * @param element
     *            The target element.
     * @return An {@link SVGMatrix} object that defines the transformation.
     */
    public SVGMatrix getTransformToElement(SVGElement element);
}
