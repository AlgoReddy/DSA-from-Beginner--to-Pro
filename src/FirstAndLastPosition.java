
import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 7, 7, 7, 8, 8, 10 };
        int target = 7;
        // the answer should starting of the target & last occurence of the target
        // for 7 : {1 , 4};
        System.out.println(Arrays.toString(search(arr, target)));

    }

    static int[] search(int[] arr, int target) {
        int[] ans = { -1, -1 };
        ans[0] = binarySearch(arr, target, true);
        ans[1] = binarySearch(arr, target, false);
        return ans;
    }

    static int binarySearch(int[] arr, int target, boolean areYouSearchingForFirstOccurence) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (areYouSearchingForFirstOccurence) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}
