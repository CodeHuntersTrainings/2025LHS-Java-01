package basics;

public class Main {
    public static void main(String[] args) {

        //Literals: ...
        System.out.println("Hello, World!");
        System.out.println('A');
        System.out.println(5); //type: integer
        System.out.println(10L); //type: long, L, l
        System.out.println(10D); //type: double, D, d
        System.out.println(4.6); //type: double
        System.out.println(3.3F); //type: float, F, f
        System.out.println(true); //type: boolean

        //Primitive type = value: byte, short, char, int, long, float, double, boolean.
        //Reference types = 2 components = reference + (value + actions).
        //Anything that is a class --> is a reference types.


        //Variables: ... Storage of a value
        byte b1 = 4;
        byte b2 = 127;
        //byte b3 = 128;
        int age = 34;
        long id = 50;

        String s1 = "Hello, World!";
        //s1.trim(); reference type -> possibility of actions = operations = methods

        String s2 = new String("Hello, World!");
        Byte b4 = Byte.valueOf("100");

        Integer i1 = new Integer(10);
        Boolean b3 = new Boolean(true);
        Character c1 = new Character('A');
        Double d1 = new Double(10.0);
        Float f1 = new Float(10.0f);

        //Operators: number+, string+, %, ==, !=, ?:, ++, --
        System.out.println(5 + 4 + 3 + 2); //14
        System.out.println("L" + "S" + "H"); //"LSH"

        System.out.println(10 % 4); //2 mod = modulo
        int v1 = 4;
        int v2 = 4;
        System.out.println(v1 == v2); //primitive!

        String s5 = new String("s");
        String s6 = s5;
        String s7 = new String("s");
        System.out.println(s5 == s6); //true
        System.out.println(s5 == s7); //false

        System.out.println(s5.equals(s7)); //true

        //?:
        double speed = 55;
        System.out.println(speed <= 50 ? "OK" : "FINE");
        String result = speed <= 50 ? "OK" : "FINE";
        System.out.println(result); //"FINE"

        //++, --
        long spentMinutes = 100;
        System.out.println(spentMinutes++);
        System.out.println(spentMinutes);
        System.out.println(++spentMinutes);
        System.out.println(spentMinutes);

        //IF: System.out.println(speed <= 50 ? "OK" : "FINE");
        if (speed <= 50) {
            System.out.println("OK");
        }

        if (speed <= 50) {

        } else {

        }

        if (speed <= 50) {
            System.out.println("0 HUF");
        } else if (speed <= 60) {
            System.out.println("10 000 HUF");
        } else {
            System.out.println("100 000 HUF");
        }

        if (speed > 50 && speed <= 60) {
            // &&: true if all true,
            // ||: true if at least 1 true
            System.out.println("10 000 HUF");
        }


        //SWITCH V1 - statement
        String color = "red"; // from the first match to the first break
        System.out.println(color);
        switch (color) { //char, byte, short, int, String, Enum, ...
            case "red":
                System.out.println("The color is red.");
                break;
            case "blue":
                System.out.println("The color is blue.");
                break;
            default:
                System.out.println("The color is unknown.");
                break;
        }

        //FOR
        for (int i = 0; i < 10; ++i) {
            System.out.println("i: " + i);
        }

        //WHILE
        int i = 0;
        while (i < 10) {
            System.out.println("i: " + i);
            ++i;
        }

        while (true) {
            String line = "a new line from the user";
            if (line == null) {
                break;
            }

            //processing ...
        }
    }
}