package fr.hd3d.html5.svg.client.user.ui;

import fr.hd3d.html5.svg.client.ISVGImageElement;
import fr.hd3d.html5.svg.client.core.SVGAnimatedPreserveAspectRatio;
import fr.hd3d.html5.svg.client.core.SVGAnimatedString;
import fr.hd3d.html5.svg.client.dom.SVGDomHelper;
import fr.hd3d.html5.svg.client.dom.SVGImageElement;
import fr.hd3d.html5.svg.client.user.PreserveAspectRatio;
import fr.hd3d.html5.svg.client.user.events.HasGraphicalHandlers;

public class SVGImageWidget extends SVGGraphicalWidget implements ISVGImageElement, HasGraphicalHandlers {
    SVGImageElement imageElement;

    public SVGImageWidget() {
        imageElement = SVGImageElement.as(SVGDomHelper.createElementNS(SVGImageElement.TAG));
        setElement(imageElement);
    }

    @Override
    public SVGAnimatedPreserveAspectRatio getPreserveAspectRatio() {
        return imageElement.getPreserveAspectRatio();
    }

    @Override
    public void setPreserveAspectRatio(PreserveAspectRatio preserveAspectRatio) {
        imageElement.setPreserveAspectRatio(preserveAspectRatio.getValue());
    }

    @Override
    public SVGAnimatedString getHref() {
        return imageElement.getHref();
    }

    @Override
    public void setHref(BaseSVGWidget href) {
        try {
            String reference = SVGDomHelper.getFuncIRI(href);
            imageElement.getHref().setBaseVal(reference);
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
