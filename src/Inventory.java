import java.util.ArrayList;
import java.util.Collection;

//Write a Java program to create a class called "Inventory" with a collection
// of products and methods to add and remove products, and to check for low inventory.
public class Inventory {
    public static void main(String[] args) {
        Collection<String> products = new ArrayList<>();

        //Add products
        products.add("Soap");

        //Remove product
        products.remove("Soap");
    }


}
