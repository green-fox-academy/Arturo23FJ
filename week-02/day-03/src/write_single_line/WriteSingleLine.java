package write_single_line;

import org.w3c.dom.stylesheets.LinkStyle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"
        String myName = "Viktor aka Paul Verlaine";
        String myFile = "my-file.txt" ;

        writeLine(myFile, myName);
    }

    public static void writeLine(String filePath, String content){
        Path path = Paths.get(filePath);

        try(BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.APPEND)){
            writer.newLine();
            writer.append(content);
        } catch (IOException e){
            System.out.println("Unable to write file: my-file.txt");
        }
    }

}
