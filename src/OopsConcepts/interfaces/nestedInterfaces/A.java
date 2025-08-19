package OopsConcepts.interfaces.nestedInterfaces;

public class A {
    public interface nestedInterfacesExample {
        boolean isOdd(int a);
    }}

class B implements A.nestedInterfacesExample{

    public boolean isOdd(int a) {
        return (a & 1) == 1;
    }

}
