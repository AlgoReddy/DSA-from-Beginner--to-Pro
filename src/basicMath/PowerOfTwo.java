package basicMath;

public class PowerOfTwo {
     public static void main(String[] args) {
        int number = 8;
        boolean ans = (number & (number-1))==0;
        System.out.println(ans);


     }
}
