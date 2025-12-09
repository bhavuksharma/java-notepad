package learn.file.opertaion;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) {

		File myFile = new File("example.txt");
		try {
			if(myFile.createNewFile()) {
				System.out.println("File Created: "+ myFile.getName());
				System.out.println("Location for the file is: "+ myFile.getAbsolutePath());
			}
			else {
				System.out.println("File already exists.");
				System.out.println("Location for the file is: "+ myFile.getPath());
				System.out.println("Location for the file is: "+ myFile.getAbsolutePath());
			}
		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}
