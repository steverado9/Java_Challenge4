package Challenge;

import java.util.ArrayList;
import java.util.Collection;

//5. Write a Java program to create a class called "Book" with attributes for title
//, author, and ISBN, and methods to add and remove books from a collection.
public class Book {
    String title;
    String author;
    String ISBN;

    Collection<String> books = new ArrayList<String>();

    public void add(String title) {
        this.title = title;
        books.add(this.title);
        System.out.println(books);
    }

    public void remove(String title) {
        this.title = title;
        books.remove(this.title);
        System.out.println(books);
    }
}
