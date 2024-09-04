package chapter3.training;

public class Training13 {

    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++) {
            if (30 <= i && i < 40) {
                if ((i - 30) % 3 == 0 && i != 30) {
                    System.out.println(i + " 박수 짝짝");
                } else {
                    System.out.println(i + " 박수 짝");
                }
            } else if (60 <= i && i < 70) {
                if ((i - 60) % 3 == 0 && i != 60) {
                    System.out.println(i + " 박수 짝짝");
                } else {
                    System.out.println(i + " 박수 짝");
                }
            } else if (90 <= i && i < 100) {
                if ((i - 90) % 3 == 0 && i != 90) {
                    System.out.println(i + " 박수 짝짝");
                } else {
                    System.out.println(i + " 박수 짝");
                }
            } else {
                int j = i;
                while (true) {
                    if (j == 3 || j == 6 || j == 9) {
                        System.out.println(i + " 박수 짝");
                        break;
                    }
                    if (j < 10) {
                        break;
                    }
                    j -= 10;
                }

            }
        }
    }
}
