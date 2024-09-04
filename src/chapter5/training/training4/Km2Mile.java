package chapter5.training.training4;

public class Km2Mile extends Converter {
    private double km;
    public Km2Mile(double km) {
        this.km = km;
    }
    @Override
    protected double convert(double src) {
        return src / km;
    }

    @Override
    protected String getSrcString() {
        return "km";
    }

    @Override
    protected String getDestString() {
        return "mile";
    }
}
