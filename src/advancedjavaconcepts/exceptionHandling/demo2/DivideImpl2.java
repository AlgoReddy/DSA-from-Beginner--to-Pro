//package advancedjavaconcepts.exceptionhandling.demo2;

import advancedjavaconcepts.exceptionhandling.simpletry.basic;

public class DivideImpl2 implements basic {
    @Override
    public void divide(Integer... array) {
        try {

            int quotient = 0;
            quotient = array[0] / array[1];
            System.out.println("quotient of " + array[0] + "quotient of " + array[1] + "is" + quotient);
        }catch(ArithmeticException yashException){
            yashException.printStackTrace();
            yashException.printStackTrace();


        }

    }

}
