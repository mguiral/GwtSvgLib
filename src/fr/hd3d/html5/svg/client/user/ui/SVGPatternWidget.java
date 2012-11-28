package fr.hd3d.html5.svg.client.user.ui;

import java.util.List;

import com.google.gwt.dom.client.Style.Unit;

import fr.hd3d.html5.svg.client.ISVGPatternElement;
import fr.hd3d.html5.svg.client.core.SVGAnimatedEnumeration;
import fr.hd3d.html5.svg.client.core.SVGAnimatedLength;
import fr.hd3d.html5.svg.client.core.SVGAnimatedPreserveAspectRatio;
import fr.hd3d.html5.svg.client.core.SVGAnimatedRect;
import fr.hd3d.html5.svg.client.core.SVGAnimatedString;
import fr.hd3d.html5.svg.client.core.SVGAnimatedTransformList;
import fr.hd3d.html5.svg.client.dom.SVGDomHelper;
import fr.hd3d.html5.svg.client.dom.SVGPatternElement;
import fr.hd3d.html5.svg.client.dom.constants.SVGUnitTypes;
import fr.hd3d.html5.svg.client.user.PreserveAspectRatio;
import fr.hd3d.html5.svg.client.user.Rectangle;
import fr.hd3d.html5.svg.client.user.Transform;

public class SVGPatternWidget extends ConditionnalProcessinsSVGWidget implements ISVGPatternElement {
    private SVGPatternElement patternElement;

    public SVGPatternWidget() {
        patternElement = SVGPatternElement.as(SVGDomHelper.createElementNS(SVGPatternElement.TAG));
        setElement(patternElement);
    }

    public SVGPatternWidget(Rectangle rectangle, Unit unit) {
        this(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeigth(), unit);
    }

    public SVGPatternWidget(float x, float y, int width, int height, Unit unit) {
        this();
        setX(x, unit);
        setY(y, unit);
        setWidth(width, unit);
        setHeight(height, unit);
    }

    @Override
    public SVGAnimatedLength getHeight() {
        return patternElement.getHeight();
    }

    @Override
    public SVGAnimatedEnumeration getPatternUnits() {
        return patternElement.getPatternUnits();
    }

    @Override
    public SVGAnimatedEnumeration getPatternContentUnits() {
        return patternElement.getPatternContentUnits();
    }

    @Override
    public SVGAnimatedTransformList getPatternTransform() {
        return patternElement.getPatternTransform();
    }

    @Override
    public SVGAnimatedLength getWidth() {
        return patternElement.getWidth();
    }

    @Override
    public SVGAnimatedLength getX() {
        return patternElement.getX();
    }

    @Override
    public SVGAnimatedLength getY() {
        return patternElement.getY();
    }

    @Override
    public void setHeight(float height, Unit unit) {
        patternElement.getHeight().getBaseVal().setValueAsString(height + unit.getType());
    }

    @Override
    public void setPatternContentUnits(SVGUnitTypes unitTypes) {
        patternElement.getPatternContentUnits().setBaseVal((short) unitTypes.ordinal());
    }

    @Override
    public void setPatternUnits(SVGUnitTypes unitTypes) {
        patternElement.getPatternUnits().setBaseVal((short) unitTypes.ordinal());
    }

    @Override
    public void setTransform(Transform transform) {
        patternElement.setAttributeNS("transform", transform.getTransform());
    }

    @Override
    public void setTransform(List<Transform> transformList) {
        String transformString = "";
        for (Transform transform : transformList) {
            transformString += transform.getTransform() + " ";
        }
        patternElement.setAttributeNS("transform", transformString);
    }

    @Override
    public void setWidth(float width, Unit unit) {
        patternElement.getWidth().getBaseVal().setValueAsString(width + unit.getType());
    }

    @Override
    public void setX(float x, Unit unit) {
        patternElement.getX().getBaseVal().setValueAsString(x + unit.getType());
    }

    @Override
    public void setY(float y, Unit unit) {
        patternElement.getY().getBaseVal().setValueAsString(y + unit.getType());
    }

    @Override
    public SVGAnimatedString getHref() {
        return patternElement.getHref();
    }

    @Override
    public void setHref(BaseSVGWidget href) {
        String funcIRI = SVGDomHelper.getFuncIRI(href);
        patternElement.getHref().setBaseVal(funcIRI);
    }

    @Override
    public SVGAnimatedPreserveAspectRatio getPreserveAspectRatio() {
        return patternElement.getPreserveAspectRatio();
    }

    @Override
    public SVGAnimatedRect getViewBox() {
        return patternElement.getViewBox();
    }

    @Override
    public void setPreserverAspectRatio(PreserveAspectRatio aspectRatio) {
        patternElement.setAttributeNS("preserveAspectRatio", aspectRatio.getValue());
    }

    @Override
    public void setViewBox(Rectangle viewBox) {
        patternElement.setAttributeNS("viewBox", viewBox.toString());
    }
}
