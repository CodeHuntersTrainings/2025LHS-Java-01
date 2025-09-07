package hu.codehunters.zoo.animal;

import hu.codehunters.zoo.food.Food;

public class Monkey extends Animal {
    public Monkey(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " roars:Monkey!");
    }

    @Override
    public void eat(Food food) {
        if (food == Food.FRUITS) {
            super.eat(food);
        } else {
            System.out.println(name + " refuses to eat " + food);
        }
    }
}

