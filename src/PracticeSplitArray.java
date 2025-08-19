public class PracticeSplitArray {
    public static void main(String[] args) {
        int m = 2;
        int[] arr = { 7, 2, 5, 8, 10 };
        int ans = splitArray(arr, m);

        System.out.println(ans);
    }

    static int splitArray(int[] arr, int m) {
        /*
         * Example : {7 , 2, 5 , 10 , 8};
         * problem is you have to create a sub array where the separate sums should be
         * less like
         * 7 , 2, 5 , 10 = 24 & {8} =8 here the max is 32;
         * {7 , 2 , 5 } =14 {10 , 8 }= 18 here the max sum 18 ;
         * {7 , 2} = 9 ,{5 ,10 , 8} = 23; here the max is 23 ;
         * {7} =7, {2 , 5 , 10 , 8} = 25 ; max = 32;
         * 
         * in above all the max sum in 2 sub arrays is 18 that is second one
         */
        int start = 0;
        int end = 0;
        for (int num : arr) {
            // here start stores the maximum element in the arrayy
            start = Math.max(start, num);
            // end stores the whole sum of the array that is 37
            end += num;

        }
        // normal binary Search
        while (start < end) {
            int mid = start + (end - start) / 2;
            // mid = 10+32/2 =21;
            int sum = 0;
            int pieces = 1;
            for (int nums : arr) {
                if (nums + sum > mid) {
                    // let's say 7 , 2 , 5 sum is 14
                    sum = nums;
                    pieces++;
                } else {
                    sum += nums;
                }
            }
            if (pieces <= m) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        // at last the start == equal
        return end;
    }
}
