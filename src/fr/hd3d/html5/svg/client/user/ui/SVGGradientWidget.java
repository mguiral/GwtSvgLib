package fr.hd3d.html5.svg.client.user.ui;

import java.util.List;

import com.google.gwt.user.client.Element;

import fr.hd3d.html5.svg.client.ISVGGradientElement;
import fr.hd3d.html5.svg.client.core.SVGAnimatedEnumeration;
import fr.hd3d.html5.svg.client.core.SVGAnimatedString;
import fr.hd3d.html5.svg.client.core.SVGAnimatedTransformList;
import fr.hd3d.html5.svg.client.core.SVGTransform;
import fr.hd3d.html5.svg.client.dom.SVGDomHelper;
import fr.hd3d.html5.svg.client.dom.SVGGradientElement;
import fr.hd3d.html5.svg.client.dom.constants.GradientUnits;
import fr.hd3d.html5.svg.client.dom.constants.SpreadMethod;

public abstract class SVGGradientWidget extends BaseSVGWidget implements ISVGGradientElement {
    private SVGGradientElement gradientElement;

    @Override
    protected void setElement(Element elem) {
        super.setElement(elem);
        gradientElement = elem.cast();
    }

    @Override
    public SVGAnimatedEnumeration getGradienUnits() {
        return gradientElement.getGradientUnits();
    }

    @Override
    public SVGAnimatedTransformList getGradientTransform() {
        return gradientElement.getGradientTransform();
    }

    @Override
    public SVGAnimatedEnumeration getSpreadMethod() {
        return gradientElement.getSpreadMethod();
    }

    @Override
    public void setGradientUnits(GradientUnits gradientUnit) {
        //        try
        //        {
        //            gradientElement.getGradientUnits().setBaseVal((short) gradientUnit.ordinal());
        //        }
        //        catch (Exception e)
        //        {
        gradientElement.setAttributeNS("gradientUnits", gradientUnit.getCssName());
        //        }
    }

    @Override
    public void setSpreadMethod(SpreadMethod spreadMethod) {
        gradientElement.getSpreadMethod().setBaseVal((short) spreadMethod.ordinal());
    }

    @Override
    public void setTransform(SVGTransform transform) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setTrasnform(List<SVGTransform> transformList) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SVGAnimatedString getHref() {
        return gradientElement.getHref();
    }

    @Override
    public void setHref(BaseSVGWidget href) {
        String funcIRI = SVGDomHelper.getFuncIRI(href);
        gradientElement.getHref().setBaseVal(funcIRI);
    }

    @Override
    public SVGStopWidget addStop(int offset, String color) {
        try {
            SVGStopWidget stopWidget = new SVGStopWidget();
            stopWidget.setOffset(offset, color);
            this.add(stopWidget);
            return stopWidget;
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
