package mile_to_km;

import java.util.Scanner;

public class MileToKm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many miles do you want to convert to km?");
        double mile = sc.nextDouble();
        double km = mile * 0.621371192;

        System.out.println(km);

    }
}
