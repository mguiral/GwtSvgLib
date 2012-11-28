package fr.hd3d.html5.svg.client.user;

import fr.hd3d.html5.svg.client.dom.constants.PathSeqTypes;

public class CurveToQuadraticPathData extends PathSegData {
    private final float x;
    private final float y;
    private final float x1;
    private final float y1;

    public CurveToQuadraticPathData(boolean isAbs, float x1, float y1, float x, float y) {
        super(isAbs ? PathSeqTypes.CURVETO_QUADRATIC_ABS : PathSeqTypes.CURVETO_QUADRATIC_REL);
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
    }

    @Override
    public String getPathData() {
        return x1 + " " + y1 + " " + x + " " + y;
    }
}
