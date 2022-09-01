package lecture_examples;

import book_examples.Circle;

public class PrimitiveVsReference {

	public static void main(String[] args) {
		int x = 10;
		
		method1(x);
		
		System.out.println(x);
		
		Circle c1 = new Circle(20);
		System.out.println(c1.getRadius());
		method2(c1);
		System.out.println(c1.getRadius());
	}
	
	public static void method2(Circle c2) {
		c2.setRadius(50);
	}
	
	public static void method1(int y) {
		y = 30;
	}

}
