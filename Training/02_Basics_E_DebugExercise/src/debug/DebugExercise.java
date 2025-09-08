package debug;

public class DebugExercise {

    public static void main(String[] args) {
        int number = 0;

        while (number < 10_000) {
            number++;
            if (number % 7 == 0 && number > 200) {
                System.out.println("Found it: " + number);
                break;
            }
        }

        System.out.println("Done searching.");

        //Take a byte with the value 1 and increase it in a while loop infinitely.
        //What do you observe?
        //for (byte i = 0; ; i++) {
        //    System.out.println(i);
        //}

        byte num = 0;
        while (true) {
            System.out.println(num++);
        }
    }
}
