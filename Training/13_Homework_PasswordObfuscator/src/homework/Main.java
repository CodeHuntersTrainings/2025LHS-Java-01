package homework;

public class Main {

    public static String obfuscatePassword(String input) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append('*');
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Password123!";
        String obfuscated = obfuscatePassword(input);
        System.out.println(obfuscated);  // Output: ********123!
    }
}