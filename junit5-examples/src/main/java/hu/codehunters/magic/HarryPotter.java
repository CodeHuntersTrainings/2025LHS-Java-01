package hu.codehunters.magic;

public class HarryPotter {

    public String castSpell(String spell) {
        if (spell == null || spell.trim().isEmpty()) {
            return "No spell cast!";
        }

        switch (spell.toLowerCase()) {
            case "lumos":
                return "The wand lights up!";
            case "expelliarmus":
                return "Opponent disarmed!";
            case "expecto patronum":
                return "A silver stag emerges!";
            default:
                return "Unknown spell!";
        }
    }

}
