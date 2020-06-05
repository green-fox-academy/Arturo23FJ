import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    public void getFibonacciIndex(){
        Fibonacci fibonacci = new Fibonacci();
        int[] fibonacciNumbers = {0, 1, 1, 2, 3, 5, 8, 13};
        int fibonacciIndex = fibonacci.getFibonacci(5);
        assertEquals(fibonacciNumbers[5], fibonacciIndex);
    }

    @Test
    public void getFibonacciIndexWithNegative(){
        Fibonacci fibonacci = new Fibonacci();
        int[] fibonacciNumbers = {0, 1, 1, 2, 3, 5, 8, 13};
        int fibonacciIndex = fibonacci.getFibonacci(-10);
        assertEquals(-1, fibonacciIndex);
    }
}