package chapter3.training;

public class Training7 {

    public static void main(String[] args) {
        int[] randomInt = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            randomInt[i] = (int) (Math.random() * 10 + 1);
        }

        System.out.print("랜덤한 정수들 : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(randomInt[i] + " ");
            sum += randomInt[i];
        }
        System.out.println();
        System.out.println("평균은 " + (double) sum / randomInt.length);
    }

}
