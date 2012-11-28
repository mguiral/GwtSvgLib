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

import fr.hd3d.html5.svg.client.ISVGSwitchElement;
import fr.hd3d.html5.svg.client.core.SVGAnimatedString;
import fr.hd3d.html5.svg.client.core.SVGAnimatedTransformList;
import fr.hd3d.html5.svg.client.core.SVGMatrix;
import fr.hd3d.html5.svg.client.core.SVGRect;
import fr.hd3d.html5.svg.client.core.SVGStyle;
import fr.hd3d.html5.svg.client.dom.SVGDomHelper;
import fr.hd3d.html5.svg.client.dom.SVGElement;
import fr.hd3d.html5.svg.client.dom.SVGSwitchElement;
import fr.hd3d.html5.svg.client.user.Transform;
import fr.hd3d.html5.svg.client.user.events.ActivateEvent;
import fr.hd3d.html5.svg.client.user.events.ActivateHandler;
import fr.hd3d.html5.svg.client.user.events.HasGraphicalHandlers;

public class SVGSwitchWidget extends ConditionnalProcessinsSVGWidget implements ISVGSwitchElement, HasGraphicalHandlers {
    SVGSwitchElement switchElement;

    public SVGSwitchWidget() {
        switchElement = SVGSwitchElement.as(SVGDomHelper.createElementNS(SVGSwitchElement.TAG));
        setElement(switchElement);
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

    @Override
    public SVGAnimatedString getSVGClassName() {
        return switchElement.getSVGClassName();
    }

    @Override
    public boolean getExternalResourcesRequired() {
        return switchElement.getExternalResourcesRequired().getBaseVal();
    }

    @Override
    public void setExternalResourcesRequired(boolean externalResourceeRequried) {
        switchElement.getExternalResourcesRequired().setBaseVal(externalResourceeRequried);
    }

    @Override
    public SVGAnimatedString getClassName() {
        return switchElement.getSVGClassName();
    }

    @Override
    public SVGStyle getStyle() {
        return switchElement.getStyle().cast();
    }

    @Override
    public SVGAnimatedTransformList getTransform() {
        return switchElement.getTransform();
    }

    @Override
    public void setTransform(List<Transform> transformList) {
        String transformString = "";
        for (Transform transform : transformList) {
            transformString += transform.getTransform();
        }
        switchElement.setAttributeNS("transform", transformString);
    }

    public void setTransform(Transform transform) {
        switchElement.setAttributeNS("transform", transform.getTransform());
    }

    @Override
    public SVGRect getBoundingBox() {
        return switchElement.getBBox();
    }

    @Override
    public SVGMatrix getCTM() {
        return switchElement.getCTM();
    }

    @Override
    public SVGElement getFarthestViewportElement() {
        return switchElement.getFarthestViewportElement();
    }

    @Override
    public SVGElement getNearestViewportElement() {
        return switchElement.getNearestViewportElement();
    }

    @Override
    public SVGMatrix getScreenCTM() {
        return switchElement.getScreenCTM();
    }

    @Override
    public SVGMatrix getTransformToElement(SVGElement element) {
        return switchElement.getTransformToElement(element);
    }
}
