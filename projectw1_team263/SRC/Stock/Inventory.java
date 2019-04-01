package Stock;

import Model.Exceptions.RedundantEntryException;
import Model.Loadable;
import Model.Saveable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;


public abstract class Inventory implements Loadable, Saveable{
    String operation = "";
    Scanner scanner = new Scanner(System.in);
//    ArrayList<String> itemArrayList = new ArrayList<>();
//    Item bike = new Item("blue bike");
//    Item car = new Item("red car");
//    Item skateboard = new Item("black skateboard");


    public Inventory() throws IOException {

        inventoryFunction2();
//        itemArrayList.add(bike.getItemName());
//        itemArrayList.add(car.getItemName());
//        itemArrayList.add(skateboard.getItemName());
        //inventoryFunction();
    }

    @Override
    public abstract void loadInventory() throws IOException;


    @Override
    public abstract void saveInventory() throws IOException, RedundantEntryException;

    public static ArrayList<String> splitOnSpace(String line){
        String[] splits = line.split(" ");
        return new ArrayList<>(Arrays.asList(splits));
    }

    public void inventoryFunction2() throws IOException {

        while (true) {
            System.out.println("Please select an option... load, save, or quit");
            operation=scanner.nextLine();
            System.out.println("you selected: "+operation);

            if (operation.equals("load")) {
                loadInventory();
            }

            if (operation.equals("save")) {
                try {
                    saveInventory();
                } catch (RedundantEntryException e) {
                    System.out.println("ITEM ALREADY EXISTS!!! PROGRAM WILL NOW RESET");
                    break;
                } finally {
                    System.out.println("Specific inventory has been operated on.");
                }

            }

            else if (operation.equals("quit")) {
                break;

            }
        }
        System.out.println("Inventory Closed");
    }

//    //REQUIRES:
//    //MODIFIES: this
//    //EFFECT: initializes a console where the user can choose to add an item,
//    // delete an item, or quit
//    public void inventoryFunction() throws IOException {
//        while (true) {
//            System.out.println("Please select an option... add, delete, load, save or quit");
//            operation = scanner.nextLine();
//            System.out.println("you selected: "+operation);
//
//            if (operation.equals("save")) {
//                saveInventory();
//            }
//
//            if (operation.equals("load")) {
//                loadInventory();
//            }
//
//            if (operation.equals("add")) {
//
//                addInventory();
//            }
//            if (operation.equals("delete")) {
//
//                deleteInventory();
//            }
//
//            //if (operation.equals("read")) {
//
//            //readInventory();
//           //}
//            else if (operation.equals("quit")) {
//                break;
//            }
//
//        }
//        //System.out.println("All items in list: "+itemArrayList );
//        System.out.println("Inventory Closed");
//
//    }
    /* **********************IGNORE METHOD FOR NOW*************
    //REQUIRES:
    //MODIFIES:
    //EFFECTS:
    private void readInventory() {
        for (int i = 0; i < INVENTORY_SIZE; i++) {
            Scanner console = new Scanner(System.in);

            System.out.println("Item's name:");
            String itemName = console.next();

            System.out.println("Item's price:");
            int itemPrice = console.nextInt();

            System.out.println("Item's rating");
            int itemRating = console.nextInt();

            // trying to get specifically itemName of item to work first
            // before making item have 3 data fields(name, rating and price)
            // itemArrayList.set(i, new Item(itemName, itemRating, itemPrice));

        }
    }
    */

    //REQUIRES:
//    //MODIFIES: this
//    //EFFECTS: adds an item into a list and prints out result
//    private void addInventory () {
//            System.out.println("All items in list: "+itemArrayList);
//            System.out.println("Please enter the name of the item that you want to add");
//            String newItem = scanner.nextLine();
//            itemArrayList.add(newItem);
//            System.out.println("you have added "+newItem);
//            System.out.println("All items in list: "+itemArrayList);
//            //inventoryFunction();
//        }

//    //REQUIRES:
//    //MODIFIES: this
//    //EFFECTS: removes an item from itemArrayList and prints out result
//    private void deleteInventory() {
//            System.out.println("All items in list: "+itemArrayList );
//            System.out.println("Please type the name of the item that you want to delete");
//            String selectedItem = scanner.nextLine();
//            if (itemArrayList.contains(selectedItem)) {
//                itemArrayList.remove(selectedItem);
//                System.out.println(selectedItem+" has been deleted");
//                System.out.println("All items in list: "+itemArrayList );
//            }
//           // inventoryFunction();
//        }

}