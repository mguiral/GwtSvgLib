package fr.hd3d.html5.svg.client;

import fr.hd3d.html5.svg.client.core.SVGPathSegList;

public interface ISVGAnimatedPathData {
    SVGPathSegList getPathSegList();

    SVGPathSegList getNormalizedPathSegList();

    SVGPathSegList getAnimatedPathSegList();

    SVGPathSegList getAnimatedNormalizedPathSegList();
}
