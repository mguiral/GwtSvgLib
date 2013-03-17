package gwt.html5.svg.client.user.ui;

import gwt.html5.svg.client.ISVGTRefElement;
import gwt.html5.svg.client.core.SVGAnimatedString;
import gwt.html5.svg.client.dom.SVGDomHelper;
import gwt.html5.svg.client.dom.SVGTRefElement;

public class SVGTRefWidget extends SVGTextPositioningWidget implements ISVGTRefElement {
    private SVGTRefElement refElement;

    public SVGTRefWidget() {
        refElement = SVGTRefElement.as(SVGDomHelper.createElementNS(SVGTRefElement.TAG));
        setElement(refElement);
    }

    @Override
    public SVGAnimatedString getHref() {
        return refElement.getHref();
    }

    @Override
    public void setHref(BaseSVGWidget href) {
        try {
            String reference = SVGDomHelper.getFuncIRI(href);
            refElement.getHref().setBaseVal(reference);
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
