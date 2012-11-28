package fr.hd3d.html5.svg.client;

import fr.hd3d.html5.svg.client.core.SVGPointList;

public interface ISVGAnimatedPoints {
    /**
     * @return Provides access to the base (i.e., static) contents of the "points" attribute.
     */
    SVGPointList getPoints();

    /**
     * @return Provides access to the current animated contents of the "points" attribute. If the given attribute or
     *         property is being animated, contains the current animated value of the attribute or property. If the
     *         given attribute or property is not currently being animated, contains the same value as points.
     */
    SVGPointList getAnimatedPoints();
}
