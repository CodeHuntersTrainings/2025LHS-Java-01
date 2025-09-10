package app;

import calculator.Calculator;

public class App {
    public static void main(String[] args) {
        int result = Calculator.add(5, 3);
        System.out.println("5 + 3 = " + result);
    }
}
