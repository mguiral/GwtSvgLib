package fr.hd3d.html5.svg.client.user.ui.filter;

import com.google.gwt.dom.client.Style.Unit;

import fr.hd3d.html5.svg.client.core.SVGAnimatedEnumeration;
import fr.hd3d.html5.svg.client.core.SVGAnimatedInteger;
import fr.hd3d.html5.svg.client.core.SVGAnimatedLength;
import fr.hd3d.html5.svg.client.core.SVGAnimatedString;
import fr.hd3d.html5.svg.client.dom.SVGDomHelper;
import fr.hd3d.html5.svg.client.dom.constants.SVGUnitTypes;
import fr.hd3d.html5.svg.client.dom.filter.SVGFilterElement;
import fr.hd3d.html5.svg.client.filter.ISVGFilterElement;
import fr.hd3d.html5.svg.client.user.ui.BaseSVGWidget;

public class SVGFilterWidget extends BaseSVGWidget implements ISVGFilterElement {
    private SVGFilterElement filterElement;

    public SVGFilterWidget() {
        filterElement = SVGFilterElement.as(SVGDomHelper.createElementNS(SVGFilterElement.TAG));
        setElement(filterElement);
    }

    @Override
    public SVGAnimatedInteger getFilterResX() {
        return filterElement.getFilterResX();
    }

    @Override
    public SVGAnimatedInteger getFilterResY() {
        return filterElement.getFilterResY();
    }

    @Override
    public SVGAnimatedEnumeration getFilterUnits() {
        return filterElement.getFilterUnits();
    }

    @Override
    public SVGAnimatedLength getHeight() {
        return filterElement.getHeight();
    }

    @Override
    public SVGAnimatedEnumeration getPrimitiveUnits() {
        return filterElement.getPrimitiveUnits();
    }

    @Override
    public SVGAnimatedLength getWidth() {
        return filterElement.getWidth();
    }

    @Override
    public SVGAnimatedLength getX() {
        return filterElement.getX();
    }

    @Override
    public SVGAnimatedLength getY() {
        return filterElement.getY();
    }

    @Override
    public void setFilterRes(int filterResX, int filterResY) {
        filterElement.setFilterRes(filterResX, filterResY);
    }

    @Override
    public void setFilterUnits(SVGUnitTypes unitTypes) {
        filterElement.getFilterUnits().setBaseVal((short) unitTypes.ordinal());
    }

    @Override
    public void setHeight(float height, Unit unit) {
        filterElement.getHeight().getBaseVal().setValueAsString(height + unit.getType());
    }

    @Override
    public void setPrimitiveUnits(SVGUnitTypes unitTypes) {
        filterElement.getPrimitiveUnits().setBaseVal((short) unitTypes.ordinal());
    }

    @Override
    public void setWidth(int width, Unit unit) {
        filterElement.getWidth().getBaseVal().setValueAsString(width + unit.getType());
    }

    @Override
    public void setX(float x, Unit unit) {
        filterElement.getX().getBaseVal().setValueAsString(x + unit.getType());
    }

    @Override
    public void setY(float y, Unit unit) {
        filterElement.getY().getBaseVal().setValueAsString(y + unit.getType());
    }

    @Override
    public SVGAnimatedString getHref() {
        return filterElement.getHref();
    }

    @Override
    public void setHref(BaseSVGWidget href) {
        String funcIRI = SVGDomHelper.getFuncIRI(href);
        filterElement.getHref().setBaseVal(funcIRI);
    }
}
