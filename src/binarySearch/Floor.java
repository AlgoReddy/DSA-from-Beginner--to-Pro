package binarySearch;

public class Floor {
    public static void main(String[] args) {
        int arr[] = { 2 , 3, 5, 7, 9 ,15 , 19 , 23 };
        int floor = 16 ;
        System.out.println(floorSearch(arr, floor));

    }
    static int floorSearch ( int arr[]   , int floor ) {
        int start = 0;
        int end = arr.length-1;
        while(start <=end){
            int mid = start + (end - start);
            if(floor > arr[mid]){
                start = mid +1;
            }else if (floor<arr[mid]) {
               end = mid -1; 
            }else{
                return mid ; 
            }
        }
        return end ; 
    }
    
}
