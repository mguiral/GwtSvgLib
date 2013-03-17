package gwt.html5.svg.client.user.ui;

import gwt.html5.svg.client.ISVGTextElement;
import gwt.html5.svg.client.dom.SVGDomHelper;
import gwt.html5.svg.client.dom.SVGTextElement;

public class SVGTextWidget extends SVGTextPositioningWidget implements ISVGTextElement {
    private SVGTextElement textElement;

    public SVGTextWidget(String text) {
        textElement = SVGTextElement.as(SVGDomHelper.createElementNS(SVGTextElement.TAG));
        setElement(textElement);
        setText(text);
    }

    public SVGTextWidget() {
        textElement = SVGTextElement.as(SVGDomHelper.createElementNS(SVGTextElement.TAG));
        setElement(textElement);
    }

    @Override
    public String getText() {
        return textElement.getInnerText();
    }

    @Override
    public void setText(String text) {
        textElement.setInnerText(text);
    }

    @Override
    public void addTextContent(SVGTextPositioningWidget childWidget) {
        this.add(childWidget);
    }
}
