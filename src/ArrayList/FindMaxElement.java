package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Write a program to find the maximum element from an ArrayList of Integers.
public class FindMaxElement {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Integer maxNumber = numbers.get(0);

        Iterator<Integer> itr = numbers.iterator();

        while(itr.hasNext()) {
            if (itr.next() > maxNumber) {
                maxNumber = itr.next();
            }
        }
        System.out.println("Maximum number = " + maxNumber);

    }
}
