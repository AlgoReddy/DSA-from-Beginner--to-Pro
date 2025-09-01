package advancedjavaconcepts.exceptionHandling.simpletry;

public class DivideImpl5 implements basic {
    @Override
    public void divide(Integer... array) {
        try {

            int quotient = 0;
            quotient = array[0] / array[1];
            System.out.println("quotient of " + array[0] + "quotient of " + array[1] + "is" + quotient);
        } catch (ArithmeticException exception) {
            System.out.println(
                    " can't divide the number by the zer0 ");

        }

    }

}
