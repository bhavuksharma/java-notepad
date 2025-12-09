package learn.file.opertaion;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

	public static void main(String[] args) {

		try {
			FileWriter writer = new FileWriter("example.txt");
			writer.write("Happy New Year 2025");
			writer.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}
