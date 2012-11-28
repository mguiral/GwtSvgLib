package fr.hd3d.html5.svg.client.core;

import com.google.gwt.core.client.JavaScriptObject;

public class SVGAnimatedLength extends JavaScriptObject {
    protected SVGAnimatedLength() {
    }

    /**
     * @return The base value of the given attribute before applying any animations.
     */
    public final native SVGLength getBaseVal() /*-{
                                               return this.baseVal;
                                               }-*/;

    /**
     * @return A read only {@link SVGLength} representing the current animated value of the given attribute. If the
     *         given attribute is not currently being animated, then the {@link SVGLength} will have the same contents
     *         as baseVal. The object referenced by animVal will always be distinct from the one referenced by baseVal,
     *         even when the attribute is not animated.
     */
    public final native SVGLength getAnimVal() /*-{
                                               return this.animVal;
                                               }-*/;
}
