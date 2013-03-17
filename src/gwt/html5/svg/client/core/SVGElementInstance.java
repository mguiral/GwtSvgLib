package gwt.html5.svg.client.core;

import com.google.gwt.dom.client.EventTarget;

import gwt.html5.svg.client.dom.SVGElement;
import gwt.html5.svg.client.dom.SVGRectElement;
import gwt.html5.svg.client.dom.SVGUseElement;

public class SVGElementInstance extends EventTarget {
    protected SVGElementInstance() {
    }

    /**
     * @return The corresponding element to which this object is an instance. For example, if a "use" element references
     *         a "rect" element, then an SVGElementInstance is created, with its correspondingElement being the
     *         {@link SVGRectElement} object for the "rect" element.
     */
    public final native SVGElement getCorrespondingElement() /*-{
                                                             return this.correspondingElement;
                                                             }-*/;

    /**
     * @return The corresponding "use" element to which this {@link SVGElementInstance} object belongs. When "use"
     *         elements are nested (e.g., a "use" references another "use" which references a graphics element such as a
     *         "rect"), then the correspondingUseElement is the outermost "use" (i.e., the one which indirectly
     *         references the "rect", not the one with the direct reference).
     */
    public final native SVGUseElement getCorrespondingUseElement() /*-{
                                                                   return this.correspondingUseElement;
                                                                   }-*/;

    /**
     * @return The parent of this {@link SVGElementInstance} within the instance tree. All {@link SVGElementInstance}
     *         objects have a parent except the {@link SVGElementInstance} which corresponds to the element which was
     *         directly referenced by the "use" element, in which case parentNode is null.
     */
    public final native SVGElementInstance getParentNode() /*-{
                                                           return this.parentNode;
                                                           }-*/;

    /**
     * @return An SVGElementInstanceList that contains all children of this {@link SVGElementInstance} within the
     *         instance tree. If there are no children, this is an {@link SVGElementInstanceList} containing no entries
     *         (i.e., an empty list).
     */
    public final native SVGElementInstanceList getChildNodes() /*-{
                                                               return this.childNodes;
                                                               }-*/;

    /**
     * @return The first child of this {@link SVGElementInstance} within the instance tree. If there is no such
     *         SVGElementInstance, this returns null.
     */
    public final native SVGElementInstance getFirstChild() /*-{
                                                           return this.firstChild;
                                                           }-*/;

    /**
     * @return The last child of this {@link SVGElementInstance} within the instance tree. If there is no such
     *         {@link SVGElementInstance}, this returns null.
     */
    public final native SVGElementInstance getLastChild() /*-{
                                                          return this.lastChild;
                                                          }-*/;

    /**
     * @return The {@link SVGElementInstance} immediately preceding this SVGElementInstance. If there is no such
     *         {@link SVGElementInstance}, this returns null.
     */
    public final native SVGElementInstance getPreviousSibling() /*-{
                                                                return this.previousSibling;
                                                                }-*/;

    /**
     * @return The {@link SVGElementInstance} immediately following this {@link SVGElementInstance}. If there is no such
     *         {@link SVGElementInstance}, this returns null.
     */
    public final native SVGElementInstance getNextSibling() /*-{
                                                            return this.nextSibling;
                                                            }-*/;
}
