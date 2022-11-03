package lecture_examples;

public class InfoFromExceptions {

	public static void main(String[] args) {

		try {
			myMethod();
		}
		catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		

	}
	
	public static void myMethod() throws NullPointerException {
		throw new NullPointerException("Object not initialized.");
	}

}
