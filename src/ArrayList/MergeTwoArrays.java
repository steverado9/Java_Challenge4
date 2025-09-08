package ArrayList;

import java.util.ArrayList;
import java.util.List;

//Write a program to merge two ArrayLists into a single ArrayList.
public class MergeTwoArrays {
    public static void main(String[] args) {
        //create list1
        List<String> list1 = new ArrayList<>();
        list1.add("Stephen");
        list1.add("fola");
        list1.add("bnxn");
        list1.add("mavo");

        //create list2
        List<String> list2 = new ArrayList<>();
        list1.add("Remilekun");
        list1.add("taves");
        list1.add("santi");
        list1.add("sdc");

        //create single list and add list1 from the constructor
        List<String> singleList = new ArrayList<>(list1);

        //add list2
        singleList.addAll(list2);

        System.out.println("Print single list");
        System.out.println(singleList);
    }
}
