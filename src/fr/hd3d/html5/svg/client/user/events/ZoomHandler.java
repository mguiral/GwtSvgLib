package fr.hd3d.html5.svg.client.user.events;

import com.google.gwt.event.shared.EventHandler;

public interface ZoomHandler extends EventHandler {
    void onZoom(ZoomEvent zoomEvent);
}
