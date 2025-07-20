import java.io.*;

class Duck{

}

public class Pond implements Serializable{

    private Duck duck = new Duck();
    public static void main(String[] args) {
        Pond pond = new Pond();

        try {
            FileOutputStream fs = new FileOutputStream("pond.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(pond);
            os.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
