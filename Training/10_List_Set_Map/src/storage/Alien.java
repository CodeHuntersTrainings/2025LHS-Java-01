package storage;

//final class = no inheritance
public final class Alien {
    private final String name; //FINAL = no assigment again
    private final String planet;

    public Alien(String name, String planet) {
        this.name = name;
        this.planet = planet;
    }

    public String getName() {
        return name;
    }

    public String getPlanet() {
        return planet;
    }

    //final = no override
    public final void fly () {
        System.out.println("I am flying: " + name);
    }

    @Override
    public String toString() {
        return name + " from " + planet;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Alien)) return false;
        Alien other = (Alien) obj;
        return name.equals(other.name) && planet.equals(other.planet);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + planet.hashCode();
    }
}
