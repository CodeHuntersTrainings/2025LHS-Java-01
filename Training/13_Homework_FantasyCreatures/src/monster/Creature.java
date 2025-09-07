package monster;

import java.util.Objects;

public abstract class Creature {
    protected String name;
    protected int health;

    public Creature(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void attack();

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Creature creature = (Creature) o;
        return health == creature.health && Objects.equals(name, creature.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, health);
    }

    @Override
    public String toString() {
        return "Creature{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
