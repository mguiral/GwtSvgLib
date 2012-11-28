package fr.hd3d.html5.svg.client.user;

import fr.hd3d.html5.svg.client.dom.constants.PathSeqTypes;

public class CurveToQuadraticSmoothPathData extends PathSegData {
    private final float x;
    private final float y;

    public CurveToQuadraticSmoothPathData(boolean isAbs, float x, float y) {
        super(isAbs ? PathSeqTypes.CURVETO_QUADRATIC_SMOOTH_ABS : PathSeqTypes.CURVETO_QUADRATIC_SMOOTH_REL);
        this.x = x;
        this.y = y;
    }

    @Override
    public String getPathData() {
        return x + " " + y;
    }
}
