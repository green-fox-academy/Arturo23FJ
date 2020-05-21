package hello_user;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How can I call you?");
        String name = sc.next();

        System.out.println("Hello, " + name + "!");
    }
}
