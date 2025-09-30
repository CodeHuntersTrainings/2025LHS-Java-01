package password;

public class Password {

    public String checkPasswordStrengthV3(String password) {
        String passedResult = "OK";
        String failedResult = "WEAK";

        if (password.contains("!") && password.contains("#")) {
            return passedResult;
        }

        return failedResult;
        //return null;
    }

    public static String checkPasswordStrengthV4(String password) {
        String passedResult = "OK";
        String failedResult = "WEAK";

        if (password.contains("!") && password.contains("#")) {
            return passedResult;
        }

        return failedResult;
        //return null;
    }

}
