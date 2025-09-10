package storage;

//import java.util.ArrayList;
//import java.util.List;
import java.util.*;

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
        for (Alien i : aliens) {
            System.out.println(i);
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
        //Collection, Set: same methods: add(), remove(), contains(), isEmpty(), size() + forEach
        Set<Alien> alienSet = new HashSet<>();
        alienSet.add(new Alien("Zorg", "Venus"));
        alienSet.add(new Alien("Xeno", "Jupiter"));
        alienSet.add(new Alien("Xeno", "Jupiter"));
        System.out.println("Size of alienSet:" + alienSet.size());

        //IV. HashMap --> Map
        Map<String, Alien> alienMap = new HashMap<>();
        alienMap.put("Earth", new Alien("Zorg", "Earth"));
        alienMap.put("Mars", new Alien("Xeno", "Mars"));
    }
}