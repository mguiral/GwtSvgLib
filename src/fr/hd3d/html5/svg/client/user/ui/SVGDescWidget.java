package fr.hd3d.html5.svg.client.user.ui;

import fr.hd3d.html5.svg.client.ISVGDescElement;
import fr.hd3d.html5.svg.client.core.SVGAnimatedString;
import fr.hd3d.html5.svg.client.core.SVGStyle;
import fr.hd3d.html5.svg.client.dom.SVGDescElement;
import fr.hd3d.html5.svg.client.dom.SVGDomHelper;

public class SVGDescWidget extends BaseSVGWidget implements ISVGDescElement {
    SVGDescElement descElement;

    public SVGDescWidget() {
        descElement = SVGDescElement.as(SVGDomHelper.createElementNS(SVGDescElement.TAG));
        setElement(descElement);
    }

    @Override
    public SVGAnimatedString getClassName() {
        return descElement.getSVGClassName();
    }

    @Override
    public SVGStyle getStyle() {
        return descElement.getStyle().cast();
    }

    @Override
    public boolean getExternalResourcesRequired() {
        throw new UnsupportedOperationException();
    }

    @Override
    public SVGAnimatedString getSVGClassName() {
        return descElement.getSVGClassName();
    }

    @Override
    public void setExternalResourcesRequired(boolean externalResourceeRequried) {
        throw new UnsupportedOperationException();
    }
}
