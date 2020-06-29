package exercise_9;

import java.util.Map;
import java.util.stream.Collectors;

public class Exercise9 {

    public static void main(String[] args) {
        String text = "Tempus edax rerum";

        System.out.println(text.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())));
    }
}
