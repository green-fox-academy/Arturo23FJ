package personal_finance;

import java.util.ArrayList;
import java.util.List;

public class PersonalFinance {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(500);
        numbers.add(1000);
        numbers.add(1250);
        numbers.add(175);
        numbers.add(800);
        numbers.add(120);

        System.out.println(howMuchDidWeSpend(numbers));
        System.out.println(ourGreatestExpense(numbers));
        System.out.println(ourCheapestExpense(numbers));
        System.out.println(averageSpending(numbers));
    }

    public static int howMuchDidWeSpend(List<Integer> list){
        int spent = 0;
        for (int i = 0; i < list.size(); i++) {
            spent += list.get(i);
        }
        return spent;
    }

    public static int ourGreatestExpense(List<Integer> list){
        int greatest = 0;
        for (int i = 0; i < list.size(); i++) {
            if (greatest < list.get(i)){
                greatest = list.get(i);
            }
        }
        return greatest;
    }

    public static int ourCheapestExpense(List<Integer> list){
        int cheapest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (cheapest > list.get(i)){
                cheapest = list.get(i);
            }
        }
        return cheapest;
    }

    public static double averageSpending(List<Integer> list){
        double avg = 0;
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        avg = sum / list.size();
        return avg;
    }
}
