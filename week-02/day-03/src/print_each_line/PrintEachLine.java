package print_each_line;

import org.w3c.dom.stylesheets.LinkStyle;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each line from the file.
        // If the program is unable to read the file (for example it does not exist),
        // then it should print the following error message: "Unable to read file: my-file.txt"
        List<String> lines = new ArrayList<>();
        try{
            Path filePath = Paths.get("my-file.txt");
            lines = Files.readAllLines(filePath);
        }catch (IOException e){
            System.out.println("Unable to read file: my-file.txt");
        }
        for(String line: lines){
            System.out.println(line);
        }
    }
}