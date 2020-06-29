package exercise_6;

import java.util.List;

public class Exercise6 {

    public static void main(String[] args) {
        String text = "Pain and suffering are always inevitable for a large intelligence and a deep heart. " +
                "The really great men must have great sadness on Earth.";

        text.chars().filter(c -> Character.isUpperCase(c)).forEach(c -> System.out.print((char) c));
    }
}
