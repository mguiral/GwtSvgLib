package gwt.html5.svg.client.dom.constants;

import com.google.gwt.dom.client.Style.HasCssName;

public enum PathSeqTypes implements HasCssName {
    UNKNOWN {
        @Override
        public String getCssName() {
            return "";
        }
    },
    CLOSEPATH {
        @Override
        public String getCssName() {
            return "Z";
        }
    },
    MOVETO_ABS {
        @Override
        public String getCssName() {
            return "M";
        }
    },
    MOVETO_REL {
        @Override
        public String getCssName() {
            return "m";
        }
    },
    LINETO_ABS {
        @Override
        public String getCssName() {
            return "L";
        }
    },
    LINETO_REL {
        @Override
        public String getCssName() {
            return "l";
        }
    },
    CURVETO_CUBIC_ABS {
        @Override
        public String getCssName() {
            return "C";
        }
    },
    CURVETO_CUBIC_REL {
        @Override
        public String getCssName() {
            return "c";
        }
    },
    CURVETO_QUADRATIC_ABS {
        @Override
        public String getCssName() {
            return "Q";
        }
    },
    CURVETO_QUADRATIC_REL {
        @Override
        public String getCssName() {
            return "q";
        }
    },
    ARC_ABS {
        @Override
        public String getCssName() {
            return "A";
        }
    },
    ARC_REL {
        @Override
        public String getCssName() {
            return "a";
        }
    },
    LINETO_HORIZONTAL_ABS {
        @Override
        public String getCssName() {
            return "H";
        }
    },
    LINETO_HORIZONTAL_REL {
        @Override
        public String getCssName() {
            return "h";
        }
    },
    LINETO_VERTICAL_ABS {
        @Override
        public String getCssName() {
            return "V";
        }
    },
    LINETO_VERTICAL_REL {
        @Override
        public String getCssName() {
            return "v";
        }
    },
    CURVETO_CUBIC_SMOOTH_ABS {
        @Override
        public String getCssName() {
            return "S";
        }
    },
    CURVETO_CUBIC_SMOOTH_REL {
        @Override
        public String getCssName() {
            return "s";
        }
    },
    CURVETO_QUADRATIC_SMOOTH_ABS {
        @Override
        public String getCssName() {
            return "T";
        }
    },
    CURVETO_QUADRATIC_SMOOTH_REL {
        @Override
        public String getCssName() {
            return "t";
        }
    };
    public abstract String getCssName();
}
