import java.io.*;

public class ReadAFile {
    public static void main(String[] args) {
        File file = new File("MyText.txt");
        
        if(file.exists()){
            try {
                FileReader fr = new FileReader(file);
                BufferedReader reader = new BufferedReader(fr);

                String line;
                while ((line = reader.readLine())  != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    
        }
    }
}
