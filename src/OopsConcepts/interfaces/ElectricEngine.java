package OopsConcepts.interfaces;

public class ElectricEngine implements Engine {

    @Override
    public void acc() {
        System.out.println("Electric car accelerates");
    }

    @Override
    public void start() {
        System.out.println("Electric car starts ");
    }

    @Override
    public void stop() {
        System.out.println("Electric car stops ");
    }

}
