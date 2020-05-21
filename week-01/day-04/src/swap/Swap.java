package swap;

public class Swap {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;

        int temp1 = a;
        int temp2 = b;

        a = temp2;
        b = temp1;

        System.out.println(a);
        System.out.println(b);
    }
}
