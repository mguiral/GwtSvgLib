package fr.hd3d.html5.svg.client.core;

import com.google.gwt.core.client.JavaScriptObject;

public class SVGAnimatedString extends JavaScriptObject {
    protected SVGAnimatedString() {
    }

    /**
     * @return The base value of the given attribute before applying any animations.
     */
    public final native String getBaseVal() /*-{
                                            return this.baseVal;
                                            }-*/;

    /**
     * @param value
     *            The base value of the given attribute before applying any animations.
     */
    public final native void setBaseVal(String value) /*-{
                                                      this.baseVal = value;
                                                      }-*/;

    /**
     * @return If the given attribute or property is being animated, contains the current animated value of the
     *         attribute or property. If the given attribute or property is not currently being animated, contains the
     *         same value as baseVal.
     */
    public final native String getAnimVal() /*-{
                                            return this.animVal;
                                            }-*/;
}
