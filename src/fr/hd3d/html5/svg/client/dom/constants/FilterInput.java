package fr.hd3d.html5.svg.client.dom.constants;

import com.google.gwt.dom.client.Style.HasCssName;

public enum FilterInput implements HasCssName {
    SOURCE_GRAPHIC {
        @Override
        public String getCssName() {
            return "SourceGraphic";
        }
    },
    SOURCE_ALPHA {
        @Override
        public String getCssName() {
            return "SourceAlpha";
        }
    },
    BACKGROUND_IMAGE {
        @Override
        public String getCssName() {
            return "BackgroundImage";
        }
    },
    BACKGROUND_ALPHA {
        @Override
        public String getCssName() {
            return "BackgroundAlpha";
        }
    },
    FILL_PAINT {
        @Override
        public String getCssName() {
            return "FillPaint";
        }
    },
    STROKE_PAINT {
        @Override
        public String getCssName() {
            return "StrokePaint";
        }
    };
    public abstract String getCssName();
}
