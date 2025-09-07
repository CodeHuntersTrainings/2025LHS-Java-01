package hu.codehunters.zoo.animal;

import hu.codehunters.zoo.food.Food;

public abstract class Animal {
    protected String name;
    protected boolean isHungry = true;
    protected boolean underHealthExamination = false;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public void eat(Food food) {
        if (isHungry && !underHealthExamination) {
            System.out.println(name + " eats " + food);
            isHungry = false;
        } else if (underHealthExamination) {
            System.out.println(name + " is under health examination and cannot eat.");
        } else {
            System.out.println(name + " is not hungry.");
        }
    }

    public void setUnderHealthExamination(boolean underExamination) {
        this.underHealthExamination = underExamination;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public String getName() {
        return name;
    }
}
