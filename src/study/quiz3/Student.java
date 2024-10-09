package study.quiz3;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    ArrayList<HashMap<String, Object>> student = new ArrayList<>();
    HashMap<String, Object> score = new HashMap<>();

    public Student(String name, int korScore, int engScore, int mathScore) {
        score.put("name", name);
        score.put("kor", korScore);
        score.put("eng", engScore);
        score.put("math", mathScore);
        int total = korScore + engScore + mathScore;
        score.put("total", total);
        score.put("avg", total / 3.0);
        student.add(score);
    }

    public ArrayList<HashMap<String, Object>> getStudent() {
        return student;
    }

    public HashMap<String, Object> getScore() {
        return score;
    }

}
