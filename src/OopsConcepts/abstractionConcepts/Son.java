package OopsConcepts.abstractionConcepts;

public class Son extends Parent{
    public Son (int age){
        // this.age = age;
        super(age);
    }

    @Override
    void career(String name) {
        // TODO Auto-generated method stub
        System.out.println("im going to be greatest scientist ");

    }

    @Override
    void partner(String name, int age) {
        // TODO Auto-generated method stub
        System.out.println("I love "+ name +" "+age);

    }


}
