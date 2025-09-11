package hu.codehunters.zoo.food;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Food, Integer> stock = new HashMap<>();

    public void addFood(Food food, int quantity) {
        Integer foodValue = stock.get(food);

        if (foodValue == null) {
            stock.put(food, 0 + quantity);

        } else {
            stock.put(food, foodValue + quantity);
        }
    }

    public boolean hasFood(Food food) {
        return stock.getOrDefault(food, 0) > 0;
    }

    public boolean consumeFood(Food food) {
        if (hasFood(food)) {
            stock.put(food, stock.get(food) - 1);
            return true;
        }
        return false;
    }

    public void printInventory() {
        System.out.println("Food inventory: " + stock);
    }
}
