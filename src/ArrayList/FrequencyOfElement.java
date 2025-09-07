package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Write a program to find the frequency of each element in an ArrayList.
public class FrequencyOfElement {
    public static ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        int n = arr.length;

        //Mark all array elements as not visited
        boolean[] visited = new boolean[n];
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            //Skip this element if already processed
            if (visited[i])
                continue;
            int count = 0;

            //store the frequency
            for (int j = i; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(arr[i]);
            temp.add(count);
            ans.add(temp);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 20};
        ArrayList<ArrayList<Integer>> ans = countFreq(arr);
        System.out.println(ans);

        Collections.sort(ans, new Comparator<ArrayList<Integer>>() {
            public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
                return Integer.compare(a.get(0), b.get(0));
            }
        });
        for (ArrayList<Integer> x : ans) {
            System.out.println(x.get(0) + " " + x.get(1));
        }
    }
}
