package gwt.html5.svg.client;

import com.google.gwt.dom.client.Style.Unit;

import gwt.html5.svg.client.core.SVGAnimatedEnumeration;
import gwt.html5.svg.client.core.SVGAnimatedLength;
import gwt.html5.svg.client.core.SVGPoint;
import gwt.html5.svg.client.core.SVGRect;
import gwt.html5.svg.client.dom.constants.LengthAdjust;

public interface ISVGTextContentElement extends ISVGGraphicalElement {
    /**
     * @return Corresponds to attribute "textLength" on the given element.
     */
    SVGAnimatedLength getTextLength();

    /**
     * Set the text length
     * @param length 
     * @param unit
     */
    void setTextLength(int length, Unit unit);

    /**
     * @return Corresponds to attribute "lengthAdjust" on the given element. The value must be one of the length adjust
     *         constants defined on this interface
     */
    SVGAnimatedEnumeration getLengthAdjust();

    /**
     * @param lengthAdjust
     *            Corresponds to attribute "lengthAdjust" on the given element. The value must be one of the length
     *            adjust constants defined on this interface
     */
    void setLengthAdjust(LengthAdjust lengthAdjust);

    /**
     * Returns the total number of characters available for rendering within the current element, which includes
     * referenced characters from "tref" reference, regardless of whether they will be rendered. Effectively, this is
     * equivalent to the length of the Node::textContent attribute from DOM Level 3 Core ([DOM3], section 1.4), if that
     * attribute also expanded "tref" elements.
     * 
     * @return Total number of characters.
     */
    int getNumberOfChars();

    /**
     * The total sum of all of the advance values from rendering all of the characters within this element, including
     * the advance value on the glyphs (horizontal or vertical), the effect of properties "kerning", "letter-spacing"
     * and "word-spacing" and adjustments due to attributes "dx" and "dy" on "tspan" elements. For non-rendering
     * environments, the user agent shall make reasonable assumptions about glyph metrics.
     * 
     * @return The text advance distance.
     */
    float getComputedTextLength();

    /**
     * The total sum of all of the advance values from rendering the specified substring of the characters, including
     * the advance value on the glyphs (horizontal or vertical), the effect of properties "kerning", "letter-spacing"
     * and "word-spacing" and adjustments due to attributes "dx" and "dy" on "tspan" elements. For non-rendering
     * environments, the user agent shall make reasonable assumptions about glyph metrics. If multiple consecutive
     * characters are rendered inseparably (e.g., as a single glyph or a sequence of glyphs, or because the range
     * encompasses half of a surrogate pair), and nchars is greater than 0 then the measured range shall be expanded so
     * that each of the inseparable characters are included.
     * 
     * @param charnum
     *            The index of the first character in the substring, where the first character has an index of 0.
     * @param nchars
     *            The number of characters in the substring. If nchars specifies more characters than are available,
     *            then the substring will consist of all characters starting with charnum until the end of the list of
     *            characters.
     * @return The text advance distance.
     */
    float getSubStringLenth(int charnum, int nchars);

    /**
     * Returns the current text position before rendering the character in the user coordinate system for rendering the
     * glyph(s) that correspond to the specified character. The current text position has already taken into account the
     * effects of any inter-character adjustments due to properties "kerning", "letter-spacing" and "word-spacing" and
     * adjustments due to attributes "x", "y", "dx" and "dy". If multiple consecutive characters are rendered
     * inseparably (e.g., as a single glyph or a sequence of glyphs), then each of the inseparable characters will
     * return the start position for the first glyph.
     * 
     * @param charnum
     *            The index of the character, where the first character has an index of 0.
     * @return The character's start position.
     */
    SVGPoint getStartPositionOfChar(int charnum);

    /**
     * Returns the current text position after rendering the character in the user coordinate system for rendering the
     * glyph(s) that correspond to the specified character. This current text position does not take into account the
     * effects of any inter-character adjustments to prepare for the next character, such as properties "kerning",
     * "letter-spacing" and "word-spacing" and adjustments due to attributes "x", "y", "dx" and "dy". If multiple
     * consecutive characters are rendered inseparably (e.g., as a single glyph or a sequence of glyphs), then each of
     * the inseparable characters will return the end position for the last glyph.
     * 
     * @param charnum
     *            The index of the character, where the first character has an index of 0.
     * @return The character's end position.
     */
    SVGPoint getEndPositionOfChar(int charnum);

    /**
     * Returns a tightest rectangle which defines the minimum and maximum X and Y values in the user coordinate system
     * for rendering the glyph(s) that correspond to the specified character. The calculations assume that all glyphs
     * occupy the full standard glyph cell for the font. If multiple consecutive characters are rendered inseparably
     * (e.g., as a single glyph or a sequence of glyphs), then each of the inseparable characters will return the same
     * extent.
     * 
     * @param charnum
     *            The index of the character, where the first character has an index of 0.
     * @return The rectangle which encloses all of the rendered glyph(s)
     */
    SVGRect getExtentOfChar(int charnum);

    /**
     * Returns the rotation value relative to the current user coordinate system used to render the glyph(s)
     * corresponding to the specified character. If multiple glyph(s) are used to render the given character and the
     * glyphs each have different rotations (e.g., due to text-on-a-path), the user agent shall return an average value
     * (e.g., the rotation angle at the midpoint along the path for all glyphs used to render this character). The
     * rotation value represents the rotation that is supplemental to any rotation due to properties
     * "glyph-orientation-horizontal" and "glyph-orientation-vertical"; thus, any glyph rotations due to these
     * properties are not included into the returned rotation value. If multiple consecutive characters are rendered
     * inseparably (e.g., as a single glyph or a sequence of glyphs), then each of the inseparable characters will
     * return the same rotation value.
     * 
     * @param charnum
     *            The index of the character, where the first character has an index of 0.
     * @return The rotation angle.
     */
    float getRotationOfChar(int charnum);

    /**
     * Returns the index of the character whose corresponding glyph cell bounding box contains the specified point. The
     * calculations assume that all glyphs occupy the full standard glyph cell for the font. If no such character
     * exists, a value of -1 is returned. If multiple such characters exist, the character within the element whose
     * glyphs were rendered last (i.e., take into account any reordering such as for bidirectional text) is used. If
     * multiple consecutive characters are rendered inseparably (e.g., as a single glyph or a sequence of glyphs), then
     * the user agent shall allocate an equal percentage of the text advance amount to each of the contributing
     * characters in determining which of the characters is chosen.
     * 
     * @param point
     *            A point in user space.
     * @return The index of the character which is at the given point, where the first character has an index of 0.
     */
    int getCharNumAtPosition(SVGPoint point);

    /**
     * Causes the specified substring to be selected just as if the user selected the substring interactively.
     * 
     * @param charnum
     *            The index of the start character which is at the given point, where the first character has an index
     *            of 0.
     * @param nchars
     *            The number of characters in the substring. If nchars specifies more characters than are available,
     *            then the substring will consist of all characters starting with charnum until the end of the list of
     *            characters.
     */
    void selectSubString(int charnum, int nchars);
}
