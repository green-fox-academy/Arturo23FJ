package zoo;

public class Reptile extends Animal{
    boolean hasLegs;
    boolean livesInWater;

    public Reptile(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "laying eggs";
    }
}
