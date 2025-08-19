package OopsConcepts.packages.singleton;

public class Test {
  public static void main(String[] args) {
    //by doing this so we can create mul obj but reference it to only one object
     Singleton obj = Singleton.getInstance();
    Singleton obj1 = Singleton.getInstance();
    Singleton obj2= Singleton.getInstance();

  }







}
