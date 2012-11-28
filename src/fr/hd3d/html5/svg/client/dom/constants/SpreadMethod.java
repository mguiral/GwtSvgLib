package fr.hd3d.html5.svg.client.dom.constants;

import com.google.gwt.dom.client.Style.HasCssName;

public enum SpreadMethod implements HasCssName {
    PAD {
        @Override
        public String getCssName() {
            return "pad";
        }
    },
    REFLECT {
        @Override
        public String getCssName() {
            return "reflect";
        }
    },
    REPEAT {
        @Override
        public String getCssName() {
            return "repeat";
        }
    };
    public abstract String getCssName();
}
