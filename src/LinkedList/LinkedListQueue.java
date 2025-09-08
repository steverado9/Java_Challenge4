package LinkedList;

import java.util.LinkedList;
import java.util.Queue;

//Implement a Queue using the LinkedList class.
public class LinkedListQueue {
    public static void main(String[] args) {
        //created a Linkedlist using the queue interface
        Queue<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.poll();

        System.out.println(list);
    }
}
