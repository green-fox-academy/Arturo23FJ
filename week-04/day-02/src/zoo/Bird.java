package zoo;

public class Bird extends Animal{
    boolean itCanFly;
    String colorOfFeather;

    public Bird(String name){
        super(name);
    }

    @Override
    public String breed(){
        return "laying eggs";
    }
}
