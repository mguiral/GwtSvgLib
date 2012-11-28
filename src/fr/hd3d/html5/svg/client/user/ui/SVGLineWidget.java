package fr.hd3d.html5.svg.client.user.ui;

import com.google.gwt.dom.client.Style.Unit;

import fr.hd3d.html5.svg.client.ISVGLineElement;
import fr.hd3d.html5.svg.client.core.SVGAnimatedLength;
import fr.hd3d.html5.svg.client.dom.SVGDomHelper;
import fr.hd3d.html5.svg.client.dom.SVGLineElement;

public class SVGLineWidget extends SVGGraphicalWidget implements ISVGLineElement {
    private SVGLineElement lineElement;

    public SVGLineWidget(float x1, float y1, float x2, float y2, Unit unit) {
        lineElement = SVGLineElement.as(SVGDomHelper.createElementNS(SVGLineElement.TAG));
        setElement(lineElement);
        setX1(x1, unit);
        setY1(y1, unit);
        setX2(x2, unit);
        setY2(y2, unit);
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGLineElement#getX1()
     */
    @Override
    public SVGAnimatedLength getX1() {
        return lineElement.getX1();
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGLineElement#getX2()
     */
    @Override
    public SVGAnimatedLength getX2() {
        return lineElement.getX2();
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGLineElement#getY1()
     */
    @Override
    public SVGAnimatedLength getY1() {
        return lineElement.getY1();
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGLineElement#getY2()
     */
    @Override
    public SVGAnimatedLength getY2() {
        return lineElement.getY2();
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGLineElement#setX1(int)
     */
    @Override
    public void setX1(float x1, Unit unit) {
        lineElement.getX1().getBaseVal().setValueAsString(x1 + unit.getType());
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGLineElement#setX2(int)
     */
    @Override
    public void setX2(float x2, Unit unit) {
        lineElement.getX2().getBaseVal().setValueAsString(x2 + unit.getType());
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGLineElement#setY1(int)
     */
    @Override
    public void setY1(float y1, Unit unit) {
        lineElement.getY1().getBaseVal().setValueAsString(y1 + unit.getType());
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGLineElement#setY2(int)
     */
    @Override
    public void setY2(float y2, Unit unit) {
        lineElement.getY2().getBaseVal().setValueAsString(y2 + unit.getType());
    }
}
