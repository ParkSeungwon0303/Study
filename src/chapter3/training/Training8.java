package chapter3.training;

import java.util.Scanner;

public class Training8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 몇개?");
        int count = scanner.nextInt();
        while (true) {
            if (count > 100 || count < 1) {
                System.out.println("1부터 100까지의 수만 가능합니다.");
                count = scanner.nextInt();
            } else {
                break;
            }
        }

        int[] nums = new int[count];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100 + 1);
            for (int j = 0; j < i; j++) {
                while (true) {
                    if (nums[j] == nums[i]) {
                        nums[i] = (int) (Math.random() * 100 + 1);
                        j = 0;
                    } else {
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(nums[i] + " ");
        }

    }
}


//{
//int randomNum = (int) (Math.random() * 100 + 1);
//            while (true) {
//                    for (int j = 0; j < i; j++) {
//        if (nums[j] != randomNum) {
//        break;
//        } else {
//randomNum = (int) (Math.random() * 100 + 1);
//        }
//        }
//
//        }
//nums[i] = randomNum;
//        }