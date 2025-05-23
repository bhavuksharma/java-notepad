import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TestFileHandling {
    public static void main(String[] args) {
        Path filePath = Paths.get("Sample/test/test.txt");
        try {
            Files.createDirectories(filePath.getParent());

            if (!Files.exists(filePath.getFileName())) {
                Files.createFile(filePath);
            }

            FileWriter fw = new FileWriter(filePath.toFile());
            BufferedWriter writer = new BufferedWriter(fw);

            String[] stringArr = {"h","e","l","l","o"};

            for (String string : stringArr) {
                writer.write(string);
            }

            writer.flush();
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



        try {
            FileReader fr = new FileReader(filePath.toFile());
            BufferedReader reader = new BufferedReader(fr);

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.getMessage();
        }
    }
}
