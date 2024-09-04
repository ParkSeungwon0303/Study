package chapter3.practice;

public class Practice12 {
    public static void main(String[] args) {
        double[][] doubles  = {{1.1, 1.2, 1.2, 1.4}, {2.1, 2.2}, {3.1, 3.2, 1.2}, {4.1}};
        for (double[] aDouble : doubles) {
            System.out.println("----------------");
            for (double v : aDouble) {
                System.out.println(v);
            }
        }
    }
}
