package gwt.html5.svg.client;

import java.util.List;

import gwt.html5.svg.client.core.SVGPointList;
import gwt.html5.svg.client.user.Point;

public interface ISVGPolylineElement extends ISVGGraphicalElement {
    /**
     * @return The points that make up the polyline. All coordinate values are in the user coordinate system.
     */
    SVGPointList getPoints();

    /**
     * @param points
     *            The points that make up the polyline. All coordinate values are in the user coordinate system.
     */
    void setPoints(List<Point> points);

    /**
     * @return The points that make up the polyline. All coordinate values are in the user coordinate system.
     */
    SVGPointList getAnimatedPoints();
}
