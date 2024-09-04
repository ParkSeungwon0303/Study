package study.quiz;

public class PrintNum {

    public void print(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 5 == 0) {
                System.out.println();
            }
            System.out.print(nums[i] + " ");

        }
    }

}
