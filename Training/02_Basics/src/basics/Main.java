package basics;

public class Main {
    public static void main(String[] args) {

        //Literals: ...
        System.out.println("Hello, World!");
        System.out.println(5);
        System.out.println(10L);


        //Variables: ...
        byte b1 = 4;


        String s1 = "Hello, World!";
        String s2 = new String("Hello, World!");
        Byte b2 = Byte.valueOf("100");

        //Operators: number+, string+, %, ==, !=, ?:, ++, --


        //IF


        //SWITCH V1 - statement
        String color = "blue";
        System.out.println(color);
        switch (color) {
            case "red":
                System.out.println("The color is red.");
                break;
            case "blue":
                System.out.println("The color is blue.");
                break;
            default:
                System.out.println("The color is unknown.");
        }

        //SWITCH V2 - expression
        int day = 3;

        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };

        System.out.println("Day: " + dayName);


        //FOR


        //WHILE
    }
}