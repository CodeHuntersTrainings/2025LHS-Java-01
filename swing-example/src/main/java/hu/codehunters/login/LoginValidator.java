package hu.codehunters.login;

public class LoginValidator {

    public static boolean validate(String username, String password) {
        return password != null && password.contains("secret");
    }
}