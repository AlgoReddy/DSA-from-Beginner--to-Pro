public class LeetCodeSevenFourFour {
    public static void main(String[] args) {

        char[] letters = { 'a', 'b', 'c', 'd', 'e' };
        // soultiion should be x
        char celing = 'a';
        System.out.println(nextGreatestLetter(letters, celing));

    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}