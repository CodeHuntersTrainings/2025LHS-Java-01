package password;

public class Main {
    public static void main(String[] args) {
        String result1 = Main.checkPasswordStrengthV1("Password1234");
        System.out.println(result1);

        String result2 = Main.checkPasswordStrengthV1("Password1234!#");
        System.out.println(result2);

        System.out.println(Main.checkPasswordStrengthV1("Password1234!#sjgyfusgku"));

        Main main = new Main();
        String result3 = main.checkPasswordStrengthV2("Password1234!#sjgyfusgku");
        System.out.println(result3);

        Password password = new Password();
        String result4 = password.checkPasswordStrengthV3("Password1234!#sjgyfusgku");
        System.out.println(result4);

        String result5 = Password.checkPasswordStrengthV4("Password1234!#sjgyfusgku");
        System.out.println(result5);
    }

    public static String checkPasswordStrengthV1(String password) {
        String passedResult = "OK";
        String failedResult = "WEAK";

        if (password.contains("!") && password.contains("#")) {
            return passedResult;
        }

        return failedResult;
        //return null;
    }

    public String checkPasswordStrengthV2(String password) {
        if (password.contains("!") && password.contains("#")) {
            return "OK";
        }

        return "WEAK";
    }
}