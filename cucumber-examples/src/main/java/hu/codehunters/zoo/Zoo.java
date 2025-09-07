package hu.codehunters.zoo;

import hu.codehunters.zoo.animal.Animal;
import hu.codehunters.zoo.food.Feeder;
import hu.codehunters.zoo.food.Inventory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Zoo {
    private final List<Animal> animals = new ArrayList<>();
    private final Feeder feeder = new Feeder();
    private final Inventory inventory = new Inventory();

    private boolean isOpen = false;

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void openZoo() {
        isOpen = true;
        System.out.println("Zoo is now open!");
    }

    public void closeZoo() {
        isOpen = false;
        System.out.println("Zoo is now closed.");
    }

    public void feedAnimals() {
        if (!isOpen) {
            System.out.println("Zoo is closed. Can't feed animals.");
            return;
        }
        feeder.feedAnimals(animals, inventory);
    }

    public void performHealthChecks() {
        for (Animal animal : animals) {
            // Randomly simulate health checks
            boolean underCheck = Math.random() < 0.3;
            animal.setUnderHealthExamination(underCheck);
            if (underCheck) {
                System.out.println(animal.getName() + " is under health examination.");
            }
        }
    }

    public Inventory getInventory() {
        return inventory;
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}

