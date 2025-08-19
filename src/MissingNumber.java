
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 0, 1, 7, 2 };
        // int ans = findMissingNumber(arr);
        // System.out.println(ans);
        int[] ans = findMissingNumber(arr);
        System.out.println(Arrays.toString(ans));

    }

    static int[] findMissingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // case 1 : finding the missing number ;
        int count = 0;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                count++;
            }
        }
        int[] nums = new int[];
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                // for (int j = 0; j < nums.length; j++) {
                //     nums[j] = index;
                // }
                 nums []={index};
            }
            return nums;

        }
        // case 2
        return new int[arr.length];
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
