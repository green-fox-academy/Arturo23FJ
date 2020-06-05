import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

    public int getFibonacci(int index){
        if (index < 0){
            return -1;
        }

        List<Integer> fibonacciNumbers = new ArrayList<>(Arrays.asList(0, 1));
        for (int i = 1; i <= index; i++) {
            int a = fibonacciNumbers.get(i);
            int b = fibonacciNumbers.get(i - 1);
            fibonacciNumbers.add(a + b);
        }
        return fibonacciNumbers.get(index);
    }
}
