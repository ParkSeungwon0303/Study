package study.quiz;

import java.util.Random;

public class RandomNum {
    private int[] nums = new int[50];

    public int[] randomNum() {
        Random rand = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(10);
        }
        return nums;
    }


}
