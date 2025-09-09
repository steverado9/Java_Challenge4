package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Write a program to find the maximum element from an ArrayList of Integers.
public class FindMaxElement {

    public static int maxElement(List<Integer> list) {
        Integer maxNumber = 0;

        for (int element : list) {
            if ( element > maxNumber) {
                maxNumber = element;
            }
        }
        return maxNumber;
    }
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int maxNumber = maxElement(numbers);

        System.out.println("Maximum number = " + maxNumber);

    }
}
