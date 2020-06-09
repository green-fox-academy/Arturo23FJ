package zoo;

public abstract class Animal {
    String name;
    int age;
    String gender;
    boolean isPredator;
    int numberOfLegs;

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String breed();
}
