package gwt.html5.svg.client.core;

public class SVGPathSegCurvetoCubicSmoothRel extends SVGPathSegCurvetoCubicSmoothBase {
    protected SVGPathSegCurvetoCubicSmoothRel() {
    }

    public final String getPathData() {
        return getX2() + " " + getY2() + " " + this.getX() + " " + this.getY();
    }
}
