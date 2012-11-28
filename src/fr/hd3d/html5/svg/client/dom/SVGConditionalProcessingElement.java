package fr.hd3d.html5.svg.client.dom;

import fr.hd3d.html5.svg.client.core.SVGStringList;

public class SVGConditionalProcessingElement extends SVGElement {
    protected SVGConditionalProcessingElement() {
    }

    public final native SVGStringList getRequiredFeatures() /*-{
                                                            return this.requiredFeatures ? @fr.hd3d.html5.svg.client.core.SVGStringList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(this.requiredFeatures) : null;
                                                            }-*/;

    public final native SVGStringList getRequiredExtensions() /*-{
                                                              return this.requiredExtensions ? @fr.hd3d.html5.svg.client.core.SVGStringList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(this.requiredExtensions) : null;
                                                              }-*/;

    public final native SVGStringList getSystemLanguage() /*-{
                                                          return this.systemLanguage ? @fr.hd3d.html5.svg.client.core.SVGStringList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(this.systemLanguage) : null;
                                                          }-*/;

    public final native boolean hasExtension(String extension) /*-{
                                                               return this.hasExtension(extension);
                                                               }-*/;
}
