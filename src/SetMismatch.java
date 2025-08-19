
import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 4 };
        setMismatchProblem(arr);
        // System.out.println(Arrays.toString(setMismatchProblem(arr)));
        int[] nums = setMismatchProblem(arr);
        System.out.println(Arrays.toString(nums));

    }

    static int[] setMismatchProblem(int[] arr) {
        // 0 1 2 3
        // {1 ,2 , 2, 4 } --> [2, 3 ] in the form of the array
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }

        }
        int nums[] = new int[2];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+ 1) {
                nums[0] = arr[j];
                nums[1] = j+ 1;
            }
        }
        return nums;

    }

}
