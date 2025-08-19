package basicMath.partTwo;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(i + " " + isPrime(i));

        }
    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;

        }
        int c = 2;
        while (c * c <= number) {
            if (number % c == 0) {
                return false;

            }
            c++;

        }
        return true;

    }
}
