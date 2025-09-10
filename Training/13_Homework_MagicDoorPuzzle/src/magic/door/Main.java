package magic.door;

public class Main {

    public static boolean canOpenMagicDoor(int[] numbers) {
        int sum = 0;

        //Index: YES
        //for (int i = 0; i < numbers.length; i++) {
        //    sum += numbers[i];
        //}

        //Enhanced for loop: foreach
        //Index: NO
        for (int num : numbers) {
            sum += num;
        }

        if (sum % 11 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] test1 = {5, 3, 3};       // Sum = 11 → true
        int[] test2 = {1, 2, 3, 4};    // Sum = 10 → false

        System.out.println(canOpenMagicDoor(test1)); // true
        System.out.println(canOpenMagicDoor(test2)); // false
    }
}