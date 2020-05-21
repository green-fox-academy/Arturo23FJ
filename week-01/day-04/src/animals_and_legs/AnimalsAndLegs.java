package animals_and_legs;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many chickens does the farmer have?");
        int chickens = sc.nextInt();
        System.out.println("How many pigs does the farmer have?");
        int pigs = sc.nextInt();

        int legs = (chickens * 2) + (pigs * 4);
        System.out.println("The animals have " + legs + " legs");
    }
}
