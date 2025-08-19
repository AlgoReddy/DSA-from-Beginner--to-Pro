package algols;

public class FindNoInRangeOfIndex {
    public static void main(String[] args) {
        int[] arr = { 3, 32, 2, 6, 0, 12, 24, 18 };
        int target = 12;
        System.out.println(searchInRange(arr, target, 2, 6));

    }

    static int searchInRange(int[] arr, int target, int start, int end) {
        int element = target;
        for (int i = start; i <= end; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1; 
    }

}
