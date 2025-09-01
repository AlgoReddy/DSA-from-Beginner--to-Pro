package advancedjavaconcepts.exceptionhandling.throwexception;
public class Demo {
    public static void main(String[] args) {
        basic imp = new MultiCatchInSingleLine();
        System.out.println("---------Scenario 1-----------------");
        imp.divide(10, 5);
        System.out.println("---------Scenario 2-----------------");
        imp.divide(5 , 9);
    }
}
