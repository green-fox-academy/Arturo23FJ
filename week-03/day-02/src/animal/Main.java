package animal;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        System.out.println("a1 thirst before playing: " + a1.thirst);
        System.out.println("a1 hunger before playing: " + a1.hunger);
        a1.play();
        System.out.println("a1 thirst after playing: " + a1.thirst);
        System.out.println("a1 hunger after playing: " + a1.hunger);
        a1.drink();
        a1.eat();
        System.out.println("a1 thirst after drinking: " + a1.thirst);
        System.out.println("a1 hunger after eating: " + a1.hunger);
    }
}
