package fr.hd3d.html5.svg.client.user;

import fr.hd3d.html5.svg.client.dom.constants.PathSeqTypes;

public class LineToHorizontalPathData extends PathSegData {
    private float x;

    public LineToHorizontalPathData(boolean isAbs, float x) {
        super(isAbs ? PathSeqTypes.LINETO_HORIZONTAL_ABS : PathSeqTypes.LINETO_HORIZONTAL_REL);
        this.x = x;
    }

    @Override
    public String getPathData() {
        return "" + x;
    }
}
