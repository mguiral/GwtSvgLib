package fr.hd3d.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

import fr.hd3d.html5.svg.client.user.ui.BaseSVGWidget;

public class SVGDomHelperIE6 {
    private static final String ID_ATTRIBUTE = "@@ID@@";
    private static final String FUNCIRI_URL = "url";
    private static final String FUNCIRI_URL_VALUE = FUNCIRI_URL + "(#" + ID_ATTRIBUTE + ")";

    public static Element createElementNS(String tag) {
        return DOM.createElement("v:" + tag);
    }

    public static String getFuncIRI(BaseSVGWidget href) {
        if (href.getElement() != null && href.getElement().getId() != null) {
            return FUNCIRI_URL_VALUE.replace(ID_ATTRIBUTE, href.getElement().getId());
        }
        throw new UnsupportedOperationException("The element is null or has no ID attribute");
    }
}
