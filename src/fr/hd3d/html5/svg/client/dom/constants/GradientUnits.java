package fr.hd3d.html5.svg.client.dom.constants;

import com.google.gwt.dom.client.Style.HasCssName;

public enum GradientUnits implements HasCssName {
    USER_SPACE_ON_USE {
        @Override
        public String getCssName() {
            return "userSpaceOnUse";
        }
    },
    OBJECT_BOUNDING_BOX {
        @Override
        public String getCssName() {
            return "objectBoundingBox";
        }
    };
    public abstract String getCssName();
}
