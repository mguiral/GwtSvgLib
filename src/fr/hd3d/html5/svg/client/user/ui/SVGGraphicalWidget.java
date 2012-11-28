package fr.hd3d.html5.svg.client.user.ui;

import java.util.List;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.event.dom.client.LoadEvent;
import com.google.gwt.event.dom.client.LoadHandler;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.Element;

import fr.hd3d.html5.svg.client.ISVGGraphicalElement;
import fr.hd3d.html5.svg.client.core.SVGAnimatedString;
import fr.hd3d.html5.svg.client.core.SVGAnimatedTransformList;
import fr.hd3d.html5.svg.client.core.SVGMatrix;
import fr.hd3d.html5.svg.client.core.SVGRect;
import fr.hd3d.html5.svg.client.core.SVGStyle;
import fr.hd3d.html5.svg.client.dom.SVGElement;
import fr.hd3d.html5.svg.client.dom.SVGGraphicalElement;
import fr.hd3d.html5.svg.client.user.Transform;
import fr.hd3d.html5.svg.client.user.events.ActivateEvent;
import fr.hd3d.html5.svg.client.user.events.ActivateHandler;
import fr.hd3d.html5.svg.client.user.events.HasGraphicalHandlers;

public abstract class SVGGraphicalWidget extends ConditionnalProcessinsSVGWidget implements ISVGGraphicalElement, HasGraphicalHandlers {
    SVGGraphicalElement shapeElement;

    @Override
    protected void setElement(Element elem) {
        super.setElement(elem);
        this.shapeElement = elem.cast();
    }

    @Override
    public boolean getExternalResourcesRequired() {
        return shapeElement.getExternalResourcesRequired().getBaseVal();
    }

    @Override
    public void setExternalResourcesRequired(boolean externalResourceeRequried) {
        shapeElement.getExternalResourcesRequired().setBaseVal(externalResourceeRequried);
    }

    @Override
    public SVGAnimatedString getClassName() {
        return shapeElement.getSVGClassName();
    }

    @Override
    public SVGAnimatedString getSVGClassName() {
        return shapeElement.getSVGClassName();
    }

    @Override
    public SVGStyle getStyle() {
        return shapeElement.getStyle().cast();
    }

    @Override
    public SVGAnimatedTransformList getTransform() {
        return shapeElement.getTransform();
    }

    public void setTransform(List<Transform> transformList) {
        String transFormString = "";
        for (Transform transform : transformList) {
            transFormString += transform.getTransform() + " ";
        }
        shapeElement.setAttributeNS("transform", transFormString);
    }

    public void setTransform(Transform transform) {
        shapeElement.setAttributeNS("transform", transform.getTransform());
    }

    @Override
    public SVGRect getBoundingBox() {
        return shapeElement.getBBox();
    }

    @Override
    public SVGMatrix getCTM() {
        return shapeElement.getCTM();
    }

    @Override
    public SVGElement getFarthestViewportElement() {
        return shapeElement.getFarthestViewportElement();
    }

    @Override
    public SVGElement getNearestViewportElement() {
        return shapeElement.getNearestViewportElement();
    }

    @Override
    public SVGMatrix getScreenCTM() {
        return shapeElement.getScreenCTM();
    }

    @Override
    public SVGMatrix getTransformToElement(SVGElement element) {
        return shapeElement.getTransformToElement(element);
    }

    @Override
    public void setStyleName(String style) {
        this.getClassName().setBaseVal(style);
    }

    @Override
    public HandlerRegistration addFocusHandler(FocusHandler handler) {
        return addDomHandler(handler, FocusEvent.getType());
    }

    @Override
    public HandlerRegistration addBlurHandler(BlurHandler handler) {
        return addDomHandler(handler, BlurEvent.getType());
    }

    @Override
    public HandlerRegistration addActivateHandler(ActivateHandler handler) {
        HandlerRegistration handlerRegistration = getSvgHandlerManager().addHandler(ActivateEvent.getType(), handler);
        addActivateEventHandler();
        return handlerRegistration;
    }

    @Override
    public HandlerRegistration addClickHandler(ClickHandler handler) {
        return addDomHandler(handler, ClickEvent.getType());
    }

    @Override
    public HandlerRegistration addMouseDownHandler(MouseDownHandler handler) {
        return addDomHandler(handler, MouseDownEvent.getType());
    }

    @Override
    public HandlerRegistration addMouseUpHandler(MouseUpHandler handler) {
        return addDomHandler(handler, MouseUpEvent.getType());
    }

    @Override
    public HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {
        return addDomHandler(handler, MouseOverEvent.getType());
    }

    @Override
    public HandlerRegistration addMouseMoveHandler(MouseMoveHandler handler) {
        return addDomHandler(handler, MouseMoveEvent.getType());
    }

    @Override
    public HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
        return addDomHandler(handler, MouseOutEvent.getType());
    }

    @Override
    public HandlerRegistration addLoadHandler(LoadHandler handler) {
        return addDomHandler(handler, LoadEvent.getType());
    }
}
