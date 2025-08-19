package OopsConcepts.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human yash = new Human(34, "yash ");
Human twin = (Human)yash.clone();
    }
}
