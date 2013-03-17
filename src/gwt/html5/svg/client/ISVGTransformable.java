package gwt.html5.svg.client;

import java.util.List;

import gwt.html5.svg.client.core.SVGAnimatedTransformList;
import gwt.html5.svg.client.user.Transform;

public interface ISVGTransformable extends ISVGLocatable {
    public SVGAnimatedTransformList getTransform();

    public void setTransform(List<Transform> transformList);

    public void setTransform(Transform transform);
}
