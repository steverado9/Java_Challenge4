package ArrayList;

import java.util.*;

//Write a program to sort an ArrayList of Strings alphabetically.
public class SortListOfString {
    public static void sortListOfString(List l1) {
        //created a set
        Set<String> list = new TreeSet<>(l1);

        //clear the ArrayList
        l1.clear();

        //add all the elements in the set collection inside the Arraylist
        l1.addAll(list);

        //print the arraylist
        System.out.println("List of String: " + l1);
    }
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

        //call method
        sortListOfString(animals);
    }
}
