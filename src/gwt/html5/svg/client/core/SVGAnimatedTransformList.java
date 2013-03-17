package gwt.html5.svg.client.core;

import com.google.gwt.core.client.JavaScriptObject;

public class SVGAnimatedTransformList extends JavaScriptObject {
    protected SVGAnimatedTransformList() {
    }

    /**
     * @return The base value of the given attribute before applying any animations.
     */
    public final native SVGTransformList getBaseVal() /*-{
                                                      return this.baseVal ? @gwt.html5.svg.client.core.SVGTransformList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(this.baseVal) : null;
                                                      }-*/;

    /**
     * @return A read only {@link SVGTransformList} representing the current animated value of the given attribute. If
     *         the given attribute is not currently being animated, then the {@link SVGTransformList} will have the same
     *         contents as baseVal. The object referenced by animVal will always be distinct from the one referenced by
     *         baseVal, even when the attribute is not animated.
     */
    public final native SVGTransformList getAnimVal() /*-{
                                                      return this.animVal ? @gwt.html5.svg.client.core.SVGTransformList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(this.animVal) : null;
                                                      }-*/;
}
