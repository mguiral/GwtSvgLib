package fr.hd3d.html5.svg.client.user.ui.filter;

import fr.hd3d.html5.svg.client.core.SVGAnimatedString;
import fr.hd3d.html5.svg.client.dom.SVGDomHelper;
import fr.hd3d.html5.svg.client.dom.constants.BlendMode;
import fr.hd3d.html5.svg.client.dom.constants.FilterInput;
import fr.hd3d.html5.svg.client.dom.filter.SVGFEBlendElement;
import fr.hd3d.html5.svg.client.filter.ISVGFEBlendElement;

public class SVGFEBlendWidget extends SVGFilterPrimitiveStandardAttributesWidget implements ISVGFEBlendElement {
    private SVGFEBlendElement blendElement;

    public SVGFEBlendWidget() {
        this.blendElement = SVGFEBlendElement.as(SVGDomHelper.createElementNS(SVGFEBlendElement.TAG));
        setElement(blendElement);
    }

    @Override
    public SVGAnimatedString getIn1() {
        return this.blendElement.getIn1();
    }

    @Override
    public SVGAnimatedString getIn2() {
        return this.blendElement.getIn2();
    }

    @Override
    public BlendMode getMode() {
        return BlendMode.values()[this.blendElement.getMode().getBaseVal()];
    }

    @Override
    public void setIn1(FilterInput in1) {
        try {
            this.blendElement.getIn1().setBaseVal(in1.getCssName());
        } catch (Exception e) {
            this.blendElement.setAttributeNS("in", in1.getCssName());
        }
    }

    @Override
    public void setIn2(FilterInput in2) {
        try {
            this.blendElement.getIn2().setBaseVal(in2.getCssName());
        } catch (Exception e) {
            this.blendElement.setAttributeNS("in2", in2.getCssName());
        }
    }

    @Override
    public void setMode(BlendMode mode) {
        this.blendElement.setAttributeNS("mode", mode.name().toLowerCase());
    }
}
