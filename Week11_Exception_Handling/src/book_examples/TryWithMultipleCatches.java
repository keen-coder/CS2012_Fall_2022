package book_examples;

public class TryWithMultipleCatches {
	public static void main(String[] args) {
		
		try {
			//some code
		}
		catch(StringIndexOutOfBoundsException ex) {
			
		}
		catch(RuntimeException ex) {
			
		}
		catch(Exception ex) {
			
		}
		
		try {
			
		}
		catch(StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException | NullPointerException ex) {
			
		}
		
		
		
		
		
	}
}
