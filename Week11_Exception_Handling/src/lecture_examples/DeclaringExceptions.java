package lecture_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DeclaringExceptions {

	public static void main(String[] args) {

		try {
			Scanner in = new Scanner(new File(""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	/* The Exception declaration (throws) not required for unchecked exceptions.
	 * But is best practice to always declare your exceptions.
	 */
	public static void myUncheckedExceptionMethod() throws IllegalStateException {
		if(true) {
			throw new IllegalStateException();
		}
		
	}


	public static void myCheckedExceptionMethod() throws FileNotFoundException {
		if(true) {
			throw new FileNotFoundException("Where did the file go?");
		}

	}

}
