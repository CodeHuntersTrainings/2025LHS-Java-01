package cat;

import java.util.Objects;

//class: new
//interface: no new, no body methods, no attributes
//abstract class: no new
public abstract class Animal {
    //Attributes
    private String breed;

    //Methods:
    public void play(Ball ball) {
        ball.bite();
        System.out.println("Playing ...");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(breed, animal.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(breed);
    }
}
