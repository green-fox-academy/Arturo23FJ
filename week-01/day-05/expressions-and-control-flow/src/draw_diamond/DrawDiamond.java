package draw_diamond;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int mid = (height + 1) / 2;

        for (int i = 1; i <= mid; i++) {
            for (int j = 1; j <= mid - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (i * 2 - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= mid - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * (mid - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
