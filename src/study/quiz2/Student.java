package study.quiz2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Student {
    static int num;
    ArrayList<Integer> score = new ArrayList<>(3);
    HashMap<String, ArrayList> studentScore = new HashMap<>();

    public Student (String name, int korScore, int engScore, int mathScore) {
        score.add(korScore);
        score.add(engScore);
        score.add(mathScore);
        studentScore.put(name, score);
    }

    public ArrayList<Integer> getScore() {
        return score;
    }

    public HashMap<String, ArrayList> getStudentScore() {
        return studentScore;
    }
}
