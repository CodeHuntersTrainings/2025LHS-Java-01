package integer;

public class Main {
    public static void main(String[] args) {
        Integer i1 = new Integer(5);
        Integer i2 = 5;

        //System.out.println(i1.equals(i2));

        //==: is it the same bubble
        Integer i3 = 5;
        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
        System.out.println(i2 == i3); //true if in [-128, 127]


    }
}