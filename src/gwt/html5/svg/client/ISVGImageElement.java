package gwt.html5.svg.client;

import gwt.html5.svg.client.core.SVGAnimatedPreserveAspectRatio;
import gwt.html5.svg.client.user.PreserveAspectRatio;

public interface ISVGImageElement extends ISVGGraphicalElement, ISVGURIReference {
    SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();

    void setPreserveAspectRatio(PreserveAspectRatio preserveAspectRatio);
}
