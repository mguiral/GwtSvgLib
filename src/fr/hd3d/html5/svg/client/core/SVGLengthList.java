package fr.hd3d.html5.svg.client.core;

import java.util.Iterator;

import com.google.gwt.core.client.JavaScriptObject;

public class SVGLengthList implements Iterable<SVGLength> {
    private JavaScriptObject lengthListJSObject;

    protected SVGLengthList(JavaScriptObject lengthListJSObject) {
        this.lengthListJSObject = lengthListJSObject;
    }

    /**
     * @return The number of items in the list.
     */
    public final native int getNumberOfItems() /*-{
                                               return this.@fr.hd3d.html5.svg.client.core.SVGLengthList::lengthListJSObject.numberOfItems;
                                               }-*/;

    /**
     * Clears all existing current items from the list, with the result being an empty list.
     */
    public final native void clear() /*-{
                                     this.@fr.hd3d.html5.svg.client.core.SVGLengthList::lengthListJSObject.clear();
                                     }-*/;

    /**
     * Clears all existing current items from the list and re-initializes the list to hold the single item specified by
     * the parameter. If the inserted item is already in a list, it is removed from its previous list before it is
     * inserted into this list. The inserted item is the item itself and not a copy.
     * 
     * @param newItem
     *            The item which should become the only member of the list.
     * @return The item being inserted into the list.
     */
    public final native SVGLength initialize(SVGLength newItem) /*-{
                                                                return this.@fr.hd3d.html5.svg.client.core.SVGLengthList::lengthListJSObject.initialize(newItem);
                                                                }-*/;

    /**
     * Returns the specified item from the list. The returned item is the item itself and not a copy. Any changes made
     * to the item are immediately reflected in the list.
     * 
     * @param index
     *            The index of the item from the list which is to be returned. The first item is number 0.
     * @return The selected item.
     */
    public final native SVGLength getItem(int index) /*-{
                                                     return this.@fr.hd3d.html5.svg.client.core.SVGLengthList::lengthListJSObject.getItem(index);
                                                     }-*/;

    /**
     * Inserts a new item into the list at the specified position. The first item is number 0. If newItem is already in
     * a list, it is removed from its previous list before it is inserted into this list. The inserted item is the item
     * itself and not a copy. If the item is already in this list, note that the index of the item to insert before is
     * before the removal of the item.
     * 
     * @param newItem
     *            The item which is to be inserted into the list
     * @param index
     *            The index of the item before which the new item is to be inserted. The first item is number 0. If the
     *            index is equal to 0, then the new item is inserted at the front of the list. If the index is greater
     *            than or equal to numberOfItems, then the new item is appended to the end of the list.
     * @return The inserted item.
     */
    public final native SVGLength insertItemBefore(SVGLength newItem, int index) /*-{
                                                                                 return this.@fr.hd3d.html5.svg.client.core.SVGLengthList::lengthListJSObject.insertItemBefore(newItem, index);
                                                                                 }-*/;

    /**
     * Replaces an existing item in the list with a new item. If newItem is already in a list, it is removed from its
     * previous list before it is inserted into this list. The inserted item is the item itself and not a copy. If the
     * item is already in this list, note that the index of the item to replace is before the removal of the item.
     * 
     * @param newItem
     *            The item which is to be inserted into the list.
     * @param index
     *            The index of the item which is to be replaced. The first item is number 0.
     * @return The inserted item.
     */
    public final native SVGLength replaceItem(SVGLength newItem, int index) /*-{
                                                                            return this.@fr.hd3d.html5.svg.client.core.SVGLengthList::lengthListJSObject.replaceItem(newItem, index);
                                                                            }-*/;

    /**
     * Removes an existing item from the list.
     * 
     * @param index
     *            The index of the item which is to be removed. The first item is number 0.
     * @return The removed item.
     */
    public final native SVGLength removeItem(int index) /*-{
                                                        return this.@fr.hd3d.html5.svg.client.core.SVGLengthList::lengthListJSObject.removeItem(index);
                                                        }-*/;

    /**
     * Inserts a new item at the end of the list. If newItem is already in a list, it is removed from its previous list
     * before it is inserted into this list. The inserted item is the item itself and not a copy.
     * 
     * @param newItem
     *            The item which is to be inserted. The first item is number 0.
     * @return The inserted item.
     */
    public final native SVGLength appendItem(SVGLength newItem) /*-{
                                                                return this.@fr.hd3d.html5.svg.client.core.SVGLengthList::lengthListJSObject.appendItem(newItem);
                                                                }-*/;

    @Override
    public final Iterator<SVGLength> iterator() {
        return new Iterator<SVGLength>() {
            private int index;

            @Override
            public boolean hasNext() {
                return index < getNumberOfItems();
            }

            @Override
            public SVGLength next() {
                return getItem(index++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
