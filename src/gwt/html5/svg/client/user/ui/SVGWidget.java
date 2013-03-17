package gwt.html5.svg.client.user.ui;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ErrorEvent;
import com.google.gwt.event.dom.client.ErrorHandler;
import com.google.gwt.event.dom.client.LoadEvent;
import com.google.gwt.event.dom.client.LoadHandler;
import com.google.gwt.event.dom.client.ScrollEvent;
import com.google.gwt.event.dom.client.ScrollHandler;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

import gwt.html5.svg.client.ISVGSVGElement;
import gwt.html5.svg.client.core.SVGAngle;
import gwt.html5.svg.client.core.SVGAnimatedLength;
import gwt.html5.svg.client.core.SVGAnimatedPreserveAspectRatio;
import gwt.html5.svg.client.core.SVGAnimatedRect;
import gwt.html5.svg.client.core.SVGAnimatedString;
import gwt.html5.svg.client.core.SVGLength;
import gwt.html5.svg.client.core.SVGMatrix;
import gwt.html5.svg.client.core.SVGNumber;
import gwt.html5.svg.client.core.SVGPoint;
import gwt.html5.svg.client.core.SVGRect;
import gwt.html5.svg.client.core.SVGStyle;
import gwt.html5.svg.client.core.SVGTransform;
import gwt.html5.svg.client.core.SVGViewSpec;
import gwt.html5.svg.client.dom.SVGDomHelper;
import gwt.html5.svg.client.dom.SVGElement;
import gwt.html5.svg.client.dom.SVGSVGElement;
import gwt.html5.svg.client.dom.constants.ZoomAndPanValue;
import gwt.html5.svg.client.user.PreserveAspectRatio;
import gwt.html5.svg.client.user.Rectangle;
import gwt.html5.svg.client.user.events.AbortEvent;
import gwt.html5.svg.client.user.events.AbortHandler;
import gwt.html5.svg.client.user.events.HasDocumentHandlers;
import gwt.html5.svg.client.user.events.ZoomEvent;
import gwt.html5.svg.client.user.events.ZoomHandler;

/**
 * An SVG document fragment consists of any number of SVG elements contained within an "svg" element.
 * 
 * @author michael.guiral
 * 
 */
public abstract class SVGWidget extends ConditionnalProcessinsSVGWidget implements ISVGSVGElement, HasDocumentHandlers, HasHandlers {
    private SVGSVGElement svgElement;

    public SVGWidget() {
        svgElement = SVGSVGElement.as(SVGDomHelper.createElementNS(SVGSVGElement.TAG));
        setElement(svgElement);
    }

    @Override
    public boolean getExternalResourcesRequired() {
        return svgElement.getExternalResourcesRequired().getBaseVal();
    }

    @Override
    public SVGAnimatedString getClassName() {
        return svgElement.getSVGClassName();
    }

    @Override
    public SVGStyle getStyle() {
        return svgElement.getStyle().cast();
    }

    @Override
    public SVGRect getBoundingBox() {
        return svgElement.getBBox();
    }

    @Override
    public SVGMatrix getCTM() {
        return svgElement.getCTM();
    }

    @Override
    public SVGElement getFarthestViewportElement() {
        return svgElement.getFarthestViewportElement();
    }

    @Override
    public SVGElement getNearestViewportElement() {
        return svgElement.getNearestViewportElement();
    }

    @Override
    public SVGMatrix getScreenCTM() {
        return svgElement.getScreenCTM();
    }

    @Override
    public SVGMatrix getTransformToElement(SVGElement element) {
        return svgElement.getTransformToElement(element);
    }

    @Override
    public SVGAnimatedPreserveAspectRatio getPreserveAspectRatio() {
        return svgElement.getPreserveAspectRatio();
    }

    @Override
    public SVGAnimatedRect getViewBox() {
        return svgElement.getViewBox();
    }

    @Override
    public ZoomAndPanValue getZoomAndPan() {
        return ZoomAndPanValue.values()[svgElement.getZoomAndPan()];
    }

    @Override
    public boolean checkEnclosure(SVGElement element, SVGRect rect) {
        return svgElement.checkEnclosure(element, rect);
    }

    @Override
    public boolean checkIntersection(SVGElement element, SVGRect rect) {
        return svgElement.checkIntersection(element, rect);
    }

    @Override
    public SVGAngle createSVGAngle() {
        return svgElement.createSVGAngle();
    }

    @Override
    public SVGLength createSVGLength() {
        return svgElement.createSVGLength();
    }

    @Override
    public SVGMatrix createSVGMatrix() {
        return svgElement.createSVGMatrix();
    }

    @Override
    public SVGNumber createSVGNumber() {
        return svgElement.createSVGNumber();
    }

    @Override
    public SVGPoint createSVGPoint() {
        return svgElement.createSVGPoint();
    }

    @Override
    public SVGRect createSVGRect() {
        return svgElement.createSVGRect();
    }

    @Override
    public SVGTransform createSVGTransform() {
        return svgElement.createSVGTransform();
    }

    @Override
    public SVGTransform createSVGTransformFromMatrix(SVGMatrix matrix) {
        return svgElement.createSVGTransformFromMatrix(matrix);
    }

    @Override
    public void deselectAll() {
        svgElement.deselectAll();
    }

    @Override
    public void forceRedraw() {
        svgElement.forceRedraw();
    }

    @Override
    public String getContentScriptType() {
        return svgElement.getContentScriptType();
    }

    @Override
    public String getContentStyleType() {
        return svgElement.getContentStyleType();
    }

    @Override
    public float getCurrentScale() {
        return svgElement.getCurrentScale();
    }

    @Override
    public float getCurrentTime() {
        return svgElement.getCurrentTime();
    }

    @Override
    public SVGPoint getCurrentTranslate() {
        return svgElement.getCurrentTranslate();
    }

    @Override
    public SVGViewSpec getCurrentView() {
        return svgElement.getCurrentView();
    }

    @Override
    public Element getElementById(String elementId) {
        return svgElement.getElementById(elementId);
    }

    @Override
    public NodeList<? extends Node> getEnclosureList(SVGRect rect, SVGElement referenceElement) {
        return svgElement.getEnclosureList(rect, referenceElement);
    }

    @Override
    public SVGAnimatedLength getHeight() {
        return svgElement.getHeight();
    }

    @Override
    public NodeList<? extends Node> getIntersectionList(SVGRect rect, SVGElement referenceElement) {
        return svgElement.getIntersectionList(rect, referenceElement);
    }

    @Override
    public float getPixelUnitToMillimeterX() {
        return svgElement.getPixelUnitToMillimeterX();
    }

    @Override
    public float getPixelUnitToMillimeterY() {
        return svgElement.getPixelUnitToMillimeterY();
    }

    @Override
    public float getScreenPixelToMillimeterX() {
        return svgElement.getScreenPixelToMillimeterX();
    }

    @Override
    public float getScreenPixelToMillimeterY() {
        return svgElement.getScreenPixelToMillimeterY();
    }

    @Override
    public SVGRect getViewport() {
        return svgElement.getViewport();
    }

    @Override
    public SVGAnimatedLength getWidth() {
        return svgElement.getWidth();
    }

    @Override
    public SVGAnimatedLength getX() {
        return svgElement.getX();
    }

    @Override
    public SVGAnimatedLength getY() {
        return svgElement.getY();
    }

    @Override
    public boolean isAnimationsPaused() {
        return svgElement.isAnimationsPaused();
    }

    @Override
    public boolean isUseCurrentView() {
        return svgElement.isUseCurrentView();
    }

    @Override
    public void pauseAnimations() {
        svgElement.pauseAnimations();
    }

    @Override
    public void setContentScriptType(String value) {
        svgElement.setContentScriptType(value);
    }

    @Override
    public void setContentStyleType(String value) {
        svgElement.setContentStyleType(value);
    }

    @Override
    public void setCurrentScale(float value) {
        svgElement.setCurrentScale(value);
    }

    @Override
    public void setCurrentTime(float seconds) {
        svgElement.setCurrentTime(seconds);
    }

    @Override
    public int suspendRedraw(int maxWaitMilliseconds) {
        return svgElement.suspendRedraw(maxWaitMilliseconds);
    }

    @Override
    public void unpauseAnimations() {
        svgElement.unpauseAnimations();
    }

    @Override
    public void unsuspendRedraw(int suspendHandleId) {
        svgElement.unsuspendRedraw(suspendHandleId);
    }

    @Override
    public void unsuspendRedrawAll() {
        svgElement.unsuspendRedrawAll();
    }

    @Override
    public HandlerRegistration addAbortHandler(AbortHandler abortHandler) {
        HandlerRegistration handlerRegistration = getSvgHandlerManager().addHandler(AbortEvent.getType(), abortHandler);
        addAbortEventHandler();
        return handlerRegistration;
    }

    @Override
    public HandlerRegistration addErrorHandler(ErrorHandler handler) {
        return addDomHandler(handler, ErrorEvent.getType());
    }

    @Override
    public HandlerRegistration addResizeHandler(ResizeHandler handler) {
        return addHandler(handler, ResizeEvent.getType());
    }

    @Override
    public HandlerRegistration addScrollHandler(ScrollHandler handler) {
        return addDomHandler(handler, ScrollEvent.getType());
    }

    @Override
    public HandlerRegistration addZoomHandler(ZoomHandler zoomHandler) {
        HandlerRegistration handlerRegistration = getSvgHandlerManager().addHandler(ZoomEvent.getType(), zoomHandler);
        addZoomEventHandler();
        return handlerRegistration;
    }

    @Override
    public HandlerRegistration addLoadHandler(LoadHandler handler) {
        return addDomHandler(handler, LoadEvent.getType());
    }

    @Override
    public void setHeight(int height, Unit unit) {
        svgElement.setHeight(height + unit.getType());
    }

    @Override
    public void setWidth(int width, Unit unit) {
        svgElement.setWidth(width + unit.getType());
    }

    @Override
    public void setX(int x, Unit unit) {
        svgElement.setX(x + unit.getType());
    }

    @Override
    public void setY(int y, Unit unit) {
        svgElement.setY(y + unit.getType());
    }

    @Override
    public void setPreserverAspectRatio(PreserveAspectRatio aspectRatio) {
        svgElement.setPreserveAspectRatio(aspectRatio.getValue());
    }

    @Override
    public void setViewBox(Rectangle viewBox) {
        svgElement.setAttributeNS("viewBox", viewBox.toString());
    }

    @Override
    public void setExternalResourcesRequired(boolean externalResourceeRequried) {
        svgElement.getExternalResourcesRequired().setBaseVal(externalResourceeRequried);
    }

    @Override
    public SVGAnimatedString getSVGClassName() {
        return svgElement.getSVGClassName();
    }
}
