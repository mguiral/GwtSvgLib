package gwt.html5.svg.client.user.ui;

import java.util.List;

import gwt.html5.svg.client.ISVGPolylineElement;
import gwt.html5.svg.client.core.SVGPointList;
import gwt.html5.svg.client.dom.SVGDomHelper;
import gwt.html5.svg.client.dom.SVGPolylineElement;
import gwt.html5.svg.client.user.Point;

public class SVGPolylineWidget extends SVGGraphicalWidget implements ISVGPolylineElement {
    SVGPolylineElement polylineElement;

    public SVGPolylineWidget() {
        polylineElement = SVGPolylineElement.as(SVGDomHelper.createElementNS(SVGPolylineElement.TAG));
        setElement(polylineElement);
    }

    @Override
    public SVGPointList getAnimatedPoints() {
        return polylineElement.getAnimatedPoints();
    }

    @Override
    public SVGPointList getPoints() {
        return polylineElement.getPoints();
    }

    @Override
    public void setPoints(List<Point> points) {
        String pointString = "";
        for (Point point : points) {
            pointString += point.toString() + " ";
        }
        polylineElement.setAttributeNS("points", pointString);
    }
}
