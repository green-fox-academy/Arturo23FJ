package sum;

public class Sum {
    public static void main(String[] args) {
        // Create the usual class wrapper and main method on your own.

        // Write a function called `sum` that returns the sum of numbers from zero to the given parameter

        System.out.println(sum(5));
    }

    public static int sum(int until){
        int sumOfNumbers = 0;
        for (int i = 0; i <= until; i++) {
            sumOfNumbers += i;
        }
        return sumOfNumbers;
    }
}
