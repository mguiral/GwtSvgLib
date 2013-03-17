package gwt.html5.svg.client;

import gwt.html5.svg.client.core.SVGAnimatedString;
import gwt.html5.svg.client.core.SVGStyle;

public interface ISVGStylable {
    /**
     * @return {@link SVGStyle} that contained all the styling properties of the element
     */
    public SVGStyle getStyle();

    /**
     * @return Corresponds to attribute "class" on the given element.
     */
    public SVGAnimatedString getClassName();
}
