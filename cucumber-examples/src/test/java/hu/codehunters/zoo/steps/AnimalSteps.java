package hu.codehunters.zoo.steps;

import hu.codehunters.zoo.animal.Animal;
import hu.codehunters.zoo.animal.Elephant;
import hu.codehunters.zoo.animal.Lion;
import hu.codehunters.zoo.animal.Monkey;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class AnimalSteps {

    private final TestContext context;

    public AnimalSteps(TestContext context) {
        this.context = context;
    }

    @When("I adopt a {word} named {string}")
    public void i_adopt_an_animal_named(String animalType, String name) {
        switch (animalType.toLowerCase()) {
            case "lion":
                context.adoptedAnimal = new Lion(name);
                break;
            case "elephant":
                context.adoptedAnimal = new Elephant(name);
                break;
            case "monkey":
                context.adoptedAnimal = new Monkey(name);
                break;
            default:
                throw new IllegalArgumentException("Unknown animal type: " + animalType);
        }
        context.zoo.addAnimal(context.adoptedAnimal);
    }

    @Then("the animal {string} should be hungry")
    public void the_animal_should_be_hungry(String name) {
        Animal animal = findAnimalByName(name);
        Assertions.assertTrue(animal.isHungry(), name + " should be hungry");
    }

    @Then("the animal {string} should not be hungry")
    public void the_animal_should_not_be_hungry(String name) {
        Animal animal = findAnimalByName(name);
        Assertions.assertFalse(animal.isHungry(), name + " should not be hungry");
    }

    //@And("the {word} {string} is under health examination")
    //public void the_animal_is_under_health_examination(String type, String name) {
    //    Animal animal = findAnimalByName(name);
    //    animal.setUnderHealthExamination(true);
    //}

    private Animal findAnimalByName(String name) {
        List<Animal> animals = context.zoo.getAnimals();
        for (Animal a : animals) {
            if (a.getName().equals(name)) {
                return a;
            }
        }
        throw new RuntimeException("Animal named " + name + " not found");
    }
}
