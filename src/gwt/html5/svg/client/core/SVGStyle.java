package gwt.html5.svg.client.core;

import com.google.gwt.dom.client.Style;
import com.google.gwt.dom.client.TagName;

@TagName("style")
public class SVGStyle extends Style {
    protected SVGStyle() {
    }

    public final native void clearSVGProperty(String name) /*-{
                                                           setPropertyImpl(name, "");
                                                           }-*/;

    public final String getSVGProperty(String name) {
        return getPropertyImpl(name);
    }

    public final void setSVGProperty(String name, String value) {
        setPropertyImpl(name, value);
    }

    private native String getPropertyImpl(String name) /*-{
                                                       return this.getPropertyValue(name);
                                                       }-*/;

    private native void setPropertyImpl(String name, String value) /*-{
                                                                   this.setProperty(name, value, '');
                                                                   }-*/;
}
