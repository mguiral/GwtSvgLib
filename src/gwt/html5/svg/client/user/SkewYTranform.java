package gwt.html5.svg.client.user;

public class SkewYTranform extends Transform {
    private final float skewAngle;

    public SkewYTranform(float skewAngle) {
        this.skewAngle = skewAngle;
    }

    @Override
    public String getTransform() {
        return "skewY(" + skewAngle + ")";
    }
}
