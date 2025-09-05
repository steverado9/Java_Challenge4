package Challenge;
//Write a Java program to create a class called "Movie" with attributes for
//title, director, actors, and reviews, and methods for adding and retrieving reviews.

import java.util.ArrayList;
import java.util.Collection;

public class Movie {
    String title, director, actors;

    ArrayList<String> reviews = new ArrayList<>();

    public void addReview(String value) {
        reviews.add(value);
    }

    public void retrieveReview(String value) {
        reviews.get(reviews.indexOf(value));
    }
}
