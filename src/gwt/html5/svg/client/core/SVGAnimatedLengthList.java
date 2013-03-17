package gwt.html5.svg.client.core;

import com.google.gwt.core.client.JavaScriptObject;

public class SVGAnimatedLengthList extends JavaScriptObject {
    protected SVGAnimatedLengthList() {
    }

    /**
     * @return The base value of the given attribute before applying any animations.
     */
    public final native SVGLengthList getBaseVal() /*-{
                                                   return this.baseVal ? @gwt.html5.svg.client.core.SVGLengthList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(this.baseVal) : null;
                                                   }-*/;

    /**
     * @return A read only {@link SVGLengthList} representing the current animated value of the given attribute. If the
     *         given attribute is not currently being animated, then the {@link SVGLengthList} will have the same
     *         contents as baseVal. The object referenced by animVal will always be distinct from the one referenced by
     *         baseVal, even when the attribute is not animat
     */
    public final native SVGLengthList getAnimVal() /*-{
                                                   return this.animVal ? @gwt.html5.svg.client.core.SVGLengthList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(this.animVal) : null;
                                                   }-*/;
}
