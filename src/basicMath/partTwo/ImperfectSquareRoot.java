package basicMath.partTwo;

public class ImperfectSquareRoot {
    public static void main(String[] args) {
        // have to find the square root of the 40 or let's imperfect roots .
        // example 40 = 6.3
        // imperfectRoot(7);
        int n = 40;
        int p = 3;
        System.out.printf("%.3f", imperfectRoot(n, p));

    }

    static double imperfectRoot(int n, int p) {
        int start = 0;
        int end = n;
        double root = 0.00;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == n) {
                root = mid;
                return root;
            }
            if (mid * mid > n) {
                end = mid - 1;
            }
            if (mid * mid < n) {
                start = mid + 1;

            }
        }
        double inc = 0.1;
        for (int i = 1; i <= p; i++) {
            while (root * root <= n) {
                root += inc;

            }
            root -= inc;
            inc /= 10;

        }
        return root;
    }

}
