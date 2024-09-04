package chapter3;

import java.util.Random;
import java.util.Scanner;

public class UpDown {

    public static void main(String[] args) {
        while (true) {
            Random r = new Random();
            int num = r.nextInt(100);
            Scanner sc = new Scanner(System.in);
            System.out.println("수를 결정하였습니다. 맞추어 보세요");
            int minNum = 0;
            int maxNum = 99;
            int count = 0;
            while (true) {
                System.out.println(minNum + "-" + maxNum);
                int userNum = sc.nextInt();
                count++;
                System.out.println(count + ">>" + userNum);
                if (userNum < num) {
                    System.out.println("더 높게");
                    minNum = userNum;
                } else if (userNum > num) {
                    System.out.println("더 낮게");
                    maxNum = userNum;
                } else {
                    System.out.println("맞았습니다.");
                    break;
                }

            }
            System.out.println("다시하시겠습니까(y/n)");
            String text = sc.next();
            if (text.equals("n")) {
                break;
            }

        }




    }
}
