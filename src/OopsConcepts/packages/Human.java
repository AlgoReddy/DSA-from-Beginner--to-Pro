package OopsConcepts.packages;

public class Human {
    public static void main(String[] args) {

    }

}

class sapien {
    String name;
    int age;
    int salary;
    boolean married;
    static long population;

    public sapien(String name, int age, int salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        // here you can use the this .population
        /*it's doesn't make any sense as the when the variable is static it is same for the every object in the class  */
        sapien.population += 1;
    }

}
