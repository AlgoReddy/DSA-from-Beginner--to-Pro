package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionsal_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[][] ArrayTwo = new int[3][3];
        for (int row = 0; row < ArrayTwo.length; row++) {
            for (int col = 0; col < ArrayTwo[row].length; col++) {

                ArrayTwo[row][col] = sc.nextInt();
            }
        }
        // 1 method to print 2 dimensional array
        for (int i = 0; i < ArrayTwo.length; i++) {
            for (int j = 0; j < ArrayTwo[i].length; j++) {
                System.out.print(ArrayTwo[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("this is the second method");
        // 2 nd method to print the 2 dimensional array
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(ArrayTwo[row]));

        }
        // 3 rd method to print the multidimensional Array
        System.out.println("this is the 3rd method");
        for (int[] edoOkatiLey : ArrayTwo) {
            System.out.println(Arrays.toString(edoOkatiLey));
        }

    }
}
