package OopsConcepts.interfaces;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        Engine car2 = new Car();

        // here the condtion holds true car2 decides the access to that particular
        // variables & right side new car(); decides which version of that variables it
        // can access

        // car.start();
        // car.stop();
        // car.acc();
        // Media carMedia = new Car();
        // carMedia.stop();
        // here the media interface also has stop and also car interface also has stop

        NiceCar car3 = new NiceCar();
        car3.start();
        car3.startMusic();
        car3.upgradeEngine();
        car3.start();
    }

}
