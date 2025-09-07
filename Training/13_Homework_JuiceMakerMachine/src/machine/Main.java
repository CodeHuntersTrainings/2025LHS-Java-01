package machine;

public class Main {

    public static void main(String[] args) {
        JuiceMaker juiceMaker = new JuiceMaker("Orange");

        juiceMaker.addSugar(10);
        juiceMaker.refillWater(80);
        juiceMaker.makeJuice();  // Not enough water

        juiceMaker.refillWater(50);
        juiceMaker.makeJuice();  // Juice made successfully
    }

}
