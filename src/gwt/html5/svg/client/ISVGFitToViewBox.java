package gwt.html5.svg.client;

import gwt.html5.svg.client.core.SVGAnimatedPreserveAspectRatio;
import gwt.html5.svg.client.core.SVGAnimatedRect;
import gwt.html5.svg.client.user.PreserveAspectRatio;
import gwt.html5.svg.client.user.Rectangle;

public interface ISVGFitToViewBox {
    /**
     * @return Corresponds to attribute "viewBox" on the given element.
     */
    public SVGAnimatedRect getViewBox();

    void setViewBox(Rectangle viewBox);

    /**
     * @return Corresponds to attribute "preserveAspectRatio" on the given element.
     */
    public SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();

    public void setPreserverAspectRatio(PreserveAspectRatio aspectRatio);
}
