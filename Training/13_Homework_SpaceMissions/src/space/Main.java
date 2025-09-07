package space;

public class Main {

    public static void main(String[] args) {
        Satellite satellite = new Satellite("Orbiter-1", 50);
        Rover rover = new Rover("Pathfinder", 70);
        Probe probe = new Probe("Voyager", 100);

        ExplorationMission mission = new ExplorationMission("Galactic Quest");

        mission.addSpacecraft(satellite);
        mission.addSpacecraft(rover);
        mission.addSpacecraft(probe);

        mission.launchAll();
    }

}
