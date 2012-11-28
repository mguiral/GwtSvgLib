package fr.hd3d.html5.svg.client;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.dom.client.Style.Unit;

import fr.hd3d.html5.svg.client.core.SVGAngle;
import fr.hd3d.html5.svg.client.core.SVGAnimatedLength;
import fr.hd3d.html5.svg.client.core.SVGLength;
import fr.hd3d.html5.svg.client.core.SVGMatrix;
import fr.hd3d.html5.svg.client.core.SVGNumber;
import fr.hd3d.html5.svg.client.core.SVGPoint;
import fr.hd3d.html5.svg.client.core.SVGRect;
import fr.hd3d.html5.svg.client.core.SVGTransform;
import fr.hd3d.html5.svg.client.core.SVGViewSpec;
import fr.hd3d.html5.svg.client.dom.SVGElement;

public interface ISVGSVGElement extends ISVGConditionalProcessingElement, ISVGStylable, ISVGLocatable, ISVGFitToViewBox, ISVGZoomAndPan {
    public SVGAnimatedLength getX();

    void setX(int x, Unit unit);

    public SVGAnimatedLength getY();

    void setY(int y, Unit unit);

    public SVGAnimatedLength getWidth();

    void setWidth(int width, Unit unit);

    public SVGAnimatedLength getHeight();

    void setHeight(int height, Unit unit);

    public String getContentScriptType();

    public void setContentScriptType(String value);

    public String getContentStyleType();

    public void setContentStyleType(String value);

    public SVGRect getViewport();

    public float getPixelUnitToMillimeterX();

    public float getPixelUnitToMillimeterY();

    public float getScreenPixelToMillimeterX();

    public float getScreenPixelToMillimeterY();

    public boolean isUseCurrentView();

    public SVGViewSpec getCurrentView();

    public float getCurrentScale();

    public void setCurrentScale(float value);

    public SVGPoint getCurrentTranslate();

    public int suspendRedraw(int maxWaitMilliseconds);

    public void unsuspendRedraw(int suspendHandleId);

    public void unsuspendRedrawAll();

    public void forceRedraw();

    public void pauseAnimations();

    public void unpauseAnimations();

    public boolean isAnimationsPaused();

    public float getCurrentTime();

    public void setCurrentTime(float seconds);

    public NodeList<? extends Node> getIntersectionList(SVGRect rect, SVGElement referenceElement);

    public NodeList<? extends Node> getEnclosureList(SVGRect rect, SVGElement referenceElement);

    public boolean checkIntersection(SVGElement element, SVGRect rect);

    public boolean checkEnclosure(SVGElement element, SVGRect rect);

    public void deselectAll();

    public SVGNumber createSVGNumber();

    public SVGLength createSVGLength();

    public SVGAngle createSVGAngle();

    public SVGPoint createSVGPoint();

    public SVGMatrix createSVGMatrix();

    public SVGRect createSVGRect();

    public SVGTransform createSVGTransform();

    public SVGTransform createSVGTransformFromMatrix(SVGMatrix matrix);

    public Element getElementById(String elementId);
}
