package OopsConcepts.oops_PartThree.Inheritence;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }
    @Override
    static void greetings(){
        System.out.println("hey i am in the boxweight class");
    }

    public BoxWeight(double l, double h, double w, double weight) {
        //used to initialize vaues in the present class
        super();
        // super(l,h,w);// call the parent class constructor , anything will do the fine
        this.weight = weight;

    }

}
