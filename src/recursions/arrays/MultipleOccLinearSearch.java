package recursions.arrays;

import java.util.ArrayList;

public class MultipleOccLinearSearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = { 4, 6, 3, 3, 3, 3, 3, 3, 8, 0 };
        multiSearch(arr, 0, 3, list);
        System.out.println(list);
        System.out.println(count);
        System.out.println("this is the answer of findAllIndex");
        System.out.println(findAllIndex(arr, 3, 0));

    }

    static int count = 0;

    static int multiSearch(int[] arr, int index, int target, ArrayList<Integer> list) {
        if (index == arr.length) {
            return -1;

        }
        if (arr[index] == target) {
            list.add(index);
            count++;

        }
        return multiSearch(arr, index + 1, target, list);

    }

    // returning the list without the passing of arguments
    // here we are creating a new arraylist in each cycle of recursion

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        // this will add only the index of that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowAllCalls = findAllIndex(arr, target, index + 1);
        // after the function is returning from above call here in below line we are all
        // adding it , without the below the answer it return is null
        list.addAll(ansFromBelowAllCalls);
        return list;

    }
}
