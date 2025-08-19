package recursions.part2;

public class SumOfDigitsinNumber {
    public static void main(String[] args) {
        System.out.println(sumOfdigits(123456));

    }

    static int sumOfdigits(int number) {
        if (number <= 0) {
            return 0;

        }
        return number % 10 + sumOfdigits(number / 10);
    }

}
