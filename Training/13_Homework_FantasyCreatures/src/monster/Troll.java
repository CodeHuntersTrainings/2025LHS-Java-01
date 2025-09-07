package monster;

public class Troll extends Creature {

    public Troll(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " swings a massive club with brute force.");
    }
}
