package learn.file.opertaion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("example.txt");
			int character;
			
			while((character = fr.read()) != -1) {
				System.out.print((char)character);
			}
			
			fr.close();			
		} catch (IOException e) {

			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
	}

}
