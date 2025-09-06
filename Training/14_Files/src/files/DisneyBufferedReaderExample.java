package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DisneyBufferedReaderExample {

    public void run() {
        try (FileReader fr = new FileReader("disney_characters.txt");
             BufferedReader br = new BufferedReader(fr)) {

            while (true) {
                String line = br.readLine();

                if (line == null) {
                    break;
                }

                String[] parts = line.split(",");
                String name = parts[0].trim();
                int age = Integer.parseInt(parts[1].trim());
                System.out.println("👤 " + name + " is " + age + " years old.");
            }

        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
