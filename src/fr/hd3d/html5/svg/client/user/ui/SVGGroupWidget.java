package fr.hd3d.html5.svg.client.user.ui;

import fr.hd3d.html5.svg.client.ISVGGroupElement;
import fr.hd3d.html5.svg.client.dom.SVGDomHelper;
import fr.hd3d.html5.svg.client.dom.SVGGroupElement;
import fr.hd3d.html5.svg.client.user.events.HasGraphicalHandlers;

/**
 * Represent a container element for grouping together related graphics elements.
 * 
 * @author michael.guiral
 * 
 */
public class SVGGroupWidget extends SVGGraphicalWidget implements ISVGGroupElement, HasGraphicalHandlers {
    SVGGroupElement groupElement;

    public SVGGroupWidget() {
        groupElement = SVGGroupElement.as(SVGDomHelper.createElementNS(SVGGroupElement.TAG));
        setElement(groupElement);
    }
}
