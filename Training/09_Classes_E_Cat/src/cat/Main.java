package cat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal();

        Ball ball = new Ball();
        System.out.println(ball.getColor());

        Cat cat = new Cat();
        play(cat, ball);
        cat.purr();

        Animal cat2 = new Cat();
        play(cat2, ball);
        //cat2.purr(); //Not possible

        Jumper cat3 = new Cat();
        cat3.jump();

        Dog dog = new Dog();
        play(dog, ball);

        Animal tiger1 = new Tiger();
        Tiger tiger2 = new Tiger();
        //Dog tiger3 = new Tiger();
        //Jumper tiger4 = new Tiger();

        //like an infinite long array
        //List-ArrayList, List-LinkedList, Set-HashSet, Map-HashMap ....
        //Collection: List: store, Set: unique, Map --> equals / hashCode
        List<Animal> animals = new ArrayList<Animal>(); //Animal[] animals = new Animal[100];
        animals.add(tiger1);
        animals.add(tiger2);
        animals.add(cat);
        animals.add(cat2);
        //animals.add(cat3);
        animals.add(dog);

        System.out.println(animals.get(0));

        System.out.println("Playings: ");
        for (Animal i : animals) {
            i.play(ball);
        }

        ArrayList<Animal> animalsA = new ArrayList<Animal>();
        List<Animal> animalsB = new ArrayList<Animal>();
        animalsB.add(new Dog());
        System.out.println(animalsB.get(0));

        Collection<Animal> animalsC = new ArrayList<Animal>();
        animalsC.add(new Cat());
        //System.out.println(animalsC.get(0));
        Iterable<Animal> animalsD = new ArrayList<Animal>();

        Map<Integer, Animal> animalsMap = new HashMap<Integer, Animal>();
        animalsMap.put(1, new Cat());//key: 1, value = Cat
        animalsMap.put(2, new Dog());
        animalsMap.put(2, new Tiger()); //override
        System.out.println(animalsMap.get(1)); //null: if key not found

        //Animal animal = animalsMap.get(10);
        //animal.play(ball);

        System.out.println(Integer.parseInt("50"));
        System.out.println(Integer.parseInt("aSDASD"));
    }

    public static void play(Animal animal, Ball ball) {
        animal.play(ball);
        System.out.println(ball.getColor());
    }
}