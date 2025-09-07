package space;

public class Satellite extends Spacecraft {

    public Satellite(String name, double fuelLevel) {
        super(name, fuelLevel);
    }

    @Override
    public void launch() {
        System.out.println("Satellite " + name + " is entering Earth's orbit...");
        fuelLevel -= 10;
    }
}

