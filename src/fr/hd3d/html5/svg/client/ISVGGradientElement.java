package fr.hd3d.html5.svg.client;

import java.util.List;

import fr.hd3d.html5.svg.client.core.SVGAnimatedEnumeration;
import fr.hd3d.html5.svg.client.core.SVGAnimatedTransformList;
import fr.hd3d.html5.svg.client.core.SVGTransform;
import fr.hd3d.html5.svg.client.dom.constants.GradientUnits;
import fr.hd3d.html5.svg.client.dom.constants.SpreadMethod;
import fr.hd3d.html5.svg.client.user.ui.SVGStopWidget;

public interface ISVGGradientElement extends ISVGElement, ISVGURIReference {
    /**
     * @return Corresponds to attribute "gradientUnits" on the given element. Takes one of the constants defined in
     *         SVGUnitTypes.
     */
    SVGAnimatedEnumeration getGradienUnits();

    /**
     * Defines the coordinate system for attributes "x1’, "y1", "x2" and "y2". If gradientUnits="userSpaceOnUse", "x1",
     * "y1", "x2" and "y2" represent values in the coordinate system that results from taking the current user
     * coordinate system in place at the time when the gradient element is referenced (i.e., the user coordinate system
     * for the element referencing the gradient element via a "fill" or "stroke" property) and then applying the
     * transform specified by attribute "gradientTransform". If gradientUnits="objectBoundingBox", the user coordinate
     * system for attributes "x1", "y1", "x2" and "y2" is established using the bounding box of the element to which the
     * gradient is applied (see Object bounding box units) and then applying the transform specified by attribute
     * "gradientTransform". When gradientUnits="objectBoundingBox" and "gradientTransform" is the identity matrix, the
     * normal of the linear gradient is perpendicular to the gradient vector in object bounding box space (i.e., the
     * abstract coordinate system where (0,0) is at the top/left of the object bounding box and (1,1) is at the
     * bottom/right of the object bounding box). When the object's bounding box is not square, the gradient normal which
     * is initially perpendicular to the gradient vector within object bounding box space may render non-perpendicular
     * relative to the gradient vector in user space. If the gradient vector is parallel to one of the axes of the
     * bounding box, the gradient normal will remain perpendicular. This transformation is due to application of the
     * non-uniform scaling transformation from bounding box space to user space. If attribute "gradientUnits" is not
     * specified, then the effect is as if a value of 'objectBoundingBox' were specified.
     */
    void setGradientUnits(GradientUnits gradientUnit);

    /**
     * @return Corresponds to attribute ‘gradientTransform’ on the given element.
     */
    SVGAnimatedTransformList getGradientTransform();

    /**
     * Contains the definition of an optional additional transformation from the gradient coordinate system onto the
     * target coordinate system (i.e., userSpaceOnUse or objectBoundingBox). This allows for things such as skewing the
     * gradient. This additional transformation matrix is post-multiplied to (i.e., inserted to the right of) any
     * previously defined transformations, including the implicit transformation necessary to convert from object
     * bounding box units to user space. If attribute ‘gradientTransform’ is not specified, then the effect is as if an
     * identity transform were specified.
     * 
     * @param transform
     */
    void setTransform(SVGTransform transform);

    /**
     * Contains the definition of an optional additional transformation from the gradient coordinate system onto the
     * target coordinate system (i.e., userSpaceOnUse or objectBoundingBox). This allows for things such as skewing the
     * gradient. This additional transformation matrix is post-multiplied to (i.e., inserted to the right of) any
     * previously defined transformations, including the implicit transformation necessary to convert from object
     * bounding box units to user space. If attribute ‘gradientTransform’ is not specified, then the effect is as if an
     * identity transform were specified.
     * 
     * @param transformList
     */
    void setTrasnform(List<SVGTransform> transformList);

    /**
     * @return Corresponds to attribute ‘spreadMethod’ on the given element.
     */
    SVGAnimatedEnumeration getSpreadMethod();

    /**
     * Indicates what happens if the gradient starts or ends inside the bounds of the target rectangle. Possible values
     * are: 'pad', which says to use the terminal colors of the gradient to fill the remainder of the target region,
     * 'reflect', which says to reflect the gradient pattern start-to-end, end-to-start, start-to-end, etc. continuously
     * until the target rectangle is filled, and repeat, which says to repeat the gradient pattern start-to-end,
     * start-to-end, start-to-end, etc. continuously until the target region is filled. If the attribute is not
     * specified, the effect is as if a value of 'pad' were speci
     */
    void setSpreadMethod(SpreadMethod spreadMethod);

    SVGStopWidget addStop(int offset, String color);
}
