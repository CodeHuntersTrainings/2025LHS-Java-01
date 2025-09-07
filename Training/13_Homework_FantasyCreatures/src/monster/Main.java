package monster;

public class Main {
    public static void main(String[] args) {
        Creature dragon = new Dragon("Smaug", 300);
        Creature elf = new Elf("Legolas", 150);
        Creature troll = new Troll("Grog", 200);

        dragon.attack();
        System.out.println();

        elf.attack();
        System.out.println();

        troll.attack();
    }
}
