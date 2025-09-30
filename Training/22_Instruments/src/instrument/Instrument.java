package instrument;

import java.util.Objects;

public abstract class Instrument {

    private final String manufacturer;
    private final String model;
    private final String serialNumber;

    //public AbstractInstrument() {
    //    manufacturer = "ABC";
    //    model = "125";
    //    serialNumber = "ABC-125-354167474413";
    //}

    public Instrument(String manufacturer, String model, String serialNumber) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public abstract void play();

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Instrument that = (Instrument) o;
        return
                Objects.equals(manufacturer, that.manufacturer) &&
                        Objects.equals(model, that.model) &&
                        Objects.equals(serialNumber, that.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, serialNumber);
    }

    @Override
    public String toString() {
        return "AbstractInstrument{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
