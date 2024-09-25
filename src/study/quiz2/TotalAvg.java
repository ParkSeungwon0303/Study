package study.quiz2;

import java.util.ArrayList;

public class TotalAvg {
    public static int getTotalScore(ArrayList<Integer> score) {
        int totalScore = 0;
        for (int i = 0; i < score.size(); i++) {
            totalScore += score.get(i);
        }
        return totalScore;
    }

    public static double getAvgScore(ArrayList<Integer> score) {
        return (double) getTotalScore(score) / score.size();
    }

}
