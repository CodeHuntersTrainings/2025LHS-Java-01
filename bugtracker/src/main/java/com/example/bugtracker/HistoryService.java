package com.example.bugtracker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HistoryService {

    private final String outputPath;

    public HistoryService(String outputPath) {
        this.outputPath = outputPath;
    }

    public void listBugs() {
        try (
                FileReader fileReader = new FileReader(outputPath);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {

            while(true) {
                String line = bufferedReader.readLine();

                if (line == null) {
                    break;
                }
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
