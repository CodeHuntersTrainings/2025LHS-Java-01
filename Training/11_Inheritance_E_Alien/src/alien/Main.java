package alien;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Alien alien = new Alien("X");
       alien.speak();

       alien.setType("Y");
       alien.speak();

       Alien alienA = new FlyingAlien();
       Alien alienB = new FlyingAlien(200);
       FlyingAlien alienC = new FlyingAlien("M", 250);

       alienA.speak();
       alienC.fly();

        List<Alien> aliens = new ArrayList<Alien>();
        aliens.add(alien);
        aliens.add(alienA);
        aliens.add(alienB);
        aliens.add(alienC);

        for (Alien al : aliens) {
            if (al instanceof FlyingAlien) {
                FlyingAlien fal = (FlyingAlien) al; //casting
                fal.fly();
                fal.speak();

            } else {
                al.speak();

            }
        }

        //Note:
        List<Object> objects = new ArrayList<>();
        objects.add(new Alien("F"));
        objects.add(new FlyingAlien(200));
        objects.add(new String("This is a string"));
        objects.add(new Integer(5));

        for (Object o : objects) {
            System.out.println(o.toString());
        }

    }
}