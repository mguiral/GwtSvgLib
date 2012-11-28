package fr.hd3d.html5.svg.client.user.ui;

import fr.hd3d.html5.svg.client.ISVGTitleElement;
import fr.hd3d.html5.svg.client.core.SVGAnimatedString;
import fr.hd3d.html5.svg.client.core.SVGStyle;
import fr.hd3d.html5.svg.client.dom.SVGDomHelper;
import fr.hd3d.html5.svg.client.dom.SVGTitleElement;

public class SVGTitleWidget extends BaseSVGWidget implements ISVGTitleElement {
    SVGTitleElement titleElement;

    public SVGTitleWidget() {
        titleElement = SVGTitleElement.as(SVGDomHelper.createElementNS(SVGTitleElement.TAG));
        setElement(titleElement);
    }

    @Override
    public boolean getExternalResourcesRequired() {
        throw new UnsupportedOperationException();
    }

    @Override
    public SVGAnimatedString getSVGClassName() {
        return titleElement.getSVGClassName();
    }

    @Override
    public void setExternalResourcesRequired(boolean externalResourceeRequried) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SVGAnimatedString getClassName() {
        return titleElement.getSVGClassName();
    }

    @Override
    public SVGStyle getStyle() {
        return titleElement.getStyle().cast();
    }
}
