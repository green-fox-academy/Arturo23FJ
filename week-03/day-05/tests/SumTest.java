import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    public void verifyingSum(){
        Sum sum = new Sum();
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8, 10, 23));
        assertEquals(57, sum.getSum(numbers));
    }

    @Test
    public void sumWithEmptyList(){
        Sum sum = new Sum();
        ArrayList<Integer> numbers = new ArrayList<>();
        assertEquals(0, sum.getSum(numbers));
    }

    @Test
    public void sumWithOneElementInTheList(){
        Sum sum = new Sum();
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3));
        assertEquals(3, sum.getSum(numbers));
    }

    @Test
    public void sumWithNullInTheList(){
        Sum sum = new Sum();
        ArrayList<Integer> numbers = null;
        assertEquals(0, sum.getSum(numbers));
    }
}