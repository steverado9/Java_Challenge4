package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

        int largestNum = list.get(0);
        System.out.println(largestNum);

        int secondLargestNum = list.get(0);
        System.out.println(secondLargestNum);

        Iterator<Integer> itr = list.iterator();

        //get the largest number
        while(itr.hasNext()) {
            if ( itr.next() > largestNum ) {
                largestNum = itr.next();
            }
        }

        //get second-largest number
//        for (int element : list) {
//            if(element > secondLargestNum && element < largestNum) {
//                secondLargestNum = element;
//            }
//        }

        //Print second largest number
        System.out.println("The second largest number is : " + secondLargestNum);
    }
}
