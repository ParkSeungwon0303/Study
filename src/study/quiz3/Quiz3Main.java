package study.quiz3;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Quiz3Main extends DBConn {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        getConnection();
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
            int totalScore = korScore + engScore + mathScore;

            PreparedStatement std = dbConn.prepareStatement("insert into user values(?, ?, ?, ?, ?, ?)");
            std.setString(1, name);
            std.setInt(2, korScore);
            std.setInt(3, engScore);
            std.setInt(4, mathScore);
            std.setInt(5, totalScore);
            std.setDouble(6, totalScore / 3.0);
            int rs = std.executeUpdate();


            students[i] = new Student(name, korScore, engScore, mathScore);
        }

        PreparedStatement std = dbConn.prepareStatement("select * from user");
        ResultSet rs = std.executeQuery();
        while (rs.next()) {
            String name = rs.getString("name");
            int total = rs.getInt("total");
            int avg = rs.getInt("avg");

            System.out.println(name + " 학생의 총점은 " + total + "평균은 " + avg);
        }
        close();
    }

}
