package gwt.html5.svg.client.core;

import com.google.gwt.core.client.JavaScriptObject;

public class SVGElementInstanceList extends JavaScriptObject {
    protected SVGElementInstanceList() {
    }

    /**
     * @return The number of {@link SVGElementInstance} objects in the list. The range of valid child indices is 0 to
     *         length-1 inclusive.
     */
    public final native int getLength() /*-{
                                        return this.length;
                                        }-*/;

    /**
     * Returns the index of the item in the collection. If index is greater than or equal to the number of nodes in the
     * list, this returns null.
     * 
     * @param index
     *            index into the collection.
     * @return The {@link SVGElementInstance} object at the indexth position in the {@link SVGElementInstanceList}, or
     *         null if that is not a valid index.
     */
    public final native SVGElementInstance item(int index) /*-{
                                                           return this.item(index);
                                                           }-*/;
}
