package fr.hd3d.html5.svg.client.user.ui;

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

import fr.hd3d.html5.svg.client.ISVGSymbolElement;
import fr.hd3d.html5.svg.client.core.SVGAnimatedPreserveAspectRatio;
import fr.hd3d.html5.svg.client.core.SVGAnimatedRect;
import fr.hd3d.html5.svg.client.core.SVGAnimatedString;
import fr.hd3d.html5.svg.client.core.SVGStyle;
import fr.hd3d.html5.svg.client.dom.SVGDomHelper;
import fr.hd3d.html5.svg.client.dom.SVGSymboleElement;
import fr.hd3d.html5.svg.client.user.PreserveAspectRatio;
import fr.hd3d.html5.svg.client.user.Rectangle;
import fr.hd3d.html5.svg.client.user.events.ActivateEvent;
import fr.hd3d.html5.svg.client.user.events.ActivateHandler;
import fr.hd3d.html5.svg.client.user.events.HasGraphicalHandlers;

public class SVGSymbolWidget extends BaseSVGWidget implements ISVGSymbolElement, HasGraphicalHandlers {
    SVGSymboleElement symbolElement;

    public SVGSymbolWidget() {
        symbolElement = SVGSymboleElement.as(SVGDomHelper.createElementNS(SVGSymboleElement.TAG));
        setElement(symbolElement);
    }

    @Override
    public boolean getExternalResourcesRequired() {
        return symbolElement.getExternalResourcesRequired().getBaseVal();
    }

    @Override
    public SVGAnimatedString getSVGClassName() {
        return symbolElement.getSVGClassName();
    }

    @Override
    public void setExternalResourcesRequired(boolean externalResourceeRequried) {
        symbolElement.getExternalResourcesRequired().setBaseVal(externalResourceeRequried);
    }

    @Override
    public SVGAnimatedString getClassName() {
        return symbolElement.getSVGClassName();
    }

    @Override
    public SVGStyle getStyle() {
        return symbolElement.getStyle().cast();
    }

    @Override
    public SVGAnimatedPreserveAspectRatio getPreserveAspectRatio() {
        return symbolElement.getPreserveAspectRatio();
    }

    @Override
    public SVGAnimatedRect getViewBox() {
        return symbolElement.getViewBox();
    }

    @Override
    public void setPreserverAspectRatio(PreserveAspectRatio aspectRatio) {
        symbolElement.setAttributeNS("preserveAspectRatio", aspectRatio.getValue());
    }

    @Override
    public void setViewBox(Rectangle viewBox) {
        symbolElement.setAttributeNS("viewBox", viewBox.toString());
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
