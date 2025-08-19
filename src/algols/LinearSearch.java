package algols;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Enter the size of Array & followed by the elements in Arrays");
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter your target Number");
        int Target = sc.nextInt();
        System.out.println(Arrays.toString(arr));
        int result = linearSearch(arr, Target);
        System.out.println(result);
    }

    static int linearSearch(int[] arr, int Target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i] ;
            if (element == Target) {
                return i;
            }
        }
        return -1;
    }
}
