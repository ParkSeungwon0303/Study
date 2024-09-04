package chapter4.training.training10;

import java.util.Scanner;

public class DicMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");
        while (true) {
            System.out.print("한글 단어?");
            String kor = scanner.next();
            if (kor.equals("그만")) break;
            String eng = Dictionary.kor2Eng(kor);
            if (!eng.isEmpty()) {
                System.out.println(kor + "은 " + eng);
            } else {
                System.out.println(kor + "은 저의 사전에 없습니다.");
            }
        }

    }
}
