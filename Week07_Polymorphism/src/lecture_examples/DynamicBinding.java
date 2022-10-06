package lecture_examples;

import shapes.Circle;
import shapes.GeometricObject;
import shapes.Rectangle;

public class DynamicBinding {

	public static void main(String[] args) {
		GeometricObject geo1 = new GeometricObject("blue", true);
		
		//Declared Data Type       Actual Data Type
		GeometricObject geo2 = new Circle("red", true, 6.9);
		GeometricObject geo3 = new Rectangle("red", true, 6.9, 6.3);
		
		System.out.println(geo1.area());
		System.out.println(geo2.area());
		
		
		
		
		
		
		
		
		
		
		
	}

}
