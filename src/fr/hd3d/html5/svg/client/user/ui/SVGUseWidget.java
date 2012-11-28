package fr.hd3d.html5.svg.client.user.ui;

import fr.hd3d.html5.svg.client.ISVGUseElement;
import fr.hd3d.html5.svg.client.core.SVGAnimatedString;
import fr.hd3d.html5.svg.client.core.SVGElementInstance;
import fr.hd3d.html5.svg.client.dom.SVGDomHelper;
import fr.hd3d.html5.svg.client.dom.SVGUseElement;
import fr.hd3d.html5.svg.client.user.events.HasGraphicalHandlers;

public class SVGUseWidget extends SVGGraphicalWidget implements ISVGUseElement, HasGraphicalHandlers {
    SVGUseElement useElement;

    public SVGUseWidget() {
        useElement = SVGUseElement.as(SVGDomHelper.createElementNS(SVGUseElement.TAG));
        setElement(useElement);
    }

    @Override
    public SVGElementInstance getAnimatedInstanceRoot() {
        return useElement.getAnimatedInstanceRoot();
    }

    @Override
    public SVGElementInstance getInstanceRoot() {
        return useElement.getInstanceRoot();
    }

    @Override
    public SVGAnimatedString getHref() {
        return useElement.getHref();
    }

    @Override
    public void setHref(BaseSVGWidget href) {
        try {
            String reference = SVGDomHelper.getFuncIRI(href);
            useElement.getHref().setBaseVal(reference);
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
