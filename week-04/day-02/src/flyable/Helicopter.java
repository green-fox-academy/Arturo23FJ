package flyable;

public class Helicopter extends Vehicle implements Flyable{

    @Override
    public void land() {
        System.out.println("Chopper lands");
    }

    @Override
    public void fly() {
        System.out.println("Chopper flies");
    }

    @Override
    public void takeOff() {
        System.out.println("Chopper takes off");
    }
}
