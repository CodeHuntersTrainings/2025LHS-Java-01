package hu.codehunters.zoo.animal;

import hu.codehunters.zoo.food.Food;

public class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " roars:Lion!");
    }

    @Override
    public void eat(Food food) {
        if (food == Food.MEAT) {
            super.eat(food);
        } else {
            System.out.println(name + " refuses to eat " + food);
        }
    }
}

