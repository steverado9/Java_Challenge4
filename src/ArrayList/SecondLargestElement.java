package ArrayList;

import java.util.*;

//Write a program to find the second-largest element
// in an ArrayList of Integers.
public class SecondLargestElement {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Collections.sort(list);

        //Print second largest number
        System.out.println("The second largest number is : " + list.get(list.size() - 2));
    }
}
