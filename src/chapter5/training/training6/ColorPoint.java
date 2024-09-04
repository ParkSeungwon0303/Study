package chapter5.training.training6;

public class ColorPoint extends Point {
    private String color;
    public ColorPoint() {
        super(0, 0);
        color = "BLACK";
    }

    public ColorPoint(int x, int y) {
        super(x, y);
        color = "BLACK";
    }

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void setXY(int x, int y) {
        super.move(x, y);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return color + "색의 (" + getX() + "," + getY() + ")의 점";
    }
}
