package gwt.html5.svg.client.user.ui;

import java.util.List;

import gwt.html5.svg.client.ISVGPolygonElement;
import gwt.html5.svg.client.core.SVGPointList;
import gwt.html5.svg.client.dom.SVGDomHelper;
import gwt.html5.svg.client.dom.SVGPolygonElement;
import gwt.html5.svg.client.user.Point;

public class SVGPolygonWidget extends SVGGraphicalWidget implements ISVGPolygonElement {
    SVGPolygonElement polygonElement;

    public SVGPolygonWidget() {
        polygonElement = SVGPolygonElement.as(SVGDomHelper.createElementNS(SVGPolygonElement.TAG));
        setElement(polygonElement);
    }

    @Override
    public SVGPointList getAnimatedPoints() {
        return polygonElement.getAnimatedPoints();
    }

    @Override
    public SVGPointList getPoints() {
        return polygonElement.getPoints();
    }

    @Override
    public void setPoints(List<Point> points) {
        String pointString = "";
        for (Point point : points) {
            pointString += point.toString() + " ";
        }
        polygonElement.setAttributeNS("points", pointString);
    }
}
