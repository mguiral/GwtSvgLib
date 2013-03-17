package gwt.html5.svg.client.user;

import gwt.html5.svg.client.dom.constants.PathSeqTypes;

public class CurveToCubicPathData extends PathSegData {
    private final float x;
    private final float y;
    private final float x1;
    private final float y1;
    private final float x2;
    private final float y2;

    public CurveToCubicPathData(boolean isAbs, float x1, float y1, float x2, float y2, float x, float y) {
        super(isAbs ? PathSeqTypes.CURVETO_CUBIC_ABS : PathSeqTypes.CURVETO_CUBIC_REL);
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public String getPathData() {
        return x1 + " " + y1 + " " + x2 + " " + y2 + " " + x + " " + y;
    }
}
