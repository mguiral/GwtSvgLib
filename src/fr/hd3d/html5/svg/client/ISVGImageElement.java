package fr.hd3d.html5.svg.client;

import fr.hd3d.html5.svg.client.core.SVGAnimatedPreserveAspectRatio;
import fr.hd3d.html5.svg.client.user.PreserveAspectRatio;

public interface ISVGImageElement extends ISVGGraphicalElement, ISVGURIReference {
    SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();

    void setPreserveAspectRatio(PreserveAspectRatio preserveAspectRatio);
}
