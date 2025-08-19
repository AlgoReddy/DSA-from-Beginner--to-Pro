package recursions.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 2, 1, 6, 3, 99 };
        int ans = linear(arr, 0, 99);
        System.out.println(ans);

    }

    static int linear(int[] arr, int i, int target) {
        if (arr[i] == target) {
            return i;

        }
        if (i == arr.length - 1) {
            return -1;
        }
        return linear(arr, i + 1, target);
        // return arr[i] == target || linear(arr, i + 1, target);

    }

    static boolean linearBoolean(int[] arr, int i, int target) {
        if (arr[i] == arr.length) {
            return false;

        }
        return arr[i] == target || linearBoolean(arr, i + 1, target);
    }
}
