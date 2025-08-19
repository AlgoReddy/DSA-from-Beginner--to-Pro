public class MountainArrary {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 6, 7, 8, 5, 4, 3, 1 };
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);

    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <end) {
            // we are assuming whenever the loop breaks that is our max number in that array & we are making start < end to come out of loop 
            // if make start <= end , then it will stuck in the continous loop 
            int mid = start + (end - start) / 2;
            
            // you are in ascending part of the array
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                //you are in descending part of the array 
                end = mid;

            }
        }
        return end;
        // in the end , start = = end and pointing towards   to the largest number bcoz of the 2 checks above
        //start & end always try to find the max elements in the above checks 
        // hence we are pointing to same element  , that is the max number that is check say 
        // more elaboration : at everypoint of time for start & end they have the best possible answer at that time , and if we are saying we are only saying one item is remaining that is the best possible answer 
    }

}
