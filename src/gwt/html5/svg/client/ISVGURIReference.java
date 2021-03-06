package gwt.html5.svg.client;

import gwt.html5.svg.client.core.SVGAnimatedString;
import gwt.html5.svg.client.user.ui.BaseSVGWidget;

public interface ISVGURIReference {
    /**
     * @return Corresponds to attribute "xlink:href" on the given element.
     */
    public SVGAnimatedString getHref();

    public void setHref(BaseSVGWidget href);
}
