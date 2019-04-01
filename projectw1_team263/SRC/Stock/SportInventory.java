package Stock;

import Model.Exceptions.RedundantEntryException;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SportInventory extends Inventory {
    public SportInventory() throws IOException {
    }

    public void loadInventory() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("sportinventorylist.txt"));
        for (String line: lines) {
            ArrayList<String> partsOfLine = splitOnSpace(line);
            System.out.println("Sports Department: "+partsOfLine.get(0)+" ");
        }
    }

    public void saveInventory() throws IOException, RedundantEntryException {
        List<String> lines = Files.readAllLines(Paths.get("sportinventorylist.txt"));
        PrintWriter writer = new PrintWriter("sportinventorylist.txt", "UTF-8");
        System.out.println("Please type the name of the new item that you want to save");
        operation=scanner.nextLine();
        if (!lines.contains(operation)) {
            lines.add(operation);
            for (String line : lines) {
                writer.println(line);
            }
        }else {
            throw new RedundantEntryException();
        }


        System.out.println(operation+" has been saved");
        writer.close();


    }
}