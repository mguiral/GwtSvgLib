package gwt.html5.svg.client.user;

import gwt.html5.svg.client.dom.constants.PathSeqTypes;

public class ArcPathData extends PathSegData {
    private final float rx;
    private final float ry;
    private final float angle;
    private final boolean isLargeArcFlag;
    private final boolean isSweepFlag;
    private final float x;
    private final float y;

    public ArcPathData(boolean isAbs, float rx, float ry, float angle, boolean isLargeArcFlag, boolean isSweepFlag, float x, float y) {
        super(isAbs ? PathSeqTypes.ARC_ABS : PathSeqTypes.ARC_REL);
        this.x = x;
        this.y = y;
        this.rx = rx;
        this.ry = ry;
        this.angle = angle;
        this.isLargeArcFlag = isLargeArcFlag;
        this.isSweepFlag = isSweepFlag;
    }

    @Override
    public String getPathData() {
        return rx + " " + ry + " " + angle + " " + (isLargeArcFlag ? 1 : 0) + " " + (isSweepFlag ? 1 : 0) + " " + x + " " + y;
    }
}
