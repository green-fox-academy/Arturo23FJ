package odd_even;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let me check if your number is odd or even");
        int num = sc.nextInt();

        if (num % 2 != 0){
            System.out.println("It's odd");
        } else {
            System.out.println("It's even");
        }
    }
}
