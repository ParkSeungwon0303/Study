package chapter5.training.training11;

import java.util.Scanner;

public class Training11Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operatorNum = 0;

        System.out.print("두 정수와 연산자를 입력하시오>>");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String operator = scanner.next();

        switch (operator) {
            case "+":
                Add add = new Add();
                add.setValue(a, b);
                operatorNum = add.calculate();
                break;
            case "-":
                Sub sub = new Sub();
                sub.setValue(a, b);
                operatorNum = sub.calculate();
                break;
            case "*":
                Mul mul = new Mul();
                mul.setValue(a, b);
                operatorNum = mul.calculate();
                break;
            case "/":
                Div div = new Div();
                div.setValue(a, b);
                operatorNum = div.calculate();
                break;
        }
        System.out.println(operatorNum);
    }
}