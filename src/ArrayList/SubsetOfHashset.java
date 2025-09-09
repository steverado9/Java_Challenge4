package ArrayList;

import java.util.HashSet;
import java.util.Set;

//Write a program to check if a HashSet is a subset of another HashSet.
public class SubsetOfHashset {
    public static boolean subsetOfHashset(Set s1, Set s2) {
        boolean result = s1.containsAll(s2);
        return result;
    }
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("rema");
        set1.add("fola");
        set1.add("taves");
        set1.add("mavo");
        set1.add("nsg");
        set1.add("seyi");
        set1.add("asake");

        Set<String> set2 = new HashSet<>();
        set1.add("fola");
        set1.add("taves");
        set1.add("mavo");
        set1.add("nsg");

        boolean result = subsetOfHashset(set1, set2);

        System.out.println("is set2 a subset of set1 " + result);

    }
}
