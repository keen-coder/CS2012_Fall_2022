package lecture_examples;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Program demonstrates how to repeatedly ask for the correct
 * user input when the input causes an exception to be thrown.
 */
public class ExceptionHandlingAndContinuousInputRequests {

	public static void main(String[] args) {
		String[] colors = {"red", "blue", "yellow", "orange", "green", "pink", "cyan", "salmon"};
		
		Scanner in = new Scanner(System.in);
		
		boolean isValid = true;
		
		
		do {
			
			try {
				System.out.println("Enter an integer index to choose a color: ");
				int choice = in.nextInt();
				
				System.out.println("Your color: " + colors[choice]);
				isValid = true;
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				
				System.out.println("Chosen index is out of bounds.");
				System.out.println("Choose a value between 0 and " + (colors.length - 1) + " inclusive.");
				
				isValid = false;
			}
			catch(InputMismatchException ex) {
				in.nextLine(); // <- Need to do this in order to clear Scanner's input buffer.  
	               			   // <- Otherwise you will get stuck in an infinite loop.
				
				System.out.println("The value entered must be an integer.");
				isValid = false;
			}

		} while(!isValid);
		
	}

}
