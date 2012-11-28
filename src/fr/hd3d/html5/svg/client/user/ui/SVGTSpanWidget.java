package fr.hd3d.html5.svg.client.user.ui;

import fr.hd3d.html5.svg.client.ISVGTextElement;
import fr.hd3d.html5.svg.client.dom.SVGDomHelper;
import fr.hd3d.html5.svg.client.dom.SVGTSpanElement;

public class SVGTSpanWidget extends SVGTextPositioningWidget implements ISVGTextElement {
    private SVGTSpanElement spanElement;

    public SVGTSpanWidget(String text) {
        spanElement = SVGTSpanElement.as(SVGDomHelper.createElementNS(SVGTSpanElement.TAG));
        setElement(spanElement);
        setText(text);
    }

    @Override
    public String getText() {
        return spanElement.getInnerText();
    }

    @Override
    public void setText(String text) {
        spanElement.setInnerText(text);
    }

    @Override
    public void addTextContent(SVGTextPositioningWidget childWidget) {
        this.add(childWidget);
    }
}
