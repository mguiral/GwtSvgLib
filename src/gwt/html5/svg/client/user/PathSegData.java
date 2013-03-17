package gwt.html5.svg.client.user;

import gwt.html5.svg.client.dom.constants.PathSeqTypes;

public abstract class PathSegData {
    private PathSeqTypes pathSeqTypes;

    public PathSegData(PathSeqTypes types) {
        this.pathSeqTypes = types;
    }

    public PathSeqTypes getPathSeqType() {
        return pathSeqTypes;
    }

    public abstract String getPathData();

    public String getPathDataWithPrefix() {
        return this.pathSeqTypes.getCssName() + getPathData();
    }
}
