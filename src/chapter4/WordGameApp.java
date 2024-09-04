package chapter4;

import java.util.Scanner;

public class WordGameApp {
    Scanner scanner = new Scanner(System.in);
    private Player[] player;

    public WordGameApp () {

    }

    public void run() {
        System.out.println("끝말잇기 게임을 시작합니다...");
        System.out.print("게임을 참가하는 인원은 몇명입니까>>");
        player = new Player[scanner.nextInt()];
        for (int i = 0; i < player.length; i++) {
            System.out.print("참가자의 이름을 입력하세요>>");
            player[i] = new Player(scanner.next());
        }

        System.out.println("시작 단어는 아버지입니다.");
        player[0].getWordFromUser("아버지");

        while (true) {
            for (int i = 0; i < player.length; i++) {
                System.out.print(player[i].getName()+">>");
                String word = scanner.next();

                if (!player[i].checkSuccess(word)) {
                    System.out.println(player[i] + "이 졌습니다.");
                    break;
                }

                player[i].getWordFromUser(word);


            }
        }

    }

    public static void main(String[] args) {
        WordGameApp wordGameApp = new WordGameApp();
        wordGameApp.run();
    }
}
