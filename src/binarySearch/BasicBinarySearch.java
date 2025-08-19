package binarySearch;

public class BasicBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 8, 9, 10, 28, 32, 49, 54, 67, 76, 89, 93 };
        int target = 32;
         System.out.println(binarySearch(arr, target));

    }

    static int binarySearch(int arr[], int target) {
        int start = arr[0];
        int end = arr.length - 1;
        while (start <= end) {
            // finding the mid of the number
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid+ 1;

            } else {
                return mid;
            }

        }
        return -1;

    }
}