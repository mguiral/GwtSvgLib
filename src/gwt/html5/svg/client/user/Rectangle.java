package gwt.html5.svg.client.user;

public class Rectangle extends Point {
    private int width;
    private int heigth;

    public Rectangle(float x, float y, int width, int heigth) {
        super(x, y);
        this.width = width;
        this.heigth = heigth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.width + " " + this.heigth;
    }
}
