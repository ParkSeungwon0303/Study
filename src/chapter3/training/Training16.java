package chapter3.training;

import java.util.Scanner;

public class Training16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = {"가위", "바위", "보"};
        int userRsp = 0, comRsp = 0;
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        while (true) {
            System.out.print("가위 바위 보!>>");
            String rsp = scanner.next();
            int n = (int) (Math.random() * 3);

            for (int i = 0; i < str.length; i++) {
                if (rsp.equals(str[i])) {
                    userRsp = i;
                }
                if (i == n) {
                    comRsp = i;
                }
            }

            if (rsp.equals("그만")) {
                break;
            }

            System.out.print("사용자 = " + str[userRsp] + ", 컴퓨터 = " + str[comRsp] + ", ");
            if (userRsp - comRsp == 0) {
                System.out.println("비겼습니다.");
            } else if (userRsp - comRsp == 1 || userRsp - comRsp == -2) {
                System.out.println("이겼습니다.");
            } else if (userRsp - comRsp == -1 || userRsp - comRsp == 2) {
                System.out.println("졌습니다.");
            }
        }




    }
}
