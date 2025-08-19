package algols;

public class MaxInTwoDArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 3, 6 }, { 3, 6, 9 }, { 4, 12, 999 } };
        System.out.println(maxNumberInTwoDArray(arr));
    }

    static int maxNumberInTwoDArray(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }

            }
        }
        return max;
    }
}
