package fr.hd3d.html5.svg.client.user;

import fr.hd3d.html5.svg.client.dom.constants.PathSeqTypes;

public class LineToVerticalPathData extends PathSegData {
    private float y;

    public LineToVerticalPathData(boolean isAbs, float y) {
        super(isAbs ? PathSeqTypes.LINETO_VERTICAL_ABS : PathSeqTypes.LINETO_VERTICAL_REL);
        this.y = y;
    }

    @Override
    public String getPathData() {
        return "" + y;
    }
}
