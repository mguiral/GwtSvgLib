package fr.hd3d.html5.svg.client;

import java.util.List;

import com.google.gwt.dom.client.Style.Unit;

import fr.hd3d.html5.svg.client.core.SVGAnimatedEnumeration;
import fr.hd3d.html5.svg.client.core.SVGAnimatedLength;
import fr.hd3d.html5.svg.client.core.SVGAnimatedTransformList;
import fr.hd3d.html5.svg.client.dom.constants.SVGUnitTypes;
import fr.hd3d.html5.svg.client.user.Transform;

/**
 * @author michael.guiral
 *
 */
public interface ISVGPatternElement extends ISVGConditionalProcessingElement, ISVGURIReference, ISVGFitToViewBox {
    /**
     * @return Defines the coordinate system for attributes "x", "y", "width" and "height". If
     *         patternUnits="userSpaceOnUse", "x", "y", "width" and "height" represent values in the coordinate system
     *         that results from taking the current user coordinate system in place at the time when the "pattern"
     *         element is referenced (i.e., the user coordinate system for the element referencing the "pattern" element
     *         via a "fill" or "stroke" property) and then applying the transform specified by attribute
     *         "patternTransform". If patternUnits="objectBoundingBox", the user coordinate system for attributes "x",
     *         "y", "width" and "height" is established using the bounding box of the element to which the pattern is
     *         applied (see Object bounding box units) and then applying the transform specified by attribute
     *         "patternTransform". If attribute "patternUnits" is not specified, then the effect is as if a value of
     *         'objectBoundingBox' were specified.
     */
    SVGAnimatedEnumeration getPatternUnits();

    /**
     * @return Defines the coordinate system for the contents of the "pattern". Note that this attribute has no effect
     *         if attribute "viewBox" is specified. If patternContentUnits="userSpaceOnUse", the user coordinate system
     *         for the contents of the "pattern" element is the coordinate system that results from taking the current
     *         user coordinate system in place at the time when the "pattern" element is referenced (i.e., the user
     *         coordinate system for the element referencing the "pattern" element via a "fill" or "stroke" property)
     *         and then applying the transform specified by attribute "patternTransform". If
     *         patternContentUnits="objectBoundingBox", the user coordinate system for the contents of the "pattern"
     *         element is established using the bounding box of the element to which the pattern is applied (see Object
     *         bounding box units) and then applying the transform specified by attribute "patternTransform". If
     *         attribute "patternContentUnits" is not specified, then the effect is as if a value of 'userSpaceOnUse'
     *         were specified.
     */
    SVGAnimatedEnumeration getPatternContentUnits();

    /**
     * @return Contains the definition of an optional additional transformation from the pattern coordinate system onto
     *         the target coordinate system (i.e., 'userSpaceOnUse' or 'objectBoundingBox'). This allows for things such
     *         as skewing the pattern tiles. This additional transformation matrix is post-multiplied to (i.e., inserted
     *         to the right of) any previously defined transformations, including the implicit transformation necessary
     *         to convert from object bounding box units to user space. If attribute "patternTransform" is not
     *         specified, then the effect is as if an identity transform were specified.
     */
    SVGAnimatedTransformList getPatternTransform();

    /**
     * @return "x", "y", "width" and "height" indicate how the pattern tiles are placed and spaced. These attributes
     *         represent coordinates and values in the coordinate space specified by the combination of attributes
     *         "patternUnits" and "patternTransform". If the attribute is not specified, the effect is as if a value of
     *         zero were specified.
     */
    SVGAnimatedLength getX();

    /**
     * @return "x", "y", "width" and "height" indicate how the pattern tiles are placed and spaced. These attributes
     *         represent coordinates and values in the coordinate space specified by the combination of attributes
     *         "patternUnits" and "patternTransform". If the attribute is not specified, the effect is as if a value of
     *         zero were specified.
     */
    SVGAnimatedLength getY();

    /**
     * @return "x", "y", "width" and "height" indicate how the pattern tiles are placed and spaced. These attributes
     *         represent coordinates and values in the coordinate space specified by the combination of attributes
     *         "patternUnits" and "patternTransform". If the attribute is not specified, the effect is as if a value of
     *         zero were specified.
     */
    SVGAnimatedLength getWidth();

    /**
     * @return "x", "y", "width" and "height" indicate how the pattern tiles are placed and spaced. These attributes
     *         represent coordinates and values in the coordinate space specified by the combination of attributes
     *         "patternUnits" and "patternTransform". If the attribute is not specified, the effect is as if a value of
     *         zero were specified.
     */
    SVGAnimatedLength getHeight();

    /**
     * @param unitTypes
     *            Defines the coordinate system for attributes "x", "y", "width" and "height". If
     *            patternUnits="userSpaceOnUse", "x", "y", "width" and "height" represent values in the coordinate
     *            system that results from taking the current user coordinate system in place at the time when the
     *            "pattern" element is referenced (i.e., the user coordinate system for the element referencing the
     *            "pattern" element via a "fill" or "stroke" property) and then applying the transform specified by
     *            attribute "patternTransform". If patternUnits="objectBoundingBox", the user coordinate system for
     *            attributes "x", "y", "width" and "height" is established using the bounding box of the element to
     *            which the pattern is applied (see Object bounding box units) and then applying the transform specified
     *            by attribute "patternTransform". If attribute "patternUnits" is not specified, then the effect is as
     *            if a value of 'objectBoundingBox' were specified.
     */
    void setPatternUnits(SVGUnitTypes unitTypes);

    /**
     * @param unitTypes
     *            Defines the coordinate system for the contents of the "pattern". Note that this attribute has no
     *            effect if attribute "viewBox" is specified. If patternContentUnits="userSpaceOnUse", the user
     *            coordinate system for the contents of the "pattern" element is the coordinate system that results from
     *            taking the current user coordinate system in place at the time when the "pattern" element is
     *            referenced (i.e., the user coordinate system for the element referencing the "pattern" element via a
     *            "fill" or "stroke" property) and then applying the transform specified by attribute
     *            "patternTransform". If patternContentUnits="objectBoundingBox", the user coordinate system for the
     *            contents of the "pattern" element is established using the bounding box of the element to which the
     *            pattern is applied (see Object bounding box units) and then applying the transform specified by
     *            attribute "patternTransform". If attribute "patternContentUnits" is not specified, then the effect is
     *            as if a value of 'userSpaceOnUse' were specified.
     */
    void setPatternContentUnits(SVGUnitTypes unitTypes);

    /**
     * @param transform
     *            Contains the definition of an optional additional transformation from the pattern coordinate system
     *            onto the target coordinate system (i.e., 'userSpaceOnUse' or 'objectBoundingBox'). This allows for
     *            things such as skewing the pattern tiles. This additional transformation matrix is post-multiplied to
     *            (i.e., inserted to the right of) any previously defined transformations, including the implicit
     *            transformation necessary to convert from object bounding box units to user space. If attribute
     *            "patternTransform" is not specified, then the effect is as if an identity transform were specified.
     */
    void setTransform(Transform transform);

    /**
     * @param transformList
     *            Contains the definition of an optional additional transformation from the pattern coordinate system
     *            onto the target coordinate system (i.e., 'userSpaceOnUse' or 'objectBoundingBox'). This allows for
     *            things such as skewing the pattern tiles. This additional transformation matrix is post-multiplied to
     *            (i.e., inserted to the right of) any previously defined transformations, including the implicit
     *            transformation necessary to convert from object bounding box units to user space. If attribute
     *            "patternTransform" is not specified, then the effect is as if an identity transform were specified.
     */
    void setTransform(List<Transform> transformList);

    /**
     * @param x
     * @param unit
     */
    void setX(float x, Unit unit);

    /**
     * @param y
     * @param unit
     */
    void setY(float y, Unit unit);

    /**
     * @param width
     * @param unit
     */
    void setWidth(float width, Unit unit);

    /**
     * @param height
     * @param unit
     */
    void setHeight(float height, Unit unit);
}
