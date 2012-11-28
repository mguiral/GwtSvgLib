package fr.hd3d.html5.svg.client.user.ui;

import com.google.gwt.dom.client.Style.Unit;

import fr.hd3d.html5.svg.client.ISVGCircleElement;
import fr.hd3d.html5.svg.client.core.SVGAnimatedLength;
import fr.hd3d.html5.svg.client.dom.SVGCircleElement;
import fr.hd3d.html5.svg.client.dom.SVGDomHelper;

public class SVGCircleWidget extends SVGGraphicalWidget implements ISVGCircleElement {
    private SVGCircleElement circleElement;

    public SVGCircleWidget() {
        circleElement = SVGCircleElement.as(SVGDomHelper.createElementNS(SVGCircleElement.TAG));
        setElement(circleElement);
    }

    public SVGCircleWidget(float cx, float cy, int radius, Unit unit) {
        this();
        setCx(cx, unit);
        setCy(cy, unit);
        setRadius(radius, unit);
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGCircleElement#getCx()
     */
    @Override
    public SVGAnimatedLength getCx() {
        return circleElement.getCx();
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGCircleElement#getCy()
     */
    @Override
    public SVGAnimatedLength getCy() {
        return circleElement.getCy();
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGCircleElement#getRadius()
     */
    @Override
    public SVGAnimatedLength getRadius() {
        return circleElement.getRadius();
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGCircleElement#setCx(int)
     */
    @Override
    public void setCx(float cx, Unit unit) {
        circleElement.getCx().getBaseVal().setValueAsString(cx + unit.getType());
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGCircleElement#setCy(int)
     */
    @Override
    public void setCy(float cy, Unit unit) {
        circleElement.getCy().getBaseVal().setValueAsString(cy + unit.getType());
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGCircleElement#setRadius(int)
     */
    @Override
    public void setRadius(int r, Unit unit) {
        circleElement.getRadius().getBaseVal().setValueAsString(r + unit.getType());
    }
}
