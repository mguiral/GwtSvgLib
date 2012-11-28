package fr.hd3d.html5.svg.client.user.ui;

import fr.hd3d.html5.svg.client.ISVGDefsElement;
import fr.hd3d.html5.svg.client.dom.SVGDefsElement;
import fr.hd3d.html5.svg.client.dom.SVGDomHelper;
import fr.hd3d.html5.svg.client.user.events.HasGraphicalHandlers;

/**
 * 
 * @author michael.guiral
 * 
 */
public class SVGDefsWidget extends SVGGraphicalWidget implements ISVGDefsElement, HasGraphicalHandlers {
    SVGDefsElement defsElement;

    public SVGDefsWidget() {
        defsElement = SVGDefsElement.as(SVGDomHelper.createElementNS(SVGDefsElement.TAG));
        setElement(defsElement);
    }
}
