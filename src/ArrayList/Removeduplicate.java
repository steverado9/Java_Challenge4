package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Write a program to remove all duplicate elements from an ArrayList.
public class Removeduplicate {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);

        Set<Integer> removeDuplicate = new HashSet<>(numbers);

        numbers.clear();

        numbers.addAll(removeDuplicate);

        System.out.println(numbers);


    }
}
