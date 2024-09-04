package chapter3.practice;

public class Practice3 {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        while (i < 100) {
            if (i % 3 != 0) {
                i++;
                continue;
            } else {
                sum += i;
                i++;
            }
        }
        System.out.println("1부터 100까지의 3의 배수의 합은 " + sum);
    }
}
