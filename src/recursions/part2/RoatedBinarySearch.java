package recursions.part2;

public class RoatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 6, 7, 8, 9, 10, 1, 2, 3, 4, 5 };
        System.out.println(RBS(arr, 10, 0, arr.length - 1));

    }

    static int RBS(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;

        }
        if (target < arr[m]) {
            if (target > arr[s] && target < arr[m]) {
                return RBS(arr, target, s, m - 1);

            } else {
                return RBS(arr, target, m - 1, e);
            }

        }
        if (target > arr[m] && target <= arr[e]) {

            return RBS(arr, target, m + 1, e);

        }
        return RBS(arr, target, s, m - 1);
    }

}
