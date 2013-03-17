package gwt.html5.svg.client;

import gwt.html5.svg.client.core.SVGElementInstance;

public interface ISVGUseElement extends ISVGGraphicalElement, ISVGURIReference {
    SVGElementInstance getInstanceRoot();

    SVGElementInstance getAnimatedInstanceRoot();
}
