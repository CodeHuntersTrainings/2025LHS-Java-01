package monster;

public class Dragon extends Creature {

    public Dragon(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " attacks with a burst of fire!");
        fireBreath();
    }

    public void fireBreath() {
        System.out.println(name + " breathes fire across the battlefield!");
    }
}
