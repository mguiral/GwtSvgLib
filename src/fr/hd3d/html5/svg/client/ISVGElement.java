package fr.hd3d.html5.svg.client;

import fr.hd3d.html5.svg.client.core.SVGAnimatedString;
import fr.hd3d.html5.svg.client.dom.SVGElement;
import fr.hd3d.html5.svg.client.dom.SVGSVGElement;

public interface ISVGElement extends ISVGLangSpace, ISVGExternalResourcesRequired {
    String getXmlBase();

    void setXmlBase(String xmlBase);

    SVGSVGElement getOwnerSVGElement();

    SVGElement getViewportElement();

    SVGAnimatedString getSVGClassName();
}
