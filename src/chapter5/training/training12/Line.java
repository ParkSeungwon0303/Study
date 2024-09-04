package chapter5.training.training12;

public class Line extends Shape {
    private Shape line;
    public Line() {
        setNext(line);
    }

    @Override
    public void draw() {
        System.out.println(getNext());
    }
}
