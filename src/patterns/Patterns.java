package patterns;
/*
 * simple fanda
 */

public class Patterns {
    public static void main(String[] args) {
        pattern28(5);
        pattern12(5);

    }

    // pattern 12
    static void pattern12(int n) {
        System.out.println("This is pattern12");
        for (int row = n * 2; row > 0; row--) {
            int totalCols = row > n ? row - n : n - row + 1;
            for (int spaces = 0; spaces < n - totalCols; spaces++) {
                System.out.print(" ");

            }
            for (int cols = 0; cols < totalCols; cols++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }

    // pattern 11
    static void pattern11(int n) {
        System.out.println("THis is pattern 11");
        for (int i = n; i > 0; i--) {
            for (int spaces = 0; spaces < n - i; spaces++) {
                System.out.print(" ");

            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    // pattern 10
    static void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int spaces = 0; spaces < n - i; spaces++) {
                System.out.print(" ");

            }
            for (int cols = 0; cols < i; cols++) {
                System.out.print("* ");

            }
            System.out.println(" ");
        }
    }

    // pattern 9
    static void pattern9(int n) {
        System.out.println("This is pattern 9 ");
        for (int rows = n; rows > 0; rows--) {
            for (int space = 0; space < n - rows; space++) {
                System.out.print(" ");

            }
            for (int left = 0; left < rows; left++) {
                System.out.print("*");

            }
            for (int right = 1; right < rows; right++) {
                System.out.print("*");

            }
            System.out.println(" ");

        }
    }

    // pattern 8
    static void pattern8(int n) {
        System.out.println(" this is pattern 8 ");
        /*
         * *
         * ***
         * ******
         * *********
         */
        for (int i = 0; i < n; i++) {
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");

            }
            for (int left = 0; left < i; left++) {
                System.out.print("*");
            }
            for (int right = 1; right < i; right++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }

    // pattern 1
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    static void pattern1(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    /*
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     *
     */
    static void pattern2(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
        System.out.println(" ");
    }

    /*
     * pattern 3
     *
     * * * * * *
     * * * * *
     * * * *
     * * *
     * *
     */
    static void pattern3(int number) {
        for (int rows = 0; rows < number; rows++) {
            for (int columns = 1; columns <= number - rows; columns++) {
                // c = n -r if columns start = 1 or n-r -1
                System.out.print("*");

            }
            System.out.println(" ");

        }
        System.out.println(" ");
    }

    /*
     * pattern 4
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     */

    static void pattern4(int number) {
        for (int rows = 1; rows <= number; rows++) {
            for (int colums = 1; colums <= rows; colums++) {
                System.out.print(colums + " ");

            }
            System.out.println(" ");
        }

        System.out.println(" ");
    }

    /*
     *
     * pattern 5
     *
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     */

    static void pattern5(int number) {

        for (int rows = 0; rows < number; rows++) {
            for (int colums = 0; colums < rows; colums++) {
                System.out.print("* ");

            }
            System.out.println(" ");

        }
        for (int rows = 0; rows < number; rows++) {
            for (int columns = 1; columns <= number - rows; columns++) {
                System.out.print("*");

            }
            System.out.println(" ");

        }
        System.out.println(" ");
    }

    static void alternativePattern5(int n) {
        for (int row = 0; row < n * 2; row++) {
            int totalColumns = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColumns; col++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     */

    static void pattern6(int n) {
        System.out.println("This is pattern 6 ");
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");

            }

            for (int cols = 0; cols < i; cols++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

    }

    static void pattern7(int n) {
        System.out.println("This is pattern 7 ");
        for (int i = 0; i < n; i++) {
            for (int spaces = 0; spaces < i; spaces++) {
                System.out.print(" ");

            }
            for (int cols = n - i; cols > 0; cols--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void pattern28(int n) {
        System.out.println(" This is pattern no 28 ");
        for (int row = 0; row < n * 2; row++) {
            int totalColumns = row > n ? 2 * n - row : row;
            int spaces = n - totalColumns;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols < totalColumns; cols++) {
                System.out.print("* ");

            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
