package wrapper_classes;

public class PrimitivesAsObjects {

	public static void main(String[] args) {
		//Every primitive has a object version
		//byte -> Byte
		//short -> Short
		//int -> Integer
		//long -> Long
		//float -> Float
		//double -> Double
		//char -> Character
		//boolean -> Boolean
		
		Integer x = 10;	
		int y = new Integer("57");
		
		Character ch1 = new Character('b');
		char ch2 = 'x';
		
		//Autoboxing / Autounboxing
		
		myMethod(ch1);
		myMethod(ch2);
		
		
		
		
		
		
		
		
		
		
//		int x = new Integer(7);
//		
//		int a = 77;
//		
//		Integer y = a;
//		
//		myMethod(new Character('h'));
//		myMethod('h');
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		//Converting strings to numbers
		//syntax: NumberType.parseNumberType(string);
		
		//Convert a string to an integer
		int x1 = Integer.parseInt("12345");
		double x2 = Double.parseDouble("42.345");
		
		myMethod('c');
		
	}
	
	public static void myMethod(Character ch) {
		
	}
	
	
	
	
	

}
