public class AmazonInterviewQuestion {
    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/

        int[] arr = { 2, 3, 5, 6, 6, 7, 10, 13, 19, 21, 26, 29, 32, 38, 43 };
        int target = 19;
        System.out.println(infiniteReturner(arr, target));


    }


    static int infiniteReturner(int arr[], int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            // changing the start
            int newStart = end + 1;

            // doubling the size of the array for each iteration of the loop
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearchInfinite(arr, target, start, end);
    }

    static int binarySearchInfinite(int arr[], int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
