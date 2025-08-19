package recursions.part3;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 1, 2, 9 };
        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));

    }

    // static void bubble(int[] arr, int startIndex, int endIndex) {
    // System.out.println(Arrays.toString(arr));
    // if (startIndex == arr.length - 1) {
    // return;

    // }
    // if (arr[startIndex] > arr[startIndex + 1]) {
    // int temp = arr[startIndex];
    // arr[startIndex] = arr[startIndex + 1];
    // arr[startIndex + 1] = temp;
    // bubble(arr, arr[startIndex + 1], arr[endIndex - 1]);
    // }
    // bubble(arr, arr[startIndex + 1], arr[endIndex - 1]);
    // }
    static void bubble(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            bubble(arr, row, col + 1);
        } else {
            bubble(arr, row - 1, 0);
        }

    }
}
