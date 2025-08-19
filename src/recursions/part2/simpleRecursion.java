package recursions.part2;

class simpleRecursion {
    public static void main(String[] args) {
        // funRecurion(5);
        // funReverse(5);
        bothFun(5);

    }

    static void funRecurion(int n) {
        if (n == 0) {
            return;

        }
        System.out.println(n);
        funRecurion(n - 1);
    }

    static void funReverse(int n) {
        if (n == 0) {
            return;

        }
        funReverse(n - 1);
        System.out.println(n);
    }

    static void bothFun(int n) {
        if (n == 0) {
            return;

        }
        System.out.println(n);
        bothFun(n - 1);
        System.out.println(n);
    }

}
