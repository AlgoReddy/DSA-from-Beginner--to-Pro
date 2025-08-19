package OopsConcepts.interfaces;

public class PowerEngine implements Engine {

    @Override
    public void acc() {
        System.out.println("this is power engine accelerates");

    }

    @Override
    public void start() {
        System.out.println("This is how the engine starts");
    }

    @Override
    public void stop() {
        System.out.println("This is how the normal car engine stops");
    }

}
