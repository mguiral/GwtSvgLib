package gwt.html5.svg.client.filter;

import gwt.html5.svg.client.ISVGElement;
import gwt.html5.svg.client.core.SVGAnimatedString;
import gwt.html5.svg.client.dom.constants.BlendMode;
import gwt.html5.svg.client.dom.constants.FilterInput;

public interface ISVGFEBlendElement extends ISVGElement, ISVGFilterPrimitiveStandardAttributeElement {
    /**
     * Identifies input for the given filter primitive. The value can be either one of six keywords or can be a string
     * which matches a previous ‘result’ attribute value within the same ‘filter’ element. If no value is provided and
     * this is the first filter primitive, then this filter primitive will use SourceGraphic as its input. If no value
     * is provided and this is a subsequent filter primitive, then this filter primitive will use the result from the
     * previous filter primitive as its input.
     * 
     * If the value for ‘result’ appears multiple times within a given ‘filter’ element, then a reference to that result
     * will use the closest preceding filter primitive with the given value for attribute ‘result’. Forward references
     * to results are an error.
     * 
     * @return
     */
    SVGAnimatedString getIn1();

    /**
     * Identifies input for the given filter primitive. The value can be either one of six keywords or can be a string
     * which matches a previous ‘result’ attribute value within the same ‘filter’ element. If no value is provided and
     * this is the first filter primitive, then this filter primitive will use SourceGraphic as its input. If no value
     * is provided and this is a subsequent filter primitive, then this filter primitive will use the result from the
     * previous filter primitive as its input.
     * 
     * If the value for ‘result’ appears multiple times within a given ‘filter’ element, then a reference to that result
     * will use the closest preceding filter primitive with the given value for attribute ‘result’. Forward references
     * to results are an error.
     * 
     * @param in1
     */
    void setIn1(FilterInput in1);

    /**
     * Identifies input for the given filter primitive. The value can be either one of six keywords or can be a string
     * which matches a previous ‘result’ attribute value within the same ‘filter’ element. If no value is provided and
     * this is the first filter primitive, then this filter primitive will use SourceGraphic as its input. If no value
     * is provided and this is a subsequent filter primitive, then this filter primitive will use the result from the
     * previous filter primitive as its input.
     * 
     * If the value for ‘result’ appears multiple times within a given ‘filter’ element, then a reference to that result
     * will use the closest preceding filter primitive with the given value for attribute ‘result’. Forward references
     * to results are an error.
     * 
     * @return
     */
    SVGAnimatedString getIn2();

    /**
     * Identifies input for the given filter primitive. The value can be either one of six keywords or can be a string
     * which matches a previous ‘result’ attribute value within the same ‘filter’ element. If no value is provided and
     * this is the first filter primitive, then this filter primitive will use SourceGraphic as its input. If no value
     * is provided and this is a subsequent filter primitive, then this filter primitive will use the result from the
     * previous filter primitive as its input.
     * 
     * If the value for ‘result’ appears multiple times within a given ‘filter’ element, then a reference to that result
     * will use the closest preceding filter primitive with the given value for attribute ‘result’. Forward references
     * to results are an error.
     * 
     * @param in2
     */
    void setIn2(FilterInput in2);

    /**
     * @return One of the image blending modes (see table below). If attribute ‘mode’ is not specified, then the effect
     *         is as if a value of normal were specified.
     *         <table width="400" border="1">
     *         <tbody>
     *         <tr>
     *         <td width="33%">Image Blending Mode</td>
     *         <td width="67%">Formula for computing result color</td>
     *         </tr>
     *         <tr>
     *         <td width="33%">normal</td>
     *         <td width="67%">cr = (1 - qa) * cb + ca</td>
     *         </tr>
     *         <tr>
     *         <td width="33%">multiply</td>
     *         <td width="67%">cr = (1-qa)*cb + (1-qb)*ca + ca*cb</td>
     *         </tr>
     *         <tr>
     *         <td width="33%">screen</td>
     *         <td width="67%">cr = cb + ca - ca * cb</td>
     *         </tr>
     *         <tr>
     *         <td width="33%">darken</td>
     *         <td width="67%">cr = Min ((1 - qa) * cb + ca, (1 - qb) * ca + cb)</td>
     *         </tr>
     *         <tr>
     *         <td width="33%">lighten</td>
     *         <td width="67%">cr = Max ((1 - qa) * cb + ca, (1 - qb) * ca + cb)</td>
     *         </tr>
     *         </tbody>
     *         </table>
     * 
     */
    BlendMode getMode();

    /**
     * /**
     * 
     * @return One of the image blending modes (see table below). If attribute ‘mode’ is not specified, then the effect
     *         is as if a value of normal were specified.
     *         <table width="400" border="1">
     *         <tbody>
     *         <tr>
     *         <td width="33%">Image Blending Mode</td>
     *         <td width="67%">Formula for computing result color</td>
     *         </tr>
     *         <tr>
     *         <td width="33%">normal</td>
     *         <td width="67%">cr = (1 - qa) * cb + ca</td>
     *         </tr>
     *         <tr>
     *         <td width="33%">multiply</td>
     *         <td width="67%">cr = (1-qa)*cb + (1-qb)*ca + ca*cb</td>
     *         </tr>
     *         <tr>
     *         <td width="33%">screen</td>
     *         <td width="67%">cr = cb + ca - ca * cb</td>
     *         </tr>
     *         <tr>
     *         <td width="33%">darken</td>
     *         <td width="67%">cr = Min ((1 - qa) * cb + ca, (1 - qb) * ca + cb)</td>
     *         </tr>
     *         <tr>
     *         <td width="33%">lighten</td>
     *         <td width="67%">cr = Max ((1 - qa) * cb + ca, (1 - qb) * ca + cb)</td>
     *         </tr>
     *         </tbody>
     *         </table>
     * 
     * @param mode
     */
    void setMode(BlendMode mode);
}
