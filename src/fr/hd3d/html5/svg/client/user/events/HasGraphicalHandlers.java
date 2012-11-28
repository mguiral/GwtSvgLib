package fr.hd3d.html5.svg.client.user.events;

import com.google.gwt.event.dom.client.HasBlurHandlers;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.HasFocusHandlers;
import com.google.gwt.event.dom.client.HasLoadHandlers;
import com.google.gwt.event.dom.client.HasMouseDownHandlers;
import com.google.gwt.event.dom.client.HasMouseMoveHandlers;
import com.google.gwt.event.dom.client.HasMouseOutHandlers;
import com.google.gwt.event.dom.client.HasMouseOverHandlers;
import com.google.gwt.event.dom.client.HasMouseUpHandlers;

public interface HasGraphicalHandlers extends HasFocusHandlers, HasBlurHandlers, HasActivateHandlers, HasClickHandlers, HasMouseDownHandlers,
        HasMouseUpHandlers, HasMouseOverHandlers, HasMouseMoveHandlers, HasMouseOutHandlers, HasLoadHandlers {
}
