import java.util.Scanner;

public class StringsReview {

	public static void main(String[] args) {
		String myString = new String("hello world");
		
		String myString2 = "hello world";
		
		String upper = myString.toUpperCase();
		
		System.out.println(myString);
		System.out.println(upper);
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a character");
		char ch1 = in.next().charAt(0);
		System.out.println(ch1);
		
		

	}

}
