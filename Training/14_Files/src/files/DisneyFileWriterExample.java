package files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DisneyFileWriterExample implements DisneyFileProcessors {

    @Override
    public void run() {
        try (
                FileWriter fw = new FileWriter("disney_characters.txt");
                PrintWriter pw = new PrintWriter(fw)
        ) {

            pw.println("Mickey Mouse,94");
            pw.println("Elsa,21");
            pw.println("Simba,3");
            pw.println("Goofy,89");
            pw.println("Moana,16");
            //pw.print("Mickey Mouse,94");

            System.out.println("Character data written to disney_characters.txt");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
