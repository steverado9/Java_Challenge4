package LinkedList;

import java.util.LinkedList;
import java.util.List;

//Write a program to check if two LinkedLists are equal.
public class equalLinkedList {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

         boolean result = list1.equals(list2);

        System.out.println("Is list1 equal to list2: " + result);

    }
}
