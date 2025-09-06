package methods;

public class Main {

    public static void main(String[] args) {
        // (a) void, no parameter
        summonAvengers();

        // (b) void, with parameter
        activateSuit("Iron Man");

        // (c) String return, no parameter
        String quote = getFamousQuote();
        System.out.println("Famous Quote: " + quote);

        // (d) int return, with 2 parameters
        int totalDamage = calculateDamage(85, 90);
        System.out.println("Total Damage: " + totalDamage);

        // (d) int return, with 3 parameters
        int comboDamage = calculateComboDamage(50, 60, 70);
        System.out.println("Combo Damage: " + comboDamage);
    }

    // (a) void method with no parameters
    public static void summonAvengers() {
        System.out.println("Avengers, Assemble!");
    }

    // (b) void method with a parameter
    public static void activateSuit(String heroName) {
        System.out.println(heroName + "'s suit is now activated.");
    }

    // (c) method returns String, no parameters
    public static String getFamousQuote() {
        return "I can do this all day. - Captain America";
    }

    // (d) method returns int, two parameters
    public static int calculateDamage(int thorHammerHit, int hulkSmash) {
        return thorHammerHit + hulkSmash;
    }

    // (d) method returns int, three parameters
    public static int calculateComboDamage(int blackWidowKick, int hawkeyeArrow, int falconWingsAttack) {
        return blackWidowKick + hawkeyeArrow + falconWingsAttack;
    }
}
