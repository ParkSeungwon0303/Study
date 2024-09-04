package chapter5.training.training7;

public class Point3D extends Point{
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")의 점";
    }

    public void moveUp() {
        z += 1;
    }

    public void moveDown() {
        z -= 1;
    }

    public void move(int x, int y) {
        super.move(x, y);
    }

    public void move(int x, int y, int z) {
        super.move(x, y);
        this.z = z;
    }
}
