package print_bigger;

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me two numbers, I'll tell you which one is bigger");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int theBigger = 0;
        if (num1 > num2){
            theBigger = num1;
            System.out.println(theBigger);
        }else if (num1 < num2){
            theBigger = num2;
            System.out.println(theBigger);
        } else if(num1 == num2) {
            System.out.println("They are even");
        }
    }
}
