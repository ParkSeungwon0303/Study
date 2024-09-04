package chapter5.training.training12;

public class Rect extends Shape {
    private Shape rect;
    public Rect() {
        setNext(rect);
    }

    @Override
    public void draw() {
        System.out.println(getNext());
    }
}
