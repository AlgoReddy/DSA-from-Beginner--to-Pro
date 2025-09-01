package advancedjavaconcepts.exceptionhandling.demo2;

public class DivideImpl implements basic {

    @Override
    public void divide(Integer... array) {
        int quotient = 0;
        quotient = array[0] / array[1];
        System.out.println("quotient of " + array[0] + "quotient of " + array[1] + "is : " + quotient);

    }

}
