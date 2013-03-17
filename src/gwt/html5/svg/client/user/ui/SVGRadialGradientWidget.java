package gwt.html5.svg.client.user.ui;

import com.google.gwt.dom.client.Style.Unit;

import gwt.html5.svg.client.ISVGRadialGradient;
import gwt.html5.svg.client.core.SVGAnimatedLength;
import gwt.html5.svg.client.dom.SVGDomHelper;
import gwt.html5.svg.client.dom.SVGRadialGradientElement;

public class SVGRadialGradientWidget extends SVGGradientWidget implements ISVGRadialGradient {
    private SVGRadialGradientElement radialGradientElement;

    public SVGRadialGradientWidget(float cx, float cy, float r, float fx, float fy, Unit unit) {
        radialGradientElement = SVGRadialGradientElement.as(SVGDomHelper.createElementNS(SVGRadialGradientElement.TAG));
        setElement(radialGradientElement);
        setCx(cx, unit);
        setCy(cy, unit);
        setR(r, unit);
        setFx(fx, unit);
        setFy(fy, unit);
    }

    @Override
    public SVGAnimatedLength getCx() {
        return radialGradientElement.getCx();
    }

    @Override
    public SVGAnimatedLength getCy() {
        return radialGradientElement.getCy();
    }

    @Override
    public SVGAnimatedLength getFx() {
        return radialGradientElement.getFx();
    }

    @Override
    public SVGAnimatedLength getFy() {
        return radialGradientElement.getFy();
    }

    @Override
    public SVGAnimatedLength getR() {
        return radialGradientElement.getR();
    }

    @Override
    public void setCx(float cx, Unit unit) {
        radialGradientElement.getCx().getBaseVal().setValueAsString(cx + unit.getType());
    }

    @Override
    public void setCy(float cy, Unit unit) {
        radialGradientElement.getCy().getBaseVal().setValueAsString(cy + unit.getType());
    }

    @Override
    public void setFx(float fx, Unit unit) {
        radialGradientElement.getFx().getBaseVal().setValueAsString(fx + unit.getType());
    }

    @Override
    public void setFy(float fy, Unit unit) {
        radialGradientElement.getFy().getBaseVal().setValueAsString(fy + unit.getType());
    }

    @Override
    public void setR(float r, Unit unit) {
        radialGradientElement.getR().getBaseVal().setValueAsString(r + unit.getType());
    }
}
