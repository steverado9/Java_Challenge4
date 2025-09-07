package ArrayList;

import java.util.Arrays;

public class KthSmallestElement {
    //Fuction to return k'th smallest
    //element in a given way
    public static int kthSmallest(Integer[] arr, int k) {
        //sort the given array
        Arrays.sort(arr);
        //Return k'th element in
        //the sorted array
        return arr [k - 1];
    }

    public static void main(String[] args) {
        Integer arr[] = new Integer[] {12, 3, 5, 7, 19};
        int k = 2;

        //function call
        System.out.println(kthSmallest(arr, k));
    }
}
