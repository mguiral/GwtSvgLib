package gwt.html5.svg.client;

import gwt.html5.svg.client.core.SVGPathSegList;

public interface ISVGAnimatedPathData {
    SVGPathSegList getPathSegList();

    SVGPathSegList getNormalizedPathSegList();

    SVGPathSegList getAnimatedPathSegList();

    SVGPathSegList getAnimatedNormalizedPathSegList();
}
