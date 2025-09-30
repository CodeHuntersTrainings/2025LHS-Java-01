package instrument;

public class Guitar extends Instrument {

    private String color;

    public Guitar(String manufacturer, String model, String serialNumber, String color) {
        super(manufacturer, model, serialNumber);
        this.color = color;
    }

    @Override
    public void play() {
        System.out.println("Guitar is playing");
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "color='" + color + '\'' +
                '}' + super.toString();
    }
}
