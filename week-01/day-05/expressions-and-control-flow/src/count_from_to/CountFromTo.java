package count_from_to;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("The second number should be bigger");
        } else if (num1 < num2){
            for (int i = num1; i < num2; i++) {
                System.out.println(i);
            }
        }
    }
}
