package arrays;

public class Main {
    public static void main(String[] args) {

        String[] names = new String[10];

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        names[0] = "Mike";
        names[1] = "Jack";
        names[2] =  "Jane";
        names[3] =  "Bob";
        names[4] =  "Jack";
        names[5] =  "Jane";
        names[6] =  "Bob";
        names[7] =  "Jack";
        names[8] =  "Jane";
        names[9] =  "Jack";

        System.out.println(names[0]);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


    }
}