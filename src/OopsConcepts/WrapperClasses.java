package OopsConcepts;

public class WrapperClasses {
    public static void main(String[] args) {
        int a = 39;
        Integer num = new Integer(89);
        // we don't have to create a integer like this ,
        // we can directly use
        Integer num2 = 89;
        System.out.println(num2.equals(num));
        int c = 10, b = 30;
        int temp = c;
        c = b;
        b = temp;

        System.out.println(c + " " + b);
        /*here we are creating a same object again and again which all the references variables are only pointing towards the same object
         * so whenever there is a load on memory & same object is created multiple times
         * the garbage collector comes under destroys those
         * that's why it's showing destroyed when we run
         * it's calls the finalize method in the java
         * Since java 9 the finalize keyword is deprecated , it called automatically you don't need call it manually , even though you can call it manually 
         */
        for (int i = 0; i < 1000000000; i++) {
            A memoryTest = new A("random ");
        }

    }

}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("the object is being destroyed here whenever the there is a load on the memory ");
    }
}
