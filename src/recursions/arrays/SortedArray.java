package recursions.arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 12 };
        System.out.println(sortedArray(arr));
        System.out.println(sorted(arr, 0));

    }

    static boolean sortedArray(int[] arr) {
        return helper(0, arr);
    }

    static boolean helper(int i, int[] arr) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return helper(i + 1, arr);
    }

    static boolean sorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        return arr[i] < arr[i + 1] && sorted(arr, i + 1);
    }

}
