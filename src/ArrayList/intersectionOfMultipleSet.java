package ArrayList;

import java.util.HashSet;
import java.util.Set;

//Write a program to find the intersection of multiple Sets.
public class intersectionOfMultipleSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("bnxn");
        set1.add("fola");
        set1.add("mavo");

        Set<String> set2 = new HashSet<>();
        set2.add("rema");
        set2.add("bnxn");
        set2.add("shalipopi");

        Set<String> set3 = new HashSet<>();
        set3.add("monaky");
        set3.add("pyschoyp");
        set3.add("bnxn");

        //retinAll is used to retain similar elements
        set1.retainAll(set2);
        set1.retainAll(set3);
        System.out.println(set1);
    }
}
