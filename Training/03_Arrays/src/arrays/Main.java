package arrays;

public class Main {
    public static void main(String[] args) {

        String n1 = "Mike";
        String n2 = "Jack";
        String n3 = "Jane";
        //..

        //String[] names; //array
        String[] names = new String[100]; //array

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]); //indexing: 0 ... length -1
        }

        System.out.println();

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
            if (names[i] != null) {
                System.out.println(names[i]);
            }

        }


    }
}