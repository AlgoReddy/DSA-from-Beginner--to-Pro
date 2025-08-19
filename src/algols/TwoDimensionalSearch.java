package algols;

import java.util.Arrays;

public class TwoDimensionalSearch {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 3, 5 }, { 8, 20, 35 }, { 45, 12, 4 }
        };
        int target = 5;
        System.out.println(Arrays.toString(TwoDimensionalSearchM(arr, target)));
    }

    static int[] TwoDimensionalSearchM(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
