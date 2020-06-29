package exercise_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise10 {

    public static void main(String[] args) {
        List<Fox> foxes = new ArrayList<>();
        foxes.add(new Fox("Vuk", "red", 1));
        foxes.add(new Fox("Axel", "black", 30));
        foxes.add(new Fox("Crash", "orange", 4));
        foxes.add(new Fox("Green Fox", "green", 4));
        foxes.add(new Fox("Fox Company", "green", 10));
        foxes.add(new Fox("Jamie Fox", "black", 40));

        System.out.println("Green fox(es) are: ");
        foxes.stream().filter(fox -> fox.getColor().equals("green")).forEach(fox -> System.out.println(fox));
        System.out.println();
        System.out.println("Green fox(es) with age less than 5 years: ");
        foxes.stream().filter(fox -> fox.getColor().equals("green")).filter(fox -> fox.getAge() < 5)
                .forEach(fox -> System.out.println(fox));
        System.out.println();
        Map<String, Long> foxesByColor = foxes.stream().collect(Collectors.groupingBy(fox -> fox.getColor(), Collectors.counting()));
        foxesByColor.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
