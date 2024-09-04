package chapter3.training;

public class Training13_2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++) {
            int count = 0, won, ten = 0;
            ten = i / 10;
            won = i % 10;

            if (won == 3 || won == 6 || won == 9) {
                count++;
            }
            if (ten == 3 || ten == 6 || ten == 9) {
                count++;
            }

            switch (count) {
                case 0:
                    break;
                case 1:
                    System.out.println(i + " 박수 짝");
                    break;
                case 2:
                    System.out.println(i + " 박수 짝짝");
                    break;
            }
        }
    }
}
