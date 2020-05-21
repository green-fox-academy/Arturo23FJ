package variable_mutation;

public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a = a + 10;

        System.out.println(a);

        int b = 100;
        b = b - 7;

        System.out.println(b);

        int c = 44;
        c = c * 2;

        System.out.println(c);

        int d = 125;
        d = d / 5;

        System.out.println(d);

        int e = 8;
        e = e * e * e;

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;

        boolean isBigger = f1 > f2;

        System.out.println(isBigger);

        int g1 = 350;
        int g2 = 200;

        boolean isBigger2 = (2 * g2) > g1;

        System.out.println(isBigger2);

        int h = 135798745;

        boolean isDivisor = h % 11 == 0;

        System.out.println(isDivisor);

        int i1 = 10;
        int i2 = 3;

        double squaredi2 = Math.pow(i2, 2);
        double cubedi2 = Math.pow(i2, 3);

        boolean isHigherAndSmaller = i1 > squaredi2 && i1 < cubedi2;

        System.out.println(isHigherAndSmaller);

        int j = 1521;

        boolean isDivideable = (j % 3 == 0) || (j % 5 == 0);

        System.out.println(isDivideable);
    }
}
