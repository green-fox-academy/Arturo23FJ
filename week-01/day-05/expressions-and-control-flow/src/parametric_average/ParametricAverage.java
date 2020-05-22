package parametric_average;

import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        double avg = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the numbers");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
            avg = (double)sum / n;
        }

        System.out.println("Sum: " + sum + ", average: " + avg);
    }
}
