package chapter3.training;

public class Training2 {
    public static void main(String[] args) {
        int[][] n = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};

        for (int i = 0; i < n.length; i++) {
            System.out.println();
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + " ");
            }
        }

        for (int[] ints : n) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
    }
}
