package gwt.html5.svg.client;

import com.google.gwt.dom.client.Style.Unit;

import gwt.html5.svg.client.core.SVGAnimatedNumberList;

public interface ISVGTextPositioningElement extends ISVGTextContentElement {
    /**
     * @return X coordinate for the current text position for rendering the glyphs that correspond to the first
     *         character within this element or any of its descendants.
     */
    float[] getX();

    /**
     * the new absolute X coordinate for the current text position for rendering the glyphs that correspond to the first
     * character within this element or any of its descendants.
     * 
     * @param x
     * @param unit
     */
    void setX(float x, Unit unit);

    /**
     * the new absolute X coordinates for the current text position for rendering the glyphs
     * corresponding to each of the first n characters within this element or any of its descendants.
     * 
     * @param xs
     * @param unit
     */
    void setX(float[] xs, Unit unit);

    /**
     * @return Y coordinate for the current text position for rendering the glyphs that correspond to
     *         the first character within this element or any of its descendants.
     * 
     */
    float[] getY();

    /**
     * the new absolute Y coordinate for the current text position for rendering the glyphs that correspond to the first
     * character within this element or any of its descendants.
     * 
     * @param y
     * @param unit
     */
    void setY(float y, Unit unit);

    /**
     * If a comma- or space-separated list of n <coordinate>s is provided, then the values represent new absolute X
     * coordinates for the current text position for rendering the glyphs corresponding to each of the first n
     * characters within this element or any of its descendants.
     * 
     * @param ys
     * @param unit
     */
    void setY(float[] ys, Unit unit);

    /**
     * @return X coordinate for the current text position for rendering the glyphs corresponding to the first character
     *         within this element or any of its descendants. The current text position is shifted along the y-axis of
     *         the current user coordinate system by length before the first character's glyphs are rendered.
     */
    float[] getDx();

    /**
     * the new relative X coordinate for the current text position for rendering the glyphs corresponding to the first
     * character within this element or any of its descendants. The current text position is shifted along the x-axis of
     * the current user coordinate system by length before the first character's glyphs are rendered.
     * 
     * @param dx
     * @param unit
     */
    void setDx(float dx, Unit unit);

    /**
     * If a comma- or space-separated list of n <length>s is provided, then the values represent incremental shifts
     * along the x-axis for the current text position before rendering the glyphs corresponding to the first n
     * characters within this element or any of its descendants. Thus, before the glyphs are rendered corresponding to
     * each character, the current text position resulting from drawing the glyphs for the previous character within the
     * current ‘text’ element is shifted along the X axis of the current user coordinate system by length.
     * 
     * @param dxs
     * @param unit
     */
    void setDx(float[] dxs, Unit unit);

    /**
     * @return Y coordinate for the current text position for rendering the glyphs corresponding to the first character
     *         within this element or any of its descendants. The current text position is shifted along the y-axis of
     *         the current user coordinate system by length before the first character's glyphs are rendered.
     */
    float[] getDy();

    /**
     * the new relative Y coordinate for the current text position for rendering the glyphs corresponding to the first
     * character within this element or any of its descendants. The current text position is shifted along the y-axis of
     * the current user coordinate system by length before the first character's glyphs are rendered.
     * 
     * @param dx
     * @param unit
     */
    void setDy(float dy, Unit unit);

    /**
     * If a comma- or space-separated list of n <length>s is provided, then the values represent incremental shifts
     * along the y-axis for the current text position before rendering the glyphs corresponding to the first n
     * characters within this element or any of its descendants. Thus, before the glyphs are rendered corresponding to
     * each character, the current text position resulting from drawing the glyphs for the previous character within the
     * current ‘text’ element is shifted along the Y axis of the current user coordinate system by length.
     * 
     * @param dys
     * @param unit
     */
    void setDy(float[] dys, Unit unit);

    SVGAnimatedNumberList getRotate();

    void setRotate(float rotate);

    void setRotate(float[] rotates);
}
