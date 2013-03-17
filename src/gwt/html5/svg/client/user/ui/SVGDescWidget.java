package gwt.html5.svg.client.user.ui;

import gwt.html5.svg.client.ISVGDescElement;
import gwt.html5.svg.client.core.SVGAnimatedString;
import gwt.html5.svg.client.core.SVGStyle;
import gwt.html5.svg.client.dom.SVGDescElement;
import gwt.html5.svg.client.dom.SVGDomHelper;

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
