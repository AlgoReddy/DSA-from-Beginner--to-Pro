package recursions;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 9 };
        binaryRecursion(arr, 5, 0, arr.length);
        System.out.println(binaryRecursion(arr, 5, 0, arr.length));

    }

    static int binaryRecursion(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;

        }
        if (arr[mid] > target) {
            return binaryRecursion(arr, target, start, mid - 1);
        }

        return binaryRecursion(arr, target, mid + 1, end);

    }
}
