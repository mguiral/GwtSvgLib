package gwt.html5.svg.client.user.ui;

import com.google.gwt.user.client.Element;

import gwt.html5.svg.client.ISVGElement;
import gwt.html5.svg.client.core.SVGStringList;
import gwt.html5.svg.client.dom.SVGConditionalProcessingElement;

public abstract class ConditionnalProcessinsSVGWidget extends BaseSVGWidget implements ISVGElement {
    private SVGConditionalProcessingElement element;

    @Override
    protected void setElement(Element elem) {
        super.setElement(elem);
        this.element = elem.cast();
    }

    public SVGStringList getRequiredExtensions() {
        return element.getRequiredExtensions();
    }

    public SVGStringList getRequiredFeatures() {
        return element.getRequiredFeatures();
    }

    public SVGStringList getSystemLanguage() {
        return element.getSystemLanguage();
    }

    public boolean hasExtension(String extension) {
        return element.hasExtension(extension);
    }
}
