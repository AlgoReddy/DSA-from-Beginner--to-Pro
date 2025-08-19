package commonprograms;

import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
        System.out.println("Enter the number to check wheather the given number is a armstrong or not ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int temp = input;
        int temp2 = input;
        int count = 0;
        int externalSum = 0;
        while (temp > 0) {

            count++;
            temp /= 10;
        }
        System.out.println(count);
        while (input > 0) {
           int  sum = 1;
            int dup = input % 10;
            for (int i = 0; i < count; i++) {
                sum = sum * dup;

            }
            input /= 10;
            externalSum = sum +externalSum;

        }
        System.out.println(externalSum);
        System.out.println(externalSum == temp2 ? "yes" : "not");
    }

}
