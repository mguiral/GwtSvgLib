package fr.hd3d.html5.svg.client.user.ui;

import fr.hd3d.html5.svg.client.ISVGSTopElement;
import fr.hd3d.html5.svg.client.core.SVGAnimatedNumber;
import fr.hd3d.html5.svg.client.dom.SVGDomHelper;
import fr.hd3d.html5.svg.client.dom.SVGStopElement;

public class SVGStopWidget extends BaseSVGWidget implements ISVGSTopElement {
    private SVGStopElement stopElement;

    public SVGStopWidget() {
        stopElement = SVGStopElement.as(SVGDomHelper.createElementNS(SVGStopElement.TAG));
        setElement(stopElement);
    }

    @Override
    public SVGAnimatedNumber getOffset() {
        return null;
    }

    @Override
    public void setOffset(int offset) {
        if (offset >= 0 && offset <= 100) {
            stopElement.getOffset().setBaseVal((float) offset / 100);
        } else {
            throw new UnsupportedOperationException("the offset value must be between 0 and 100");
        }
    }

    @Override
    public void setOffset(int offset, String color) {
        setOffset(offset);
        if (color != null) {
            getPresentationStyle().setStopColor(color);
        }
    }
}
