package study.quiz4;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz3Main extends DBManager {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생수를 입력해주세요.");
        int count = scanner.nextInt();
        ArrayList<HashMap<String, Object>> student = new ArrayList<>();

        // 정보 입력
        for (int i = 0; i < count; i++) {
            HashMap<String, Object> score = new HashMap<>();

            System.out.println((i + 1) + "번째 학생의 이름을 입력해주세요.");
            String name = scanner.next();
            score.put("name", name);

            System.out.println((i + 1) + "번째 학생의 국어 점수를 입력해주세요.");
            int korScore = scanner.nextInt();
            score.put("kor", korScore);

            System.out.println((i + 1) + "번째 학생의 영어 점수를 입력해주세요.");
            int engScore = scanner.nextInt();
            score.put("eng", engScore);

            System.out.println((i + 1) + "번째 학생의 수학 점수를 입력해주세요.");
            int mathScore = scanner.nextInt();
            score.put("math", mathScore);

            int totalScore = korScore + engScore + mathScore;
            score.put("total", totalScore);

            double avgScore = totalScore / 3.0;
            score.put("avg", avgScore);

            // JDBC 이용
            insert(name, korScore, engScore, mathScore, totalScore, avgScore);
            // HashMap 이용
            student.add(score);
        }

        // JDBC 이용
        select();

        // ArrayList, HashMap 이용
        for (HashMap<String, Object> score : student) {
            System.out.println(score.get("name") + " 학생의 총점은 " + score.get("total") + " 평균은 " + score.get("avg"));
        }


    }

}
