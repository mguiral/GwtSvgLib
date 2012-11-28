package fr.hd3d.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;

import fr.hd3d.html5.svg.client.user.ui.BaseSVGWidget;

public class SVGDomHelper {
    private static final String HTTP_WWW_W3_ORG_2000_SVG = "http://www.w3.org/2000/svg";
    private static final String ID_ATTRIBUTE = "@@ID@@";
    private static final String FUNCIRI_URL = "url";
    private static final String FUNCIRI_URL_VALUE = FUNCIRI_URL + "(#" + ID_ATTRIBUTE + ")";

    public static Element createElementNS(String tag) {
        return createElementNS(HTTP_WWW_W3_ORG_2000_SVG, tag);
    }

    private static native Element createElementNS(String ns, String tag) /*-{
                                                                         return $doc.createElementNS(ns, tag);
                                                                         }-*/;

    public static String getFuncIRI(BaseSVGWidget href) {
        if (href.getElement() != null && href.getElement().getId() != null) {
            return FUNCIRI_URL_VALUE.replace(ID_ATTRIBUTE, href.getElement().getId());
        }
        throw new UnsupportedOperationException("The element is null or has no ID attribute");
    }
}
