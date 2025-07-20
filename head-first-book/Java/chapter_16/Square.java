import java.io.*;

public class Square implements Serializable{

    private int width;
    private int height;

    public Square(int theWidth, int theHeight){

        width = theWidth;
        height = theHeight;
    }

    public static void main(String[] args) {
        Square s = new Square(20, 30);

        try {
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(s);
            os.close();
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}