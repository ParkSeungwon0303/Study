package chapter3.practice;

public class Practice4 {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        while (true) {
            if (i > 50) {
                break;
            }
            sum += i;
            i++;
        }
        System.out.println("1부터 50까지의 합은 " + sum);
    }
}
