package fr.hd3d.html5.svg.client;

import fr.hd3d.html5.svg.client.core.SVGAnimatedPreserveAspectRatio;
import fr.hd3d.html5.svg.client.core.SVGAnimatedRect;
import fr.hd3d.html5.svg.client.user.PreserveAspectRatio;
import fr.hd3d.html5.svg.client.user.Rectangle;

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
