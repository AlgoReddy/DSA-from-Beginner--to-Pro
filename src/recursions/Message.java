package recursions;

public class Message{
    public static void main(String[] args) {
        messsage();
    }

    static void messsage() {
        System.out.println("hello world");
        messsage2();
    }

    static void messsage2() {
        System.out.println("hello world");
        messsage3();
    }

    static void messsage3() {
        System.out.println("hello world");
        messsage4();

    }

    static void messsage4() {
        System.out.println("hello world");
    }
}
