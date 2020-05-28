package count_lines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.
        String filePath = "my-file.txt";
        lineCounter(filePath);
    }

    public static void lineCounter(String filename){
        Path path = Paths.get(filename);

        try {
            long lines = Files.lines(path).count();
            System.out.println(lines);
        }catch (IOException e){
            System.exit(0);
        }
    }
}
