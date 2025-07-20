import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePackageExample {
    public static void main(String[] args) {
        File file = new File("MyApp");
        FilePackageExample fpe = new FilePackageExample();
        fpe.saveFile(file);
    }

    private void saveFile(File file){
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(file));

            writer.write("Jai");
            writer.write("Verru");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try {
                writer.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    private void saveFileWithTryResource(File file){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("Jay");
            writer.write("Veeru");
        } catch (Exception e) {
            // TODO: handle exception
            e.getMessage();
        }
    }
}
