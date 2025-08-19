// package algols.1295 ; 

public class NumbersWithEvenDigits {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));

    }

    
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
        
    }
    
    // function to check wheather a number contains the even digits or not
    static boolean even(int num) {
        int numberofDigits = digits(num);
        // if (numberofDigits%2==0){
            // return true;
            // }
            // return false ;
            return numberofDigits % 2 == 0;
            
        }
        
         
        // count number of digits in a number
    static int digits(int num) {
        // making the code work for the negative numbers also

        if (num < 0) {
            num = num * -1;
        }
        // if someone even given 0 then
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

}
