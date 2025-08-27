package leetcodeseries;

public class SixtyNine {
    public static void main(String[] args) {
       int myAns= mySqurt(2147395600);
       System.out.println(myAns);


    }

    public static int mySqurt(int x) {
        int starter = 0;
        while (starter*starter <= x) {
            starter++;

        }
        if (starter*starter==x) {
            return starter;
        }

        return starter-1;

    }
}
