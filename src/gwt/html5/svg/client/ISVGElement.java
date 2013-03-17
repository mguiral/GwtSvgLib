package gwt.html5.svg.client;

import gwt.html5.svg.client.core.SVGAnimatedString;
import gwt.html5.svg.client.dom.SVGElement;
import gwt.html5.svg.client.dom.SVGSVGElement;

public interface ISVGElement extends ISVGLangSpace, ISVGExternalResourcesRequired {
    String getXmlBase();

    void setXmlBase(String xmlBase);

    SVGSVGElement getOwnerSVGElement();

    SVGElement getViewportElement();

    SVGAnimatedString getSVGClassName();
}
