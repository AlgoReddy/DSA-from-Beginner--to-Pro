package OopsConcepts.packages;

public class StaticBlock {
    static int a = 4;
    static int b;
    static {
        // will only run once  , when the first object is created  i.e class is loaded
        System.out.println("im in a static block ");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + StaticBlock.b);
        StaticBlock.b += 3;
        System.out.println(StaticBlock.b);
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
