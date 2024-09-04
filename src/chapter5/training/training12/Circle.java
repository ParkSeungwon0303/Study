package chapter5.training.training12;

public class Circle extends Shape {
    private Shape circle;
    public Circle() {
        setNext(circle);
    }

    @Override
    public void draw() {
        System.out.println(getNext());
    }
}
