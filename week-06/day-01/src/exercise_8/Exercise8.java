package exercise_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {

    public static void main(String[] args) {
        List<Character> characterList = Arrays.asList('F', 'i', 'n', 'e');
        String text = "Fino alla ";

        System.out.println(text + characterList.stream().map(c -> c.toString()).collect(Collectors.joining()));
    }
}
