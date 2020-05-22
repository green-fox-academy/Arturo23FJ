package guees_the_number;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int myNumber = 23;

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess my number!");
        int userNumber = 0;

        while (userNumber != myNumber){
            userNumber = sc.nextInt();
            if (userNumber < myNumber){
                System.out.println("The stored number is higher");
            } else if (userNumber > myNumber){
                System.out.println("The stored number is lower");
            } else {
                System.out.println("You found the number: " + myNumber);
            }
        }
    }
}
