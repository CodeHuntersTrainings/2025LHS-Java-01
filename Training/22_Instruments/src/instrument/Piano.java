package instrument;

public class Piano extends Instrument {

    public Piano(String manufacturer, String model, String serialNumber) {
        super(manufacturer, model, serialNumber);
    }

    @Override
    public void play() {
        System.out.println("Piano is playing");
    }

}
