package gwt.html5.svg.client.user.ui;

import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.html5.svg.client.ISVGElement;
import gwt.html5.svg.client.core.SVGAnimatedString;
import gwt.html5.svg.client.dom.PresentationStyle;
import gwt.html5.svg.client.dom.SVGElement;
import gwt.html5.svg.client.dom.SVGSVGElement;

public abstract class BaseSVGWidget extends ComplexPanel implements ISVGElement {
    private SVGElement element;
    private HandlerManager svgHandlerManager;
    private PresentationStyle presentationStyle = null;

    public PresentationStyle getPresentationStyle() {
        return presentationStyle;
    }

    @Override
    protected void setElement(Element elem) {
        super.setElement(elem);
        this.element = elem.cast();
        this.presentationStyle = new PresentationStyle(this.element);
    }

    public SVGElement getSVGElement() {
        return this.element;
    }

    @Override
    public String getXmlLang() {
        return element.getXmlLang();
    }

    @Override
    public String getXmlSpace() {
        return element.getXmlSpace();
    }

    @Override
    public void setXmlLang(String value) {
        element.setXmlLang(value);
    }

    @Override
    public void setXmlSpace(String value) {
        element.setXmlSpace(value);
    }

    @Override
    public SVGSVGElement getOwnerSVGElement() {
        return this.element.getOwnerSVGElement();
    }

    @Override
    public SVGElement getViewportElement() {
        return this.element.getViewportElement();
    }

    @Override
    public String getXmlBase() {
        return this.element.getXmlBase();
    }

    @Override
    public void setXmlBase(String xmlBase) {
        this.element.setXmlBase(xmlBase);
    }

    /**
     * This function is call in JNI code to dispatch {@link GwtEvent}
     * 
     * @param event
     */
    public void fireEvent(Object event) {
        if (event instanceof GwtEvent<?>) {
            GwtEvent<?> gwtEvent = (GwtEvent<?>) event;
            if (svgHandlerManager != null) {
                svgHandlerManager.fireEvent(gwtEvent);
            }
        }
    }

    @Override
    public void add(Widget child) {
        super.add(child, this.getElement());
    }

    public HandlerManager getSvgHandlerManager() {
        return svgHandlerManager;
    }

    @Override
    public String toString() {
        DivElement createDivElement = Document.get().createDivElement();
        createDivElement.appendChild(this.element.cloneNode(true));
        return createDivElement.getInnerHTML();
    }

    /**
     * JNI for event handlers
     */
    protected final native void addAbortEventHandler() /*-{
                                                       var svgElement = this.@gwt.html5.svg.client.user.ui.BaseSVGWidget::element;
                                                       var svgWidget = this;
                                                       svgElement.addEventListener('abort', function(){
                                                       var event = @gwt.html5.svg.client.user.events.AbortEvent::new()();
                                                       svgWidget.@gwt.html5.svg.client.user.ui.BaseSVGWidget::fireEvent(Ljava/lang/Object;)(event);
                                                       }, true);
                                                       }-*/;

    protected final native void addActivateEventHandler() /*-{
                                                          var svgElement = this.@gwt.html5.svg.client.user.ui.BaseSVGWidget::element;
                                                          var svgWidget = this;
                                                          svgElement.addEventListener('activate', function(){
                                                          var event = @gwt.html5.svg.client.user.events.ActivateEvent::new()();
                                                          svgWidget.@gwt.html5.svg.client.user.ui.BaseSVGWidget::fireEvent(Ljava/lang/Object;)(event);
                                                          }, true);
                                                          }-*/;

    protected final native void addZoomEventHandler() /*-{
                                                      var svgElement = this.@gwt.html5.svg.client.user.ui.BaseSVGWidget::element;
                                                      var svgWidget = this;
                                                      svgElement.addEventListener('zoom', function(){
                                                      var event = @gwt.html5.svg.client.user.events.ZoomEvent::new()();
                                                      svgWidget.@gwt.html5.svg.client.user.ui.BaseSVGWidget::fireEvent(Ljava/lang/Object;)(event);
                                                      }, true);
                                                      }-*/;

    @Override
    public SVGAnimatedString getSVGClassName() {
        return this.element.getSVGClassName();
    }

    @Override
    public boolean getExternalResourcesRequired() {
        return element.getExternalResourcesRequired().getBaseVal();
    }

    @Override
    public void setExternalResourcesRequired(boolean externalResourceeRequried) {
        element.getExternalResourcesRequired().setBaseVal(externalResourceeRequried);
    }
}
