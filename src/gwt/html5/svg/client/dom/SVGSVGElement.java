package gwt.html5.svg.client.dom;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.dom.client.TagName;

import gwt.html5.svg.client.core.SVGAngle;
import gwt.html5.svg.client.core.SVGAnimatedLength;
import gwt.html5.svg.client.core.SVGAnimatedPreserveAspectRatio;
import gwt.html5.svg.client.core.SVGAnimatedRect;
import gwt.html5.svg.client.core.SVGLength;
import gwt.html5.svg.client.core.SVGMatrix;
import gwt.html5.svg.client.core.SVGNumber;
import gwt.html5.svg.client.core.SVGPoint;
import gwt.html5.svg.client.core.SVGRect;
import gwt.html5.svg.client.core.SVGTransform;
import gwt.html5.svg.client.core.SVGViewSpec;

@TagName(SVGSVGElement.TAG)
public class SVGSVGElement extends SVGConditionalProcessingElement {
    public static final String TAG = "svg";

    public static SVGSVGElement as(Element elem) {
        assert elem.getTagName().equalsIgnoreCase(TAG);
        return (SVGSVGElement) elem;
    }

    protected SVGSVGElement() {
    }

    public final native SVGAnimatedLength getX() /*-{
                                                 return this.x;
                                                 }-*/;

    public final native void setX(String x) /*-{
                                            
                                            this.x = x;
                                            }-*/;

    public final native SVGAnimatedLength getY() /*-{
                                                 return this.y;
                                                 }-*/;

    public final native void setY(String y) /*-{
                                            
                                            this.y = y;
                                            }-*/;

    public final native SVGAnimatedLength getWidth() /*-{
                                                     return this.width;
                                                     }-*/;

    public final native void setWidth(String width) /*-{
                                                    
                                                    this.width = width;
                                                    }-*/;

    public final native SVGAnimatedLength getHeight() /*-{
                                                      return this.height;
                                                      }-*/;

    public final native void setHeight(String height) /*-{
                                                      
                                                      this.height = height;
                                                      }-*/;

    public final native String getContentScriptType() /*-{
                                                      return this.contentScriptType;
                                                      }-*/;

    public final native void setContentScriptType(String value) /*-{
                                                                this.contentScriptType = value;
                                                                }-*/;

    public final native String getContentStyleType() /*-{
                                                     return this.contentStyleType;
                                                     }-*/;

    public final native void setContentStyleType(String value) /*-{
                                                               this.contentStyleType = value;
                                                               }-*/;

    public final native SVGRect getViewport() /*-{
                                              return this.viewport;
                                              }-*/;

    public final native float getPixelUnitToMillimeterX() /*-{
                                                          return this.pixelUnitToMillimeterX;
                                                          }-*/;

    public final native float getPixelUnitToMillimeterY() /*-{
                                                          return this.pixelUnitToMillimeterY;
                                                          }-*/;

    public final native float getScreenPixelToMillimeterX() /*-{
                                                            return this.screenPixelToMillimeterX;
                                                            }-*/;

    public final native float getScreenPixelToMillimeterY() /*-{
                                                            return this.screenPixelToMillimeterY;
                                                            }-*/;

    public final native boolean isUseCurrentView() /*-{
                                                   return this.useCurrentView;
                                                   }-*/;

    public final native SVGViewSpec getCurrentView() /*-{
                                                     return this.currentView;
                                                     }-*/;

    public final native float getCurrentScale() /*-{
                                                return this.currentScale;
                                                }-*/;

    public final native void setCurrentScale(float value) /*-{
                                                          this.currentScale = value;
                                                          }-*/;

    public final native SVGPoint getCurrentTranslate() /*-{
                                                       return this.currentTranslate;
                                                       }-*/;

    public final native int suspendRedraw(int maxWaitMilliseconds) /*-{
                                                                   return this.suspendRedraw(maxWaitMilliseconds);
                                                                   }-*/;

    public final native void unsuspendRedraw(int suspendHandleId) /*-{
                                                                  this.unsuspendRedraw(suspendHandleId);
                                                                  }-*/;

    public final native void unsuspendRedrawAll() /*-{
                                                  this.unsuspendRedrawAll();
                                                  }-*/;

    public final native void forceRedraw() /*-{
                                           this.forceRedraw();
                                           }-*/;

    public final native void pauseAnimations() /*-{
                                               this.pauseAnimations();
                                               }-*/;

    public final native void unpauseAnimations() /*-{
                                                 this.unpauseAnimations();
                                                 }-*/;

    public final native boolean isAnimationsPaused() /*-{
                                                     return this.animationsPaused();
                                                     }-*/;

    public final native float getCurrentTime() /*-{
                                               return this.getCurrentTime();
                                               }-*/;

    public final native void setCurrentTime(float seconds) /*-{
                                                           this.setCurrentTime(seconds);
                                                           }-*/;

    public final native NodeList<? extends Node> getIntersectionList(SVGRect rect, SVGElement referenceElement) /*-{
                                                                                                                return this.getIntersectionList(rect, referenceElement);
                                                                                                                }-*/;

    public final native NodeList<? extends Node> getEnclosureList(SVGRect rect, SVGElement referenceElement) /*-{
                                                                                                             return this.getEnclosureList(rect, referenceElement);
                                                                                                             }-*/;

    public final native boolean checkIntersection(SVGElement element, SVGRect rect) /*-{
                                                                                    return this.checkIntersection(element, rect);
                                                                                    }-*/;

    public final native boolean checkEnclosure(SVGElement element, SVGRect rect) /*-{
                                                                                 return this.checkEnclosure(element, rect);
                                                                                 }-*/;

    public final native void deselectAll() /*-{
                                           this.deselectAll();
                                           }-*/;

    public final native SVGNumber createSVGNumber() /*-{
                                                    return this.createSVGNumber();
                                                    }-*/;

    public final native SVGLength createSVGLength() /*-{
                                                    return this.createSVGLength();
                                                    }-*/;

    public final native SVGAngle createSVGAngle() /*-{
                                                  return this.createSVGAngle();
                                                  }-*/;

    public final native SVGPoint createSVGPoint() /*-{
                                                  return this.createSVGPoint();
                                                  }-*/;

    public final native SVGMatrix createSVGMatrix() /*-{
                                                    return this.createSVGMatrix();
                                                    }-*/;

    public final native SVGRect createSVGRect() /*-{
                                                return this.createSVGRect();
                                                }-*/;

    public final native SVGTransform createSVGTransform() /*-{
                                                          return this.createSVGTransform();
                                                          }-*/;

    public final native SVGTransform createSVGTransformFromMatrix(SVGMatrix matrix) /*-{
                                                                                    return this.createSVGTransformFromMatrix(matrix);
                                                                                    }-*/;

    public final native Element getElementById(String elementId) /*-{
                                                                 return this.getElementById(elementId);
                                                                 }-*/;

    public final native SVGAnimatedRect getViewBox() /*-{
                                                     return this.viewBox;
                                                     }-*/;

    public final native void setViewBox(String viewBox) /*-{
                                                        
                                                        this.viewBox = viewBox;
                                                        }-*/;

    public final native SVGAnimatedPreserveAspectRatio getPreserveAspectRatio() /*-{
                                                                                return this.preserveAspectRatio;
                                                                                }-*/;

    public final native void setPreserveAspectRatio(String aspectRatio) /*-{
                                                                        
                                                                        this.preserveAspectRatio = aspectRatio;
                                                                        }-*/;

    public final native short getZoomAndPan() /*-{
                                              return this.zoomAndPan;
                                              }-*/;

    public final native void setZoomAndPan(short zoomAndPan) /*-{
                                                             
                                                             this.zoomAndPan = zoomAndPan;
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
