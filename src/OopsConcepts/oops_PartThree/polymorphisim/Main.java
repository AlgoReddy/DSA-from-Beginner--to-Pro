package OopsConcepts.oops_PartThree.polymorphisim;

public class Main {
    public static void main(String[] args) {

        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        // Square square = new Square();
        shapes.area();
        circle.area();
        triangle.area();
        Shapes square = new Square();
        // void area() {
        //     System.out.println("i 'm in the shapes area ");
        // }
        square.area();  // if you remove those void area in the shape then square .area will throws error 


    }

}
