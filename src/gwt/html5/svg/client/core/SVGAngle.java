package gwt.html5.svg.client.core;

import com.google.gwt.core.client.JavaScriptObject;

public class SVGAngle extends JavaScriptObject {
    public enum AngleUnitType {
        UNKNOWN, UNSPECIFIED, DEG, RAD, GRAD;
    }

    protected SVGAngle() {
    }

    /**
     * @return The type of the value as specified by one of the {@link AngleUnitType}
     */
    public final AngleUnitType getUnitType() {
        return AngleUnitType.values()[getUnitTypeValue()];
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
     *            The {@link AngleUnitType} for the value.
     * @param valueInSpecifiedUnits
     *            The new value.
     */
    public final void setNewValueSpecifiedUnits(AngleUnitType unitType, float valueInSpecifiedUnits) {
        setNewValueSpecifiedUnits((short) unitType.ordinal(), valueInSpecifiedUnits);
    }

    private final native void setNewValueSpecifiedUnits(short unitType, float valueInSpecifiedUnits) /*-{
                                                                                                     this.newValueSpecifiedUnits(unitType, valueInSpecifiedUnits);
                                                                                                     }-*/;

    /**
     * Preserve the same underlying stored value, but reset the stored unit identifier to the given unitType. Object
     * attributes unitType, valueInSpecifiedUnits and valueAsString might be modified as a result of this method.
     * 
     * @param unitType
     *            The {@link AngleUnitType} to switch to.
     */
    public final void convertToSpecifiedUnits(AngleUnitType unitType) {
        this.convertToSpecifiedUnits((short) unitType.ordinal());
    };

    private final native void convertToSpecifiedUnits(short unitType) /*-{
                                                                      this.convertToSpecifiedUnits(unitType);
                                                                      }-*/;
}
