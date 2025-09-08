package wizard;

public class Main {
    public static void main(String[] args) {
        // Using default constructor
        Wizard defaultWizard = new Wizard();
        System.out.println("Default Wizard: " + defaultWizard);

        // Using parameterized constructor
        String harryPotter = new String("Harry Potter");
        Wizard harry = new Wizard(harryPotter, "Gryffindor", 5);
        System.out.println("Created Wizard: " + harry);

        // Testing setters
        defaultWizard.setName("Ron Weasley");
        defaultWizard.setHouse("Gryffindor");
        defaultWizard.setYear(5);
        System.out.println("Updated Default Wizard: " + defaultWizard);

        // Testing getters
        System.out.println("Name: " + harry.getName());
        System.out.println("House: " + harry.getHouse());
        System.out.println("Year: " + harry.getYear());

        // equals() and hashCode()
        Wizard anotherHarry = new Wizard("Harry Potter", "Gryffindor", 5);
        System.out.println("anotherHarry equals harry? " + anotherHarry.equals(harry));
        System.out.println("hashCode of harry: " + harry.hashCode());
        System.out.println("hashCode of anotherHarry: " + anotherHarry.hashCode());
    }

}