package gwt.html5.svg.client.user.events;

import com.google.gwt.event.shared.GwtEvent;

public class ZoomEvent extends GwtEvent<ZoomHandler> {
    private static final Type<ZoomHandler> TYPE = new Type<ZoomHandler>();

    public static Type<ZoomHandler> getType() {
        return TYPE;
    }

    @Override
    protected void dispatch(ZoomHandler handler) {
        handler.onZoom(this);
    }

    @Override
    public Type<ZoomHandler> getAssociatedType() {
        return TYPE;
    }
}
