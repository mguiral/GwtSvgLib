package fr.hd3d.html5.svg.client;

import java.util.List;

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
import fr.hd3d.html5.svg.client.core.SVGPathSegMovetoAbs;
import fr.hd3d.html5.svg.client.core.SVGPathSegMovetoRel;
import fr.hd3d.html5.svg.client.core.SVGPoint;
import fr.hd3d.html5.svg.client.user.PathSegData;

public interface ISVGPathElement extends ISVGGraphicalElement, ISVGAnimatedPathData {
    void setD(List<PathSegData> pathSegs);

    SVGAnimatedNumber getPathLength();

    float getTotalLength();

    SVGPoint getPointAtLength(float distance);

    long getPathSegAtLength(float distance);

    SVGPathSegClosePath createSVGPathSegClosePath();

    SVGPathSegMovetoAbs createSVGPathSegMovetoAbs(float x, float y);

    SVGPathSegMovetoRel createSVGPathSegMovetoRel(float x, float y);

    SVGPathSegLinetoAbs createSVGPathSegLinetoAbs(float x, float y);

    SVGPathSegLinetoRel createSVGPathSegLinetoRel(float x, float y);

    SVGPathSegCurvetoCubicAbs createSVGPathSegCurvetoCubicAbs(float x, float y, float x1, float y1, float x2, float y2);

    SVGPathSegCurvetoCubicRel createSVGPathSegCurvetoCubicRel(float x, float y, float x1, float y1, float x2, float y2);

    SVGPathSegCurvetoQuadraticAbs createSVGPathSegCurvetoQuadraticAbs(float x, float y, float x1, float y1);

    SVGPathSegCurvetoQuadraticRel createSVGPathSegCurvetoQuadraticRel(float x, float y, float x1, float y1);

    SVGPathSegArcAbs createSVGPathSegArcAbs(float x, float y, float r1, float r2, float angle, boolean largeArcFlag, boolean sweepFlag);

    SVGPathSegArcRel createSVGPathSegArcRel(float x, float y, float r1, float r2, float angle, boolean largeArcFlag, boolean sweepFlag);

    SVGPathSegLinetoHorizontalAbs createSVGPathSegLinetoHorizontalAbs(float x);

    SVGPathSegLinetoHorizontalRel createSVGPathSegLinetoHorizontalRel(float x);

    SVGPathSegLinetoVerticalAbs createSVGPathSegLinetoVerticalAbs(float y);

    SVGPathSegLinetoVerticalRel createSVGPathSegLinetoVerticalRel(float y);

    SVGPathSegCurvetoCubicSmoothAbs createSVGPathSegCurvetoCubicSmoothAbs(float x, float y, float x2, float y2);

    SVGPathSegCurvetoCubicSmoothRel createSVGPathSegCurvetoCubicSmoothRel(float x, float y, float x2, float y2);

    SVGPathSegCurvetoQuadraticSmoothAbs createSVGPathSegCurvetoQuadraticSmoothAbs(float x, float y);

    SVGPathSegCurvetoQuadraticSmoothRel createSVGPathSegCurvetoQuadraticSmoothRel(float x, float y);
}
