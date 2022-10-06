package book_examples;

import shapes.Circle;
import shapes.GeometricObject;

public class Main {
	public static void main(String[] args) {
		//Polymorphishm
		//Declared Type            Actual Type
		GeometricObject geo1 = new Circle("blue", true, 9.75);
		
		//Dynamic Binding
		//area() method from Circle used even though the area method in
		//GeometricObject returns 0.0;
		System.out.println(geo1.area());
		
		
		
		
		
		
		
		
		
		
	}
}
