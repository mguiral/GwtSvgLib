package gwt.html5.svg.client;

import gwt.html5.svg.client.core.SVGStringList;

public interface ISVGTests {
    /**
     * @return Corresponds to attribute "requiredFeatures" on the given element.
     */
    public SVGStringList getRequiredFeatures();

    /**
     * @return Corresponds to attribute "requiredExtensions" on the given element.
     */
    public SVGStringList getRequiredExtensions();

    /**
     * @return Corresponds to attribute "systemLanguage" on the given element.
     */
    public SVGStringList getSystemLanguage();

    /**
     * Returns true if the user agent supports the given extension, specified by a URI.
     * 
     * @param extension
     *            The name of the extension, expressed as a URI.
     * @return True or false, depending on whether the given extension is supported
     */
    public boolean hasExtension(String extension);
}
