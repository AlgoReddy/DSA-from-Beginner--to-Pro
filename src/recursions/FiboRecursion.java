package recursions;

public class FiboRecursion {
    public static void main(String[] args) {
        // System.out.println(fibo(4));
        System.out.println(fibo(4));

    }

    static int fibo(int n) {
        // base condition
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
