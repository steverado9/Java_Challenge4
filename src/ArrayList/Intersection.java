package ArrayList;

import java.util.ArrayList;
import java.util.List;

//Write a program to find the intersection of two ArrayLists.
public class Intersection {
    public static void intersection(List l1, List l2) {
        //use retain all to retain only the elements in the list
        // that are contained in the specified collection.
        l2.retainAll(l1);
        System.out.println(l2);
    }
    public static void main(String[] args) {
        //Create first arrayList
        List<String> l1 = new ArrayList<>();
        l1.add("my");
        l1.add("name");
        l1.add("is");
        l1.add("stephen");
        System.out.println(l1);

        //create second arraylist
        List<String> l2 = new ArrayList<>();
        l2.add("my");
        l2.add("name");
        l2.add("is");
        l2.add("and");
        l2.add("always");
        l2.add("stephen");
        l2.add("isaac");
        System.out.println(l2);

        //calling the intersection method
        intersection(l1, l2);
    }
}
