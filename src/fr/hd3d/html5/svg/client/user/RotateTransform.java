package fr.hd3d.html5.svg.client.user;

public class RotateTransform extends Transform {
    private final float angle;
    private final float cx;
    private final float cy;

    public RotateTransform(float angle) {
        this(angle, -1, -1);
    }

    public RotateTransform(float angle, float cx, float cy) {
        this.angle = angle;
        this.cx = cx;
        this.cy = cy;
    }

    @Override
    public String getTransform() {
        String value = "rotate(" + angle;
        if (this.cx > -1 && this.cy > -1) {
            value += "," + cx + "," + cy;
        }
        value += ")";
        return value;
    }
}
