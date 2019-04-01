package Stock;

import Model.Exceptions.RedundantEntryException;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BakeryInventory extends Inventory {
    public BakeryInventory() throws IOException {
    }

    public void loadInventory() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("bakeryinventorylist.txt"));
        for (String line: lines) {
            ArrayList<String> partsOfLine = splitOnSpace(line);
            System.out.println("Bakery Department: "+partsOfLine.get(0)+" ");
        }
    }

    public void saveInventory() throws IOException, RedundantEntryException {
        List<String> lines = Files.readAllLines(Paths.get("bakeryinventorylist.txt"));
        PrintWriter writer = new PrintWriter("bakeryinventorylist.txt", "UTF-8");
        System.out.println("Please type the name of the new item that you want to save");
        operation=scanner.nextLine();
        if (!lines.contains(operation)) {
            lines.add(operation);
            for (String line : lines) {
                writer.println(line);
            }
        }else {
            for (String line : lines) {
                writer.println(line);
            }
            throw new RedundantEntryException();
        }


        System.out.println(operation+" has been saved");
        writer.close();


    }
}
