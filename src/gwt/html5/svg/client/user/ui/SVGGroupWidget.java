package gwt.html5.svg.client.user.ui;

import gwt.html5.svg.client.ISVGGroupElement;
import gwt.html5.svg.client.dom.SVGDomHelper;
import gwt.html5.svg.client.dom.SVGGroupElement;
import gwt.html5.svg.client.user.events.HasGraphicalHandlers;

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
