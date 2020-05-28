package divide_by_zero;

public class DivideByZero {
    public static void main(String[] args) {
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0
        try {
            System.out.println(divide(0));
        }catch (ArithmeticException a){
            System.out.println("fail");
        }
    }

    public static int divide(int number){
        int result = 10 / number;
        return result;
    }
}
