package basicMath.partTwo;

public class SquareRoot {
    public static void main(String[] args) {
        int number = 64;
        int i = 2;
        while (i * i <= number ) {
            if (i * i == number) {
                System.out.println(i);

            }
            i++;

        }
        System.out.println("no squareroot found for this number ");

    }

}
