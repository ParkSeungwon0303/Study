package chapter5.training.training11;

public abstract class Calc {
    private int a, b;

    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    };

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    abstract public int calculate();

}
