public class MissingElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
        missingElement(arr);
        System.out.println(missingElement(arr));

    }

    static int  missingElement(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i + 1] - 1) {
                return arr[i]+1;
            }
        }
        return -1;
    }
}
