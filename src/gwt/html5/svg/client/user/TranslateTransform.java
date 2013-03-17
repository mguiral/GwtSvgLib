package gwt.html5.svg.client.user;

public class TranslateTransform extends Transform {
    private float tx;
    private float ty;

    public TranslateTransform(float tx) {
        this(tx, -1);
    }

    public TranslateTransform(float tx, float ty) {
        this.tx = tx;
        this.ty = ty;
    }

    @Override
    public String getTransform() {
        String value = "translate(" + tx;
        if (ty > -1) {
            value += "," + ty;
        }
        value += ")";
        return value;
    }
}
