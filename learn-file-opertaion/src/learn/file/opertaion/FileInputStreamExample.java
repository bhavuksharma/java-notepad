package learn.file.opertaion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("example.txt");
			System.out.println("Reading file content:");
			
			int content;
			while ((content = fis.read()) != -1) {
				System.out.print((char)content);
			}
			
			fis.close();
			
		} catch (IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
		
	}

}
