import java.util.ArrayList;

public class Sum {

    public int getSum(ArrayList<Integer> numbers){
        if (numbers == null){
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }
}
