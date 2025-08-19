package commonprograms;

public class FiboNumbers {
    public static void main(String[] args) {
        fibo(10);

    }

    static void fibo(int n) {
        int first = 0;
        int second = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        int firstNum = 0;

        int secondNum = 1;
        while (firstNum < n) {

            System.out.println(firstNum);

            int next = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = next;
        }

    }

}
