package alg;

public class Main {

    public static void main(String[] args) {
        // Array of superhero names
        String[] heroes = {"Iron Man", "Spider-Man", "Hulk", "Black Panther", "Thor", "Captain Marvel"};

        // TASK 1: Create array to store the lengths of each hero's name
        int[] nameLengths = new int[heroes.length];
        for (int i = 0; i < heroes.length; i++) {
            nameLengths[i] = heroes[i].length();
        }

        // a) Average length of names
        double averageLength = calculateAverageLength(nameLengths);
        System.out.println("Average name length: " + averageLength);

        // b) Length of the longest name
        int longestLength = findLongestLength(nameLengths);
        System.out.println("Longest name length: " + longestLength);

        // c) Length and index of longest name
        int[] result = findLongestLengthAndIndex(nameLengths);
        System.out.println("Longest name length: " + result[0] + ", at index: " + result[1]);

        // d) Is there a number divisible by both 3 and 11?
        boolean hasDivisibleBy3And11 = checkDivisibleBy3And11(nameLengths);
        System.out.println("Any name length divisible by both 3 and 11? " + hasDivisibleBy3And11);

        // e) Search for a superhero name
        String searchTerm = "Hulk";
        int foundIndex = searchHero(heroes, searchTerm);
        if (foundIndex != -1) {
            System.out.println(searchTerm + " found at index: " + foundIndex);
        } else {
            System.out.println(searchTerm + " not found.");
        }
    }

    // a) Method to calculate average
    public static double calculateAverageLength(int[] lengths) {
        // TODO: Implement
        return 0;
    }

    // b) Method to find longest name length
    public static int findLongestLength(int[] lengths) {
        // TODO: Implement
        return 0;
    }

    // c) Method to find longest name length and its index
    public static int[] findLongestLengthAndIndex(int[] lengths) {
        // TODO: Implement
        return new int[]{0, -1}; // Format: {length, index}
    }

    // d) Method to check if any name length is divisible by 3 and 11
    public static boolean checkDivisibleBy3And11(int[] lengths) {
        // TODO: Implement
        return false;
    }

    // e) Method to search for a hero name and return its index
    public static int searchHero(String[] names, String target) {
        // TODO: Implement
        return -1;
    }
}