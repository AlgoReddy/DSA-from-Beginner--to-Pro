public class RotatedBinarySearch {
    
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };

    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            // just do the do normal binary search here as the array is not rotated ;
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        // if you found pivot ,you have found 2 sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target > nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    // this does not work for the duplicate values
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // there are 4 here by which we can find the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid -1]) {
                return mid - 1;
            } else if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // there are 4 here by which we can find the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid -1]) {
                return mid - 1;
            }
            // if elements in the middle /start / end are equal just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE : what if these elements start & end are pivot might be a case
                // check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                /*you might get confused why we are taking the end -1  becoz if the start & mid & end  3 are equal 
                 * then they are not pivots 
                 * but how can you check if it's a pivot or not so , if the last element -1 is greater than the end -1 will become the pivot 
                 */
                /* you might ask then why we are taking arr[start]>arr[start+1] meaning is that last position is the highest value  then start +1 element should be less  making start pivot 
                 *  But why we are not comparing the end element like this if it's a pivot we can compare it with end +1 so that's why 
                 */
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[mid] == arr[start] && arr[mid] > arr[end])) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    static int binarySearch(int arr[], int target, int start, int end) {

        while (start <= end) {
            // finding the mid of the number
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;

            } else {
                return mid;
            }

        }
        return -1;

    }
}
// public class RotatedBinarySearch {
// public static void main(String[] args) {
// int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
// System.out.println(findPivot(arr));

// }

// static int searchNums(int[] arr, int target) {
// int pivot = findPivot(arr);
// if (pivot == -1) {
// // run normal binary search as the arr is not rotated
// return binarySearch(arr, target, 0, arr.length - 1);
// }
// // if pivot is found , you have 2 asc order sorted arrays;
// // case 1: where pivot == target
// if (pivot == target) {
// return pivot;
// }
// if (target >= arr[0]) {
// return binarySearch(arr, target, 0, pivot - 1);

// }

// return binarySearch(arr, target, pivot + 1, arr.length - 1);
// }

// static int findPivot(int[] arr) {
// int start = 0;
// int end = arr.length - 1;
// while (start <= end) {
// int mid = start + (end - start) / 2;
// // 4 casess over here
// if (mid < end && arr[mid] > arr[mid + 1]) {
// return mid;
// } else if (mid > start && arr[mid] < arr[mid + 1]) {
// return mid + 1;
// }
// if (arr[mid] <= arr[mid]) {
// end = mid - 1;
// } else {
// start = mid + 1;
// }
// }
// return 1;

// }

// static int binarySearch(int arr[], int target, int start, int end) {

// while (start <= end) {
// // finding the mid of the number
// int mid = start + (end - start) / 2;
// if (arr[mid] > target) {
// end = mid - 1;
// } else if (arr[mid] < target) {
// start = mid + 1;

// } else {
// return mid;
// }

// }
// return -1;
// }
// }
// // review it once you have the time
// /*
// * class Solution {
// * public int search(int[] nums, int target) {
// * int start = 0;
// * int end = nums.length - 1;
// * int max = peakIndex(nums);
// * if (target <= max) {
// * end = max;
// * return binarySearch(nums, target, start, max);
// * }else{
// * max = max+1;
// * return binarySearch(nums , target , max, nums.length-1 );
// * }
// *
// * }
// *
// * int peakIndex(int[] arr) {
// * int start = 0;
// * int end = arr.length - 1;
// *
// * while (start < end) {
// * int mid = start + (end - start) / 2;
// *
// * if (arr[mid] >arr[mid+1]) {
// * end = mid;
// * } else {
// * start = mid + 1;
// * }
// *
// * }
// * return start;
// * }
// *
// * int binarySearch(int[] arr, int target, int start, int end) {
// * while (start <= end) {
// * int mid = start + (end - start) / 2;
// * if(target==arr[start]){
// * return start ;
// * }else if (target < arr[mid]) {
// * end = mid - 1;
// * } else if (target < arr[mid]) {
// * start = mid + 1;
// *
// * }
// * }
// * return -1;
// * }
// * }
// */
