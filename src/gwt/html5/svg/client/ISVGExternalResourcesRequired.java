package gwt.html5.svg.client;

public interface ISVGExternalResourcesRequired {
    /**
     * @return Corresponds to attribute "externalResourcesRequired" on the given element. Note that the SVG DOM defines
     *         the attribute "externalResourcesRequired" as being of type SVGAnimatedBoolean, whereas the SVG language
     *         definition says that "externalResourcesRequired" is not animated. Because the SVG language definition
     *         states that "externalResourcesRequired" cannot be animated, the animVal will always be the same as the
     *         baseVal.
     */
    public boolean getExternalResourcesRequired();

    void setExternalResourcesRequired(boolean externalResourceeRequried);
}
