package chapter5.training.training11;

public class Add extends Calc {

    @Override
    public int calculate() {
        return super.getA() + super.getB();
    }
}
