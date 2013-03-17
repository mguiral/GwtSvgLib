package gwt.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

import gwt.html5.svg.client.core.SVGAnimatedTransformList;
import gwt.html5.svg.client.core.SVGMatrix;
import gwt.html5.svg.client.core.SVGRect;

@TagName(SVGSwitchElement.TAG)
public class SVGSwitchElement extends SVGConditionalProcessingElement {
    public static final String TAG = "switch";

    public static SVGSwitchElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGSwitchElement) elem;
    }

    protected SVGSwitchElement() {
    }

    public final native SVGAnimatedTransformList getTransform() /*-{
                                                                return this.transform;
                                                                }-*/;

    public final native void setTransform(String transform) /*-{
                                                            
                                                            this.transform = transform;
                                                            }-*/;

    public final native SVGElement getNearestViewportElement() /*-{
                                                               return this.nearestViewportElement;
                                                               }-*/;

    public final native SVGElement getFarthestViewportElement() /*-{
                                                                return this.farthestViewportElement;
                                                                }-*/;

    public final native SVGRect getBBox() /*-{
                                          return this.getBBox();
                                          }-*/;

    public final native SVGMatrix getCTM() /*-{
                                           return this.getCTM();
                                           }-*/;

    public final native SVGMatrix getScreenCTM() /*-{
                                                 return this.getScreenCTM();
                                                 }-*/;

    public final native SVGMatrix getTransformToElement(SVGElement element) /*-{
                                                                            return this.getTransformToElement(element);
                                                                            }-*/;
}
