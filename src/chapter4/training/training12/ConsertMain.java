package chapter4.training.training12;

import java.util.Scanner;

public class ConsertMain {
    public static void main(String[] args) {
        Reservation reservation = new Reservation();
        Scanner scanner = new Scanner(System.in);

        System.out.println("명품콘서트홀 예약 시스템입니다.");

        while (true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.print("좌석구분 S(1), A(2), B(3)>>");
                    int grade = scanner.nextInt();
                    for (int i = 0; i < 10; i++) {
                        System.out.print(reservation.getSeat()[grade - 1].getSeat()[i] + " ");
                    }
                    System.out.println();
                    System.out.print("이름>>");
                    String name = scanner.next();
                    System.out.print("번호>>");
                    int num = scanner.nextInt();
                    reservation.reservation(grade, name, num);
                    break;
                case 2:
                    reservation.check();
                    System.out.println("<<<조회를 완료하였습니다.>>>");
                    break;
                case 3:
                    System.out.print("좌석구분 S(1), A(2), B(3)>>");
                    grade = scanner.nextInt();
                    for (int i = 0; i < 10; i++) {
                        System.out.print(reservation.getSeat()[grade - 1].getSeat()[i] + " ");
                    }
                    System.out.println();
                    System.out.println("이름>>");
                    name = scanner.next();
                    reservation.cancel(grade, name);
                    break;
                case 4:
                    return;
            }
        }
    }
}
