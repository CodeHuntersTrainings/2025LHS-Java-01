package hu.codehunters.password;

public class PasswordObfuscator {

    //IN: Password123!
    //OUT:P*******123!
    public String obfuscatePasswordV1(String password) {
        String result = "";

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += "*"; // result = result + "*";

            } else {
                result += c;
            }
        }

        return result;
    }

    public String obfuscatePasswordV2(String password) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result.append("*"); // result = result + "*";

            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

}
