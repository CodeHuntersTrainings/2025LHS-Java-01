package space;

public class Probe extends Spacecraft {

    public Probe(String name, double fuelLevel) {
        super(name, fuelLevel);
    }

    @Override
    public void launch() {
        System.out.println("Probe " + name + " is being sent to deep space...");
        fuelLevel -= 30;
    }
}
