package arrays;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] randomNumbers = new int[5]; //0,0,0,0...

        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt();
            System.out.println(randomNumbers[i]);
        }

        System.out.println("Random numbers in reverse: ");
        for (int i = randomNumbers.length - 1; i >= 0; --i) {
            System.out.println(randomNumbers[i]);
        }

        System.out.println("Random numbers in reverse: ");
        for (int i = randomNumbers.length - 1; i >= 0; i = i - 2) {
            System.out.println(randomNumbers[i]);
        }

        System.out.println("Random numbers in reverse: ");
        for (int i = randomNumbers.length - 1; i >= 0; --i) {
            if (i % 2 == 0) { //when index is even
                System.out.println(randomNumbers[i]);
            }
        }

        // The size of the array is fixed. So if we need to add more items than its length,
        // then we need a bigger array.
        //Add: index = 5th (6), value = 150
        int[] extendedRandomNumbers = new int[5 + 1];
        for (int i = 0; i < randomNumbers.length; i++) {
            extendedRandomNumbers[i] = randomNumbers[i];
        }
        extendedRandomNumbers[5] = 150;
        System.out.println();

        int[] randomNumbers2 = {1,5,3,7,9,4,2,9};
        int[] randomNumbers3 = new int[]{1,5,3,7,9,4,2,9};
    }
}