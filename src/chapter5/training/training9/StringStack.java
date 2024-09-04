package chapter5.training.training9;

public class StringStack implements Stack {
    private int top;
    private String[] val;

    public StringStack(int num) {
        top = 0;
        val = new String[num];
    }

    @Override
    public int length() {
        return top;
    }

    @Override
    public int capacity() {
        return val.length;
    }

    @Override
    public String pop() {
        return val[--top];
    }

    @Override
    public boolean push(String val) {

        if (top < this.val.length) {
            this.val[top] = val;
            top++;
            return true;
        } else {
            return false;
        }
    }
}
