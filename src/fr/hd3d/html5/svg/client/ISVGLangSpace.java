package fr.hd3d.html5.svg.client;

public interface ISVGLangSpace {
    /**
     * @return Corresponds to attribute "xml:lang" on the given element.
     */
    public String getXmlLang();

    void setXmlLang(String value);

    /**
     * @return Corresponds to attribute "xml:space" on the given element.
     */
    public String getXmlSpace();

    void setXmlSpace(String value);
}
