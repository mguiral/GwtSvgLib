package fr.hd3d.html5.svg.client.core;

import java.util.Iterator;

import com.google.gwt.core.client.JavaScriptObject;

public class SVGPointList implements Iterable<SVGPoint> {
    private JavaScriptObject pointListJSObject;

    protected SVGPointList(JavaScriptObject ot) {
        this.pointListJSObject = ot;
    }

    public final native int getNumberOfItems() /*-{
                                               return this.@fr.hd3d.html5.svg.client.core.SVGPointList::pointListJSObject.numberOfItems;
                                               }-*/;

    public final native void clear() /*-{
                                     this.@fr.hd3d.html5.svg.client.core.SVGPointList::pointListJSObject.clear();
                                     }-*/;

    public final native SVGPoint initialize(SVGPoint newItem) /*-{
                                                              return this.@fr.hd3d.html5.svg.client.core.SVGPointList::pointListJSObject.initialize(newItem);
                                                              }-*/;

    public final native SVGPoint getItem(int index) /*-{
                                                    return this.@fr.hd3d.html5.svg.client.core.SVGPointList::pointListJSObject.getItem(index);
                                                    }-*/;

    public final native SVGPoint insertItemBefore(SVGPoint newItem, int index) /*-{
                                                                               return this.@fr.hd3d.html5.svg.client.core.SVGPointList::pointListJSObject.insertItemBefore(newItem, index);
                                                                               }-*/;

    public final native SVGPoint replaceItem(SVGPoint newItem, int index) /*-{
                                                                          return this.@fr.hd3d.html5.svg.client.core.SVGPointList::pointListJSObject.replaceItem(newItem, index);
                                                                          }-*/;

    public final native SVGPoint removeItem(int index) /*-{
                                                       return this.@fr.hd3d.html5.svg.client.core.SVGPointList::pointListJSObject.removeItem(index);
                                                       }-*/;

    public final native SVGPoint appendItem(SVGPoint newItem) /*-{
                                                              return this.@fr.hd3d.html5.svg.client.core.SVGPointList::pointListJSObject.appendItem(newItem);
                                                              }-*/;

    @Override
    public final Iterator<SVGPoint> iterator() {
        return new Iterator<SVGPoint>() {
            private int index;

            @Override
            public boolean hasNext() {
                return index < getNumberOfItems();
            }

            @Override
            public SVGPoint next() {
                return getItem(index++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
