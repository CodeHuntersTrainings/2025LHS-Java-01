package machine;

public class JuiceMaker {

    private final String fruit;
    private int sugarAmount; // in grams
    private int waterMl;     // in milliliters

    private static final int MIN_WATER_REQUIRED = 100;

    public JuiceMaker(String fruit) {
        this.fruit = fruit;
        this.sugarAmount = 0;
        this.waterMl = 0;
    }

    public void addSugar(int grams) {
        if (grams <= 0) {
            System.out.println("Sugar amount must be positive.");
            return;
        }
        sugarAmount += grams;
        System.out.println(grams + "g of sugar added.");
    }

    public void refillWater(int ml) {
        if (ml <= 0) {
            System.out.println("Water amount must be positive.");
            return;
        }
        waterMl += ml;
        System.out.println(ml + "ml of water added.");
    }

    public void makeJuice() {
        if (waterMl < MIN_WATER_REQUIRED) {
            System.out.println("Not enough water to make juice. Please add at least " +
                    (MIN_WATER_REQUIRED - waterMl) + "ml more.");
            return;
        }

        System.out.println("🍹 Juice Summary:");
        System.out.println("- Fruit: " + fruit);
        System.out.println("- Sugar: " + sugarAmount + "g");
        System.out.println("- Water used: " + waterMl + "ml");
        System.out.println("Enjoy your " + fruit + " juice!");

        // Reset for next batch (optional)
        sugarAmount = 0;
        waterMl = 0;
    }
}

