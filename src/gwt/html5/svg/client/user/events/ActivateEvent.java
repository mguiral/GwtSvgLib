package gwt.html5.svg.client.user.events;

import com.google.gwt.event.shared.GwtEvent;

public class ActivateEvent extends GwtEvent<ActivateHandler> {
    private static final Type<ActivateHandler> TYPE = new Type<ActivateHandler>();

    public static Type<ActivateHandler> getType() {
        return TYPE;
    }

    @Override
    protected void dispatch(ActivateHandler handler) {
        handler.onActivate(this);
    }

    @Override
    public Type<ActivateHandler> getAssociatedType() {
        return TYPE;
    }
}
