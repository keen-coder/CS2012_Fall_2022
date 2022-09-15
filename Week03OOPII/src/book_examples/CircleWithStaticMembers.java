package book_examples;

public class CircleWithStaticMembers {
	/** The radius of the circle */
	private double radius;

	/** The number of the objects created */
	private static int numberOfObjects = 0;

	/** Construct a circle with radius 1 */
	public CircleWithStaticMembers() {
		radius = 1.0;
		numberOfObjects++;
	}

	/** Construct a circle with a specified radius */
	public CircleWithStaticMembers(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}

	/** Return numberOfObjects */
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	/** Return the area of this circle */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
}

