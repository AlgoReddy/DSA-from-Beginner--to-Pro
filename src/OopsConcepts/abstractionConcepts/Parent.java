package OopsConcepts.abstractionConcepts;

public abstract class Parent {
    abstract  void career (String name);
    abstract  void partner(String name , int age );
    int age ;
    //can we have constructor for the abstract class
    //yes but you have to call using the super keyword in the child classes
    public Parent(int age){
        this.age=age;
    }


}
