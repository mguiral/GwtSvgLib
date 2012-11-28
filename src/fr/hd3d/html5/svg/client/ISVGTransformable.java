package fr.hd3d.html5.svg.client;

import java.util.List;

import fr.hd3d.html5.svg.client.core.SVGAnimatedTransformList;
import fr.hd3d.html5.svg.client.user.Transform;

public interface ISVGTransformable extends ISVGLocatable {
    public SVGAnimatedTransformList getTransform();

    public void setTransform(List<Transform> transformList);

    public void setTransform(Transform transform);
}
