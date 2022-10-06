package book_examples;

import shapes.Circle;
import shapes.GeometricObject;
import shapes.Rectangle;

public class PolymorphismDemo {
	/** Main method */
	public static void main(String[] args) {
		// Display circle and rectangle properties
		displayObject(new Circle("red", false, 1));
		displayObject(new Rectangle("black", true, 1, 1));
	}

	/** Display geometric object properties */
	public static void displayObject(GeometricObject object) {
		System.out.println("Created on " + object.getDateCreated() +
				". Color is " + object.getColor());
	}
}
