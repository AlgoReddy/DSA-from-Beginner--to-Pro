public class SearchInMountainArray {

    public static void main(String[] args) {
        
    }

    // static int findInMountainArray(int target, int mountainArr) {
    // return 1;

    // }
    int findInMountainArray(int target, int [] arr) {
         int peak=peakIndexInMountainArray(arr);
         int firstTry=agonsticBinarySearch(arr, target , 0 , peak);
         if(firstTry!= -1 ) {
            return firstTry;
         }else{
            return agonsticBinarySearch(arr, target, peak, arr.length-1);
         }

    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // we are assuming whenever the loop breaks that is our max number in that array
            // & we are making start < end to come out of loop
            // if make start <= end , then it will stuck in the continous loop
            int mid = start + (end - start) / 2;

            // you are in ascending part of the array
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                // you are in descending part of the array
                end = mid;

            }
        }
        int max = end;
        return max;
        // in the end , start = = end and pointing towards to the largest number bcoz of
        // the 2 checks above
        // start & end always try to find the max elements in the above checks
        // hence we are pointing to same element , that is the max number that is check
        // say
        // more elaboration : at everypoint of time for start & end they have the best
        // possible answer at that time , and if we are saying we are only saying one
        // item is remaining that is the best possible answer
    }

    // static int normalBinarySearch(int[] arr, int target, int max) {
    //     int start = 0;
    //     int end = arr.length - 1;
    //     int ans = 0;
    //     if (target <= max) {
    //         // ans = binarySearch(arr, target, start, end);
    //         while (start <= end) {
    //             int mid = start + (end - start) / 2;

    //             if (target < arr[mid]) {
    //                 end = mid - 1;
    //             } else if (target > arr[mid]) {
    //                 start = mid + 1;
    //             } else {
    //                 return target;
    //             }

    //         }
    //     } else {
    //         start = max + 1;
    //         while (start <= end) {
    //             int mid = start + (end - start) / 2;
    //             start = mid + 1;

    //             if (target < arr[mid]) {
    //             } else if (target > arr[mid]) {
    //                 end = mid - 1;
    //             } else {
    //                 return target;
    //             }

    //         }
    //     }
    //     return 1;
    // }

    // static int binarySearch(int[] arr, int target, int start, int end) {

    // while (start <= end) {
    // int mid = start + (end - start) / 2;
    // if (target < arr[mid]) {
    // end = mid - 1;
    // } else {
    // start = mid + 1;
    // }
    // return mid;
    // }
    // return -00;
    // }
    static int agonsticBinarySearch(int[] arr, int target , int start , int end ) {
        

        boolean asc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (asc) {
                if (target < arr[mid]) {
                    end = mid + 1;

                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid + 1;

                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
