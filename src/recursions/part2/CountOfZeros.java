package recursions.part2;

public class CountOfZeros {
    public static void main(String[] args) {
        // find the no of zero's in the given number
        // ex: 20330030 --> 4
        System.out.println(zeroCount(20330030));

    }

    static int zeroCount(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int c) {
        if (n == 0) {
            return c;

        }
        int rem = n % 10;
        if (rem == 0) {

            return helper(n / 10, c+1);
        }
        return helper(n/10, c);
    }

}
