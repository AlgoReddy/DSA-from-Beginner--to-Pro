package basicMath;
/*Magic number asked in amazon (magic number is respective to this question)
 *
 * when a number is given example 4
 * we have to convert the 4 into binaray == 1 , 0 , 0 then we have  make 5 power of 1 increasing from the last digit to the first digit like shown in below
 *     3    2    1
 *   5    5    5
 * 1    0    0        125+0+0 -> 125   is the magic number of the 4
 *
 *
 * 2* example for 3  =  0   1   1  -> 25 +5 -> 30
 *
 */

public class MagicNumber {
    public static void main(String[] args) {
        int number = 4;
        int ans = 0;
        int base = 5;

        while (number > 0) {
            // here the last number gives the value of the last digit that either 0 or 1
            // we are doing the right shift here which ignores the last digit until the last
            // digit becomes less or equal to 0
            int last = number & 1;
            // here the number shifts  right to left position  
            number = number >> 1;
            // ans = ans + last * base -> 0*5 power respective number
            ans += last * base;
            // it increases the power of the 5 for each incrementing number .
            base = base * 5;

        }
        System.out.println(ans);

    }

}
