package chapter4.training.training6;

import java.util.Scanner;

public class CircleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle[] c = new Circle[3];
        for (int i = 0; i < c.length; i++) {
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Circle(x, y, radius);
        }

        int big = 0;
        int bigNum = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i].getRadius() > big) {
                big = c[i].getRadius();
                bigNum = i;
            }
        }
        System.out.print("가장 면적이 큰 원은 ");
        c[bigNum].show();
        scanner.close();
    }
}
