package hu.codehunters.zoo.animal;

import hu.codehunters.zoo.food.Food;

public class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }

    public Elephant() {
        super("Dumbo");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " roars:Elephant!");
    }

    @Override
    public void eat(Food food) {
        if (food == Food.PLANTS) { // enum -> ref type -> ==
            super.eat(food);
            //super -> reference to the elements defined in the super class
            //this -> reference to the elements defined in the current class

        } else {
            System.out.println(name + " refuses to eat " + food);

        }
    }
}

