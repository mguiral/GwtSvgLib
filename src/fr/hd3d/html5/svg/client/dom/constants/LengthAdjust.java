package fr.hd3d.html5.svg.client.dom.constants;

import com.google.gwt.dom.client.Style.HasCssName;

public enum LengthAdjust implements HasCssName {
    UNKNOWN {
        @Override
        public String getCssName() {
            return "";
        }
    },
    SPACING {
        @Override
        public String getCssName() {
            return "spacing";
        }
    },
    SPACING_AND_GLYPHS {
        @Override
        public String getCssName() {
            return "spacingAndGlyphs";
        }
    };
    public abstract String getCssName();
}
