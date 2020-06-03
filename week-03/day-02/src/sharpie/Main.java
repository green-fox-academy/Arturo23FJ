package sharpie;

public class Main {
    public static void main(String[] args) {
        Sharpie s1 = new Sharpie("brown", 23.00f);
        System.out.println("Inkamount before using: " + s1.inkAmount);
        s1.use();
        System.out.println("Inkamount after using: " + s1.inkAmount);
    }
}
