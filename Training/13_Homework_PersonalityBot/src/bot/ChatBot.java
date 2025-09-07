package bot;

public class ChatBot {

    private final String name;
    private String mood;

    public ChatBot(String name, String mood) {
        this.name = name;
        this.mood = mood.toLowerCase();
    }

    public void changeMood(String newMood) {
        if (newMood != null && !newMood.trim().isEmpty()) {
            this.mood = newMood.toLowerCase();
            System.out.println(name + " is now " + this.mood + ".");
        }
    }

    public String reply(String userInput) {
        if (userInput == null || userInput.trim().isEmpty()) {
            return name + ": Please say something.";
        }

        String input = userInput.toLowerCase();

        if (input.contains("hello") || input.contains("hi")) {
            return respond("greeting");
        } else if (input.contains("bye")) {
            return respond("farewell");
        } else if (input.contains("how are you")) {
            return respond("status");
        }

        return respond("default");
    }

    private String respond(String type) {
        switch (mood) {
            case "happy":
                return happyResponses(type);
            case "sad":
                return sadResponses(type);
            default:
                return name + ": I'm not sure how I feel right now.";
        }
    }

    private String happyResponses(String type) {
        switch (type) {
            case "greeting": return name + ": Hello! It's good to see you.";
            case "farewell": return name + ": Goodbye! Have a great day.";
            case "status": return name + ": I'm feeling great, thanks for asking.";
            default: return name + ": I'm ready to chat!";
        }
    }

    private String sadResponses(String type) {
        switch (type) {
            case "greeting": return name + ": Hi.";
            case "farewell": return name + ": Bye.";
            case "status": return name + ": I've been better.";
            default: return name + ": I don't feel like talking much.";
        }
    }
}

