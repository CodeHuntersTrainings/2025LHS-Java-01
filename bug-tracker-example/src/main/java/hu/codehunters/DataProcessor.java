package hu.codehunters;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataProcessor {
    private final String inputPath;
    private final String outputPath;

    private final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    public DataProcessor(String inputPath, String outputPath) {
        this.inputPath = inputPath;
        this.outputPath = outputPath;
    }

    public void readBugs() {
        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputPath));
                PrintWriter writer = new PrintWriter(new FileWriter(outputPath, true)) // Append mode
        ) {
            String timestamp = LocalDateTime.now().format(formatter);

            while (true) {
                String line = reader.readLine();

                if (line == null) {
                    break;
                }

                String[] parts = line.split(";", 3); // [type, name, description]
                if (parts.length >= 2) {
                    String type = parts[0].trim();
                    String name = parts[1].trim();
                    writer.println(String.format("%s | %s | %s", timestamp, type, name));
                }
            }
        } catch (IOException e) {
            System.err.println("Error processing bugs: " + e.getMessage());
        }
    }
}