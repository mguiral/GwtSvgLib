package gwt.html5.svg.client.dom;

import java.util.Arrays;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Cursor;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.dom.client.Style.FontStyle;
import com.google.gwt.dom.client.Style.FontWeight;
import com.google.gwt.dom.client.Style.HasCssName;
import com.google.gwt.dom.client.Style.Overflow;
import com.google.gwt.dom.client.Style.TextDecoration;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.dom.client.Style.Visibility;
import com.google.gwt.i18n.client.HasDirection.Direction;

import gwt.html5.svg.client.core.SVGAngle.AngleUnitType;
import gwt.html5.svg.client.user.Rectangle;

public class PresentationStyle {
    public enum AlignmentBaseLine implements HasCssName {
        AUTO {
            @Override
            public final String getCssName() {
                return CSS_PROPERTY_AUTO;
            }
        },
        BASELINE {
            @Override
            public final String getCssName() {
                return ALIGNMENT_BASELINE_BASELINE;
            }
        },
        BEFORE_EDGE {
            @Override
            public final String getCssName() {
                return ALIGNMENT_BASELINE_BEFORE_EDGE;
            }
        },
        TEXT_BEFORE_EDGE {
            @Override
            public final String getCssName() {
                return ALIGNMENT_BASELINE_TEXT_BEFORE_EDGE;
            }
        },
        MIDDLE {
            @Override
            public final String getCssName() {
                return ALIGNMENT_BASELINE_MIDDLE;
            }
        },
        CENTRAL {
            @Override
            public final String getCssName() {
                return ALIGNMENT_BASELINE_CENTRAL;
            }
        },
        AFTER_EDGE {
            @Override
            public final String getCssName() {
                return ALIGNMENT_BASELINE_AFTER_EDGE;
            }
        },
        TEXT_AFTER_EDGE {
            @Override
            public final String getCssName() {
                return ALIGNMENT_BASELINE_TEXT_AFTER_EDGE;
            }
        },
        IDEOGRAPHIC {
            @Override
            public final String getCssName() {
                return ALIGNMENT_BASELINE_IDEOGRAPHIC;
            }
        },
        ALPHABETIC {
            @Override
            public final String getCssName() {
                return ALIGNMENT_BASELINE_ALPHABETIC;
            }
        },
        HANGING {
            @Override
            public final String getCssName() {
                return ALIGNMENT_BASELINE_HANGING;
            }
        },
        MATHEMATICAL {
            @Override
            public final String getCssName() {
                return ALIGNMENT_BASELINE_MATHEMATICAL;
            }
        };
        public abstract String getCssName();
    }

    public enum DominantBaseline implements HasCssName {
        AUTO {
            @Override
            public String getCssName() {
                return CSS_PROPERTY_AUTO;
            }
        },
        USE_SCRIPT {
            @Override
            public String getCssName() {
                return DOMINANT_BASELINE_USE_SCRIPT;
            }
        },
        NO_CHANGE {
            @Override
            public String getCssName() {
                return DOMINANT_BASELINE_NO_CHANGE;
            }
        },
        RESET_SIZE {
            @Override
            public String getCssName() {
                return DOMINANT_BASELINE_RESET_SIZE;
            }
        },
        IDEOGRAPHIC {
            @Override
            public String getCssName() {
                return DOMINANT_BASELINE_IDEOGRAPHIC;
            }
        },
        ALPHABETIC {
            @Override
            public String getCssName() {
                return DOMINANT_BASELINE_ALPHABETIC;
            }
        },
        HANGING {
            @Override
            public String getCssName() {
                return DOMINANT_BASELINE_HANGING;
            }
        },
        MATHEMATICAL {
            @Override
            public String getCssName() {
                return DOMINANT_BASELINE_MATHEMATICAL;
            }
        },
        CENTRAL {
            @Override
            public String getCssName() {
                return DOMINANT_BASELINE_CENTRAL;
            }
        },
        MIDDLE {
            @Override
            public String getCssName() {
                return DOMINANT_BASELINE_MIDDLE;
            }
        },
        TEXT_AFTER_EDGE {
            @Override
            public String getCssName() {
                return DOMINANT_BASELINE_TEXT_AFTER_EDGE;
            }
        },
        TEXT_BEFORE_EDGE {
            @Override
            public String getCssName() {
                return DOMINANT_BASELINE_TEXT_BEFORE_EDGE;
            }
        },
        INHERIT {
            @Override
            public String getCssName() {
                return CSS_PROPERTY_INHERIT;
            }
        };
        public abstract String getCssName();
    }

    public enum BaseLineShift implements HasCssName {
        BASELINE {
            @Override
            public final String getCssName() {
                return ALIGNMENT_BASELINE_BASELINE;
            }
        },
        SUB {
            @Override
            public final String getCssName() {
                return BASELINE_SHIFT_SUB;
            }
        },
        SUPER {
            @Override
            public final String getCssName() {
                return BASELINE_SHIFT_SUPER;
            }
        };
        public abstract String getCssName();
    }

    public enum ColorInterpolation implements HasCssName {
        AUTO {
            @Override
            public final String getCssName() {
                return CSS_PROPERTY_AUTO;
            }
        },
        SRGB {
            @Override
            public final String getCssName() {
                return COLOR_INTERPOLATION_SRGB;
            }
        },
        LINEAR_RGB {
            @Override
            public final String getCssName() {
                return COLOR_INTERPOLATION_LINEAR_RGB;
            }
        },
        INHERIT {
            @Override
            public final String getCssName() {
                return CSS_PROPERTY_INHERIT;
            }
        };
        public abstract String getCssName();
    }

    public enum FillRule implements HasCssName {
        NONZERO {
            @Override
            public final String getCssName() {
                return FILL_RULE_NONZERO;
            }
        },
        EVENODD {
            @Override
            public final String getCssName() {
                return FILL_RULE_EVENODD;
            }
        };
        public abstract String getCssName();
    }

    public enum PointerEvents implements HasCssName {
        VISIBLE_PAINTED {
            @Override
            public String getCssName() {
                return POINTER_EVENTS_VISIBLE_PAINTED;
            }
        },
        VISIBLE_FILL {
            @Override
            public String getCssName() {
                return POINTER_EVENTS_VISIBLE_FILL;
            }
        },
        VISIBLE_STROKE {
            @Override
            public String getCssName() {
                return POINTER_EVENTS_VISIBLE_STROKE;
            }
        },
        VISIBLE {
            @Override
            public String getCssName() {
                return POINTER_EVENTS_VISIBLE;
            }
        },
        PAINTED {
            @Override
            public String getCssName() {
                return POINTER_EVENTS_PAINTED;
            }
        },
        FILL {
            @Override
            public String getCssName() {
                return POINTER_EVENTS_FILL;
            }
        },
        STROKE {
            @Override
            public String getCssName() {
                return POINTER_EVENTS_STROKE;
            }
        },
        ALL {
            @Override
            public String getCssName() {
                return POINTER_EVENTS_ALL;
            }
        },
        NONE {
            @Override
            public String getCssName() {
                return POINTER_EVENTS_NONE;
            }
        };
        public abstract String getCssName();
    }

    public enum Rendering implements HasCssName {
        AUTO {
            @Override
            public String getCssName() {
                return RENDERING_AUTO;
            }
        },
        OPTIMIZED_SPEED {
            @Override
            public String getCssName() {
                return RENDERING_OPTIMIZED_SPEED;
            }
        },
        GEOMETRIC_PRECISION {
            @Override
            public String getCssName() {
                return RENDERING_GEOMETRIC_PRECISION;
            }
        },
        OPTIMIZED_QUALITY {
            @Override
            public String getCssName() {
                return IMAGE_RENDERING_OPTIMIZED_QUALITY;
            }
        },
        CRISP_EDGES {
            @Override
            public String getCssName() {
                return SHAPE_RENDERING_CRISP_EDGES;
            }
        },
        OPTIMIZED_LEGIBILITY {
            @Override
            public String getCssName() {
                return TEXT_RENDERING_OPTIMIZED_LEGIBILITY;
            }
        };
        public abstract String getCssName();
    }

    public enum LineCap implements HasCssName {
        BUTT {
            @Override
            public String getCssName() {
                return STROKE_LINE_CAP_BUTT;
            }
        },
        ROUND {
            @Override
            public String getCssName() {
                return STROKE_LINE_CAP_ROUND;
            }
        },
        SQUARE {
            @Override
            public String getCssName() {
                return STROKE_LINE_CAP_SQUARE;
            }
        };
        public abstract String getCssName();
    }

    public enum LineJoin implements HasCssName {
        MITER {
            @Override
            public String getCssName() {
                return STROKE_LINE_JOIN_MITER;
            }
        },
        ROUND {
            @Override
            public String getCssName() {
                return STROKE_LINE_JOIN_ROUND;
            }
        },
        BEVEL {
            @Override
            public String getCssName() {
                return STROKE_LINE_JOIN_BEVEL;
            }
        };
        public abstract String getCssName();
    }

    public enum TextAnchor implements HasCssName {
        START {
            @Override
            public String getCssName() {
                return TEXT_ANCHOR_START;
            }
        },
        MIDDLE {
            @Override
            public String getCssName() {
                return TEXT_ANCHOR_MIDDLE;
            }
        },
        END {
            @Override
            public String getCssName() {
                return TEXT_ANCHOR_END;
            }
        };
        public abstract String getCssName();
    }

    public enum UnicodeBidi implements HasCssName {
        NORMAL {
            @Override
            public String getCssName() {
                return UNICODE_BIDI_NORMAL;
            }
        },
        EMBED {
            @Override
            public String getCssName() {
                return UNICODE_BIDI_EMBED;
            }
        },
        OVERRIDE_BIDI {
            @Override
            public String getCssName() {
                return UNICODE_BIDI_BIDI_OVERRIDE;
            }
        };
        public abstract String getCssName();
    }

    public enum WritingMode implements HasCssName {
        LR_TB {
            @Override
            public String getCssName() {
                return WRITING_MODE_LR_TB;
            }
        },
        RL_TB {
            @Override
            public String getCssName() {
                return WRITING_MODE_RL_TB;
            }
        },
        TB_RL {
            @Override
            public String getCssName() {
                return WRITING_MODE_TB_RL;
            }
        },
        LR {
            @Override
            public String getCssName() {
                return WRITING_MODE_LR;
            }
        },
        RL {
            @Override
            public String getCssName() {
                return WRITING_MODE_RL;
            }
        },
        TB {
            @Override
            public String getCssName() {
                return WRITING_MODE_TB;
            }
        };
        public abstract String getCssName();
    }

    public enum EnableBackground implements HasCssName {
        ACCUMULATE {
            @Override
            public String getCssName() {
                return ENABLE_BACKGROUND_ACCUMULATE;
            }
        },
        NEW {
            @Override
            public String getCssName() {
                return ENABLE_BACKGROUND_NEW;
            }
        };
        public abstract String getCssName();
    }

    private static final String ID_ATTRIBUTE = "@@ID@@";
    private static final String FUNCIRI_URL = "url";
    private static final String FUNCIRI_URL_VALUE = FUNCIRI_URL + "(#" + ID_ATTRIBUTE + ")";
    private static final String CSS_PROPERTY_AUTO = "auto";
    private static final String CSS_PROPERTY_INHERIT = "inherit";
    private static final String ALIGNMENT_BASELINE_BASELINE = "baseline";
    private static final String ALIGNMENT_BASELINE_BEFORE_EDGE = "before-edge";
    private static final String ALIGNMENT_BASELINE_TEXT_BEFORE_EDGE = "text-before-edge";
    private static final String ALIGNMENT_BASELINE_MIDDLE = "middle";
    private static final String ALIGNMENT_BASELINE_CENTRAL = "central";
    private static final String ALIGNMENT_BASELINE_AFTER_EDGE = "after-edge";
    private static final String ALIGNMENT_BASELINE_TEXT_AFTER_EDGE = "text-after-edge";
    private static final String ALIGNMENT_BASELINE_IDEOGRAPHIC = "ideographic";
    private static final String ALIGNMENT_BASELINE_ALPHABETIC = "alphabetic";
    private static final String ALIGNMENT_BASELINE_HANGING = "hanging";
    private static final String ALIGNMENT_BASELINE_MATHEMATICAL = "mathematical";
    private static final String BASELINE_SHIFT_SUB = "sub";
    private static final String BASELINE_SHIFT_SUPER = "super";
    private static final String COLOR_INTERPOLATION_SRGB = "sRGB";
    private static final String COLOR_INTERPOLATION_LINEAR_RGB = "linearRGB";
    public static final String PAINT_CURRENT_COLOR = "currentColor";
    private static final String FILL_RULE_NONZERO = "nonzero";
    private static final String FILL_RULE_EVENODD = "evenodd";
    private static final String POINTER_EVENTS_VISIBLE_PAINTED = "visiblePainted";
    private static final String POINTER_EVENTS_VISIBLE_FILL = "visibleFill";
    private static final String POINTER_EVENTS_VISIBLE_STROKE = "visibleStroke";
    private static final String POINTER_EVENTS_VISIBLE = "visible";
    private static final String POINTER_EVENTS_PAINTED = "painted";
    private static final String POINTER_EVENTS_FILL = "fill";
    private static final String POINTER_EVENTS_STROKE = "stroke";
    private static final String POINTER_EVENTS_ALL = "all";
    private static final String POINTER_EVENTS_NONE = "none";
    private static final String RENDERING_AUTO = "auto";
    private static final String RENDERING_OPTIMIZED_SPEED = "optimizedSpeed";
    private static final String RENDERING_GEOMETRIC_PRECISION = "geometricPrecision ";
    private static final String SHAPE_RENDERING_CRISP_EDGES = "crispEdges";
    private static final String TEXT_RENDERING_OPTIMIZED_LEGIBILITY = "optimizeLegibility";
    private static final String IMAGE_RENDERING_OPTIMIZED_QUALITY = "optimizeQuality";
    private static final String STROKE_LINE_CAP_BUTT = "butt";
    private static final String STROKE_LINE_CAP_ROUND = "round";
    private static final String STROKE_LINE_CAP_SQUARE = "square";
    private static final String STROKE_LINE_JOIN_MITER = "miter";
    private static final String STROKE_LINE_JOIN_ROUND = "round";
    private static final String STROKE_LINE_JOIN_BEVEL = "bevel";
    private static final String TEXT_ANCHOR_START = "start";
    private static final String TEXT_ANCHOR_MIDDLE = "middle";
    private static final String TEXT_ANCHOR_END = "end";
    private static final String UNICODE_BIDI_NORMAL = "normal";
    private static final String UNICODE_BIDI_EMBED = "embed";
    private static final String UNICODE_BIDI_BIDI_OVERRIDE = "bidi-override";
    private static final String WRITING_MODE_LR_TB = "lr-tb";
    private static final String WRITING_MODE_RL_TB = "rl-tb";
    private static final String WRITING_MODE_TB_RL = "tb-RL";
    private static final String WRITING_MODE_LR = "lr";
    private static final String WRITING_MODE_RL = "RL";
    private static final String WRITING_MODE_TB = "tb";
    private static final String DOMINANT_BASELINE_USE_SCRIPT = "use-script";
    private static final String DOMINANT_BASELINE_NO_CHANGE = "no-change";
    private static final String DOMINANT_BASELINE_RESET_SIZE = "reset-size";
    private static final String DOMINANT_BASELINE_IDEOGRAPHIC = "ideographic";
    private static final String DOMINANT_BASELINE_ALPHABETIC = "alphabetic";
    private static final String DOMINANT_BASELINE_HANGING = "hanging";
    private static final String DOMINANT_BASELINE_MATHEMATICAL = "mathematical";
    private static final String DOMINANT_BASELINE_CENTRAL = "central";
    private static final String DOMINANT_BASELINE_MIDDLE = "middle";
    private static final String DOMINANT_BASELINE_TEXT_AFTER_EDGE = "text-after-edge";
    private static final String DOMINANT_BASELINE_TEXT_BEFORE_EDGE = "text-before-edge";
    private static final String ENABLE_BACKGROUND_ACCUMULATE = "accumulate";
    private static final String ENABLE_BACKGROUND_NEW = "new";
    private static final String ALIGNMENT_BASELINE_PROPERTY = "alignment-baseline";
    private static final String BASELINE_SHIFT_PROPERTY = "baseline-shift";
    private static final String COLOR_PROPERTY = "color";
    private static final String COLOR_INTERPOLATION_PROPERTY = "color-interpolation";
    private static final String COLOR_INTERPOLATION_FILTERS_PROPERTY = "color-interpolation-filters";
    private static final String COLOR_RENDERING_PROPERTY = "color-rendering";
    private static final String CURSOR_PROPERTY = "cursor";
    private static final String DIRECTION_PROPERTY = "direction";
    private static final String DISPLAY_PROPERTY = "display";
    private static final String DOMINANT_BASELINE_PROPERTY = "dominant-baseline";
    private static final String ENABLE_BACKGROUND_PROPERTY = "enable-background";
    private static final String FILL_PROPERTY = "fill";
    private static final String FILL_OPACITY_PROPERTY = "fill-opacity";
    private static final String FILL_RULE_PROPERTY = "fill-rule";
    private static final String FILTER_PROPERTY = "filter";
    private static final String FLOOD_COLOR_PROPERTY = "flood-color";
    private static final String FLOOD_OPACITY_PROPERTY = "flood-opacity";
    private static final String FONT_SIZE_PROPERTY = "font-size";
    private static final String FONT_SIZE_ADJUST_PROPERTY = "font-sze-adjust";
    private static final String FONT_STYLE_PROPERTY = "font-style";
    private static final String FONT_WEIGHT_PROPERTY = "font-weight";
    private static final String GLYPH_ORIENTATION_HORIZONTAL_PROPERTY = "glyph-orientation-horizontal";
    private static final String GLYPH_ORIENTATION_VERTICAL_PROPERTY = "glyph-orientation-vertical";
    private static final String IMAGE_RENDERING_PROPERTY = "image-rendering";
    private static final String LIGHTING_COLOR_PROPERTY = "lighting-color";
    private static final String OPACITY_PROPERTY = "opacity";
    private static final String OVERFLOW_PROPERTY = "overflow";
    private static final String POINTER_EVENTS_PROPERTY = "pointer-events";
    private static final String SHAPE_RENDERING_PROPERTY = "shape-rendering";
    private static final String STOP_COLOR_PROPERTY = "stop-color";
    private static final String STOP_OPACITY_PROPERTY = "stop-opacity";
    private static final String STROKE_PROPERTY = "stroke";
    private static final String STROKE_DASH_ARRAY_PROPERTY = "stroke-daskarray";
    private static final String STROKE_DASHOFFSET_PROPERTY = "stroke-dashoffset";
    private static final String STROKE_LINECAP_PROPERTY = "stroke-linecap";
    private static final String STROKE_LINEJOIN_PROPERTY = "stroke-linejoin";
    private static final String STROKE_MITER_LIMIT_PROPERTY = "stroke-miterlimit";
    private static final String STROKE_OPACITY_PROPERTY = "stroke-opacity";
    private static final String STROKE_WIDTH_PROPERTY = "stroke-width";
    private static final String TEXT_ANCHOR_PROPERTY = "text-anchor";
    private static final String TEXT_DECORATION_PROPERTY = "text-decoration";
    private static final String TEXT_RENDERING_PROPERTY = "text-rendering";
    private static final String UNICODE_BIDI_PROPERTY = "unicode-bidi";
    private static final String VISIBILITY_PROPERTY = "visibility";
    private static final String WORD_SPACING_PROPERTY = "word-spacing";
    private static final String WRITING_MODE_PROPERTY = "writing-mode";
    private final Element element;

    public PresentationStyle(Element element) {
        this.element = element;
    }

    /**
     * Sets the alignment-baseline property
     */
    public final void setAlignmentBaseline(AlignmentBaseLine alignmentBaseLine) {
        setPresentationProperty(ALIGNMENT_BASELINE_PROPERTY, alignmentBaseLine.getCssName());
    }

    /**
     * Gets the alignment-baseline property
     */
    public final String getAlignmentBaseline() {
        return getPropertyImpl(ALIGNMENT_BASELINE_PROPERTY);
    }

    /**
     * Sets the baseline-shift property
     */
    public final void setBaselineShift(BaseLineShift baseLineShift) {
        setPresentationProperty(BASELINE_SHIFT_PROPERTY, baseLineShift.getCssName());
    }

    /**
     * Sets the baseline-shift property
     */
    public final void setBaseLineShift(double value, Unit unit) {
        setPresentationProperty(BASELINE_SHIFT_PROPERTY, value, unit);
    }

    /**
     * Gets the baseline-shift property
     */
    public final String getBaseLineShift() {
        return getPropertyImpl(BASELINE_SHIFT_PROPERTY);
    }

    /**
     * Sets the color property
     */
    public final void setColor(String color) {
        setPresentationProperty(COLOR_PROPERTY, color);
    }

    /**
     * Gets the color property
     */
    public final String getColor() {
        return getPropertyImpl(COLOR_PROPERTY);
    }

    /**
     * Sets the color-interpolation property
     */
    public final void setColorInterpolation(ColorInterpolation colorInterpolation) {
        setPresentationProperty(COLOR_INTERPOLATION_PROPERTY, colorInterpolation.getCssName());
    }

    /**
     * Gets the color-interpolation property
     */
    public final String getColorInterpolation() {
        return getPropertyImpl(COLOR_INTERPOLATION_PROPERTY);
    }

    /**
     * Sets the color-interpolation-filters property
     */
    public final void setColorInterpolationFilters(ColorInterpolation colorInterpolation) {
        setPresentationProperty(COLOR_INTERPOLATION_FILTERS_PROPERTY, colorInterpolation.getCssName());
    }

    /**
     * Gets the color-interpolation-filters property
     */
    public final String getColorInterpolationFilters() {
        return getPropertyImpl(COLOR_INTERPOLATION_FILTERS_PROPERTY);
    }

    /**
     * Sets the color-rendering property
     */
    public final void setColorRendering(Rendering colorRendering) {
        setPresentationProperty(COLOR_RENDERING_PROPERTY, colorRendering.getCssName());
    }

    /**
     * Gets the color-rendering property
     */
    public final String getColorRendering() {
        return getPropertyImpl(COLOR_RENDERING_PROPERTY);
    }

    /**
     * Sets the cursor property
     */
    public final void setCursor(Cursor cursor) {
        setPresentationProperty(CURSOR_PROPERTY, cursor.getCssName());
    }

    /**
     * Gets the cursor property.
     */
    public final String getCursor() {
        return getPropertyImpl(CURSOR_PROPERTY);
    }

    /**
     * Sets the display property
     */
    public final void setDisplay(Display display) {
        setPresentationProperty(DISPLAY_PROPERTY, display.getCssName());
    }

    /**
     * Gets the display property
     */
    public final String getDisplay() {
        return getPropertyImpl(DISPLAY_PROPERTY);
    }

    /**
     * Sets the direction property
     */
    public final void setDirection(Direction direction) {
        setPresentationProperty(DIRECTION_PROPERTY, direction.name().toLowerCase());
    }

    /**
     * Gets the direction property
     */
    public final String getDirection() {
        return getPropertyImpl(DIRECTION_PROPERTY);
    }

    /**
     * Sets the dominant-baseline property
     */
    public final void setDominantBaseline(DominantBaseline dominantBaseline) {
        setPresentationProperty(DOMINANT_BASELINE_PROPERTY, dominantBaseline.getCssName());
    }

    /**
     * Gets the dominant-baseline property
     */
    public final String getDominantBaseline() {
        return getPropertyImpl(DOMINANT_BASELINE_PROPERTY);
    }

    /**
     * Sets the enable-background property
     */
    public final void setEnableBackground(EnableBackground enableBackground) {
        setPresentationProperty(ENABLE_BACKGROUND_PROPERTY, enableBackground.getCssName());
    }

    /**
     * Sets the enable-background property
     */
    public final void setEnableBackground(Rectangle rectangle) {
        setPresentationProperty(ENABLE_BACKGROUND_PROPERTY, ENABLE_BACKGROUND_NEW + " " + rectangle.toString());
    }

    /**
     * Gets the enable-background property
     */
    public final String getEnableBackground() {
        return getPropertyImpl(ENABLE_BACKGROUND_PROPERTY);
    }

    /**
     * Sets the fill property
     */
    public final void setFill(String fill) {
        if (!fill.contains(FUNCIRI_URL)) {
            setPresentationProperty(FILL_PROPERTY, fill);
        } else {
            throw new UnsupportedOperationException("This value is not allowed here please use setFillWithCurentColor or setFill(Element element)");
        }
    }

    /**
     * Sets the fill property to url(#element.getId())
     */
    public final void setFill(Element element) {
        setFuncIRIProperty(FILL_PROPERTY, element);
    }

    /**
     * Gets the fill property
     */
    public final String getFill() {
        return getPropertyImpl(FILL_PROPERTY);
    }

    /**
     * Sets the fill-opacity property
     */
    public final void setFillOpacity(double opacity) {
        if (opacity > 1 || opacity < 0) {
            throw new UnsupportedOperationException("Opacity must be between 0.0 and 1.0");
        }
        setPresentationProperty(FILL_OPACITY_PROPERTY, "" + opacity);
    }

    /**
     * Gets the fill-opacity property
     */
    public final String getFillOpacity() {
        return getPropertyImpl(FILL_OPACITY_PROPERTY);
    }

    /**
     * Sets the fill-rule property
     */
    public final void setFillRule(FillRule fillRule) {
        setPresentationProperty(FILL_RULE_PROPERTY, fillRule.getCssName());
    }

    /**
     * Gets the fill-rule property
     */
    public final String getFillRule() {
        return getPropertyImpl(FILL_RULE_PROPERTY);
    }

    /**
     * Sets the filter property
     */
    public final void setFilter(Element element) {
        setFuncIRIProperty(FILTER_PROPERTY, element);
    }

    /**
     * Sets the flood-color property
     */
    public final void setFloodColor(String color) {
        setPresentationProperty(FLOOD_COLOR_PROPERTY, color);
    }

    /**
     * Gets the flood-color property
     */
    public final String getFloodColor() {
        return getPropertyImpl(FLOOD_COLOR_PROPERTY);
    }

    /**
     * Sets the flood-opacity property
     */
    public final void setFloodOpacity(double opacity) {
        setPresentationProperty(FLOOD_OPACITY_PROPERTY, "" + opacity);
    }

    /**
     * Gets the flood-opacity property
     */
    public final String getFloodOpacity() {
        return getPropertyImpl(FLOOD_OPACITY_PROPERTY);
    }

    /**
     * Set the font-size css property.
     */
    public final void setFontSize(double value, Unit unit) {
        setPresentationProperty(FONT_SIZE_PROPERTY, value, unit);
    }

    /**
     * Get the font-size css property.
     */
    public final String getFontSize() {
        return getPropertyImpl(FONT_SIZE_PROPERTY);
    }

    /**
     * Sets the font-size-adjust property
     */
    public final void setFontSizeAdjust(double fontSizeAdjust) {
        setPresentationProperty(FONT_SIZE_ADJUST_PROPERTY, "" + fontSizeAdjust);
    }

    /**
     * Gets the font-size-adjust property
     */
    public final String getFontSizeAdjust() {
        return getPropertyImpl(FONT_SIZE_ADJUST_PROPERTY);
    }

    /**
     * Sets the font-style CSS property.
     */
    public final void setFontStyle(FontStyle value) {
        setPresentationProperty(FONT_STYLE_PROPERTY, value.getCssName());
    }

    /**
     * Gets the font-style CSS property.
     */
    public final String getFontStyle() {
        return getPropertyImpl(FONT_STYLE_PROPERTY);
    }

    /**
     * Sets the font-weight CSS property.
     */
    public final void setFontWeight(FontWeight value) {
        setPresentationProperty(FONT_WEIGHT_PROPERTY, value.getCssName());
    }

    /**
     * Gets the font-weight CSS property.
     */
    public final String getFontWeight() {
        return getPropertyImpl(FONT_WEIGHT_PROPERTY);
    }

    /**
     * Gets the glyph-orientation-horizontal property
     */
    public final void setGlyphOrientationHorizontal(double angle, AngleUnitType type) {
        setPresentationAngle(GLYPH_ORIENTATION_HORIZONTAL_PROPERTY, angle, type);
    }

    /**
     * Gets the glyph-orientation-horizontal property
     */
    public final String getGlyphOrientationHorizontal() {
        return getPropertyImpl(GLYPH_ORIENTATION_HORIZONTAL_PROPERTY);
    }

    /**
     * Gets the glyph-orientation-vertical property
     */
    public final void setGlyphOrientationVertical(double angle, AngleUnitType type) {
        setPresentationAngle(GLYPH_ORIENTATION_VERTICAL_PROPERTY, angle, type);
    }

    /**
     * Gets the glyph-orientation-vertical property
     */
    public final String getGlyphOrientationVertical() {
        return getPropertyImpl(GLYPH_ORIENTATION_VERTICAL_PROPERTY);
    }

    /**
     * Sets the image-rendering property
     */
    public final void setImageRendering(Rendering imageRendering) {
        setPresentationProperty(IMAGE_RENDERING_PROPERTY, imageRendering.getCssName());
    }

    /**
     * Gets the image-rendering property
     */
    public final String getImageRendering() {
        return getPropertyImpl(IMAGE_RENDERING_PROPERTY);
    }

    /**
     * Sets the lighting-color property
     */
    public final void setLightingColor(String color) {
        setPresentationProperty(LIGHTING_COLOR_PROPERTY, color);
    }

    /**
     * Gets the lighting-color property
     */
    public final String getLightongColor() {
        return getPropertyImpl(LIGHTING_COLOR_PROPERTY);
    }

    /**
     * Set the opacity property.
     */
    public final void setOpacity(double value) {
        setPresentationProperty(OPACITY_PROPERTY, "" + value);
    }

    /**
     * Get the opacity property.
     */
    public final String getOpacity() {
        return getPropertyImpl(OPACITY_PROPERTY);
    }

    /**
     * Sets the overflow property.
     */
    public final void setOverflow(Overflow value) {
        setPresentationProperty(OVERFLOW_PROPERTY, value.getCssName());
    }

    /**
     * Gets the overflow property.
     */
    public final String getOverflow() {
        return getPropertyImpl(OVERFLOW_PROPERTY);
    }

    /**
     * Sets the pointer-events property
     */
    public final void setPointerEvents(PointerEvents pointerEvents) {
        setPresentationProperty(POINTER_EVENTS_PROPERTY, pointerEvents.getCssName());
    }

    /**
     * Gets the pointer-events property
     */
    public final String getPointerEvents() {
        return getPropertyImpl(POINTER_EVENTS_PROPERTY);
    }

    /**
     * Sets the shape-rendering property
     */
    public final void setShapeRendering(Rendering shapeRendering) {
        setPresentationProperty(SHAPE_RENDERING_PROPERTY, shapeRendering.getCssName());
    }

    /**
     * Gets the shape-rendering property
     */
    public final String getShapeRendering() {
        return getPropertyImpl(SHAPE_RENDERING_PROPERTY);
    }

    /**
     * Sets the stop-color property
     */
    public final void setStopColor(String color) {
        setPresentationProperty(STOP_COLOR_PROPERTY, color);
    }

    /**
     * Gets the stop-color property
     */
    public final String getStopColor() {
        return getPropertyImpl(STOP_COLOR_PROPERTY);
    }

    /**
     * Sets the stop-opacity property
     */
    public final void setStopOpacity(double opacity) {
        setPresentationProperty(STOP_OPACITY_PROPERTY, "" + opacity);
    }

    /**
     * Gets the stop-opacity property
     */
    public final String getStopOpacity() {
        return getPropertyImpl(STOP_OPACITY_PROPERTY);
    }

    /**
     * Sets the stroke property
     */
    public final void setStroke(String color) {
        if (!color.contains(FUNCIRI_URL)) {
            setPresentationProperty(STROKE_PROPERTY, color);
        } else {
            throw new UnsupportedOperationException("you must use setStroke(Element element)");
        }
    }

    /**
     * Sets the stroke property
     */
    public final void setStroke(Element element) {
        setFuncIRIProperty(STROKE_PROPERTY, element);
    }

    /**
     * Gets the stroke property
     */
    public final String getStroke() {
        return getPropertyImpl(STROKE_PROPERTY);
    }

    /**
     * Set the stroke-dasharray property
     */
    public final void setStrokeDasharray(double[] values) {
        setPresentationProperty(STROKE_DASH_ARRAY_PROPERTY, Arrays.toString(values));
    }

    /**
     * Get the strike-dasharray property
     */
    public final double[] getStrokeDasharray() {
        String dashArray = getPropertyImpl(STROKE_DASH_ARRAY_PROPERTY);
        String[] values = dashArray.split(",");
        double[] returnValues = {};
        for (int i = 0; i < values.length; i++) {
            try {
                double numberValue = Double.parseDouble(values[i]);
                returnValues[i] = numberValue;
            } catch (NumberFormatException e) {
            }
        }
        return returnValues;
    }

    /**
     * Set the stroke-dashoffset property
     */
    public final void setStrokeDashOffSet(double offset, Unit unit) {
        setPresentationProperty(STROKE_DASHOFFSET_PROPERTY, offset, unit);
    }

    /**
     * Get the stroke-dashoffset property
     */
    public final String getStrokeDashOffSet() {
        return getPropertyImpl(STROKE_DASHOFFSET_PROPERTY);
    }

    /**
     * Sets the stroke-linecap property
     */
    public final void setStrokeLineCap(LineCap lineCap) {
        setPresentationProperty(STROKE_LINECAP_PROPERTY, lineCap.getCssName());
    }

    /**
     * Gets the stroke-linecap property
     */
    public final String getStrokeLineCap() {
        return getPropertyImpl(STROKE_LINECAP_PROPERTY);
    }

    /**
     * Sets the stroke-linejoin property
     */
    public final void setStrokeLineJoin(LineJoin lineJoin) {
        setPresentationProperty(STROKE_LINEJOIN_PROPERTY, lineJoin.getCssName());
    }

    /**
     * Get the stroke-linejoin property
     */
    public final String getStrokeLineJoin() {
        return getPropertyImpl(STROKE_LINEJOIN_PROPERTY);
    }

    /**
     * Sets the stroke-miterlimit property
     * 
     * @param miterlimit
     *            must be a number greater than or equal to 1
     */
    public final void setStrokeMiterLimit(double miterlimit) {
        if (miterlimit >= 1) {
            setPresentationProperty(STROKE_MITER_LIMIT_PROPERTY, "" + miterlimit);
        } else {
            throw new UnsupportedOperationException("The value must be greater than or equal to 1");
        }
    }

    /**
     * Gets the stroke-miterlimit property
     */
    public final String getStrokeMiterLimit() {
        return getPropertyImpl(STROKE_MITER_LIMIT_PROPERTY);
    }

    /**
     * Sets the stroke-opacity property
     */
    public final void setStrokeOpacity(double opacity) {
        if (opacity >= 0 && opacity <= 1) {
            setPresentationProperty(STROKE_OPACITY_PROPERTY, "" + opacity);
        } else {
            throw new UnsupportedOperationException("The value must be in the range [0,1]");
        }
    }

    /**
     * Gets the stroke-opacity property
     */
    public final String getStrokeOpacity() {
        return getPropertyImpl(STROKE_OPACITY_PROPERTY);
    }

    /**
     * Sets the stroke-width property
     */
    public final void setStrokeWidth(double value, Unit unit) {
        setPresentationProperty(STROKE_WIDTH_PROPERTY, value, unit);
    }

    /**
     * Gets the stroke-width property
     */
    public final String getStrokeWidth() {
        return getPropertyImpl(STROKE_WIDTH_PROPERTY);
    }

    /**
     * Sets the text-anchor property
     */
    public final void setTextAnchor(TextAnchor textAnchor) {
        setPresentationProperty(TEXT_ANCHOR_PROPERTY, textAnchor.getCssName());
    }

    /**
     * Gets the text-anchor property
     */
    public final String getTextAnchor() {
        return getPropertyImpl(TEXT_ANCHOR_PROPERTY);
    }

    /**
     * Sets the text-decoration CSS property.
     */
    public final void setTextDecoration(TextDecoration value) {
        setPresentationProperty(TEXT_DECORATION_PROPERTY, value.getCssName());
    }

    /**
     * Gets the text-decoration CSS property.
     */
    public final String getTextDecoration() {
        return getPropertyImpl(TEXT_DECORATION_PROPERTY);
    }

    /**
     * Sets the text-rendering property
     */
    public final void setTextRendering(Rendering rendering) {
        setPresentationProperty(TEXT_RENDERING_PROPERTY, rendering.getCssName());
    }

    /**
     * Gets the text-rendering property
     */
    public final String getTextRendering() {
        return getPropertyImpl(TEXT_RENDERING_PROPERTY);
    }

    /**
     * Sets the unicode-bidi property
     */
    public final void setUnicodeBidi(UnicodeBidi unicodeBidi) {
        setPresentationProperty(UNICODE_BIDI_PROPERTY, unicodeBidi.getCssName());
    }

    /**
     * Gets the unicode-bidi property
     */
    public final String getUnicodeBidi() {
        return getPropertyImpl(UNICODE_BIDI_PROPERTY);
    }

    /**
     * Sets the visibility CSS property.
     */
    public final void setVisibility(Visibility value) {
        setPresentationProperty(VISIBILITY_PROPERTY, value.getCssName());
    }

    /**
     * Gets the visibility CSS property.
     */
    public final String getVisibility() {
        return getPropertyImpl(VISIBILITY_PROPERTY);
    }

    /**
     * Sets the word-spacing property
     */
    public final void setWordSpacing(double value, Unit unit) {
        setPresentationProperty(WORD_SPACING_PROPERTY, value, unit);
    }

    /**
     * Gets the word-spacing property
     */
    public final String getWordSpacing() {
        return getPropertyImpl(WORD_SPACING_PROPERTY);
    }

    /**
     * Sets the writing-mode property
     */
    public final void setWritingMode(WritingMode writingMode) {
        setPresentationProperty(WRITING_MODE_PROPERTY, writingMode.getCssName());
    }

    /**
     * Gets the writing-mode property
     */
    public final String getWritingMode() {
        return getPropertyImpl(WRITING_MODE_PROPERTY);
    }

    private void setPresentationAngle(String name, double angle, AngleUnitType type) {
        if (!AngleUnitType.UNKNOWN.equals(type) && !AngleUnitType.UNSPECIFIED.equals(type)) {
            setPresentationProperty(name, angle + type.name().toLowerCase());
        } else {
            throw new UnsupportedOperationException("The unit must be deg or grad or rad");
        }
    }

    private void setFuncIRIProperty(String name, Element element) {
        if (element.getId() != null) {
            setPresentationProperty(name, FUNCIRI_URL_VALUE.replace(ID_ATTRIBUTE, element.getId()));
        } else {
            throw new UnsupportedOperationException("The element has no ID attribute");
        }
    }

    /**
     * Sets the value of a named property.
     */
    private final void setPresentationProperty(String name, String value) {
        setPropertyImpl(null, name, value);
    }

    /**
     * Sets the value of a named property in the specified units.
     */
    private final void setPresentationProperty(String name, double value, Unit unit) {
        setPropertyImpl(null, name, value + unit.getType());
    }

    /**
     * Gets the value of a named property.
     */
    private native String getPropertyImpl(String name) /*-{
                                                       return this.@gwt.html5.svg.client.dom.PresentationStyle::element[name];
                                                       }-*/;

    /**
     * Sets the value of a named property.
     */
    private native void setPropertyImpl(String uri, String name, String value) /*-{
                                                                               this.@gwt.html5.svg.client.dom.PresentationStyle::element.setAttributeNS(uri, name, value);
                                                                               }-*/;
}
