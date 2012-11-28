package fr.hd3d.html5.svg.client.user.ui;

import com.google.gwt.dom.client.Style.Unit;

import fr.hd3d.html5.svg.client.ISVGRectElement;
import fr.hd3d.html5.svg.client.core.SVGAnimatedLength;
import fr.hd3d.html5.svg.client.dom.SVGDomHelper;
import fr.hd3d.html5.svg.client.dom.SVGRectElement;
import fr.hd3d.html5.svg.client.user.Rectangle;

public class SVGRectWidget extends SVGGraphicalWidget implements ISVGRectElement {
    SVGRectElement rectElement;

    public SVGRectWidget() {
        rectElement = SVGRectElement.as(SVGDomHelper.createElementNS(SVGRectElement.TAG));
        setElement(rectElement);
    }

    public SVGRectWidget(float x, float y, int width, int height, Unit unit) {
        this();
        setX(x, unit);
        setY(y, unit);
        setWidth(width, unit);
        setHeight(height, unit);
    }

    public SVGRectWidget(Rectangle rectangle, Unit unit) {
        this(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeigth(), unit);
    }

    @Override
    public SVGAnimatedLength getHeight() {
        return shapeElement.getHeight();
    }

    @Override
    public SVGAnimatedLength getWidth() {
        return shapeElement.getWidth();
    }

    @Override
    public SVGAnimatedLength getX() {
        return shapeElement.getX();
    }

    @Override
    public SVGAnimatedLength getY() {
        return shapeElement.getY();
    }

    @Override
    public void setHeight(int height, Unit unit) {
        shapeElement.getHeight().getBaseVal().setValue(height);
    }

    @Override
    public void setWidth(int width, Unit unit) {
        shapeElement.getWidth().getBaseVal().setValue(width);
    }

    @Override
    public void setX(float x, Unit unit) {
        shapeElement.getX().getBaseVal().setValueAsString(x + unit.getType());
    }

    @Override
    public void setY(float y, Unit unit) {
        shapeElement.getY().getBaseVal().setValueAsString(y + unit.getType());
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGRectElement#getRx()
     */
    @Override
    public SVGAnimatedLength getRx() {
        return rectElement.getRx();
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGRectElement#getRy()
     */
    @Override
    public SVGAnimatedLength getRy() {
        return rectElement.getRy();
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGRectElement#setRx(int)
     */
    @Override
    public void setRx(int rx, Unit unit) {
        rectElement.getRx().getBaseVal().setValueAsString(rx + unit.getType());
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGRectElement#setRy(int)
     */
    @Override
    public void setRy(int ry, Unit unit) {
        rectElement.getRy().getBaseVal().setValueAsString(ry + unit.getType());
    }
}
