package gwt.html5.svg.client.core;

import com.google.gwt.core.client.JavaScriptObject;

public class SVGAnimatedInteger extends JavaScriptObject {
    protected SVGAnimatedInteger() {
    }

    /**
     * @return The base value of the given attribute before applying any animations.
     */
    public final native int getBaseVal() /*-{
                                         return this.baseVal;
                                         }-*/;

    /**
     * @param baseVal
     *            The base value of the given attribute before applying any animations.
     */
    public final native void setBaseVal(int baseVal) /*-{
                                                     this.baseVal = baseVal;
                                                     }-*/;

    /**
     * @return If the given attribute or property is being animated, contains the current animated value of the
     *         attribute or property. If the given attribute or property is not currently being animated, contains the
     *         same value as baseVal.
     */
    public final native int getAnimVal() /*-{
                                         return this.animVal;
                                         }-*/;
}
