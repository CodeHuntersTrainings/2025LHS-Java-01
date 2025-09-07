package space;

import java.util.ArrayList;
import java.util.List;

public class ExplorationMission {
    private final String missionName;
    private final List<Spacecraft> spacecraftList;

    public ExplorationMission(String missionName) {
        this.missionName = missionName;
        this.spacecraftList = new ArrayList<>();
    }

    public void addSpacecraft(Spacecraft spacecraft) {
        spacecraftList.add(spacecraft);
        System.out.println(spacecraft.getName() + " added to mission " + missionName + ".");
    }

    public void launchAll() {
        System.out.println("\nLaunching mission: " + missionName);
        for (Spacecraft sc : spacecraftList) {
            sc.launch();
            System.out.println("Remaining fuel: " + sc.getFuelLevel() + "\n");
        }
    }
}