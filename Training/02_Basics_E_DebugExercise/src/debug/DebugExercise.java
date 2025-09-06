package debug;

public class DebugExercise {

    public static void main(String[] args) {
        int number = 0;

        while (number < 200) {
            number++;
            if (number % 7 == 0 && number > 200) {
                System.out.println("Found it: " + number);
                break;
            }
        }

        System.out.println("Done searching.");
    }
}
