package fr.hd3d.html5.svg.client.user.ui;

import java.util.List;

import fr.hd3d.html5.svg.client.ISVGPathElement;
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
import fr.hd3d.html5.svg.client.dom.SVGDomHelper;
import fr.hd3d.html5.svg.client.dom.SVGPathElement;
import fr.hd3d.html5.svg.client.user.PathSegData;

public class SVGPathWidget extends SVGGraphicalWidget implements ISVGPathElement {
    private SVGPathElement pathElement;

    public SVGPathWidget() {
        pathElement = SVGPathElement.as(SVGDomHelper.createElementNS(SVGPathElement.TAG));
        setElement(pathElement);
    }

    @Override
    public SVGPathSegArcAbs createSVGPathSegArcAbs(float x, float y, float r1, float r2, float angle, boolean largeArcFlag, boolean sweepFlag) {
        return pathElement.createSVGPathSegArcAbs(x, y, r1, r2, angle, largeArcFlag, sweepFlag);
    }

    @Override
    public SVGPathSegArcRel createSVGPathSegArcRel(float x, float y, float r1, float r2, float angle, boolean largeArcFlag, boolean sweepFlag) {
        return pathElement.createSVGPathSegArcRel(x, y, r1, r2, angle, largeArcFlag, sweepFlag);
    }

    @Override
    public SVGPathSegClosePath createSVGPathSegClosePath() {
        return pathElement.createSVGPathSegClosePath();
    }

    @Override
    public SVGPathSegCurvetoCubicAbs createSVGPathSegCurvetoCubicAbs(float x, float y, float x1, float y1, float x2, float y2) {
        return pathElement.createSVGPathSegCurvetoCubicAbs(x, y, x1, y1, x2, y2);
    }

    @Override
    public SVGPathSegCurvetoCubicRel createSVGPathSegCurvetoCubicRel(float x, float y, float x1, float y1, float x2, float y2) {
        return pathElement.createSVGPathSegCurvetoCubicRel(x, y, x1, y1, x2, y2);
    }

    @Override
    public SVGPathSegCurvetoCubicSmoothAbs createSVGPathSegCurvetoCubicSmoothAbs(float x, float y, float x2, float y2) {
        return pathElement.createSVGPathSegCurvetoCubicSmoothAbs(x, y, x2, y2);
    }

    @Override
    public SVGPathSegCurvetoCubicSmoothRel createSVGPathSegCurvetoCubicSmoothRel(float x, float y, float x2, float y2) {
        return pathElement.createSVGPathSegCurvetoCubicSmoothRel(x, y, x2, y2);
    }

    @Override
    public SVGPathSegCurvetoQuadraticAbs createSVGPathSegCurvetoQuadraticAbs(float x, float y, float x1, float y1) {
        return pathElement.createSVGPathSegCurvetoQuadraticAbs(x, y, x1, y1);
    }

    @Override
    public SVGPathSegCurvetoQuadraticRel createSVGPathSegCurvetoQuadraticRel(float x, float y, float x1, float y1) {
        return pathElement.createSVGPathSegCurvetoQuadraticRel(x, y, x1, y1);
    }

    @Override
    public SVGPathSegCurvetoQuadraticSmoothAbs createSVGPathSegCurvetoQuadraticSmoothAbs(float x, float y) {
        return pathElement.createSVGPathSegCurvetoQuadraticSmoothAbs(x, y);
    }

    @Override
    public SVGPathSegCurvetoQuadraticSmoothRel createSVGPathSegCurvetoQuadraticSmoothRel(float x, float y) {
        return pathElement.createSVGPathSegCurvetoQuadraticSmoothRel(x, y);
    }

    @Override
    public SVGPathSegLinetoAbs createSVGPathSegLinetoAbs(float x, float y) {
        return pathElement.createSVGPathSegLinetoAbs(x, y);
    }

    @Override
    public SVGPathSegLinetoHorizontalAbs createSVGPathSegLinetoHorizontalAbs(float x) {
        return pathElement.createSVGPathSegLinetoHorizontalAbs(x);
    }

    @Override
    public SVGPathSegLinetoHorizontalRel createSVGPathSegLinetoHorizontalRel(float x) {
        return pathElement.createSVGPathSegLinetoHorizontalRel(x);
    }

    @Override
    public SVGPathSegLinetoRel createSVGPathSegLinetoRel(float x, float y) {
        return pathElement.createSVGPathSegLinetoRel(x, y);
    }

    @Override
    public SVGPathSegLinetoVerticalAbs createSVGPathSegLinetoVerticalAbs(float y) {
        return pathElement.createSVGPathSegLinetoVerticalAbs(y);
    }

    @Override
    public SVGPathSegLinetoVerticalRel createSVGPathSegLinetoVerticalRel(float y) {
        return pathElement.createSVGPathSegLinetoVerticalRel(y);
    }

    @Override
    public SVGPathSegMovetoAbs createSVGPathSegMovetoAbs(float x, float y) {
        return pathElement.createSVGPathSegMovetoAbs(x, y);
    }

    @Override
    public SVGPathSegMovetoRel createSVGPathSegMovetoRel(float x, float y) {
        return pathElement.createSVGPathSegMovetoRel(x, y);
    }

    @Override
    public SVGAnimatedNumber getPathLength() {
        return pathElement.getPathLength();
    }

    @Override
    public long getPathSegAtLength(float distance) {
        return pathElement.getPathSegAtLength(distance);
    }

    @Override
    public SVGPoint getPointAtLength(float distance) {
        return pathElement.getPointAtLength(distance);
    }

    @Override
    public float getTotalLength() {
        return pathElement.getTotalLength();
    }

    @Override
    public boolean getExternalResourcesRequired() {
        return pathElement.getExternalResourcesRequired().getBaseVal();
    }

    @Override
    public void setD(List<PathSegData> pathSegs) {
        String pathD = "";
        for (PathSegData pathSeg : pathSegs) {
            pathD += pathSeg.getPathDataWithPrefix() + " ";
        }
        pathElement.setAttributeNS("d", pathD);
    }

    @Override
    public SVGPathSegList getAnimatedNormalizedPathSegList() {
        return pathElement.getAnimatedNormalizedPathSegList();
    }

    @Override
    public SVGPathSegList getAnimatedPathSegList() {
        return pathElement.getAnimatedPathSegList();
    }

    @Override
    public SVGPathSegList getNormalizedPathSegList() {
        return pathElement.getNormalizedPathSegList();
    }

    @Override
    public SVGPathSegList getPathSegList() {
        return pathElement.getPathSegList();
    }
}
