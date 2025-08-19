package OopsConcepts.oops_PartThree.Inheritence;

public class Box {
    double l;
    double h;
    double w;

    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

// ** using the static keyword makes it cannot be overridden 
    static void greeting() {
        System.out.println("Hey! I'm in box : Greetings!");
    }

    // cube
    Box(double side) {
        this.l = side;
        this.h = side;
        this.w = side;
    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the boxƒ");
    }

    public static void main(String[] args) {
        Box.greeting();
    }
}
