package gwt.html5.svg.client.core;

import com.google.gwt.core.client.JavaScriptObject;

public class SVGAnimatedPreserveAspectRatio extends JavaScriptObject {
    protected SVGAnimatedPreserveAspectRatio() {
    }

    /**
     * @return The base value of the given attribute before applying any animations.
     */
    public final native SVGPreserveAspectRatio getBaseVal() /*-{
                                                            return this.baseVal;
                                                            }-*/;

    /**
     * @return A read only {@link SVGPreserveAspectRatio} representing the current animated value of the given
     *         attribute. If the given attribute is not currently being animated, then the
     *         {@link SVGPreserveAspectRatio} will have the same contents as baseVal. The object referenced by animVal
     *         will always be distinct from the one referenced by baseVal, even when the attribute is not animated.
     */
    public final native SVGPreserveAspectRatio getAnimVal() /*-{
                                                            return this.animVal;
                                                            }-*/;
}
