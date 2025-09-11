package hu.codehunters.zoo.food;

import hu.codehunters.zoo.animal.Animal;
import hu.codehunters.zoo.animal.Elephant;
import hu.codehunters.zoo.animal.Lion;
import hu.codehunters.zoo.animal.Monkey;

import java.util.List;

public class Feeder {
    public void feedAnimals(List<Animal> animals, Inventory inventory) {
        for (Animal animal : animals) {
            if (animal instanceof Lion && inventory.consumeFood(Food.MEAT)) {
                animal.eat(Food.MEAT);

            } else if (animal instanceof Elephant && inventory.consumeFood(Food.PLANTS)) {
                animal.eat(Food.PLANTS);

            } else if (animal instanceof Monkey && inventory.consumeFood(Food.FRUITS)) {
                animal.eat(Food.FRUITS);

            } else {
                System.out.println("No suitable food available for " + animal.getName());
            }
        }
    }
}