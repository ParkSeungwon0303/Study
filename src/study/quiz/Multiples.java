package study.quiz;

public class Multiples {
    private int count;
    protected int factor;

    public Multiples(int factor) {
        this.factor = factor;
    }

    public int getFactor() {
        return factor;
    }

    public int multiple(int[] num) {
        for (int i : num) {
            if (i % factor == 0 && i != 0) {
                count++;
            }
        }
        return count;
    }
}
