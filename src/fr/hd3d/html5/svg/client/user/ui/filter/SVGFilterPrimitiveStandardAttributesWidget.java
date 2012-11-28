package fr.hd3d.html5.svg.client.user.ui.filter;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.Element;

import fr.hd3d.html5.svg.client.core.SVGAnimatedLength;
import fr.hd3d.html5.svg.client.core.SVGAnimatedString;
import fr.hd3d.html5.svg.client.core.SVGStyle;
import fr.hd3d.html5.svg.client.dom.filter.SVGFilterPrimitiveStandardAttributesElement;
import fr.hd3d.html5.svg.client.filter.ISVGFilterPrimitiveStandardAttributeElement;
import fr.hd3d.html5.svg.client.user.ui.BaseSVGWidget;

public abstract class SVGFilterPrimitiveStandardAttributesWidget extends BaseSVGWidget implements ISVGFilterPrimitiveStandardAttributeElement {
    private SVGFilterPrimitiveStandardAttributesElement attributesElement;

    @Override
    public SVGAnimatedString getClassName() {
        return attributesElement.getSVGClassName();
    }

    @Override
    public SVGAnimatedLength getHeight() {
        return attributesElement.getHeight();
    }

    @Override
    public SVGAnimatedString getResult() {
        return this.attributesElement.getResult();
    }

    @Override
    public SVGStyle getStyle() {
        return attributesElement.getStyle().cast();
    }

    @Override
    public SVGAnimatedLength getWidth() {
        return attributesElement.getWidth();
    }

    @Override
    public SVGAnimatedLength getX() {
        return attributesElement.getX();
    }

    @Override
    public SVGAnimatedLength getY() {
        return attributesElement.getY();
    }

    @Override
    protected void setElement(Element elem) {
        super.setElement(elem);
        this.attributesElement = elem.cast();
    }

    @Override
    public void setHeight(float height, Unit unit) {
        try {
            this.attributesElement.getHeight().getBaseVal().setValueAsString(height + unit.getType());
        } catch (Exception e) {
            this.attributesElement.setAttributeNS("height", height + unit.getType());
        }
    }

    @Override
    public void setResult(String result) {
        try {
            this.attributesElement.getResult().setBaseVal(result);
        } catch (Exception e) {
            this.attributesElement.setAttributeNS("result", result);
        }
    }

    @Override
    public void setWidth(float width, Unit unit) {
        try {
            this.attributesElement.getWidth().getBaseVal().setValueAsString(width + unit.getType());
        } catch (Exception e) {
            this.attributesElement.setAttributeNS("width", width + unit.getType());
        }
    }

    @Override
    public void setX(float x, Unit unit) {
        try {
            this.attributesElement.getX().getBaseVal().setValueAsString(x + unit.getType());
        } catch (Exception e) {
            this.attributesElement.setAttributeNS("x", x + unit.getType());
        }
    }

    @Override
    public void setY(float y, Unit unit) {
        try {
            this.attributesElement.getY().getBaseVal().setValueAsString(y + unit.getType());
        } catch (Exception e) {
            this.attributesElement.setAttributeNS("y", y + unit.getType());
        }
    }
}
