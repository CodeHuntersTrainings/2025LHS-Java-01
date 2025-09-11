package com.example.bugtracker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class DataProcessor {

    private final String inputPath;
    private final String outputPath;

    public DataProcessor(String inputPath, String outputPath) {
        this.inputPath = inputPath;
        this.outputPath = outputPath;
    }

    public void readBugs() {
        //IN: Bug;NullPointerException;Occurs when clicking save
        //OUT: 2025-09-04T12:23:01 | Bug | NullPointerException

        try (
                //Reading:
                FileReader fileReader = new FileReader(inputPath);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                //Writing:
                FileWriter fileWriter = new FileWriter(outputPath, true);
                PrintWriter printWriter = new PrintWriter(fileWriter);

        ) {

            while (true) {
                //Bug;NullPointerException;Occurs when clicking save
                String line = bufferedReader.readLine();

                if (line == null) {
                    break;
                }

                String[] pieces = line.split(";");

                //OUT: 2025-09-04T12:23:01 | Bug | NullPointerException
                String out = LocalDateTime.now().toString() + "|" +
                        pieces[0] + "|" +
                        pieces[1];

                printWriter.println(out);
            }

        } catch (Exception e) {
            //
        }

    }
}
