
public class RectangleCoordinates {

    private int x0;
    private int x1;
    private int y0;
    private int y1;

    RectangleCoordinates () {
        this.x0 = 0;
        this.x1 = 0;
        this.y0 = 0;
        this.y1 = 0;
    }

    RectangleCoordinates (int x0, int y0, int x1, int y1) {
        this.x0 = x0;
        this.x1 = x1;
        this.y0 = y0;
        this.y1 = y1;
    }

    public String info() {
        return "x0: " + this.x0 + " y0: " + this.y0 + " x1: " + this.x1 + " y1: " + this.y1;
    }

    public double rectangleArea () {
        return Math.abs(x0 - x1) * Math.abs(y0 - y1);
    }

    public boolean squareCheck () {
        return Math.abs(this.x0 - this.x1) == Math.abs(this.y0 - this.y1);
    }
}