package fr.hd3d.html5.svg.client;

import fr.hd3d.html5.svg.client.user.ui.SVGTextPositioningWidget;

public interface ISVGTextElement extends ISVGGraphicalElement {
    void setText(String text);

    String getText();

    void addTextContent(SVGTextPositioningWidget childWidget);
}
