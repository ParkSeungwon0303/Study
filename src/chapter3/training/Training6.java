package chapter3.training;

import java.util.Scanner;

public class Training6 {
    public static void main(String[] args) {
        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류
        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int money = scanner.nextInt();

        for (int i : unit) {
            int count = 0;
            while (true) {
                if (money - i >= 0) {
                    money -= i;
                    count++;
                } else {
                    break;
                }
            }
            if (count != 0) {
                System.out.println(i+"원 짜리 : " + count + "개");
            }

        }

    }
}
