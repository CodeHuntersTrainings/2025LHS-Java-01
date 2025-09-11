package alien;

public class FlyingAlien extends Alien {

    private int maxSpeed;

    public FlyingAlien() {
        super("W");
        this.maxSpeed = 100;
    }

    public FlyingAlien(int maxSpeed) {
        super("W");
        this.maxSpeed = maxSpeed;
    }

    public FlyingAlien(String type, int maxSpeed) {
        super(type);
        this.maxSpeed = maxSpeed;
    }

    public void fly() {
        System.out.println("Zoom! I am flying.");
    }

}
