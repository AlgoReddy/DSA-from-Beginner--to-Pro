package recursions.part3;

public class PatternOne {
    public static void main(String[] args) {
        // pattern1(4, 0);
        // enhanced(5, 0);
        normalTriangle(5, 0);

    }

    static void pattern1(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("*");
        }
        if (row == col) {
            System.out.println(" ");
            col = 0;
            pattern1(row - 1, col);
        } else {
            pattern1(row, col + 1);
        }
    }

    // more enhanced loop
    static void enhanced(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("*");
            enhanced(row, col + 1);
        } else {
            System.out.println(" ");
            enhanced(row - 1, 0);
        }
    }

    static void normalTriangle(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            normalTriangle(row, col + 1);
            System.out.print("*");
        } else {
            normalTriangle(row - 1, 0);
            System.out.println(" ");
        }
    }

}
