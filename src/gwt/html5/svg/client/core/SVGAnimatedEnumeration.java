package gwt.html5.svg.client.core;

import com.google.gwt.core.client.JavaScriptObject;

public class SVGAnimatedEnumeration extends JavaScriptObject {
    protected SVGAnimatedEnumeration() {
    }

    /**
     * @return The base value of the given attribute before applying any animations.
     */
    public final native short getBaseVal() /*-{
                                           return this.baseVal;
                                           }-*/;

    /**
     * @param baseVal
     *            The base value of the given attribute before applying any animations.
     */
    public final native void setBaseVal(short baseVal) /*-{
                                                       this.baseVal = baseVal;
                                                       }-*/;

    /**
     * @return If the given attribute or property is being animated, contains the current animated value of the
     *         attribute or property. If the given attribute or property is not currently being animated, contains the
     *         same value as baseVal.
     */
    public final native short getAnimVal() /*-{
                                           return this.animVal;
                                           }-*/;
}
