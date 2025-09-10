package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DisneyBufferedReaderExample implements DisneyFileProcessors {

    @Override
    public void run() {
        try (
                FileReader fr = new FileReader("disney_characters.txt");
                BufferedReader br = new BufferedReader(fr)
        ) {

            while (true) {
                String line = br.readLine();

                if (line == null) {
                    break;
                }
                //...

                String[] parts = line.split(","); //elements: 2
                String name = parts[0].trim();
                int age = Integer.parseInt(parts[1].trim());
                System.out.println("👤 " + name + " is " + age + " years old.");
            }

            //String line;
            //while ((line = br.readLine()) != null) {
            //    String[] parts = line.split(",");
            //    String name = parts[0].trim();
            //    int age = Integer.parseInt(parts[1].trim());
            //    System.out.println("👤 " + name + " is " + age + " years old.");
            //}

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
