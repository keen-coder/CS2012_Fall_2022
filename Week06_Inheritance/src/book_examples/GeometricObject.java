package book_examples;

//Super class / Parent Class
public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/** Construct a default geometric object */
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	/** Construct a geometric object with color and filled value */
	public GeometricObject(String color, boolean filled) {
		this.dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor() {
		return color;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}

	/** Return filled. Since filled is boolean,
	 *  the get method is named isFilled */
	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	public double area() {
		return 0.0;
	}
	
	public double perimeter() {
		return 0.0;
	}
	
	@Override
	public String toString() {
		String result = "color:\t" + this.color + "\n";
		result += "filled:\t" + this.filled + "\n";
		result += "date:\t" + this.dateCreated;
	
		return result;
	}

}

