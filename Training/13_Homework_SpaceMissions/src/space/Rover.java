package space;

public class Rover extends Spacecraft {

    public Rover(String name, double fuelLevel) {
        super(name, fuelLevel);
    }

    @Override
    public void launch() {
        System.out.println("Rover " + name + " is landing on Mars...");
        fuelLevel -= 20;
    }
}
