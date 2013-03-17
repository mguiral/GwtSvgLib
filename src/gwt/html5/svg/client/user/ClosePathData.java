package gwt.html5.svg.client.user;

import gwt.html5.svg.client.dom.constants.PathSeqTypes;

public class ClosePathData extends PathSegData {
    public ClosePathData() {
        super(PathSeqTypes.CLOSEPATH);
    }

    @Override
    public String getPathData() {
        throw new UnsupportedOperationException("Please use getPathDataWithPrefix() instead");
    }

    @Override
    public String getPathDataWithPrefix() {
        return getPathSeqType().getCssName();
    }
}
