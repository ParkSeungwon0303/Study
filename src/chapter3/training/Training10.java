package chapter3.training;

public class Training10 {

    public static void main(String[] args) {
        int[][] array = new int[4][4];

        for (int i = 0; i < 10; i++) {
            while (true) {
                int a = (int) (Math.random() * 4);
                int b = (int) (Math.random() * 4);
                if (array[a][b] == 0) {
                    array[a][b] = (int) (Math.random() * 10 + 1);
                    break;
                }
            }
        }

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
