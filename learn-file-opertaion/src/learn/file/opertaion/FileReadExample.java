package learn.file.opertaion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample {

	public static void main(String[] args) {

		try {
		    File myFile = new File("example.txt");
			Scanner scan = new Scanner(myFile);
			System.out.println("Reading from file: "+ myFile.getAbsolutePath());
			while (scan.hasNextLine()) {
				String data = scan.nextLine();
				System.out.println(data);
			}			
			scan.close();
			
		} catch (FileNotFoundException e) {

			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}
