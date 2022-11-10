package lecture_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class WritingDataToFiles {

	public static void main(String[] args) {
		File outFile = new File("src/files/output.txt");
		
		try {
			PrintWriter pw = new PrintWriter(outFile);
			Random r = new Random();
			
			int i = 1;
			
			while(i <= 100) {
				int nextNum = r.nextInt(1001);
				pw.println("the value is: " + nextNum);
				i++;
			}
			pw.flush();
			pw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("All data written to file.");
		
	}

}
