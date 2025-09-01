package advancedjavaconcepts.exceptionhandling.demo2;

public class Demo {
    public static void main(String[] args) {
        basic imp = new MultiCatchInSingleLine();
        try {
            System.out.println("---------Scenario 1-----------------");
            imp.divide(10, 5);
            System.out.println("---------Scenario 2-----------------");
            imp.divide(5, 9);
        }catch (ArithmeticException |  ArrayIndexOutOfBoundsException exception) {
            System.out.println(
                    " can't divide the number by the zer0 ");

        } catch (Exception exception) {
            System.out.println("Something Went wrong ");
        }
    }
}
