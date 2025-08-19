package StringsMethods;

public class StringPalindrome {
    public static void main(String[] args) {
        String str ="";
        System.out.println(isPalindrome(str));

    }

    static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        for (int i = 0; i < str.length() / 2; i++) {
            if (str == null || str.length() == 0) {
                return true;
            }
            // if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
            // return false;
            // }
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                return true;
            }
        }
        return true;

    }
}
