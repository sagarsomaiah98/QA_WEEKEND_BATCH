package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FilenotFound_Ex {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\somai\\OneDrive\\Desktop\\test.txt");
		
		System.out.println("file found");
		
	}

}
