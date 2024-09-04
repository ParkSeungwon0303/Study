package chapter5.training.training3;

public class Won2Dollar extends Converter {
    private double won;
    public Won2Dollar(double won) {
        this.won = won;
    }
    @Override
    protected double convert(double src) {
        return src / won;
    }

    @Override
    protected String getSrcString() {
        return "원";
    }

    @Override
    protected String getDestString() {
        return "달러";
    }
}
