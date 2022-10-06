package lecture_examples;

import java.util.ArrayList;

import shapes.Circle;
import shapes.GeometricObject;
import shapes.Rectangle;

public class PolymorphismTester {

	public static void main(String[] args) {
		ArrayList<GeometricObject> shapes = new ArrayList<>();
		
		shapes.add(new Circle("blue", true, 5.6));
		shapes.add(new Rectangle("red", false, 5, 8));
		shapes.add(new Rectangle("orange", true, 10, 5));
		shapes.add(new Circle("yellow", false, 10.74));
		
		//printShapeColors(shapes);
		printAreas(shapes);
		

	}
	
	public static void printAreas(ArrayList<GeometricObject> list) {
		for(GeometricObject shape : list) {
			System.out.println(shape.area());
		}
	}
	
	public static void printShapeColors(ArrayList<GeometricObject> list) {
		
		for(GeometricObject shape : list) {
			System.out.println(shape.getColor());
		}
		
		
	}
	
	public static void myMethod(SuperClass sc) {
		sc.superMethod();
	}

}
