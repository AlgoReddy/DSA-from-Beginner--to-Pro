
public class RoateBinaryPlusDuplicateBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 2, 3, 5 };
        // int piv = findPivot(arr);
        // System.out.println(piv);
        // int ans = RotatedSearch(arr, 2);
        // System.out.println(ans);
        int april = RotatedSearch(arr, 2);
        System.out.println(april);
    }

    static int RotatedSearch(int arr[], int target) {

        int pivot = findPivot(arr);
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);

        } else {

            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }

    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // there are 4 cases to find the pivot in the array
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;

                // { 4 , 5, 6 , 1, 2 , 3 }
                // here let's say if arr[mid] = 1 < arr[mid-1=6 meaning here we found our pivot
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;

            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }

}
