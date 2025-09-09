package ArrayList;

import java.util.LinkedList;
import java.util.List;

//Write a program to check if two LinkedLists are equal.
public class EqualLinkedList {
    public static boolean isEqual(Object l1, Object l2) {
        boolean result = l1.equals(l2);
        return result;
    }
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        list1.add("fola");
        list1.add("bnxn");
        list1.add("monaky");
        list1.add("lojay");

        List<String> list2 = new LinkedList<>();
        list2.add("fola");
        list2.add("bnxn");
        list2.add("monaky");
        list2.add("lojay");

        boolean result = isEqual(list1, list2);

        System.out.println("Is List1 equal to List2: " + result);

     }
}
