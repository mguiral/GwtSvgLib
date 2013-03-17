package gwt.html5.svg.client.core;

import com.google.gwt.core.client.JavaScriptObject;

public class SVGLength extends JavaScriptObject {
    public enum LengthUnitType {
        UNKNOWN, NUMBER, PERCENTAGE, EMS, EXS, PX, CM, MM, IN, PT, PC
    }

    protected SVGLength() {
    }

    /**
     * @return The type of the value as specified by one of the {@link LengthUnitType}
     */
    public final LengthUnitType getUnitType() {
        return LengthUnitType.values()[getUnitTypeValue()];
    }

    private final native int getUnitTypeValue() /*-{
                                                return this.unitType;
                                                }-*/;

    /**
     * @return The value as a floating point value, in user units.
     */
    public final native float getValue() /*-{
                                         return this.value;
                                         }-*/;

    /**
     * @param value
     *            The value as a floating point value, in user units. Setting this attribute will cause
     *            valueInSpecifiedUnits and valueAsString to be updated automatically to reflect this setting.
     */
    public final native void setValue(float value) /*-{
                                                   this.value = value;
                                                   }-*/;

    /**
     * @return The value as a floating point value, in the units expressed by unitType
     */
    public final native float getValueInSpecifiedUnits() /*-{
                                                         return this.valueInSpecifiedUnits;
                                                         }-*/;

    /**
     * @param valueInSpecifiedUnits
     *            The value as a floating point value, in the units expressed by unitType. Setting this attribute will
     *            cause value and valueAsString to be updated automatically to reflect this setting.
     */
    public final native void setValueInSpecifiedUnits(float valueInSpecifiedUnits) /*-{
                                                                                   this.valueInSpecifiedUnits = valueInSpecifiedUnits;
                                                                                   }-*/;

    /**
     * @return The value as a string value, in the units expressed by unitType.
     */
    public final native String getValueAsString() /*-{
                                                  return this.valueAsString;
                                                  }-*/;

    /**
     * @param valueAsString
     *            The value as a string value, in the units expressed by unitType. Setting this attribute will cause
     *            value, valueInSpecifiedUnits and unitType to be updated automatically to reflect this setting.
     */
    public final native void setValueAsString(String valueAsString) /*-{
                                                                    this.valueAsString = valueAsString;
                                                                    }-*/;

    /**
     * Reset the value as a number with an associated unitType, thereby replacing the values for all of the attributes
     * on the object.
     * 
     * @param unitType
     *            The {@link LengthUnitType} for the value.
     * @param valueInSpecifiedUnits
     *            The new value.
     */
    public final void setNewValueSpecifiedUnits(LengthUnitType unitType, float valueInSpecifiedUnits) {
        setNewValueSpecifiedUnits((short) unitType.ordinal(), valueInSpecifiedUnits);
    }

    private final native void setNewValueSpecifiedUnits(short unitType, float valueInSpecifiedUnits) /*-{
                                                                                                     this.newValueSpecifiedUnits(unitType, valueInSpecifiedUnits);
                                                                                                     }-*/;

    /**
     * Preserve the same underlying stored value, but reset the stored unit identifier to the given unitType. Object
     * attributes unitType, valueInSpecifiedUnits and valueAsString might be modified as a result of this method. For
     * example, if the original value were "0.5cm" and the method was invoked to convert to millimeters, then the
     * unitType would be changed to {@link LengthUnitType.MM}, valueInSpecifiedUnits would be changed to the numeric
     * value 5 and valueAsString would be changed to "5mm".
     * 
     * @param unitType
     *            The {@link LengthUnitType} to switch to.
     */
    public final void convertToSpecifiedUnits(LengthUnitType unitType) {
        this.convertToSpecifiedUnits((short) unitType.ordinal());
    };

    private final native void convertToSpecifiedUnits(short unitType) /*-{
                                                                      this.convertToSpecifiedUnits(unitType);
                                                                      }-*/;
}
