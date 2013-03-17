package gwt.html5.svg.client.user.events;

import com.google.gwt.event.shared.GwtEvent;

public class AbortEvent extends GwtEvent<AbortHandler> {
    private static final Type<AbortHandler> TYPE = new Type<AbortHandler>();

    @Override
    protected void dispatch(AbortHandler handler) {
        handler.onAbort(this);
    }

    public static Type<AbortHandler> getType() {
        return TYPE;
    }

    @Override
    public Type<AbortHandler> getAssociatedType() {
        return TYPE;
    }
}
