package fr.hd3d.html5.svg.client.user.ui;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.Element;

import fr.hd3d.html5.svg.client.ISVGTextPositioningElement;
import fr.hd3d.html5.svg.client.core.SVGAnimatedLengthList;
import fr.hd3d.html5.svg.client.core.SVGAnimatedNumberList;
import fr.hd3d.html5.svg.client.core.SVGLength;
import fr.hd3d.html5.svg.client.dom.SVGTextPositioningElement;

public abstract class SVGTextPositioningWidget extends SVGTextContentWidget implements ISVGTextPositioningElement {
    private SVGTextPositioningElement positioningElement;

    @Override
    protected void setElement(Element elem) {
        super.setElement(elem);
        this.positioningElement = elem.cast();
    }

    @Override
    public float[] getDx() {
        SVGAnimatedLengthList lengthList = positioningElement.getDx();
        float[] dx = new float[lengthList.getBaseVal().getNumberOfItems()];
        int index = 0;
        for (SVGLength length : lengthList.getBaseVal()) {
            dx[index] = length.getValue();
        }
        return dx;
    }

    @Override
    public float[] getDy() {
        SVGAnimatedLengthList lengthList = positioningElement.getDy();
        float[] dy = new float[lengthList.getBaseVal().getNumberOfItems()];
        int index = 0;
        for (SVGLength length : lengthList.getBaseVal()) {
            dy[index] = length.getValue();
        }
        return dy;
    }

    @Override
    public SVGAnimatedNumberList getRotate() {
        return positioningElement.getRotate();
    }

    @Override
    public float[] getX() {
        SVGAnimatedLengthList lengthList = positioningElement.getX();
        float[] x = new float[lengthList.getBaseVal().getNumberOfItems()];
        int index = 0;
        for (SVGLength length : lengthList.getBaseVal()) {
            x[index] = length.getValue();
        }
        return x;
    }

    @Override
    public float[] getY() {
        SVGAnimatedLengthList lengthList = positioningElement.getY();
        float[] y = new float[lengthList.getBaseVal().getNumberOfItems()];
        int index = 0;
        for (SVGLength length : lengthList.getBaseVal()) {
            y[index] = length.getValue();
        }
        return y;
    }

    @Override
    public void setDx(float dx, Unit unit) {
        positioningElement.setAttributeNS("dx", dx + unit.getType());
    }

    @Override
    public void setDx(float[] dxs, Unit unit) {
        String dxsString = "";
        for (float dx : dxs) {
            dxsString += dx + unit.getType() + " ";
        }
        positioningElement.setAttributeNS("dx", dxsString);
    }

    @Override
    public void setDy(float dy, Unit unit) {
        positioningElement.setAttributeNS("dy", dy + unit.getType());
    }

    @Override
    public void setDy(float[] dys, Unit unit) {
        String dysString = "";
        for (float dy : dys) {
            dysString += dy + unit.getType() + " ";
        }
        positioningElement.setAttributeNS("dy", dysString);
    }

    @Override
    public void setRotate(float rotate) {
        positioningElement.setAttributeNS("rotate", "" + rotate);
    }

    @Override
    public void setRotate(float[] rotates) {
        String rotateString = "";
        for (float rotate : rotates) {
            rotateString += rotate + " ";
        }
        positioningElement.setAttributeNS("rotate", rotateString);
    }

    @Override
    public void setX(float x, Unit unit) {
        positioningElement.setAttributeNS("x", x + unit.getType());
    }

    @Override
    public void setX(float[] xs, Unit unit) {
        String xString = "";
        for (float x : xs) {
            xString += x + unit.getType() + " ";
        }
        positioningElement.setAttributeNS("x", xString);
    }

    @Override
    public void setY(float y, Unit unit) {
        positioningElement.setAttributeNS("y", y + unit.getType());
    }

    @Override
    public void setY(float[] ys, Unit unit) {
        String yString = "";
        for (float y : ys) {
            yString += y + unit.getType() + " ";
        }
        positioningElement.setAttributeNS("y", yString);
    }
}
