package OopsConcepts.interfaces;

public class Car implements Brake, Engine, Media {

    @Override
    public void brake() {
        // TODO Auto-generated method stub
        System.out.println("This is how a normal car brakes ");
    }

    @Override
    public void acc() {
        // TODO Auto-generated method stub
        System.out.println("this is hwo you can accelerate the car like a normal one ");

    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("This is how a media player start ");

    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("This is how a media player stops");

    }

}
