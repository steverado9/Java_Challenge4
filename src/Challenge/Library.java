package Challenge;

import java.util.ArrayList;
import java.util.Collection;

// Write a Java program to create a class called "Library" with a collection
// of books and methods to add and remove books.
public class Library {
    Collection<String> books = new ArrayList<>();

    public void add(String value) {
        books.add(value);
    }

    public void remove(String value) {
        books.remove(value);
    }
}
