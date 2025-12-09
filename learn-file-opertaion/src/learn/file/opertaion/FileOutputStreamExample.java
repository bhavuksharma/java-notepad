package learn.file.opertaion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("example.txt");
			String data = "Hello, FileStreams in Java";
			fos.write(data.getBytes());
			
			fos.close();
			System.out.println("Data successfully written to the file");
		} catch (IOException e) {

			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
	}

}
