package gwt.html5.svg.client.user.ui;

import com.google.gwt.dom.client.Style.Unit;

import gwt.html5.svg.client.ISVGLinearGradientElement;
import gwt.html5.svg.client.core.SVGAnimatedLength;
import gwt.html5.svg.client.dom.SVGDomHelper;
import gwt.html5.svg.client.dom.SVGLinearGradientElement;

public class SVGLinearGradientWidget extends SVGGradientWidget implements ISVGLinearGradientElement {
    private SVGLinearGradientElement linearGradientElement;

    public SVGLinearGradientWidget() {
        linearGradientElement = SVGLinearGradientElement.as(SVGDomHelper.createElementNS(SVGLinearGradientElement.TAG));
        setElement(linearGradientElement);
    }

    public SVGLinearGradientWidget(float x1, float y1, float x2, float y2, Unit unit) {
        this();
        setX1(x1, unit);
        setY1(y1, unit);
        setX2(x2, unit);
        setY2(y2, unit);
    }

    @Override
    public SVGAnimatedLength getX1() {
        return linearGradientElement.getX1();
    }

    @Override
    public SVGAnimatedLength getX2() {
        return linearGradientElement.getX2();
    }

    @Override
    public SVGAnimatedLength getY1() {
        return linearGradientElement.getY1();
    }

    @Override
    public SVGAnimatedLength getY2() {
        return linearGradientElement.getY2();
    }

    @Override
    public void setX1(float x1, Unit unit) {
        linearGradientElement.getX1().getBaseVal().setValueAsString(x1 + unit.getType());
    }

    @Override
    public void setX2(float x2, Unit unit) {
        linearGradientElement.getX2().getBaseVal().setValueAsString(x2 + unit.getType());
    }

    @Override
    public void setY1(float y1, Unit unit) {
        linearGradientElement.getY1().getBaseVal().setValueAsString(y1 + unit.getType());
    }

    @Override
    public void setY2(float y2, Unit unit) {
        linearGradientElement.getY2().getBaseVal().setValueAsString(y2 + unit.getType());
    }
}
