package mergesorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BasicMergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 8 };
        // int[] ans = mergeSort(arr);
        // System.out.println(Arrays.toString(ans));
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);

    }

    static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;

        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;

        }
        return mix;
    }

    static void mergeSortInPlace(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

        mergeInPlace(arr, start, mid, end);
    }

    static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s, j = m, k = 0;
        while (i < m && j < e) {
            if (arr[i] <= arr[j]) {
                mix[k] = arr[i];
                i++;

            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;

        }
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;

        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;

        }
        for (int z = 0; z < mix.length; z++) {
            arr[s + z] = mix[z];
        }

    }

}
