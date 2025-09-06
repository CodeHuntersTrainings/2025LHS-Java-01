package hu.codehunters.wednesday;

public class Wednesday {

    private boolean brooding;

    public void setMood(String mood) {
        this.brooding = "dark".equalsIgnoreCase(mood);
    }

    public String interactWithThing() {
        if (brooding) {
            return "Wednesday ignores Thing.";
        } else {
            return "Wednesday nods silently at Thing.";
        }
    }
}