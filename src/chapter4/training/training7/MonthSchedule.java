package chapter4.training.training7;

import java.util.Scanner;

public class MonthSchedule {
    public static void main(String[] args) {
        Day[] day = new Day[30];
        for (int i = 0; i < day.length; i++) {
            day[i] = new Day();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("이번달 스케쥴 관리 프로그램");
        while (true) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    System.out.print("날짜(1~30)?");
                    num = scanner.nextInt() - 1;
                    System.out.print("할일(빈칸없이입력)?");
                    day[num].setWork(scanner.next());
                    break;
                case 2:
                    System.out.print("날짜(1~30)?");
                    num = scanner.nextInt() - 1;
                    System.out.print(num + "일의 할 일은 " + day[num].getWork());
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }
    }
}
