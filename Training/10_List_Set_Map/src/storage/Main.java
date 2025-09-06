package storage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //I.
        // For-each loop: arrays + List, Set, ... (Iterable)
        Alien[] aliens = {
                new Alien("Zorg", "Venus"),
                new Alien("Blip", "Mars"),
                new Alien("Xeno", "Jupiter")
        };

        // For-each loop = Enhanced for loop
        for (Alien alien : aliens) {
            System.out.println(alien);
        }

        //II. ArrayList / LinkedList --> List
        List<Alien> alienArrayList = new ArrayList<>();
        alienArrayList.add(new Alien("Zorg", "Venus"));
        alienArrayList.add(new Alien("Xeno", "Jupiter"));

        System.out.println("Aliens in ArrayList:");
        for (Alien alien : alienArrayList) {
            System.out.println(alien);
        }

        //III. HashSet / LinkedHashSet --> Set
        //TODO: Implement

        //IV. HashMap --> Map
        //TODO: Implement
    }
}