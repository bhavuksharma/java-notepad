import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        // File directory = new File("MyFiles");
        Path directory = Paths.get("MyFiles");

        // if(!directory.exists()){
        //     directory.mkdirs();
        // }

        
        try (BufferedWriter writer = Files.newBufferedWriter(directory.resolve("text.txt"))){
            writer.write("Jai Shree Ram");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
}

}
