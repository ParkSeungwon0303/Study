package study.quiz;

import java.util.Random;

public class Quiz1Main {
    public static void main(String[] args) {
        Multiples[] multiples = new Multiples[3];
        RandomNum randomNum = new RandomNum();
        int[] nums = randomNum.randomNum();

        multiples[0] = new Multiples(2);
        multiples[1] = new Multiples(3);
        multiples[2] = new Multiples(5);

        for (Multiples multiple : multiples) {
            System.out.println(multiple.getFactor() + "의 배수: " + multiple.multiple(nums));
        }

        PrintNum printNum = new PrintNum();
        printNum.print(nums);
    }
}
