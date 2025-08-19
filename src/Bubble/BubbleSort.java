package Bubble;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 4, 8 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr) {
        // run n-1 steps

        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                // for each step , the max item or element come at the last respective index
                if (arr[j] < arr[j - 1]) {
                    // perform the swap here
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;

                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
