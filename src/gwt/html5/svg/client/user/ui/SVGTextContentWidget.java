package gwt.html5.svg.client.user.ui;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.Element;

import gwt.html5.svg.client.ISVGTextContentElement;
import gwt.html5.svg.client.core.SVGAnimatedEnumeration;
import gwt.html5.svg.client.core.SVGAnimatedLength;
import gwt.html5.svg.client.core.SVGAnimatedString;
import gwt.html5.svg.client.core.SVGPoint;
import gwt.html5.svg.client.core.SVGRect;
import gwt.html5.svg.client.core.SVGStyle;
import gwt.html5.svg.client.dom.SVGTextContentElement;
import gwt.html5.svg.client.dom.constants.LengthAdjust;

public abstract class SVGTextContentWidget extends SVGGraphicalWidget implements ISVGTextContentElement {
    private SVGTextContentElement textContentElement;

    @Override
    protected void setElement(Element elem) {
        super.setElement(elem);
        textContentElement = elem.cast();
    }

    @Override
    public int getCharNumAtPosition(SVGPoint point) {
        return textContentElement.getCharNumAtPosition(point);
    }

    @Override
    public float getComputedTextLength() {
        return textContentElement.getComputedTextLength();
    }

    @Override
    public SVGPoint getEndPositionOfChar(int charnum) {
        return textContentElement.getEndPositionOfChar(charnum);
    }

    @Override
    public SVGRect getExtentOfChar(int charnum) {
        return textContentElement.getExtentOfChar(charnum);
    }

    @Override
    public SVGAnimatedEnumeration getLengthAdjust() {
        return textContentElement.getLengthAdjust();
    }

    @Override
    public int getNumberOfChars() {
        return textContentElement.getNumberOfChars();
    }

    @Override
    public float getRotationOfChar(int charnum) {
        return textContentElement.getRotationOfChar(charnum);
    }

    @Override
    public SVGPoint getStartPositionOfChar(int charnum) {
        return textContentElement.getStartPositionOfChar(charnum);
    }

    @Override
    public float getSubStringLenth(int charnum, int nchars) {
        return textContentElement.getSubStringLenth(charnum, nchars);
    }

    @Override
    public SVGAnimatedLength getTextLength() {
        return textContentElement.getTextLength();
    }

    @Override
    public void selectSubString(int charnum, int nchars) {
        textContentElement.selectSubString(charnum, nchars);
    }

    @Override
    public void setLengthAdjust(LengthAdjust lengthAdjust) {
        textContentElement.setLengthAdjust(lengthAdjust.getCssName());
    }

    @Override
    public void setTextLength(int length, Unit unit) {
        textContentElement.setTextLength(length + unit.getType());
    }

    @Override
    public SVGAnimatedString getSVGClassName() {
        return textContentElement.getSVGClassName();
    }

    @Override
    public boolean getExternalResourcesRequired() {
        return textContentElement.getExternalResourcesRequired().getBaseVal();
    }

    @Override
    public void setExternalResourcesRequired(boolean externalResourceeRequried) {
        textContentElement.getExternalResourcesRequired().setBaseVal(externalResourceeRequried);
    }

    @Override
    public SVGAnimatedString getClassName() {
        return textContentElement.getSVGClassName();
    }

    @Override
    public SVGStyle getStyle() {
        return textContentElement.getStyle().cast();
    }
}
