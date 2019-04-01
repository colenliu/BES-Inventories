package UI;

import Stock.BakeryInventory;
import Stock.ElectronicInventory;
import Stock.SportInventory;

import java.io.IOException;
import java.util.Scanner;

public class InventoryFunctions2 {

    public InventoryFunctions2() {
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            String operation = "";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select a department to edit... bakery, electronics, sports or quit");
            operation = scanner.nextLine();
            System.out.println("you selected: "+operation);
            if (operation.equals("bakery")) {
                new BakeryInventory();
            }

            if (operation.equals("electronics")) {
                new ElectronicInventory();
            }

            if (operation.equals("sports")) {

                new SportInventory();
            }

            else if (operation.equals("quit")) {
                break;
            }

        }
        System.out.println("Inventory Closed");
    }
}
