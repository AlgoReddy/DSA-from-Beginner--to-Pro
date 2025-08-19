package recursions.part3;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 8, 4, 9 };
        select(arr, arr.length - 1, 0, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void select(int[] arr, int row, int col, int max) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[max] < arr[col]) {
                select(arr, row, col + 1, col);
            } else {
                select(arr, row, col + 1, max);
            }

        } else {
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            select(arr, row - 1, 0, 0);
        }

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
