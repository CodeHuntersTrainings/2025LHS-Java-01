package dice;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int rolls = 1000;
        int[] frequency = new int[13];  // index 0 and 1 unused, sums from 2 to 12

        Random random = new Random();

        // Simulate dice rolls
        for (int i = 0; i < rolls; i++) {
            int die1 = random.nextInt(6) + 1;  // 1 to 6
            int die2 = random.nextInt(6) + 1;  // 1 to 6
            int sum = die1 + die2;
            frequency[sum]++;
        }

        // Print results in reverse (from sum=12 down to 2)
        System.out.println("Sum : Frequency");
        for (int sum = 12; sum >= 2; sum--) {
            System.out.println(sum + " : " + frequency[sum]);
        }
    }
}