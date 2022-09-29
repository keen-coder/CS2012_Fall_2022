import java.util.Scanner;

public class ComparingStrings {

	public static void main(String[] args) {
		//DO NOT USE >, <, >=, <=, == !=
		
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = "ja" + "va";
		
		System.out.println(s1 == s2); //true
		System.out.println(s1 == s3); //true false?
		System.out.println(s1 == s4); //false
		
//		Scanner in = new Scanner(System.in);
//		
//		String choice = in.next();
//		
//		if(choice.equalsIgnoreCase("blue")) {
//			System.out.println("choice is blue");
//		}
		
		
		String s5 = "app le";
		String s6 = "orange";
		String s7 = "apple";
		
		System.out.println(s5.compareTo(s6)); //'a' - 'o'
		System.out.println(s6.compareTo(s5)); //'o' - 'a'
		System.out.println(s5.compareTo(s7));
		
		String s8 = "Welcome to Java";
		
		System.out.println(s8.substring(8));
		System.out.println(s8.substring(8, 13));
		
		String s9 = "" + 12345;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
