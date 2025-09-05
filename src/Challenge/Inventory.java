package Challenge;

import java.util.ArrayList;
import java.util.Collection;

//Write a Java program to create a class called "Inventory" with a collection
// of products and methods to add and remove products, and to check for low inventory.
public class Inventory {
    Collection<String> products = new ArrayList<>();

    public void add(String value) {
        products.add(value);
    }

    public void remove(String value) {
        products.remove(value);
    }

    public void checkForLowInventory() {
        System.out.println("true");
    }
}
