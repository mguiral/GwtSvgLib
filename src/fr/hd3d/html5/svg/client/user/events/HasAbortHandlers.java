package fr.hd3d.html5.svg.client.user.events;

import com.google.gwt.event.shared.HandlerRegistration;

public interface HasAbortHandlers {
    HandlerRegistration addAbortHandler(AbortHandler abortHandler);
}
