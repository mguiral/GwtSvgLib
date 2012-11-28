package fr.hd3d.html5.svg.client;

import fr.hd3d.html5.svg.client.core.SVGElementInstance;

public interface ISVGUseElement extends ISVGGraphicalElement, ISVGURIReference {
    SVGElementInstance getInstanceRoot();

    SVGElementInstance getAnimatedInstanceRoot();
}
