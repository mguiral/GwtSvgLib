package gwt.html5.svg.client.user;

public class SkewXTranform extends Transform {
    private final float skewAngle;

    public SkewXTranform(float skewAngle) {
        this.skewAngle = skewAngle;
    }

    @Override
    public String getTransform() {
        return "skewX(" + skewAngle + ")";
    }
}
