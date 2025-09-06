package ArrayList;

import java.util.*;

//Write a program to sort an ArrayList of Strings alphabetically.
public class SortListOfString {
    public static void main(String[] args) {
        //created a list of animals
        List<String> animals = new ArrayList<>();

        //add elements
        animals.add("elephant");
        animals.add("dog");
        animals.add("cat");
        animals.add("bear");
        animals.add("antelope");

        //print the list of animals
        System.out.println("List of String: " + animals);

        //created a set
        Set<String> list = new TreeSet<>(animals);

        //clear the ArrayList
        animals.clear();

        //add all the elements in the set collection inside the Arraylist
        animals.addAll(list);

        //print the arraylist
        System.out.println("List of String: " + animals);
    }
}
