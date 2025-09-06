package hu.codehunters;

import java.io.*;

public class HistoryService {
    private final String outputPath;

    public HistoryService(String outputPath) {
        this.outputPath = outputPath;
    }

    public void listBugs() {
        try (BufferedReader reader = new BufferedReader(new FileReader(outputPath))) {
            while (true) {
                String line = reader.readLine();

                if (line == null) {
                    break;
                }

                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading output file: " + e.getMessage());
        }
    }
}