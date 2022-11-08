package lecture_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingFromTextFiles {

	public static void main(String[] args) {
		//3 ways to make a Scanner to read a file.
		
		//Make a named file object, pass the object to scanner.
		// File colorsFile = new File("src/files/colors.txt");
		// Scanner fileReader = new Scanner(colorsFile);

		//Pass an anonymous File object to Scanner
		// Scanner fileReader = new Scanner(new File("src/files/colors.txt"));
		
		ArrayList<MyColor> colors = new ArrayList<>();
		
		try {
			Scanner fileReader = new Scanner(new File("src/files/colors.txt"));
			
			while(fileReader.hasNextLine()) {
				String nextLine = fileReader.nextLine();
				
				//Create color object, put the object in the ArrayList.
				MyColor color = new MyColor(nextLine);
				colors.add(color);
			}
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
		for (MyColor color : colors) {
			System.out.println(color);
		}	
	}
}