package string;

public class Main {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);

        String s4 = "abc bgd fksd df ofwuiohf wuiehfuiwhf afh";
        String[] strings = s4.split(" ");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

    }
}