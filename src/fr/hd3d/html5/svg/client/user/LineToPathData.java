package fr.hd3d.html5.svg.client.user;

import fr.hd3d.html5.svg.client.dom.constants.PathSeqTypes;

public class LineToPathData extends PathSegData {
    private float x;
    private float y;

    public LineToPathData(boolean isAbs, float x, float y) {
        super(isAbs ? PathSeqTypes.LINETO_ABS : PathSeqTypes.LINETO_REL);
        this.x = x;
        this.y = y;
    }

    @Override
    public String getPathData() {
        return x + " " + y;
    }
}
