import java.util.ArrayList;
import java.util.Arrays;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 4, 5, 7 };
        ArrayList<Integer> missing = findDisappearedNumbers(nums);
        System.out.println("Sorted Array (Cyclic Sort): " + Arrays.toString(nums));
        System.out.println("Missing Numbers: " + missing);

    }

    static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);

            }
        }
        return ans;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
