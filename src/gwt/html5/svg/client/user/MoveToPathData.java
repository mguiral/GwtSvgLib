package gwt.html5.svg.client.user;

import gwt.html5.svg.client.dom.constants.PathSeqTypes;

public class MoveToPathData extends PathSegData {
    private float x;
    private float y;

    public MoveToPathData(boolean isAbs, float x, float y) {
        super(isAbs ? PathSeqTypes.MOVETO_ABS : PathSeqTypes.MOVETO_REL);
        this.x = x;
        this.y = y;
    }

    @Override
    public String getPathData() {
        return x + " " + y;
    }
}
