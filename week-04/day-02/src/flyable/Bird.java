package flyable;

import zoo.Animal;

public class Bird extends Animal implements Flyable{
    boolean itCanFly;
    String colorOfFeather;

    public Bird(String name){
        super(name);
    }

    @Override
    public String breed(){
        return "laying eggs";
    }

    @Override
    public void land() {
        System.out.println("Lands by reaching it's wings");
    }

    @Override
    public void fly() {
        System.out.println("Slices through the air");
    }

    @Override
    public void takeOff() {
        System.out.println("Takes off by waving it's wings");
    }
}
