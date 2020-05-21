package cuboid;

public class Cuboid {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int c = 5;

        int volume = a * b * c;
        int surface = 2 * ((a * b) + (a * c) + (b * c));


        System.out.println(volume);
        System.out.println(surface);
    }
}
