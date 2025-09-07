package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//Write a program to shuffle the elements of an ArrayList.
public class ShuffleElements {
    public static void main(String[] args) {
        //creating an array list using the list interface
        List<String> elements = new ArrayList<>();
        //adding elements to the arrayList
        elements.add("pen");
        elements.add("paper");
        elements.add("ruler");
        elements.add("set square");

        //Prints elements of an arraylist
        System.out.println("Before shuffling ArrayList");

        Iterator<String> itr = elements.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        //use the collection.shuffle methodo to shuffle the arraylist
        Collections.shuffle(elements);
        System.out.println("After shuffling Arraylist");
        //reassign the itr variable to the iterator with
        // the shuffled array elements
        itr = elements.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());;
        }
    }
}
