package study.quiz2;

import java.util.Scanner;

public class Quiz2Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생수를 입력해주세요.");
        int count = scanner.nextInt();
        Student[] students = new Student[count];

        // 정보 입력
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번째 학생의 이름을 입력해주세요.");
            String name = scanner.next();
            System.out.println((i + 1) + "번째 학생의 국어 점수를 입력해주세요.");
            int korScore = scanner.nextInt();
            System.out.println((i + 1) + "번째 학생의 영어 점수를 입력해주세요.");
            int engScore = scanner.nextInt();
            System.out.println((i + 1) + "번째 학생의 수학 점수를 입력해주세요.");
            int mathScore = scanner.nextInt();

            students[i] = new Student(name, korScore, engScore, mathScore);
        }

        // 정보 출력
        for (int i = 0; i < count; i++) {
            for (String s : students[i].getStudentScore().keySet()) {
                System.out.println(s + "학생의 총 점수는" + TotalAvg.getTotalScore(students[i].getScore()) + " 평균은 " + TotalAvg.getAvgScore(students[i].getScore()));
            }
        }
    }

}
