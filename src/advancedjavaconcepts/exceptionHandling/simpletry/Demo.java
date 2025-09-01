package advancedjavaconcepts.exceptionHandling.simpletry;

public class Demo {
    public static void main(String[] args) {
        DivideImpl5 imp = new DivideImpl5();
        System.out.println("---------Scenario 1-----------------");
        imp.divide(10, 5);
        System.out.println("---------Scenario 2-----------------");
        imp.divide(5, 0);
    }
}
