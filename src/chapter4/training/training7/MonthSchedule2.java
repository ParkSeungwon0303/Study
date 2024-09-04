package chapter4.training.training7;

import java.util.Scanner;

public class MonthSchedule2 {
    private Day[] days;
    private Scanner scanner;

    public MonthSchedule2(int a) {
        days = new Day[a];
        scanner = new Scanner(System.in);

        for (int i = 0; i < days.length; i++) {
            days[i] = new Day();
        }
    }

    void input() {
        System.out.print("날짜(1~30)?");
        int day = scanner.nextInt() - 1;
        System.out.print("할일(빈칸없이입력)?");
        days[day].setWork(scanner.next());
    }

    void view() {
        System.out.print("날짜(1~30)?");
        int day = scanner.nextInt() - 1;
        System.out.print(day + "일의 할 일은 " + days[day].getWork());
    }

    void finish() {
        System.out.println("프로그램을 종료합니다.");
    }

    void run() {
        System.out.println("이번달 스케쥴 관리 프로그램");
        while (true) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    input();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    finish();
                    return;
            }
        }

    }

    public static void main(String[] args) {
        MonthSchedule2 april = new MonthSchedule2(30);
        april.run();
    }


}
