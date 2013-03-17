package gwt.html5.svg.client.core;

import com.google.gwt.core.client.JavaScriptObject;

public class SVGTransform extends JavaScriptObject {
    public enum TransformUnit {
        UNKNOWN, MATRIX, TRANSLATE, SCALE, ROTATE, SKEWX, SKEWY;
    }

    protected SVGTransform() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return The type of the value as specified by one of the {@link TransformUnit} constants.
     */
    public final TransformUnit getType() {
        return TransformUnit.values()[getTypeValue()];
    }

    private final native int getTypeValue() /*-{
                                            return this.type;
                                            }-*/;

    /**
     * @return The matrix that represents this transformation. The matrix object is live, meaning that any changes made
     *         to the SVGTransform object are immediately reflected in the matrix object and vice versa. In case the
     *         matrix object is changed directly (i.e., without using the methods on the SVGTransform interface itself)
     *         then the type of the SVGTransform changes to {@link TransformUnit.MATRIX}.
     * 
     *         <li>For {@link TransformUnit.MATRIX}, the matrix contains the a, b, c, d, e, f values supplied by the
     *         user.</li> <li>For {@link TransformUnit.TRANSLATE}, e and f represent the translation amounts (a=1, b=0,
     *         c=0 and d=1).</li> <li>For {@link TransformUnit.SCALE}, a and d represent the translation amounts (b=0,
     *         c=0, e=0 and f=0).</li> <li>For {@link TransformUnit.ROTATE}, {@link TransformUnit.SKEWX} and
     *         {@link TransformUnit.SKEWY}, a, b, c and d represent the matrix which will result in the given
     *         transformation (e=0 and f=0).</li>
     */
    public final native SVGMatrix getMatrix() /*-{
                                              return this.matrix;
                                              }-*/;

    /**
     * @return A convenience attribute for {@link TransformUnit.ROTATE}, {@link TransformUnit.SKEWX} and
     *         {@link TransformUnit.SKEWY}. It holds the angle that was specified.
     * 
     *         For {@link TransformUnit.MATRIX}, {@link TransformUnit.TRANSLATE} and {@link TransformUnit.SCALE}, angle
     *         will be 0.
     */
    public final native float getAngle() /*-{
                                         return this.angle;
                                         }-*/;

    /**
     * Sets the transform type to {@link TransformUnit.MATRIX}, with parameter matrix defining the new transformation.
     * The values from the parameter matrix are copied, the matrix parameter does not replace SVGTransform::matrix.
     * 
     * @param matrix
     *            The new matrix for the transformation.
     */
    public final native void setMatrix(SVGMatrix matrix) /*-{
                                                         this.setMatrix(matrix);
                                                         }-*/;

    /**
     * Sets the transform type to {@link TransformUnit.TRANSLATE}, with parameters tx and ty defining the translation
     * amounts.
     * 
     * @param tx
     *            The translation amount in X.
     * @param ty
     *            The translation amount in Y.
     */
    public final native void setTranslate(float tx, float ty) /*-{
                                                              this.setTranslate(tx, ty);
                                                              }-*/;

    /**
     * Sets the transform type to {@link TransformUnit.SCALE}, with parameters sx and sy defining the scale amounts.
     * 
     * @param sx
     *            The scale amount in X.
     * @param sy
     *            The scale amount in Y.
     */
    public final native void setScale(float sx, float sy) /*-{
                                                          this.setScale
                                                          }-*/;

    /**
     * Sets the transform type to{@link TransformUnit.ROTATE}, with parameter angle defining the rotation angle and
     * parameters cx and cy defining the optional center of rotation.
     * 
     * @param angle
     *            The rotation angle.
     * @param cx
     *            The x coordinate of center of rotation.
     * @param cy
     *            The y coordinate of center of rotation.
     */
    public final native void setRotate(float angle, float cx, float cy) /*-{
                                                                        this.setRotate(angle, cx, cy);
                                                                        }-*/;

    /**
     * Sets the transform type to {@link TransformUnit.SKEWX}, with parameter angle defining the amount of skew.
     * 
     * @param angle
     *            The skew angle.
     */
    public final native void setSkewX(float angle) /*-{
                                                   this.setSkewX(angle);
                                                   }-*/;

    /**
     * Sets the transform type to {@link TransformUnit.SKEWY}, with parameter angle defining the amount of skew.
     * 
     * @param angle
     *            The skew angle.
     */
    public final native void setSkewY(float angle) /*-{
                                                   this.setSkewY(angle);
                                                   }-*/;
}
