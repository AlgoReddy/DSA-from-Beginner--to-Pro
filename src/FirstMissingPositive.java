public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = { 7 , 9 , 8 , 6 , 11 , 10};
        int ans = firstMissingPositiveArray(arr);
        System.out.println(ans);

    }

    static int firstMissingPositiveArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            //here teh arr[i]>0 sees if any element is negetive skip the loop & why we are mentioning the arr[i]<=arr.length is 
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);

            } else {
                i++;

            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }
        return -8;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
