package Challenge;
//Write a Java program to create a class called "Restaurant" with
//attributes for menu items, prices, and ratings, and methods to add and
//remove items, and to calculate average rating.

import java.util.ArrayList;

public class Restaurant {
    int prices;
    //intializing a list of items
    ArrayList<String> items = new ArrayList<>();

    //intializing a list of ratings
    int[] rating = {1, 2, 3, 4, 5};

    public void addItems(String value) {
        items.add(value);
    }
    public void removeItems(String value) {
        items.remove(value);
    }
    public void averageRating() {
        int sum = 0;
        for (int element : rating) {
            sum+= element;
        }
        int average = sum / rating.length;
        System.out.println("Average: " + average);

    }
}
