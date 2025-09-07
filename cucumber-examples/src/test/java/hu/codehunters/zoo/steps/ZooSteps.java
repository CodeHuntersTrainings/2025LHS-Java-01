package hu.codehunters.zoo.steps;

import hu.codehunters.zoo.Zoo;
import hu.codehunters.zoo.food.Food;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class ZooSteps {

    private final TestContext context;

    public ZooSteps(TestContext context) {
        this.context = context;
    }

    @Given("an empty zoo")
    public void an_empty_zoo() {
        context.zoo = new Zoo();
    }

    @Then("the zoo should contain {int} animal")
    public void the_zoo_should_contain_animals(int count) {
        Assertions.assertEquals(count, context.zoo.getAnimals().size());
    }

    @When("I open the zoo")
    public void i_open_the_zoo() {
        context.zoo.openZoo();
    }

    @And("I feed the animals")
    public void i_feed_the_animals() {
        context.zoo.feedAnimals();
    }

    @And("the inventory has {int} {word} item")
    public void the_inventory_has_food(int quantity, String foodType) {
        Food food = Food.valueOf(foodType.toUpperCase());
        context.zoo.getInventory().addFood(food, quantity);
    }
}
