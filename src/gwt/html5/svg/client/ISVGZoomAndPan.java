package gwt.html5.svg.client;

import gwt.html5.svg.client.dom.constants.ZoomAndPanValue;

public interface ISVGZoomAndPan {
    /**
     * @return Corresponds to attribute "zoomAndPan" on the given element. The value must be one of the
     *         {@link ZoomAndPanValue} constants.
     */
    public ZoomAndPanValue getZoomAndPan();
}
