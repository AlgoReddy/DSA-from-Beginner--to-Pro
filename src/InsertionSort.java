
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = { 4 , 5  , 8 ,2 ,1 ,234};
        insertionSorting(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertionSorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swapping(arr, j, j - 1);

                } else {
                    break;
                }
            }

        }
    }

    static void swapping(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
