package algols;

public class FindMinNumberArray {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 45, 65, 2, 342, 43 };
        int target = 2;
        System.out.println(findMinNum(arr, target));
    }

    static int findMinNum(int[] arr, int target) {
        int minNumber = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minNumber) {
                minNumber = arr[i];
            }
        }

        return minNumber;
    }
}
