package commonprograms;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimesionalArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 2, 3, 5 }, { 6, 8, 9 }, { 10, 11, 12 }
        };
        int[][] arr2 = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();

            }
        }
        // printing the array
        System.out.println("hey i am printing here , don't forget ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(arr2[i][j]);

            }
        }
        // second way of printing the 2d array
        System.out.println("second way of printing the 2 dimensional array ");
        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }
        // third method to print
        System.out.println("third method to print the 2d array ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }
    }

}
