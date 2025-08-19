package recursions.part2;

public class ReverseNumber {
    public static void main(String[] args) {
        // traditionalMethod(12345);
        // revRecursion(875764235);
        // System.out.println(ReverseNumber);
        System.out.println(rev2(1243552));
    }

    static int ReverseNumber = 0;

    static void traditionalMethod(int n) {
        while (n > 0) {
            int rem = n % 10;
            // 124
            /* 4*10 --> 40 +0 ---> 2*10 -->20 *40 */
            ReverseNumber = ReverseNumber * 10 + rem;
            n /= 10;

        }
        System.out.println(ReverseNumber);

    }

    // recursive method 1 .
    static void revRecursion(int n) {
        if (n <= 0) {
            return;
        }
        int rem = n % 10;
        ReverseNumber = ReverseNumber * 10 + rem;
        revRecursion(n / 10);
    }

    // recursive method2

    static int rev2(int n) {

        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;

        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);

    }

}
