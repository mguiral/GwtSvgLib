package fr.hd3d.html5.svg.client.user.events;

import com.google.gwt.event.dom.client.HasErrorHandlers;
import com.google.gwt.event.dom.client.HasLoadHandlers;
import com.google.gwt.event.dom.client.HasScrollHandlers;
import com.google.gwt.event.logical.shared.HasResizeHandlers;

public interface HasDocumentHandlers extends HasLoadHandlers, HasAbortHandlers, HasErrorHandlers, HasResizeHandlers, HasScrollHandlers,
        HasZoomHandlers {
}
