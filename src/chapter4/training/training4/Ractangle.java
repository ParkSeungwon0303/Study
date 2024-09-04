package chapter4.training.training4;

public class Ractangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Ractangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void show() {
        System.out.println("(" + x + "," + "y" + ")에서 크기가 " + width + "x" + height + "인 사각형");
    }

    public int square() {
        return width * height;
    }
// x=1 , a=11, y=1, b=11 / r.x=5, c=11, r.y=6 d=11
    public boolean contains(Ractangle r) {
        int a = x + width;
        int b = y + height;
        int c = r.x + r.width;
        int d = r.y + r.height;

        return x < r.x && y < r.y && a > c && b > d;

    }

}
