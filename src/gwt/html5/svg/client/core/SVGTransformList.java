package gwt.html5.svg.client.core;

import java.util.Iterator;

import com.google.gwt.core.client.JavaScriptObject;

import gwt.html5.svg.client.core.SVGTransform.TransformUnit;

public class SVGTransformList implements Iterable<SVGTransform> {
    private JavaScriptObject transformListJSObject;

    protected SVGTransformList(JavaScriptObject transformListJSObject) {
        this.transformListJSObject = transformListJSObject;
    }

    /**
     * @return The number of items in the list.
     */
    public final native int getNumberOfItems() /*-{
                                               return this.@gwt.html5.svg.client.core.SVGTransformList::transformListJSObject.numberOfItems;
                                               }-*/;

    /**
     * Clears all existing current items from the list, with the result being an empty list.
     */
    public final native void clear() /*-{
                                     this.@gwt.html5.svg.client.core.SVGTransformList::transformListJSObject.clear();
                                     }-*/;

    /**
     * Clears all existing current items from the list and re-initializes the list to hold the single item specified by
     * the parameter. If the inserted item is already in a list, it is removed from its previous list before it is
     * inserted into this list. The inserted item is the item itself and not a copy.
     * 
     * @param newItem
     *            The item which should become the only member of the list.
     * @return The item being inserted into the list
     */
    public final native SVGTransform initialize(SVGTransform newItem) /*-{
                                                                      return this.@gwt.html5.svg.client.core.SVGTransformList::transformListJSObject.initialize(newItem);
                                                                      }-*/;

    /**
     * Returns the specified item from the list. The returned item is the item itself and not a copy. Any changes made
     * to the item are immediately reflected in the list.
     * 
     * @param index
     *            The index of the item from the list which is to be returned. The first item is number 0.
     * @return The selected item.
     */
    public final native SVGTransform getItem(int index) /*-{
                                                        return this.@gwt.html5.svg.client.core.SVGTransformList::transformListJSObject.getItem(index);
                                                        }-*/;

    /**
     * Inserts a new item into the list at the specified position. The first item is number 0. If newItem is already in
     * a list, it is removed from its previous list before it is inserted into this list. The inserted item is the item
     * itself and not a copy. If the item is already in this list, note that the index of the item to insert before is
     * before the removal of the item.
     * 
     * @param newItem
     *            The item which is to be inserted into the list.
     * @param index
     *            The index of the item before which the new item is to be inserted. The first item is number 0. If the
     *            index is equal to 0, then the new item is inserted at the front of the list. If the index is greater
     *            than or equal to numberOfItems, then the new item is appended to the end of the list.
     * @return The inserted item.
     */
    public final native SVGTransform insertItemBefore(SVGTransform newItem, int index) /*-{
                                                                                       return this.@gwt.html5.svg.client.core.SVGTransformList::transformListJSObject.insertItemBefore(newItem, index);
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
    public final native SVGTransform replaceItem(SVGTransform newItem, int index) /*-{
                                                                                  return this.@gwt.html5.svg.client.core.SVGTransformList::transformListJSObject.replaceItem(newItem, index);
                                                                                  }-*/;

    /**
     * Removes an existing item from the list.
     * 
     * @param index
     *            The index of the item which is to be removed. The first item is number 0.
     * @return The removed item.
     */
    public final native SVGTransform removeItem(int index) /*-{
                                                           return this.@gwt.html5.svg.client.core.SVGTransformList::transformListJSObject.removeItem(index);
                                                           }-*/;

    /**
     * Inserts a new item at the end of the list. If newItem is already in a list, it is removed from its previous list
     * before it is inserted into this list. The inserted item is the item itself and not a copy.
     * 
     * @param newItem
     *            The item which is to be inserted. The first item is number 0.
     * @return The inserted item
     */
    public final native SVGTransform appendItem(SVGTransform newItem) /*-{
                                                                      return this.@gwt.html5.svg.client.core.SVGTransformList::transformListJSObject.appendItem(newItem);
                                                                      }-*/;

    /**
     * Creates an {@link SVGTransform} object which is initialized to transform of type {@link TransformUnit.MATRIX} and
     * whose values are the given matrix. The values from the parameter matrix are copied, the matrix parameter is not
     * adopted as SVGTransform::matrix
     * 
     * @param matrix
     *            The matrix which defines the transformation.
     * @return The returned {@link SVGTransform} object.
     */
    public final native SVGTransform createSVGTransformFromMatrix(SVGMatrix matrix) /*-{
                                                                                    return this.@gwt.html5.svg.client.core.SVGTransformList::transformListJSObject.createSVGTransformFromMatrix(matrix);
                                                                                    }-*/;

    /**
     * Consolidates the list of separate {@link SVGTransform} objects by multiplying the equivalent transformation
     * matrices together to result in a list consisting of a single SVGTransform object of type
     * {@link SVGTransform.MATRIX}. The consolidation operation creates new {@link SVGTransform} object as the first and
     * only item in the list. The returned item is the item itself and not a copy. Any changes made to the item are
     * immediately reflected in the list.
     * 
     * @return The resulting {@link SVGTransform} object which becomes single item in the list. If the list was empty,
     *         then a value of null is returned.
     */
    public final native SVGTransform consolidate() /*-{
                                                   return this.@gwt.html5.svg.client.core.SVGTransformList::transformListJSObject.consolidate();
                                                   }-*/;

    @Override
    public final Iterator<SVGTransform> iterator() {
        return new Iterator<SVGTransform>() {
            private int index;

            @Override
            public boolean hasNext() {
                return index < getNumberOfItems();
            }

            @Override
            public SVGTransform next() {
                return getItem(index++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
