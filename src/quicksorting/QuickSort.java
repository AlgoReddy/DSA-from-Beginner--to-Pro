package quicksorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 28, 9, 10, 33, 89, 45 };
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void quicksort(int[] arr, int low, int high) {
        if (low >= high) {
            return;

        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];
        while (start <= end) {
            while (arr[start] < pivot) {
                start++;

            }
            while (arr[end] > pivot) {
                end--;

            }
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        // now my pivot is at correct position or index, please sort the 2 half's now
        quicksort(arr, low, end);
        quicksort(arr, start, high);
    }
}
