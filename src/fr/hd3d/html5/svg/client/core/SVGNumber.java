package fr.hd3d.html5.svg.client.core;

import com.google.gwt.core.client.JavaScriptObject;

public class SVGNumber extends JavaScriptObject {
    protected SVGNumber() {
    }

    /**
     * @return The value of the given attribute.
     */
    public final native int getValue() /*-{
                                       return this.value;
                                       }-*/;

    /**
     * @param value
     *            The value of the given attribute.
     */
    public final native void setValue(int value) /*-{
                                                 this.value = value;
                                                 }-*/;
}
