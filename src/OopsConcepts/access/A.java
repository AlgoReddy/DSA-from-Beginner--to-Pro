package OopsConcepts.access;

public class A {
    private int num;
     
    public int getNum() {
        return num;
    }

    String name;
    int[] arr;

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        int[] arr = new int[num];
    }

}
