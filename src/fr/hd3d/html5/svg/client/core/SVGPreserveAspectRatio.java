package fr.hd3d.html5.svg.client.core;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Style.HasCssName;

public class SVGPreserveAspectRatio extends JavaScriptObject {
    public enum AlignmentType implements HasCssName {
        UNKNOWN {
            @Override
            public String getCssName() {
                return null;
            }
        },
        NONE {
            @Override
            public String getCssName() {
                return "none";
            }
        },
        XMINYMIN {
            @Override
            public String getCssName() {
                return "xMinYMin";
            }
        },
        XMIDYMIN {
            @Override
            public String getCssName() {
                return "xMidYMin";
            }
        },
        XMAXYMIN {
            @Override
            public String getCssName() {
                return "xMaxYMin";
            }
        },
        XMINYMID {
            @Override
            public String getCssName() {
                return "xMinYMid";
            }
        },
        XMIDYMID {
            @Override
            public String getCssName() {
                return "xMidYMid";
            }
        },
        XMAXYMID {
            @Override
            public String getCssName() {
                return "xMaxYMid";
            }
        },
        XMINYMAX {
            @Override
            public String getCssName() {
                return "xMinYMax";
            }
        },
        XMIDYMAX {
            @Override
            public String getCssName() {
                return "xMidYMax";
            }
        },
        XMAXYMAX {
            @Override
            public String getCssName() {
                return "xMaxYMax";
            }
        };
        public abstract String getCssName();
    }

    public enum MeetOrSliceType implements HasCssName {
        UNKNOWN {
            @Override
            public String getCssName() {
                return null;
            }
        },
        MEET {
            @Override
            public String getCssName() {
                return "meet";
            }
        },
        SLICE {
            @Override
            public String getCssName() {
                return "slice";
            }
        };
    }

    protected SVGPreserveAspectRatio() {
    }

    /**
     * @return The type of the alignment value as specified by one of the {@link AlignmentType} constants defined on
     *         this interface.
     */
    public final AlignmentType getAlignType() {
        return AlignmentType.values()[getAlign()];
    }

    private final native short getAlign() /*-{
                                          return this.align;
                                          }-*/;

    /**
     * @return The type of the meet-or-slice value as specified by one of the {@link MeetOrSliceType} constants defined
     *         on this interface.
     */
    public final MeetOrSliceType getMeetOrSliceType() {
        return MeetOrSliceType.values()[getMeetOrSlice()];
    }

    private final native short getMeetOrSlice() /*-{
                                                return this.meetOrSlice;
                                                }-*/;
}
