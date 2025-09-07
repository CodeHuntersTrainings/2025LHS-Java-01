package bot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChatBot bot = new ChatBot("Alex", "happy");

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("You are chatting with Alex. Type 'exit' to stop.");
            System.out.println("To change mood, type: mood:happy or mood:sad");

            while (true) {
                System.out.print("You: ");
                String input = scanner.nextLine();

                if ("exit".equalsIgnoreCase(input)) {
                    System.out.println(bot.reply("bye"));
                    break;
                } else if (input.toLowerCase().startsWith("mood:")) {
                    String newMood = input.substring(5).trim();
                    bot.changeMood(newMood);
                } else {
                    System.out.println(bot.reply(input));
                }
            }

        }
    }
}
