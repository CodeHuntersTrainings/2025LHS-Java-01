package cat;

public class Cat extends Animal implements Jumper {

    @Override //= same name + same parameters
    public void play(Ball ball) {
        ball.bite();
        ball.bite();
    }

    public void purr() {
        System.out.println("pur pur pur");
    }

    @Override
    public void jump() {
        System.out.println("jump jump");
    }

}
