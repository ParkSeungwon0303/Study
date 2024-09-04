package chapter4.training.training12;

public class Reservation {
    private String name;
    private String[] grade = {"S", "A", "B"};
    private Seat[] seat = new Seat[3];

    public Reservation() {
        for (int i = 0; i < seat.length; i++) {
            seat[i] = new Seat();
        }
    }

    public void reservation(int grade, String name, int num) {
        switch (grade) {
            case 1:
                seat[0].setSeat(name, num - 1);
                break;
            case 2:
                seat[1].setSeat(name, num - 1);
                break;
            case 3:
                seat[2].setSeat(name, num - 1);
                break;
        }
    }

    public void check() {
        for (int i = 0; i < seat.length; i++) {
            System.out.print(grade[i] + ">> ");
            for (int j = 0; j < seat[i].getSeat().length; j++) {
                System.out.print(seat[i].getSeat()[j] + " ");
            }
            System.out.println();
        }
    }

    public void cancel(int grade, String name) {
        for (int i = 0; i < seat[grade - 1].getSeat().length; i++) {
            if (seat[grade - 1].getSeat()[i].equals(name)) {
                seat[grade - 1].setSeat("---", i);
            }
        }
    }


    public Seat[] getSeat() {
        return seat;
    }
}
