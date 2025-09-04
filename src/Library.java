import java.util.ArrayList;
import java.util.Collection;

// Write a Java program to create a class called "Library" with a collection
// of books and methods to add and remove books.
public class Library {
    public static void main(String[] args) {
        Collection<String> books = new ArrayList<>();

        //Method to add book
        books.add("one");

        //Method to remove book
        books.remove("one");
    }
}
