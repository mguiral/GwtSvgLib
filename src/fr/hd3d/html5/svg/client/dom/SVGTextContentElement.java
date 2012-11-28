package fr.hd3d.html5.svg.client.dom;

import fr.hd3d.html5.svg.client.core.SVGAnimatedEnumeration;
import fr.hd3d.html5.svg.client.core.SVGAnimatedLength;
import fr.hd3d.html5.svg.client.core.SVGPoint;
import fr.hd3d.html5.svg.client.core.SVGRect;

public abstract class SVGTextContentElement extends SVGConditionalProcessingElement {
    protected SVGTextContentElement() {
    }

    public final native SVGAnimatedLength getTextLength() /*-{
                                                          return this.textLength;
                                                          }-*/;

    public final native void setTextLength(String textLength) /*-{
                                                              this.textLength = textLength;
                                                              }-*/;

    public final native SVGAnimatedEnumeration getLengthAdjust() /*-{
                                                                 return this.lengthAdjust;
                                                                 }-*/;

    public final native void setLengthAdjust(String lengthAdjust) /*-{
                                                                  this.lengthAdjust = lengthAdjust;
                                                                  }-*/;

    public final native int getNumberOfChars() /*-{
                                               return this.getNumberOfChars();
                                               }-*/;

    public final native float getComputedTextLength() /*-{
                                                      return this.getComputedTextLength();
                                                      }-*/;

    public final native float getSubStringLenth(int charnum, int nchars) /*-{
                                                                         return this.getSubStringLenth(charnum, nchars);
                                                                         }-*/;

    public final native SVGPoint getStartPositionOfChar(int charnum) /*-{
                                                                     return this.getStartPositionOfChar(charnum);
                                                                     }-*/;

    public final native SVGPoint getEndPositionOfChar(int charnum) /*-{
                                                                   return this.getEndPositionOfChar(charnum);
                                                                   }-*/;

    public final native SVGRect getExtentOfChar(int charnum) /*-{
                                                             return this.getExtentOfChar(charnum);
                                                             }-*/;

    public final native float getRotationOfChar(int charnum) /*-{
                                                             return this.getRotationOfChar(charnum);
                                                             }-*/;

    public final native int getCharNumAtPosition(SVGPoint point) /*-{
                                                                 return this.getCharNumAtPosition(point);
                                                                 }-*/;

    public final native void selectSubString(int charnum, int nchars) /*-{
                                                                      this.selectSubString(charnum, nchars);
                                                                      }-*/;
}
