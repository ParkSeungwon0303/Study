package chapter3.practice;

public class Practice9 {
    public static void main(String[] args) {
        int[] myArray = new int[2];
        myArray[0] = 1;
        myArray[1] = myArray[0] + 1;

        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
    }
}
