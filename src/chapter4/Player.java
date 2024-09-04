package chapter4;

public class Player {
    private String name;
    private String word;

    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
    }

    public void getWordFromUser(String word) {
        this.word = word;
    }

    public boolean checkSuccess(String word) {
        int lastIndex = this.word.length() - 1;
        char lastChar = this.word.charAt(lastIndex);
        char firstChar = word.charAt(0);
        return lastChar == firstChar;
    }
}
