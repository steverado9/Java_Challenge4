package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//Create a LinkedList and perform various operations like add, remove, and iterate over it.
public class OperationsOnLinkedList {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = new LinkedList<>();

        //add elements
        listOfNumbers.add(1);
        listOfNumbers.add(2);
        listOfNumbers.add(3);
        listOfNumbers.add(4);
        listOfNumbers.add(5);

        //remove uising index
        listOfNumbers.remove(2);

        //iterate over linkedlist
        Iterator<Integer> itr = listOfNumbers.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

}
