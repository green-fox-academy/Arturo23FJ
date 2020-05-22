package draw_square;

import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();

        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= line; j++) {
                if (i >= 2 && j >= 2 && i <= line - 1 && j <= line - 1){
                    System.out.print(" ");
                } else {
                    System.out.print("%");
                }
            }
            System.out.println();
        }
    }
}
