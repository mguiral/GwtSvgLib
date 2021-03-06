package gwt.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;

import gwt.html5.svg.client.core.SVGAnimatedBoolean;
import gwt.html5.svg.client.core.SVGAnimatedString;

public class SVGElement extends Element {
    protected SVGElement() {
    }

    /**
     * @return attribute "xml:base" on the given element.
     */
    public final native String getXmlBase() /*-{
                                            return this.xmlbase;
                                            }-*/;

    /**
     * @param xmlbase
     *            Corresponds to attribute "xml:base" on the given element.
     */
    public final native void setXmlBase(String xmlbase) /*-{
                                                        this.xmlbase = xmlbase;
                                                        }-*/;

    public final native String getXmlLang() /*-{
                                            return this.xmllang;
                                            }-*/;

    public final native void setXmlLang(String value) /*-{
                                                      this.xmllang = value;
                                                      }-*/;

    public final native String getXmlSpace() /*-{
                                             return this.xmlspace;
                                             }-*/;

    public final native void setXmlSpace(String value) /*-{
                                                       this.xmlspace = value;
                                                       }-*/;

    /**
     * @return the nearest ancestor "svg" element.
     */
    public final native SVGSVGElement getOwnerSVGElement() /*-{
                                                           return this.ownerSVGElement;
                                                           }-*/;

    /**
     * @return The element which established the current viewport. Often, the nearest ancestor "svg" element
     */
    public final native SVGElement getViewportElement() /*-{
                                                        return this.viewportElement
                                                        }-*/;

    public final native SVGAnimatedString getSVGClassName() /*-{
                                                            return this.className;
                                                            }-*/;

    public final native SVGAnimatedBoolean getExternalResourcesRequired() /*-{
                                                                          return this.externalResourcesRequired;
                                                                          }-*/;

    public final void setAttributeNS(String name, String value) {
        this.setAttributeNS(null, name, value);
    }

    private final native void setAttributeNS(String uri, String name, String value) /*-{
                                                                                    this.setAttributeNS(uri, name, value);
                                                                                    }-*/;
}
