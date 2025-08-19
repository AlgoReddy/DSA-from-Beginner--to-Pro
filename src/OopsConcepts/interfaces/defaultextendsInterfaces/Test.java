package OopsConcepts.interfaces.defaultextendsInterfaces;

public class Test implements A,B {

    @Override
    public void greet() {
        // TODO Auto-generated method stub

    }
    // here we are not overriding the fun in a , but it's automatically implemented as because we use the keyword default
    public static void main(String[] args) {
        Test a = new Test();
        a.fun();
    }


}
