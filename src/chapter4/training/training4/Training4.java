package chapter4.training.training4;

public class Training4 {
    public static void main(String[] args) {
        Ractangle r = new Ractangle(2, 2, 8, 7);
        Ractangle s = new Ractangle(5, 5, 6, 6);
        Ractangle t = new Ractangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if (t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if (t.contains(s)) System.out.println("t는 s을 포함합니다.");
    }
}
