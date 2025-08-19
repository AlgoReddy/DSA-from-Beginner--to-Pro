package OopsConcepts.oops_PartThree.Inheritence;

public class Test {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(box1);
        System.out.println(box1.h + " " + box1.l + " " + box1.w);
        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.weight + " " + box3.h);
        BoxWeight box4 = new BoxWeight(3, 4, 9, 22);
        // here you can refer the parent ref variable to a child like the boxweight
        // which contains additional extra weight
        // you can only access the box5 content which is already exists in the box like
        // height width length , but not teh weight let's say
        // box5.weight; it will give you error , parent can point out children but can't
        // access the variable that are specific to the children like weight
        Box box5 = new BoxWeight(4, 59, 2, 9);

        /*
         * there are many variable in the both parent and the child classes
         * you are given access to variables that are in the ref type i.e boxweight
         * hence you should access to weight variable
         * this also means , that the ones you are trying to access should be
         * initialized
         * but here , when the object is itself a parent class , how will you call the
         * constructor of the child class that's impossible
         * this is why it's giving error , so we can't do this
         */
        // BoxWeight box6 = new Box( 3, 5 , 8 );

        // here i called a constructor which has only weight without super keyword
        // meaning this box 7 inherits the only the default values of each
        BoxWeight box7 = new BoxWeight();
        System.out.println(box7.h + " " + box7.w + " " + box7.h + " " + box7.weight);
        Box box = new BoxWeight();
        //both will produce the same outputff
        box.greeting();
        BoxWeight.greeting();
    }

}
