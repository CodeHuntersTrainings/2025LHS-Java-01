package hu.codehunters.zoo.animal;

import hu.codehunters.zoo.food.Food;

public class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " roars:Elephant!");
    }

    @Override
    public void eat(Food food) {
        if (food == Food.PLANTS) {
            super.eat(food);
        } else {
            System.out.println(name + " refuses to eat " + food);
        }
    }
}

