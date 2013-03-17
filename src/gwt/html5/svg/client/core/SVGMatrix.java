package gwt.html5.svg.client.core;

import com.google.gwt.core.client.JavaScriptObject;

public class SVGMatrix extends JavaScriptObject {
    protected SVGMatrix() {
    }

    /**
     * @return The a component of the matrix
     */
    public final native float getA() /*-{
                                     return this.a;
                                     }-*/;

    /**
     * @param value
     *            The a component of the matrix
     */
    public final native void setA(float value) /*-{
                                               this.a = value;
                                               }-*/;

    /**
     * @return The b component of the matrix.
     */
    public final native float getB() /*-{
                                     return this.b;
                                     }-*/;

    /**
     * @param value
     *            The b component of the matrix.
     */
    public final native void setB(float value) /*-{
                                               this.b = value;
                                               }-*/;

    /**
     * @return The c component of the matrix.
     */
    public final native float getC() /*-{
                                     return this.c;
                                     }-*/;

    /**
     * @param value
     *            The c component of the matrix.
     */
    public final native void setC(float value) /*-{
                                               this.c = value;
                                               }-*/;

    /**
     * @return The d component of the matrix.
     */
    public final native float getD() /*-{
                                     return this.d;
                                     }-*/;

    /**
     * @param value
     *            The d component of the matrix.
     */
    public final native void setD(float value) /*-{
                                               this.d = value;
                                               }-*/;

    /**
     * @return The e component of the matrix.
     */
    public final native float getE() /*-{
                                     return this.e;
                                     }-*/;

    /**
     * @param value
     *            The e component of the matrix.
     */
    public final native void setE(float value) /*-{
                                               this.e = value;
                                               }-*/;

    /**
     * @return The f component of the matrix.
     */
    public final native float getF() /*-{
                                     return this.f;
                                     }-*/;

    /**
     * @param value
     *            The f component of the matrix.
     */
    public final native void setF(float value) /*-{
                                               this.f = value;
                                               }-*/;

    /**
     * Performs matrix multiplication. This matrix is post-multiplied by another matrix, returning the resulting new
     * matrix.
     * 
     * @param secondMatrix
     *            The matrix which is post-multiplied to this matrix.
     * @return The resulting matrix.
     */
    public final native SVGMatrix multiply(SVGMatrix secondMatrix) /*-{
                                                                   return this.multiply(secondMatrix);
                                                                   }-*/;

    /**
     * @return the inverse matrix.
     */
    public final native SVGMatrix inverse() /*-{
                                            return this.inverse();
                                            }-*/;

    /**
     * Post-multiplies a translation transformation on the current matrix and returns the resulting matrix.
     * 
     * @param x
     *            The distance to translate along the x-axis.
     * @param y
     *            The distance to translate along the y-axis.
     * @return The resulting matrix.
     */
    public final native SVGMatrix translate(float x, float y) /*-{
                                                              return this.translate(x, y);
                                                              }-*/;

    /**
     * Post-multiplies a uniform scale transformation on the current matrix and returns the resulting matrix.
     * 
     * @param scaleFactor
     *            Scale factor in both X and Y.
     * @return The resulting matrix.
     */
    public final native SVGMatrix scale(float scaleFactor) /*-{
                                                           return this.scale(scaleFactor);
                                                           }-*/;

    /**
     * Post-multiplies a non-uniform scale transformation on the current matrix and returns the resulting matrix.
     * 
     * @param scaleFactorX
     *            Scale factor in X
     * @param scaleFactorY
     *            Scale factor in Y.
     * @return The resulting matrix.
     */
    public final native SVGMatrix scaleNonUniform(float scaleFactorX, float scaleFactorY) /*-{
                                                                                          return this.scaleNonUniform(scaleFactorX, scaleFactorY);
                                                                                          }-*/;

    /**
     * Post-multiplies a rotation transformation on the current matrix and returns the resulting matrix.
     * 
     * @param angle
     *            Rotation angle.
     * @return The resulting matrix.
     */
    public final native SVGMatrix rotate(float angle) /*-{
                                                      return this.rotate(angle);
                                                      }-*/;

    /**
     * Post-multiplies a rotation transformation on the current matrix and returns the resulting matrix. The rotation
     * angle is determined by taking (+/-) atan(y/x). The direction of the vector (x,��y) determines whether the
     * positive or negative angle value is used.
     * 
     * @param x
     *            The X coordinate of the vector (x,y). Must not be zero
     * @param y
     *            The Y coordinate of the vector (x,y). Must not be zero.
     * @return The resulting matrix.
     */
    public final native SVGMatrix rotateFromVector(float x, float y) /*-{
                                                                     return this.rotateFromVector(x, y);
                                                                     }-*/;

    /**
     * Post-multiplies the transformation [1��0��0��1��0��0] and returns the resulting matrix.
     * 
     * @return The resulting matrix.
     */
    public final native SVGMatrix flipX() /*-{
                                          return this.flipX();
                                          }-*/;

    /**
     * Post-multiplies the transformation [1��0��0��-1��0��0] and returns the resulting matrix.
     * 
     * @return The resulting matrix.
     */
    public final native SVGMatrix flipY() /*-{
                                          return this.flipY();
                                          }-*/;

    /**
     * Post-multiplies a skewX transformation on the current matrix and returns the resulting matrix.
     * 
     * @param angle
     *            Skew angle.
     * @return The resulting matrix.
     */
    public final native SVGMatrix skewX(float angle) /*-{
                                                     return this.skewX(angle);
                                                     }-*/;

    /**
     * Post-multiplies a skewX transformation on the current matrix and returns the resulting matrix.
     * 
     * @param angle
     *            Skew angle.
     * @return The resulting matrix.
     */
    public final native SVGMatrix skewY(float angle) /*-{
                                                     return this.skewY(angle);
                                                     }-*/;
}
