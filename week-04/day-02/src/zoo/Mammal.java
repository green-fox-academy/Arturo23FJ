package zoo;

public class Mammal extends Animal{
    boolean isDomestic;
    boolean hasFur;

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "pushing miniature versions out";
    }
}
