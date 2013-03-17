package gwt.html5.svg.client.core;

import com.google.gwt.core.client.JavaScriptObject;

public class SVGAnimatedNumber extends JavaScriptObject {
    protected SVGAnimatedNumber() {
    }

    /**
     * @return The base value of the given attribute before applying any animations.
     */
    public final native float getBaseVal() /*-{
                                           return this.baseVal;
                                           }-*/;

    /**
     * @param baseVal
     *            The base value of the given attribute before applying any animations.
     */
    public final native void setBaseVal(float baseVal) /*-{
                                                       this.baseVal = baseVal;
                                                       }-*/;

    /**
     * @return If the given attribute or property is being animated, contains the current animated value of the
     *         attribute or property. If the given attribute or property is not currently being animated, contains the
     *         same value as baseVal.
     */
    public final native float getAnimVal() /*-{
                                           return this.animVal;
                                           }-*/;
}
