
public class RotatedArrayWithDups {
    public static void main(String[] args) {
        int[] arr = { 10 ,  12 , 14, 15 , 18 , 20 , 0 , 3 , 6 , 8 , 9  };
        int target = 5;
        int ans = finalAnswer(arr, target);
        System.out.println(ans);
        int howManyTimesArrayIsRotate=findPivot(arr);
        System.out.println("this is how many times the array is rotated");
        System.out.println(howManyTimesArrayIsRotate+1);

    }

    static int finalAnswer(int[] arr, int target) {
        int pivot = findPivot(arr);
        int dups = dupFindPivot(arr);
        // if (arr[pivot] == target) {
        //     return pivot;
        // }
        // if (pivot == -1) {
        //     binarySearch(arr, target, 0, arr.length - 1);
        // }
        // if (target >= arr[0]) {
        //     return binarySearch(arr, target, 0, pivot - 1);
        // }
        // return binarySearch(arr, target, pivot + 1, arr.length - 1);
    

        if (arr[dups] == target) {
            return dups;
        }
        if (dups == -1) {
            binarySearch(arr, target, 0, arr.length - 1);
        }
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, dups - 1);
        }
        return binarySearch(arr, target, dups + 1, arr.length - 1);
    }

    /*
     * Every time you want to solve the case make an array & think what might be the
     * possible scenario's . Each condition is wriiten based on the scenario / to
     * meet the specific set of scenario's .
     */
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // there are 4 cases that might be happen
            /*
             * 1. if there is { 4, 5 , 6 , 7 ,0 , 1, 2 ,}
             * let's say if mid is 7 then
             * there is also chance that the pivot is the last element so to check that
             * thing we && logic
             */
            if (arr[mid] > arr[mid + 1] && mid < end) {
                // if the mid is 7
                // mid<end checks if the mid is the last element & protects us from the out of
                // bound index array error
                return mid;
            } else if (arr[mid] < arr[mid - 1] && mid > start) {
                // same here mid>start checking wheather the mid is the start
                // if the mid is 0
                return mid - 1;
            }
            // { 4, 5 , 6 , 7 ,0 , 1, 2 ,}
            // let's mid = 6 ; then there might be elements present to right side which
            // might be bigger than 6
            if (arr[mid] > arr[start]) {
                start = mid + 1;
            } else {
                // above loop checks the elements at the right hand side now the below one
                // checks the
                // vice versa at the left hand side
                end = mid - 1;
            }

        }
        return -1;
    }

    static int dupFindPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1] && mid < end) {
                return mid;
            } else if (arr[mid] < arr[mid - 1] && mid > start) {
                return mid - 1;
            }
            // if the start = mid = end
            if (arr[start] == arr[mid] & arr[end] == arr[mid]) {
                // what if the start is the pivot
                // when will the start become the pivot , if the start > mid
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                // what if the end is the become the pivot
                // if the pivot is end then we compare with pivot +1 meaning end+1 to make this
                // true
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }

                end--;
            }
            if (arr[start] < arr[mid] || (arr[mid] == arr[start] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }

}
