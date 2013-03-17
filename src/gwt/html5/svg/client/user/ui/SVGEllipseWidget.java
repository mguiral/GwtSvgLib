package gwt.html5.svg.client.user.ui;

import com.google.gwt.dom.client.Style.Unit;

import gwt.html5.svg.client.ISVGEllipseElement;
import gwt.html5.svg.client.core.SVGAnimatedLength;
import gwt.html5.svg.client.dom.SVGDomHelper;
import gwt.html5.svg.client.dom.SVGEllipseElement;

public class SVGEllipseWidget extends SVGGraphicalWidget implements ISVGEllipseElement {
    private SVGEllipseElement ellipseElement;

    public SVGEllipseWidget(int cx, int cy, int rx, int ry, Unit unit) {
        this(rx, ry, unit);
        setCx(cx, unit);
        setCy(cy, unit);
    }

    public SVGEllipseWidget(int rx, int ry, Unit unit) {
        ellipseElement = SVGEllipseElement.as(SVGDomHelper.createElementNS(SVGEllipseElement.TAG));
        setElement(ellipseElement);
        setRx(rx, unit);
        setRy(ry, unit);
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGEllipseElement#getCx()
     */
    @Override
    public SVGAnimatedLength getCx() {
        return ellipseElement.getCx();
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGEllipseElement#getCy()
     */
    @Override
    public SVGAnimatedLength getCy() {
        return ellipseElement.getCy();
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGEllipseElement#getRx()
     */
    @Override
    public SVGAnimatedLength getRx() {
        return ellipseElement.getRx();
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGEllipseElement#getRy()
     */
    @Override
    public SVGAnimatedLength getRy() {
        return ellipseElement.getRy();
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGEllipseElement#setCx(int)
     */
    @Override
    public void setCx(int cx, Unit unit) {
        ellipseElement.getCx().getBaseVal().setValueAsString(cx + unit.getType());
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGEllipseElement#setCy(int)
     */
    @Override
    public void setCy(int cy, Unit unit) {
        ellipseElement.getCy().getBaseVal().setValueAsString(cy + unit.getType());
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGEllipseElement#setRx(int)
     */
    @Override
    public void setRx(int rx, Unit unit) {
        ellipseElement.getRx().getBaseVal().setValueAsString(rx + unit.getType());
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.hd3d.html5.svg.client.ISVGEllipseElement#setRy(int)
     */
    @Override
    public void setRy(int ry, Unit unit) {
        ellipseElement.getRy().getBaseVal().setValueAsString(ry + unit.getType());
    }
}
