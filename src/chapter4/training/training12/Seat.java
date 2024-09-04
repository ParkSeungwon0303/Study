package chapter4.training.training12;

public class Seat {
    private String[] seat = new String[10];

    public Seat() {
        for (int i = 0; i < seat.length; i++) {
            seat[i] = "---";
        }
    }

    public String[] getSeat() {
        return seat;
    }

    public void setSeat(String seat, int num) {
        this.seat[num] = seat;
    }
}
