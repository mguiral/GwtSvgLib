package fr.hd3d.html5.svg.client.core;

import java.util.Iterator;

import com.google.gwt.core.client.JavaScriptObject;

public class SVGStringList implements Iterable<String> {
    private JavaScriptObject stringListJSObject;

    protected SVGStringList(JavaScriptObject stringListJSObject) {
        this.stringListJSObject = stringListJSObject;
    }

    /**
     * @return The number of items in the list.
     */
    public final native int getNumberOfItems() /*-{
                                               return this.@fr.hd3d.html5.svg.client.core.SVGStringList::stringListJSObject.numberOfItems;
                                               }-*/;

    /**
     * Clears all existing current items from the list, with the result being an empty list.
     */
    public final native void clear() /*-{
                                     this.@fr.hd3d.html5.svg.client.core.SVGStringList::stringListJSObject.clear();
                                     }-*/;

    /**
     * Clears all existing current items from the list and re-initializes the list to hold the single item specified by
     * the parameter.
     * 
     * @param newItem
     *            The item which should become the only member of the list.
     * @return The item being inserted into the list.
     */
    public final native String initialize(String newItem) /*-{
                                                          return this.@fr.hd3d.html5.svg.client.core.SVGStringList::stringListJSObject.initialize(newItem);
                                                          }-*/;

    /**
     * Returns the specified item from the list.
     * 
     * @param index
     *            The index of the item from the list which is to be returned. The first item is number 0.
     * @return The selected item.
     */
    public final native String getItem(int index) /*-{
                                                  return this.@fr.hd3d.html5.svg.client.core.SVGStringList::stringListJSObject.getItem(index);
                                                  }-*/;

    /**
     * Inserts a new item into the list at the specified position. The first item is number 0.
     * 
     * @param newItem
     *            The item which is to be inserted into the list.
     * @param index
     *            The index of the item before which the new item is to be inserted. The first item is number 0. If the
     *            index is equal to 0, then the new item is inserted at the front of the list. If the index is greater
     *            than or equal to numberOfItems, then the new item is appended to the end of the list.
     * @return The inserted item.
     */
    public final native String insertItemBefore(String newItem, int index) /*-{
                                                                           return this.@fr.hd3d.html5.svg.client.core.SVGStringList::stringListJSObject.insertItemBefore(newItem, index);
                                                                           }-*/;

    /**
     * Replaces an existing item in the list with a new item.
     * 
     * @param newItem
     *            The item which is to be inserted into the list.
     * @param index
     *            The index of the item which is to be replaced. The first item is number 0.
     * @return The inserted item.
     */
    public final native String replaceItem(String newItem, int index) /*-{
                                                                      return this.@fr.hd3d.html5.svg.client.core.SVGStringList::stringListJSObject.replaceItem(newItem, index);
                                                                      }-*/;

    /**
     * Removes an existing item from the list.
     * 
     * @param index
     *            The index of the item which is to be removed. The first item is number 0.
     * @return The removed item.
     */
    public final native String removeItem(int index) /*-{
                                                     return this.@fr.hd3d.html5.svg.client.core.SVGStringList::stringListJSObject.removeItem(index);
                                                     }-*/;

    /**
     * Inserts a new item at the end of the list.
     * 
     * @param newItem
     *            The item which is to be inserted. The first item is number 0
     * @return The inserted item.
     */
    public final native String appendItem(String newItem) /*-{
                                                          return this.@fr.hd3d.html5.svg.client.core.SVGStringList::stringListJSObject.appendItem(newItem);
                                                          }-*/;

    @Override
    public final Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index;

            @Override
            public boolean hasNext() {
                return index < getNumberOfItems();
            }

            @Override
            public String next() {
                return getItem(index++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
