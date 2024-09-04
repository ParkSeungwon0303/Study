package chapter3.practice;

public class Practice10 {
    public static void main(String[] args) {
        char[] alpha = {'a', 'b', 'c', 'd'};
        for (int i = 0; i < alpha.length; i++) {
            System.out.println(alpha[i]);
        }
        System.out.println("----------------------");
        for (char c : alpha) {
            System.out.println(c);
        }
    }
}
