package OopsConcepts.interfaces;

public interface Engine {
    // static so that it's doesn't depend on the objects , as the interface doesn't
    // have any constructor , so no objects means no need of specific price for each
    // , final is because it will be implemented by many people so the value should
    // be same for the all , so final
    static final int PRICE = 7800;

    void start();

    void stop();

    void acc();
}
