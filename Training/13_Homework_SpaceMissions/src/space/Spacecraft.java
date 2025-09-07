package space;

public abstract class Spacecraft {
    protected String name;
    protected double fuelLevel;

    public Spacecraft(String name, double fuelLevel) {
        this.name = name;
        this.fuelLevel = fuelLevel;
    }

    public abstract void launch();

    public String getName() {
        return name;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void refuel(double amount) {
        fuelLevel += amount;
        System.out.println(name + " refueled by " + amount + " units.");
    }

    // + equals, hashCode, toString
}
