package chapter5.training.training11;

public class Sub extends Calc {

    @Override
    public int calculate() {
        return super.getA() - super.getB();
    }
}
