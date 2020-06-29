package exercise_11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Exercise11 {

    public static void main(String[] args) {
        getTenMostCommonWord("miketyson.txt").forEach((k, v) -> System.out.println(k + ":" + v));
    }

    public static Map<String, Long> getTenMostCommonWord(String fileName){
        List<String> lines = new ArrayList<>();
        try{
            lines = Files.readAllLines(Paths.get(fileName));
        } catch(IOException e){
            System.out.println("Something went wrong while reading the file");
            System.exit(1);
        }

        Map<String, Long> firstHundredMostCommonWordsWithFrequency =
                lines.stream().flatMap(line -> Arrays.stream(line.split(" ")))
                        .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
                        .filter(word -> word.length() > 0)
                        .collect(Collectors.groupingBy(word -> word, Collectors.counting())).entrySet().stream()
                        .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())).limit(100)
                        .collect(Collectors.toMap(word -> word.getKey(), word -> word.getValue(), (k, v) ->{
                            throw new IllegalStateException(String.format("Duplicate key %s", k));
                        }, LinkedHashMap:: new));
        return firstHundredMostCommonWordsWithFrequency;
    }
}
