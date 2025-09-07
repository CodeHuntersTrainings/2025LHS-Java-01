package monster;

public class Elf extends Creature {

    public Elf(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " shoots a flurry of arrows from a distance.");
    }
}

