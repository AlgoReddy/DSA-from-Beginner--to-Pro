
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = { 5, 2 ,  6 ,  9 , 4 };
        selectionSorting(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            /*
             * why we are using the arr.lenth -i -1 becoz
             * for every time the loop run it ensures that we don't need to check for the
             * respective last digits as they are already sorted
             * this line ensures that loop doesn't iterate through that again & again
             */
            int last = arr.length - i - 1;
            int max = maxElement(arr, 0, last);
            swapping(arr, max, last);

        }
    }

    static void swapping(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;

    }

    static int maxElement(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <=end; i++) {      
            if(arr[max]<arr[i]){
                max = i ;
            }
            
        }
        return max;
    }

}
