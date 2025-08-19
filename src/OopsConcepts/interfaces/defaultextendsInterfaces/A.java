package OopsConcepts.interfaces.defaultextendsInterfaces ;

public interface A {
   default  void fun(){
    System.out.println("This is the default configuration done by using default keyword in teh interface A , even though it didn't explicitly overidden the fun method in implementing it in test file , you don't get any error ");
   }

}
