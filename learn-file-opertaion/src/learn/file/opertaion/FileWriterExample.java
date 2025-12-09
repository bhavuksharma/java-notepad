package learn.file.opertaion;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {

		try {
			FileWriter fr = new FileWriter("example.txt");
			
			fr.write("This the FileWriter Example.\n");
			fr.write("Happy New Year 2025");
			
			fr.close();
			System.out.println("Successfully written to the file.");
		} catch (IOException e) {

			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
	}

}
