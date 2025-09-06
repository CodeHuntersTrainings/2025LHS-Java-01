package examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DisneyExceptions {

    public static void simulateNullPointer() {
        try {
            String character = null;
            System.out.println(character.length()); //NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException:");
            e.printStackTrace();
        }
    }

    public static void simulateArrayIndex() {
        try {
            String[] dwarfs = {"Doc", "Grumpy", "Happy"};
            System.out.println(dwarfs[5]); //ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException:");
            e.printStackTrace();
        }
    }

    public static void simulateArithmetic() {
        try {
            int result = 10 / 0; //ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException:");
            e.printStackTrace();
        }
    }

    public static void simulateNumberFormat() {
        try {
            int age = Integer.parseInt("Simba"); //NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException:");
            e.printStackTrace();
        }
    }

    public static void simulateCustomWrapped() {
        try {
            causeBeastAnger();
        } catch (RuntimeException e) {
            System.out.println("Caught Wrapped RuntimeException:");
            e.printStackTrace();
        }
    }

    private static void causeBeastAnger() {
        try {
            throw new IllegalArgumentException("Belle left the castle!");
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Beast is angry!", e); // wrapper
        }
    }

    public static void simulateIOExceptionWrapped() {
        try {
            readMagicScroll("nonexistent_scroll.txt");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException wrapping IOException:");
            e.printStackTrace();
        }
    }

    private static void readMagicScroll(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            br.readLine(); //FileNotFoundException or IOException
        } catch (IOException e) {
            throw new RuntimeException("Failed to read the magic scroll: " + fileName, e);
        }
    }
}
