package fr.hd3d.html5.svg.client.user;

public class MatrixTransform extends Transform {
    private Matrix matrix;

    public MatrixTransform(Matrix matrix) {
        this.matrix = matrix;
    }

    public MatrixTransform(int a, int b, int c, int d, int e, int f) {
        this.matrix = new Matrix(a, b, c, d, e, f);
    }

    @Override
    public String getTransform() {
        String value = "matrix(";
        value += matrix.getA() + "," + matrix.getB() + "," + matrix.getC() + "," + matrix.getD() + "," + matrix.getE() + "," + matrix.getF() + ")";
        return value;
    }
}
