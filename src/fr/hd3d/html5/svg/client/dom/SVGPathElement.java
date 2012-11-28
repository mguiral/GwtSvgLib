package fr.hd3d.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;

import fr.hd3d.html5.svg.client.core.SVGAnimatedNumber;
import fr.hd3d.html5.svg.client.core.SVGPathSegArcAbs;
import fr.hd3d.html5.svg.client.core.SVGPathSegArcRel;
import fr.hd3d.html5.svg.client.core.SVGPathSegClosePath;
import fr.hd3d.html5.svg.client.core.SVGPathSegCurvetoCubicAbs;
import fr.hd3d.html5.svg.client.core.SVGPathSegCurvetoCubicRel;
import fr.hd3d.html5.svg.client.core.SVGPathSegCurvetoCubicSmoothAbs;
import fr.hd3d.html5.svg.client.core.SVGPathSegCurvetoCubicSmoothRel;
import fr.hd3d.html5.svg.client.core.SVGPathSegCurvetoQuadraticAbs;
import fr.hd3d.html5.svg.client.core.SVGPathSegCurvetoQuadraticRel;
import fr.hd3d.html5.svg.client.core.SVGPathSegCurvetoQuadraticSmoothAbs;
import fr.hd3d.html5.svg.client.core.SVGPathSegCurvetoQuadraticSmoothRel;
import fr.hd3d.html5.svg.client.core.SVGPathSegLinetoAbs;
import fr.hd3d.html5.svg.client.core.SVGPathSegLinetoHorizontalAbs;
import fr.hd3d.html5.svg.client.core.SVGPathSegLinetoHorizontalRel;
import fr.hd3d.html5.svg.client.core.SVGPathSegLinetoRel;
import fr.hd3d.html5.svg.client.core.SVGPathSegLinetoVerticalAbs;
import fr.hd3d.html5.svg.client.core.SVGPathSegLinetoVerticalRel;
import fr.hd3d.html5.svg.client.core.SVGPathSegList;
import fr.hd3d.html5.svg.client.core.SVGPathSegMovetoAbs;
import fr.hd3d.html5.svg.client.core.SVGPathSegMovetoRel;
import fr.hd3d.html5.svg.client.core.SVGPoint;

/**
 * @author michael.guiral
 * 
 */
public class SVGPathElement extends SVGGraphicalElement {
    public static final String TAG = "path";

    public static SVGPathElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGPathElement) elem;
    }

    protected SVGPathElement() {
    }

    /**
     * @return Corresponds to attribute pathLength on the given "path" element.
     */
    public final native SVGAnimatedNumber getPathLength() /*-{
                                                          return this.pathLength;
                                                          }-*/;

    /**
     * Returns the user agent's computed value for the total length of the path using the user agent's
     * distance-along-a-path algorithm, as a distance in the current user coordinate system
     * 
     * @return The total length of the path.
     */
    public final native float getTotalLength() /*-{
                                               return this.getTotalLength();
                                               }-*/;

    /**
     * Returns the (x,y) coordinate in user space which is distance units along the path, utilizing the user agent's
     * distance-along-a-path algorithm.
     * 
     * @param distance
     *            The distance along the path, relative to the start of the path, as a distance in the current user
     *            coordinate system.
     * @return The returned point in user space.
     */
    public final native SVGPoint getPointAtLength(float distance) /*-{
                                                                  return this.getPointAtLength(distance);
                                                                  }-*/;

    /**
     * Returns the index into pathSegList which is distance units along the path, utilizing the user agent's
     * distance-along-a-path algorithm.
     * 
     * @param distance
     *            The distance along the path, relative to the start of the path, as a distance in the current user
     *            coordinate system.
     * @return The index of the path segment, where the first path segment is number 0.
     */
    public final native int getPathSegAtLength(float distance) /*-{
                                                               return this.getPathSegAtLength(distance);
                                                               }-*/;

    /**
     * Returns a stand-alone, parentless {@link SVGPathSegClosePath} object.
     * 
     * @return A stand-alone, parentless {@link SVGPathSegClosePath} object.
     */
    public final native SVGPathSegClosePath createSVGPathSegClosePath() /*-{
                                                                        return this.createSVGPathSegClosePath();
                                                                        }-*/;

    /**
     * Returns a stand-alone, parentless {@link SVGPathSegMovetoAbs} object.
     * 
     * @param x
     *            The absolute X coordinate for the end point of this path segment.
     * @param y
     *            The absolute Y coordinate for the end point of this path segment.
     * @return A stand-alone, parentless {@link SVGPathSegMovetoAbs} object.
     */
    public final native SVGPathSegMovetoAbs createSVGPathSegMovetoAbs(float x, float y) /*-{
                                                                                        return this.createSVGPathSegMovetoAbs(x, y);
                                                                                        }-*/;

    /**
     * Returns a stand-alone, parentless {@link SVGPathSegMovetoRel} object.
     * 
     * @param x
     *            The absolute X coordinate for the end point of this path segment.
     * @param y
     *            The absolute Y coordinate for the end point of this path segment.
     * @return A stand-alone, parentless {@link SVGPathSegMovetoRel} object.
     */
    public final native SVGPathSegMovetoRel createSVGPathSegMovetoRel(float x, float y) /*-{
                                                                                        return this.createSVGPathSegMovetoRel(x, y);
                                                                                        }-*/;

    /**
     * Returns a stand-alone, parentless {@link SVGPathSegLinetoAbs} object.
     * 
     * @param x
     *            The absolute X coordinate for the end point of this path segment.
     * @param y
     *            The absolute Y coordinate for the end point of this path segment.
     * @return A stand-alone, parentless {@link SVGPathSegLinetoAbs} object.
     */
    public final native SVGPathSegLinetoAbs createSVGPathSegLinetoAbs(float x, float y) /*-{
                                                                                        return this.createSVGPathSegLinetoAbs(x, y);
                                                                                        }-*/;

    /**
     * Returns a stand-alone, parentless {@link SVGPathSegLinetoRel} object.
     * 
     * @param x
     *            The relative X coordinate for the end point of this path segment.
     * @param y
     *            The relative Y coordinate for the end point of this path segment.
     * @return A stand-alone, parentless {@link SVGPathSegLinetoRel} object.
     */
    public final native SVGPathSegLinetoRel createSVGPathSegLinetoRel(float x, float y) /*-{
                                                                                        return this.createSVGPathSegLinetoRel(x, y);
                                                                                        }-*/;

    /**
     * Returns a stand-alone, parentless {@link SVGPathSegCurvetoCubicAbs} object.
     * 
     * @param x
     *            The absolute X coordinate for the end point of this path segment.
     * @param y
     *            The absolute Y coordinate for the end point of this path segment.
     * @param x1
     *            The absolute X coordinate for the first control point.
     * @param y1
     *            The absolute Y coordinate for the first control point.
     * @param x2
     *            The absolute X coordinate for the second control point.
     * @param y2
     *            The absolute Y coordinate for the second control point.
     * @return A stand-alone, parentless {@link SVGPathSegCurvetoCubicAbs} object.
     */
    public final native SVGPathSegCurvetoCubicAbs createSVGPathSegCurvetoCubicAbs(float x, float y, float x1, float y1, float x2, float y2) /*-{
                                                                                                                                            return this.createSVGPathSegCurvetoCubicAbs(x, y, x1, y1, x2, y2);
                                                                                                                                            }-*/;

    /**
     * Returns a stand-alone, parentless {@link SVGPathSegCurvetoCubicRel} object.
     * 
     * @param x
     *            The relative X coordinate for the end point of this path segment
     * @param y
     *            The relative Y coordinate for the end point of this path segment.
     * @param x1
     *            The relative X coordinate for the first control point.
     * @param y1
     *            The relative Y coordinate for the first control point.
     * @param x2
     *            The relative X coordinate for the second control point.
     * @param y2
     *            The relative Y coordinate for the second control point.
     * @return A stand-alone, parentless {@link SVGPathSegCurvetoCubicRel} object.
     */
    public final native SVGPathSegCurvetoCubicRel createSVGPathSegCurvetoCubicRel(float x, float y, float x1, float y1, float x2, float y2) /*-{
                                                                                                                                            return this.createSVGPathSegCurvetoCubicRel(x, y, x1, y1, x2, y2);
                                                                                                                                            }-*/;

    /**
     * Returns a stand-alone, parentless {@link SVGPathSegCurvetoQuadraticAbs} object.
     * 
     * @param x
     *            The relative X coordinate for the end point of this path segment
     * @param y
     *            The relative Y coordinate for the end point of this path segment.
     * @param x1
     *            The relative X coordinate for the first control point.
     * @param y1
     *            The relative Y coordinate for the first control point.
     * @return A stand-alone, parentless {@link SVGPathSegCurvetoQuadraticAbs} object.
     */
    public final native SVGPathSegCurvetoQuadraticAbs createSVGPathSegCurvetoQuadraticAbs(float x, float y, float x1, float y1) /*-{
                                                                                                                                return this.createSVGPathSegCurvetoQuadraticAbs(x, y, x1, y1);
                                                                                                                                }-*/;

    /**
     * Returns a stand-alone, parentless {@link SVGPathSegCurvetoQuadraticRel} object.
     * 
     * @param x
     *            The relative X coordinate for the end point of this path segment
     * @param y
     *            The relative Y coordinate for the end point of this path segment.
     * @param x1
     *            The relative X coordinate for the first control point.
     * @param y1
     *            The relative Y coordinate for the first control point.
     * @return A stand-alone, parentless {@link SVGPathSegCurvetoQuadraticRel} object.
     */
    public final native SVGPathSegCurvetoQuadraticRel createSVGPathSegCurvetoQuadraticRel(float x, float y, float x1, float y1) /*-{
                                                                                                                                return this.createSVGPathSegCurvetoQuadraticRel(x, y, x1, y1);
                                                                                                                                }-*/;

    /**
     * Returns a stand-alone, parentless {@link SVGPathSegArcAbs} object.
     * 
     * @param x
     *            The relative X coordinate for the end point of this path segment
     * @param y
     *            The relative Y coordinate for the end point of this path segment.
     * @param r1
     *            The x-axis radius for the ellipse (i.e., r1).
     * @param r2
     *            The y-axis radius for the ellipse (i.e., r2).
     * @param angle
     *            The rotation angle in degrees for the ellipse's x-axis relative to the x-axis of the user coordinate
     *            system.
     * @param largeArcFlag
     *            The value of the large-arc-flag parameter.
     * @param sweepFlag
     *            The value of the large-arc-flag parameter.
     * @return A stand-alone, parentless {@link SVGPathSegArcAbs} object.
     */
    public final native SVGPathSegArcAbs createSVGPathSegArcAbs(float x, float y, float r1, float r2, float angle, boolean largeArcFlag,
            boolean sweepFlag) /*-{
                               return this.createSVGPathSegArcAbs(x, y, r1, r2, angle, largeArcFlag, sweepFlag);
                               }-*/;

    /**
     * Returns a stand-alone, parentless {@link SVGPathSegArcRel} object.
     * 
     * @param x
     *            The relative X coordinate for the end point of this path segment
     * @param y
     *            The relative Y coordinate for the end point of this path segment.
     * @param r1
     *            The x-axis radius for the ellipse (i.e., r1).
     * @param r2
     *            The y-axis radius for the ellipse (i.e., r2).
     * @param angle
     *            The rotation angle in degrees for the ellipse's x-axis relative to the x-axis of the user coordinate
     *            system.
     * @param largeArcFlag
     *            The value of the large-arc-flag parameter.
     * @param sweepFlag
     *            The value of the large-arc-flag parameter.
     * @return A stand-alone, parentless {@link SVGPathSegArcRel} object.
     */
    public final native SVGPathSegArcRel createSVGPathSegArcRel(float x, float y, float r1, float r2, float angle, boolean largeArcFlag,
            boolean sweepFlag) /*-{
                               return this.createSVGPathSegArcRel(x, y, r1, r2, angle, largeArcFlag, sweepFlag);
                               }-*/;

    /**
     * Returns a stand-alone, parentless {@link SVGPathSegLinetoHorizontalAbs} object.
     * 
     * @param x
     *            The absolute X coordinate for the end point of this path segment.
     * @return A stand-alone, parentless {@link SVGPathSegLinetoHorizontalAbs} object.
     */
    public final native SVGPathSegLinetoHorizontalAbs createSVGPathSegLinetoHorizontalAbs(float x) /*-{
                                                                                                   return this.createSVGPathSegLinetoHorizontalAbs(x);
                                                                                                   }-*/;

    /**
     * Returns a stand-alone, parentless {@link SVGPathSegLinetoHorizontalRel} object.
     * 
     * @param x
     *            The absolute X coordinate for the end point of this path segment.
     * @return A stand-alone, parentless {@link SVGPathSegLinetoHorizontalRel} object.
     */
    public final native SVGPathSegLinetoHorizontalRel createSVGPathSegLinetoHorizontalRel(float x) /*-{
                                                                                                   return this.createSVGPathSegLinetoHorizontalRel(x);
                                                                                                   }-*/;

    /**
     * Returns a stand-alone, parentless {@link SVGPathSegLinetoVerticalAbs} object.
     * 
     * @param y
     *            The absolute Y coordinate for the end point of this path segment.
     * @return A stand-alone, parentless {@link SVGPathSegLinetoVerticalAbs} object.
     */
    public final native SVGPathSegLinetoVerticalAbs createSVGPathSegLinetoVerticalAbs(float y) /*-{
                                                                                               return this.createSVGPathSegLinetoVerticalAbs(y);
                                                                                               }-*/;

    /**
     * Returns a stand-alone, parentless {@link SVGPathSegLinetoVerticalRel} object.
     * 
     * @param y
     *            The absolute Y coordinate for the end point of this path segment.
     * @return A stand-alone, parentless {@link SVGPathSegLinetoVerticalRel} object.
     */
    public final native SVGPathSegLinetoVerticalRel createSVGPathSegLinetoVerticalRel(float y) /*-{
                                                                                               return this.createSVGPathSegLinetoVerticalRel(y);
                                                                                               }-*/;

    /**
     * Returns a stand-alone, parentless {@link SVGPathSegCurvetoCubicSmoothAbs} object.
     * 
     * @param x
     *            The absolute X coordinate for the end point of this path segment.
     * @param y
     *            The absolute Y coordinate for the end point of this path segment.
     * @param x2
     *            The absolute X coordinate for the second control point.
     * @param y2
     *            The absolute Y coordinate for the second control point.
     * @return A stand-alone, parentless {@link SVGPathSegCurvetoCubicSmoothAbs} object.
     */
    public final native SVGPathSegCurvetoCubicSmoothAbs createSVGPathSegCurvetoCubicSmoothAbs(float x, float y, float x2, float y2) /*-{
                                                                                                                                    return this.createSVGPathSegCurvetoCubicSmoothAbs(x, y, x2, y2);
                                                                                                                                    }-*/;

    /**
     * Returns a stand-alone, parentless {@link SVGPathSegCurvetoCubicSmoothRel} object.
     * 
     * @param x
     *            The absolute X coordinate for the end point of this path segment.
     * @param y
     *            The absolute Y coordinate for the end point of this path segment.
     * @param x2
     *            The absolute X coordinate for the second control point.
     * @param y2
     *            The absolute Y coordinate for the second control point.
     * @return A stand-alone, parentless {@link SVGPathSegCurvetoCubicSmoothRel} object.
     */
    public final native SVGPathSegCurvetoCubicSmoothRel createSVGPathSegCurvetoCubicSmoothRel(float x, float y, float x2, float y2) /*-{
                                                                                                                                    return this.createSVGPathSegCurvetoCubicSmoothRel(x, y, x2, y2);
                                                                                                                                    }-*/;

    /**
     * Returns a stand-alone, parentless {@link SVGPathSegCurvetoQuadraticSmoothAbs} object.
     * 
     * @param x
     *            The absolute X coordinate for the end point of this path segment.
     * @param y
     *            The absolute Y coordinate for the end point of this path segment.
     * @return A stand-alone, parentless {@link SVGPathSegCurvetoQuadraticSmoothAbs} object.
     */
    public final native SVGPathSegCurvetoQuadraticSmoothAbs createSVGPathSegCurvetoQuadraticSmoothAbs(float x, float y) /*-{
                                                                                                                        return this.createSVGPathSegCurvetoQuadraticSmoothAbs(x, y);
                                                                                                                        }-*/;

    /**
     * Returns a stand-alone, parentless {@link SVGPathSegCurvetoQuadraticSmoothRel} object.
     * 
     * @param x
     *            The absolute X coordinate for the end point of this path segment.
     * @param y
     *            The absolute Y coordinate for the end point of this path segment.
     * @return A stand-alone, parentless {@link SVGPathSegCurvetoQuadraticSmoothRel} object.
     */
    public final native SVGPathSegCurvetoQuadraticSmoothRel createSVGPathSegCurvetoQuadraticSmoothRel(float x, float y) /*-{
                                                                                                                        return this.createSVGPathSegCurvetoQuadraticSmoothRel(x, y);
                                                                                                                        }-*/;

    /**
     * @return Provides access to the base (i.e., static) contents of the "d" attribute in a form which matches
     *         one-for-one with SVG's syntax. Thus, if the "d" attribute has an "absolute moveto (M)" and an
     *         "absolute arcto (A)" command, then pathSegList will have two entries: a SVG_PATHSEG_MOVETO_ABS and a
     *         SVG_PATHSEG_ARC_ABS.
     */
    public final native SVGPathSegList getPathSegList() /*-{
                                                        return this.pathSegList ? @fr.hd3d.html5.svg.client.core.SVGPathSegList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(this.pathSegList) : null;
                                                        }-*/;

    /**
     * @return Provides access to the base (i.e., static) contents of the "d" attribute in a form where all path data
     *         commands are expressed in terms of the following subset of SVGPathSeg types: SVG_PATHSEG_MOVETO_ABS (M),
     *         SVG_PATHSEG_LINETO_ABS (L), SVG_PATHSEG_CURVETO_CUBIC_ABS (C) and SVG_PATHSEG_CLOSEPATH (z). Thus, if the
     *         "d" attribute has an "absolute moveto (M)" and an "absolute arcto (A)" command, then pathSegList will
     *         have one SVG_PATHSEG_MOVETO_ABS entry followed by a series of SVG_PATHSEG_LINETO_ABS entries which
     *         approximate the arc. This alternate representation is available to provide a simpler interface to
     *         developers who would benefit from a more limited set of commands.
     * 
     *         The only valid SVGPathSeg types are SVG_PATHSEG_MOVETO_ABS (M), SVG_PATHSEG_LINETO_ABS (L),
     *         SVG_PATHSEG_CURVETO_CUBIC_ABS (C) and SVG_PATHSEG_CLOSEPATH (z).
     */
    public final native SVGPathSegList getNormalizedPathSegList() /*-{
                                                                  return this.normalizedPathSegList ? @fr.hd3d.html5.svg.client.core.SVGPathSegList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(this.normalizedPathSegList) : null;
                                                                  }-*/;

    /**
     * @return Provides access to the current animated contents of the "d" attribute in a form which matches one-for-one
     *         with SVG's syntax. If the given attribute or property is being animated, contains the current animated
     *         value of the attribute or property, and both the object itself and its contents are read only. If the
     *         given attribute or property is not currently being animated, contains the same value as pathSegList.
     */
    public final native SVGPathSegList getAnimatedPathSegList() /*-{
                                                                return this.animatedPathSegList ? @fr.hd3d.html5.svg.client.core.SVGPathSegList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(this.animatedPathSegList) : null;
                                                                }-*/;

    /**
     * @return Provides access to the current animated contents of the "d" attribute in a form where all path data
     *         commands are expressed in terms of the following subset of SVGPathSeg types: SVG_PATHSEG_MOVETO_ABS (M),
     *         SVG_PATHSEG_LINETO_ABS (L), SVG_PATHSEG_CURVETO_CUBIC_ABS (C) and SVG_PATHSEG_CLOSEPATH (z). If the given
     *         attribute or property is being animated, contains the current animated value of the attribute or
     *         property, and both the object itself and its contents are read only. If the given attribute or property
     *         is not currently being animated, contains the same value as normalizedPathSegList.
     */
    public final native SVGPathSegList getAnimatedNormalizedPathSegList() /*-{
                                                                          return this.animatedNormalizedPathSegList ? @fr.hd3d.html5.svg.client.core.SVGPathSegList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(this.animatedNormalizedPathSegList) : null;
                                                                          }-*/;
}
