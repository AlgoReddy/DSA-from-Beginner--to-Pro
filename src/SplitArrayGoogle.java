public class SplitArrayGoogle {
    public static void main(String[] args) {
        int [] nums = {7 , 2, 3 , 8 , 18};
        int ans = splitArray(nums, 2);
        System.out.println(ans);

    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            // this line controls or outputs the max item in the array or it's a simple
            // linear Search
            start = Math.max(start, nums[i]);
            end += nums[i];
            // binary Search
            // our final answer would be start == end ;
            while (start < end) {
                /// try for the potential answer
                int mid = start + (end - start) / 2;
                // calculate how many pieces you can divide this in with this max sum
                int sum = 0;
                int pieces = 1;
                for (int num : nums) {
                    if (sum + num > mid) {
                        // you cannot add this in subarray , make a new one
                        // say you can add this sum into the new subarray , that makes it sum = num ;
                        sum = num;
                        pieces++;

                    }else {
                        sum +=num;
                    }
                }
                if(pieces>m){
                    start = mid+1;
                
                }else{
                    end = mid;
                }
            }
        }
        return end;
    }

}
