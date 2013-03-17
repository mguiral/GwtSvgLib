package gwt.html5.svg.client.dom;

import gwt.html5.svg.client.core.SVGStringList;

public class SVGConditionalProcessingElement extends SVGElement {
    protected SVGConditionalProcessingElement() {
    }

    public final native SVGStringList getRequiredFeatures() /*-{
                                                            return this.requiredFeatures ? @gwt.html5.svg.client.core.SVGStringList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(this.requiredFeatures) : null;
                                                            }-*/;

    public final native SVGStringList getRequiredExtensions() /*-{
                                                              return this.requiredExtensions ? @gwt.html5.svg.client.core.SVGStringList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(this.requiredExtensions) : null;
                                                              }-*/;

    public final native SVGStringList getSystemLanguage() /*-{
                                                          return this.systemLanguage ? @gwt.html5.svg.client.core.SVGStringList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(this.systemLanguage) : null;
                                                          }-*/;

    public final native boolean hasExtension(String extension) /*-{
                                                               return this.hasExtension(extension);
                                                               }-*/;
}
