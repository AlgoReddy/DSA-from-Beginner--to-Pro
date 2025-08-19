package mergesorting;

import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 1, 3, 5, 91, 32 };
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

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
