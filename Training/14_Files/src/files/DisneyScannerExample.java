package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DisneyScannerExample {

    public void run() {
        try (Scanner scanner = new Scanner(new File("disney_characters.txt"))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String name = parts[0].trim();
                int age = Integer.parseInt(parts[1].trim());
                System.out.println("⭐ " + name + " is " + age + " years old.");
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            e.printStackTrace();

        } catch (NumberFormatException e) {
            System.err.println("Age is not a valid number: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
