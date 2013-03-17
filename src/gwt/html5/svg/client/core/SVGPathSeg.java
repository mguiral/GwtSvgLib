package gwt.html5.svg.client.core;

import com.google.gwt.core.client.JavaScriptObject;

import gwt.html5.svg.client.dom.constants.PathSeqTypes;

public class SVGPathSeg extends JavaScriptObject {
    protected SVGPathSeg() {
    }

    /**
     * @return The type of the path segment as specified by one of the constants defined on this interface.
     */
    public final PathSeqTypes getPathSeqType() {
        return PathSeqTypes.values()[getPathSeqTypeValue()];
    }

    private final native short getPathSeqTypeValue() /*-{
                                                     return this.pathSeqType;
                                                     }-*/;

    /**
     * @return The type of the path segment, specified by the corresponding one character command name.
     */
    public final native String getPathSeqTypeAsLetter() /*-{
                                                        return this.pathSeqTypeAsLetter;
                                                        }-*/;
}
