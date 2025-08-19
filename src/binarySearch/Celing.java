package binarySearch;

public class Celing {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 4;
        System.out.println(celingSearch(arr, target));

    }

    static int celingSearch(int[] arr, int target) {
        // these are the small steps in the leet code where we actually forgot how to do 
        if(target>arr.length-1){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        int storedMid=0;
        // while loop for the binary search
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // if statement
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                return mid;
            }  
            storedMid=start; 
        }
        return storedMid;
        
    }

}
