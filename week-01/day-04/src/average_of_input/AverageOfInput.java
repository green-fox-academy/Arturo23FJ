package average_of_input;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me 5 numbers to get their average");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
        double num5 = sc.nextDouble();

        double avg = (num1 + num2 + num3 + num4 + num5) / 5;

        System.out.println("Average of the numbers: " + avg);
    }
}
