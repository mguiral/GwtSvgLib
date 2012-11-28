package fr.hd3d.html5.svg.client.user;

public class ScaleTransform extends Transform {
    private final float sx;
    private final float sy;

    public ScaleTransform(float sxy) {
        this(sxy, sxy);
    }

    public ScaleTransform(float sx, float sy) {
        this.sx = sx;
        this.sy = sy;
    }

    @Override
    public String getTransform() {
        String value = "scale(" + sx;
        if (sy != sx) {
            value += "," + sy;
        }
        value += ")";
        return value;
    }
}
