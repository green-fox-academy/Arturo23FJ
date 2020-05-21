package average_of_input;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me 5 numbers to get their average");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();

        double avg = (num1 + num2 + num3 + num4 + num5) / 5;

        System.out.println("Average of the numbers: " + avg);
    }
}
