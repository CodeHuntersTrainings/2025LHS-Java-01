package wizard;

import java.util.Objects;

//Harry Potter
public class Wizard {
    private String name;
    private String house;
    private int year;

    public Wizard() {
        this.name = "Unknown";
        this.house = "Unknown";
        this.year = 1;
    }

    public Wizard(String name, String house, int year) {
        this.name = name;
        this.house = house;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getHouse() {
        return house;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Wizard))
            return false;

        Wizard other = (Wizard) obj;

        return year == other.year &&
                Objects.equals(name, other.name) &&
                Objects.equals(house, other.house);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, house, year);
    }

    @Override
    public String toString() {
        return "Wizard{name='" + name + "', house='" + house + "', year=" + year + "}";
    }
}