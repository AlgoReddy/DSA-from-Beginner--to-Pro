package algols;

public class FindMaxUsingEnhancedForTwoD {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 8, 9 }, { 34, 12, 11, 15 } };
        System.out.println(findMax(arr));
    }

    static int findMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int cols : ints) {
                if (cols > max) {
                    max = cols;
                }
            }
        }
        return max;
    }
}
