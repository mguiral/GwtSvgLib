package fr.hd3d.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;

import fr.hd3d.html5.svg.client.core.SVGAnimatedBoolean;
import fr.hd3d.html5.svg.client.core.SVGAnimatedString;

public class SVGElementIE6 extends Element {
    protected SVGElementIE6() {
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
    public final native SVGElementIE6 getViewportElement() /*-{
                                                           return this.viewportElement
                                                           }-*/;

    public final native SVGAnimatedString getSVGClassName() /*-{
                                                            return this.className;
                                                            }-*/;

    public final native SVGAnimatedBoolean getExternalResourcesRequired() /*-{
                                                                          return this.externalResourcesRequired;
                                                                          }-*/;

    public final void setAttributeNS(String name, String value) {
        this.setAttribute(name, value);
    }
}
