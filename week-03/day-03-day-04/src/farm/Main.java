package farm;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();
        System.out.println("Free slots before breeding: " + farm.freeSlots);
        farm.breed();
    }
}
