package gwt.html5.svg.client.user;

import gwt.html5.svg.client.dom.constants.PathSeqTypes;

public class CurveToCubicSmoothPathData extends PathSegData {
    private final float x;
    private final float y;
    private final float x2;
    private final float y2;

    public CurveToCubicSmoothPathData(boolean isAbs, float x2, float y2, float x, float y) {
        super(isAbs ? PathSeqTypes.CURVETO_CUBIC_SMOOTH_ABS : PathSeqTypes.CURVETO_CUBIC_SMOOTH_REL);
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public String getPathData() {
        return x2 + " " + y2 + " " + x + " " + y;
    }
}
