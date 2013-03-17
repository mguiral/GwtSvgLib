package gwt.html5.svg.client.filter;

import com.google.gwt.dom.client.Style.Unit;

import gwt.html5.svg.client.ISVGElement;
import gwt.html5.svg.client.ISVGURIReference;
import gwt.html5.svg.client.core.SVGAnimatedEnumeration;
import gwt.html5.svg.client.core.SVGAnimatedInteger;
import gwt.html5.svg.client.core.SVGAnimatedLength;
import gwt.html5.svg.client.dom.constants.SVGUnitTypes;

/**
 * @author michael.guiral
 * 
 */
public interface ISVGFilterElement extends ISVGElement, ISVGURIReference {
    /**
     * @return the coordinate system for attributes "x", "y", "width" and "height".
     * 
     *         If filterUnits="userSpaceOnUse", "x", "y", "width" and "height" represent values in the current user
     *         coordinate system in place at the time when the "filter" is referenced (i.e., the user coordinate system
     *         for the element referencing the "filter" via a "filter" property).
     * 
     *         If filterUnits="objectBoundingBox", then "x", "y", "width" and "height" represent fractions or
     *         percentages of the bounding box on the referencing element (see Object bounding box units).
     * 
     *         If attribute "filterUnits" is not specified, then the effect is if a value of 'objectBoundingBox' were
     *         specified.
     */
    SVGAnimatedEnumeration getFilterUnits();

    /**
     * @param unitTypes
     *            Defines the coordinate system for attributes "x", "y", "width" and "height".
     * 
     *            If filterUnits="userSpaceOnUse", "x", "y", "width" and "height" represent values in the current user
     *            coordinate system in place at the time when the "filter" is referenced (i.e., the user coordinate
     *            system for the element referencing the "filter" via a "filter" property).
     * 
     *            If filterUnits="objectBoundingBox", then "x", "y", "width" and "height" represent fractions or
     *            percentages of the bounding box on the referencing element (see Object bounding box units).
     * 
     *            If attribute "filterUnits" is not specified, then the effect is if a value of 'objectBoundingBox' were
     *            specified.
     */
    void setFilterUnits(SVGUnitTypes unitTypes);

    /**
     * @return the coordinate system for the various length values within the filter primitives and for the attributes
     *         that define the filter primitive subregion. If primitiveUnits="userSpaceOnUse", any length values within
     *         the filter definitions represent values in the current user coordinate system in place at the time when
     *         the "filter" element is referenced (i.e., the user coordinate system for the element referencing the
     *         "filter" element via a "filter" property). If primitiveUnits="objectBoundingBox", then any length values
     *         within the filter definitions represent fractions or percentages of the bounding box on the referencing
     *         element (see Object bounding box units). Note that if only one number was specified in a
     *         <number-optional-number> value this number is expanded out before the "primitiveUnits" computation takes
     *         place. If attribute "primitiveUnits" is not specified, then the effect is as if a value of userSpaceOnUse
     *         were specified.
     */
    SVGAnimatedEnumeration getPrimitiveUnits();

    /**
     * @param unitTypes
     *            Specifies the coordinate system for the various length values within the filter primitives and for the
     *            attributes that define the filter primitive subregion. If primitiveUnits="userSpaceOnUse", any length
     *            values within the filter definitions represent values in the current user coordinate system in place
     *            at the time when the "filter" element is referenced (i.e., the user coordinate system for the element
     *            referencing the "filter" element via a "filter" property). If primitiveUnits="objectBoundingBox", then
     *            any length values within the filter definitions represent fractions or percentages of the bounding box
     *            on the referencing element (see Object bounding box units). Note that if only one number was specified
     *            in a <number-optional-number> value this number is expanded out before the "primitiveUnits"
     *            computation takes place. If attribute "primitiveUnits" is not specified, then the effect is as if a
     *            value of userSpaceOnUse were specified.
     */
    void setPrimitiveUnits(SVGUnitTypes unitTypes);

    /**
     * These attributes define a rectangular region on the canvas to which this filter applies.
     * 
     * The amount of memory and processing time required to apply the filter are related to the size of this rectangle
     * and the "filterRes" attribute of the filter.
     * 
     * The coordinate system for these attributes depends on the value for attribute "filterUnits".
     * 
     * Negative values for "width" or "height" are an error (see Error processing). Zero values disable rendering of the
     * element which referenced the filter.
     * 
     * The bounds of this rectangle act as a hard clipping region for each filter primitive included with a given
     * "filter" element; thus, if the effect of a given filter primitive would extend beyond the bounds of the rectangle
     * (this sometimes happens when using a "feGaussianBlur" filter primitive with a very large "stdDeviation"), parts
     * of the effect will get clipped.
     * 
     * If "x" or "y" is not specified, the effect is as if a value of -10% were specified.
     * 
     * If "width" or "height" is not specified, the effect is as if a value of 120% were specified.
     */
    SVGAnimatedLength getX();

    /**
     * These attributes define a rectangular region on the canvas to which this filter applies.
     * 
     * The amount of memory and processing time required to apply the filter are related to the size of this rectangle
     * and the "filterRes" attribute of the filter.
     * 
     * The coordinate system for these attributes depends on the value for attribute "filterUnits".
     * 
     * Negative values for "width" or "height" are an error (see Error processing). Zero values disable rendering of the
     * element which referenced the filter.
     * 
     * The bounds of this rectangle act as a hard clipping region for each filter primitive included with a given
     * "filter" element; thus, if the effect of a given filter primitive would extend beyond the bounds of the rectangle
     * (this sometimes happens when using a "feGaussianBlur" filter primitive with a very large "stdDeviation"), parts
     * of the effect will get clipped.
     * 
     * If "x" or "y" is not specified, the effect is as if a value of -10% were specified.
     * 
     * If "width" or "height" is not specified, the effect is as if a value of 120% were specified.
     */
    void setX(float x, Unit unit);

    /**
     * These attributes define a rectangular region on the canvas to which this filter applies.
     * 
     * The amount of memory and processing time required to apply the filter are related to the size of this rectangle
     * and the "filterRes" attribute of the filter.
     * 
     * The coordinate system for these attributes depends on the value for attribute "filterUnits".
     * 
     * Negative values for "width" or "height" are an error (see Error processing). Zero values disable rendering of the
     * element which referenced the filter.
     * 
     * The bounds of this rectangle act as a hard clipping region for each filter primitive included with a given
     * "filter" element; thus, if the effect of a given filter primitive would extend beyond the bounds of the rectangle
     * (this sometimes happens when using a "feGaussianBlur" filter primitive with a very large "stdDeviation"), parts
     * of the effect will get clipped.
     * 
     * If "x" or "y" is not specified, the effect is as if a value of -10% were specified.
     * 
     * If "width" or "height" is not specified, the effect is as if a value of 120% were specified.
     */
    SVGAnimatedLength getY();

    /**
     * These attributes define a rectangular region on the canvas to which this filter applies.
     * 
     * The amount of memory and processing time required to apply the filter are related to the size of this rectangle
     * and the "filterRes" attribute of the filter.
     * 
     * The coordinate system for these attributes depends on the value for attribute "filterUnits".
     * 
     * Negative values for "width" or "height" are an error (see Error processing). Zero values disable rendering of the
     * element which referenced the filter.
     * 
     * The bounds of this rectangle act as a hard clipping region for each filter primitive included with a given
     * "filter" element; thus, if the effect of a given filter primitive would extend beyond the bounds of the rectangle
     * (this sometimes happens when using a "feGaussianBlur" filter primitive with a very large "stdDeviation"), parts
     * of the effect will get clipped.
     * 
     * If "x" or "y" is not specified, the effect is as if a value of -10% were specified.
     * 
     * If "width" or "height" is not specified, the effect is as if a value of 120% were specified.
     */
    void setY(float y, Unit unit);

    /**
     * These attributes define a rectangular region on the canvas to which this filter applies.
     * 
     * The amount of memory and processing time required to apply the filter are related to the size of this rectangle
     * and the "filterRes" attribute of the filter.
     * 
     * The coordinate system for these attributes depends on the value for attribute "filterUnits".
     * 
     * Negative values for "width" or "height" are an error (see Error processing). Zero values disable rendering of the
     * element which referenced the filter.
     * 
     * The bounds of this rectangle act as a hard clipping region for each filter primitive included with a given
     * "filter" element; thus, if the effect of a given filter primitive would extend beyond the bounds of the rectangle
     * (this sometimes happens when using a "feGaussianBlur" filter primitive with a very large "stdDeviation"), parts
     * of the effect will get clipped.
     * 
     * If "x" or "y" is not specified, the effect is as if a value of -10% were specified.
     * 
     * If "width" or "height" is not specified, the effect is as if a value of 120% were specified.
     */
    SVGAnimatedLength getWidth();

    /**
     * These attributes define a rectangular region on the canvas to which this filter applies.
     * 
     * The amount of memory and processing time required to apply the filter are related to the size of this rectangle
     * and the "filterRes" attribute of the filter.
     * 
     * The coordinate system for these attributes depends on the value for attribute "filterUnits".
     * 
     * Negative values for "width" or "height" are an error (see Error processing). Zero values disable rendering of the
     * element which referenced the filter.
     * 
     * The bounds of this rectangle act as a hard clipping region for each filter primitive included with a given
     * "filter" element; thus, if the effect of a given filter primitive would extend beyond the bounds of the rectangle
     * (this sometimes happens when using a "feGaussianBlur" filter primitive with a very large "stdDeviation"), parts
     * of the effect will get clipped.
     * 
     * If "x" or "y" is not specified, the effect is as if a value of -10% were specified.
     * 
     * If "width" or "height" is not specified, the effect is as if a value of 120% were specified.
     */
    void setWidth(int width, Unit unit);

    /**
     * These attributes define a rectangular region on the canvas to which this filter applies.
     * 
     * The amount of memory and processing time required to apply the filter are related to the size of this rectangle
     * and the "filterRes" attribute of the filter.
     * 
     * The coordinate system for these attributes depends on the value for attribute "filterUnits".
     * 
     * Negative values for "width" or "height" are an error (see Error processing). Zero values disable rendering of the
     * element which referenced the filter.
     * 
     * The bounds of this rectangle act as a hard clipping region for each filter primitive included with a given
     * "filter" element; thus, if the effect of a given filter primitive would extend beyond the bounds of the rectangle
     * (this sometimes happens when using a "feGaussianBlur" filter primitive with a very large "stdDeviation"), parts
     * of the effect will get clipped.
     * 
     * If "x" or "y" is not specified, the effect is as if a value of -10% were specified.
     * 
     * If "width" or "height" is not specified, the effect is as if a value of 120% were specified.
     */
    SVGAnimatedLength getHeight();

    /**
     * These attributes define a rectangular region on the canvas to which this filter applies.
     * 
     * The amount of memory and processing time required to apply the filter are related to the size of this rectangle
     * and the "filterRes" attribute of the filter.
     * 
     * The coordinate system for these attributes depends on the value for attribute "filterUnits".
     * 
     * Negative values for "width" or "height" are an error (see Error processing). Zero values disable rendering of the
     * element which referenced the filter.
     * 
     * The bounds of this rectangle act as a hard clipping region for each filter primitive included with a given
     * "filter" element; thus, if the effect of a given filter primitive would extend beyond the bounds of the rectangle
     * (this sometimes happens when using a "feGaussianBlur" filter primitive with a very large "stdDeviation"), parts
     * of the effect will get clipped.
     * 
     * If "x" or "y" is not specified, the effect is as if a value of -10% were specified.
     * 
     * If "width" or "height" is not specified, the effect is as if a value of 120% were specified.
     */
    void setHeight(float height, Unit unit);

    /**
     * This attribute takes the form x-pixels [y-pixels], and indicates the width and height of the intermediate images
     * in pixels. If not provided, then a reasonable default resolution appropriate for the target device will be used.
     * (For displays, an appropriate display resolution, preferably the current display's pixel resolution, is the
     * default. For printing, an appropriate common printer resolution, such as 400dpi, is the default.)
     * 
     * Care should be taken when assigning a non-default value to this attribute. Too small of a value may result in
     * unwanted pixelation in the result. Too large of a value may result in slow processing and large memory usage.
     * 
     * Negative values are an error (see Error processing). Zero values disable rendering of the element which
     * referenced the filter.
     */
    SVGAnimatedInteger getFilterResX();

    /**
     * This attribute takes the form x-pixels [y-pixels], and indicates the width and height of the intermediate images
     * in pixels. If not provided, then a reasonable default resolution appropriate for the target device will be used.
     * (For displays, an appropriate display resolution, preferably the current display's pixel resolution, is the
     * default. For printing, an appropriate common printer resolution, such as 400dpi, is the default.)
     * 
     * Care should be taken when assigning a non-default value to this attribute. Too small of a value may result in
     * unwanted pixelation in the result. Too large of a value may result in slow processing and large memory usage.
     * 
     * Negative values are an error (see Error processing). Zero values disable rendering of the element which
     * referenced the filter.
     */
    SVGAnimatedInteger getFilterResY();

    /**
     * This attribute takes the form x-pixels [y-pixels], and indicates the width and height of the intermediate images
     * in pixels. If not provided, then a reasonable default resolution appropriate for the target device will be used.
     * (For displays, an appropriate display resolution, preferably the current display's pixel resolution, is the
     * default. For printing, an appropriate common printer resolution, such as 400dpi, is the default.)
     * 
     * Care should be taken when assigning a non-default value to this attribute. Too small of a value may result in
     * unwanted pixelation in the result. Too large of a value may result in slow processing and large memory usage.
     * 
     * Negative values are an error (see Error processing). Zero values disable rendering of the element which
     * referenced the filter.
     * 
     * @param filterResX
     * @param filterResY
     */
    void setFilterRes(int filterResX, int filterResY);
}
