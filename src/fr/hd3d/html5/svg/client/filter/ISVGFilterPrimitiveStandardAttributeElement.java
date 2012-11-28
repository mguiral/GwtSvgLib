package fr.hd3d.html5.svg.client.filter;

import com.google.gwt.dom.client.Style.Unit;

import fr.hd3d.html5.svg.client.ISVGStylable;
import fr.hd3d.html5.svg.client.core.SVGAnimatedLength;
import fr.hd3d.html5.svg.client.core.SVGAnimatedString;

/**
 * @author michael.guiral
 * 
 */
public interface ISVGFilterPrimitiveStandardAttributeElement extends ISVGStylable {
    /**
     * @return The minimum x coordinate for the subregion which restricts calculation and rendering of the given filter
     *         primitive
     */
    SVGAnimatedLength getX();

    /**
     * The minimum x coordinate for the subregion which restricts calculation and rendering of the given filter
     * primitive
     * 
     * @param x
     * @param unit
     */
    void setX(float x, Unit unit);

    /**
     * @return The minimum y coordinate for the subregion which restricts calculation and rendering of the given filter
     *         primitive
     */
    SVGAnimatedLength getY();

    /**
     * The minimum y coordinate for the subregion which restricts calculation and rendering of the given filter
     * primitive
     * 
     * @param y
     * @param unit
     */
    void setY(float y, Unit unit);

    /**
     * The width of the subregion which restricts calculation and rendering of the given filter primitive
     * 
     * @return
     */
    SVGAnimatedLength getWidth();

    /**
     * The width of the subregion which restricts calculation and rendering of the given filter primitive
     * 
     * @param width
     * @param unit
     */
    void setWidth(float width, Unit unit);

    /**
     * @return The height of the subregion which restricts calculation and rendering of the given filter primitive
     */
    SVGAnimatedLength getHeight();

    /**
     * The height of the subregion which restricts calculation and rendering of the given filter primitive
     * 
     * @param height
     * @param unit
     */
    void setHeight(float height, Unit unit);

    /**
     * 
     * @return Assigned name for this filter primitive. If supplied, then graphics that result from processing this
     *         filter primitive can be referenced by an "in" attribute on a subsequent filter primitive within the same
     *         "filter" element. If no value is provided, the output will only be available for re-use as the implicit
     *         input into the next filter primitive if that filter primitive provides no value for its "in" attribute.
     *         Note that a <filter-primitive-reference> is not an XML ID; instead, a <filter-primitive-reference> is
     *         only meaningful within a given "filter" element and thus have only local scope. It is legal for the same
     *         <filter-primitive-reference> to appear multiple times within the same "filter" element. When referenced,
     *         the <filter-primitive-reference> will use the closest preceding filter primitive with the given result.
     */
    SVGAnimatedString getResult();

    /**
     * Assigned name for this filter primitive. If supplied, then graphics that result from processing this filter
     * primitive can be referenced by an "in" attribute on a subsequent filter primitive within the same "filter"
     * element. If no value is provided, the output will only be available for re-use as the implicit input into the
     * next filter primitive if that filter primitive provides no value for its "in" attribute. Note that a
     * <filter-primitive-reference> is not an XML ID; instead, a <filter-primitive-reference> is only meaningful within
     * a given "filter" element and thus have only local scope. It is legal for the same <filter-primitive-reference> to
     * appear multiple times within the same "filter" element. When referenced, the <filter-primitive-reference> will
     * use the closest preceding filter primitive with the given result.
     * 
     * @param result
     */
    void setResult(String result);
}
