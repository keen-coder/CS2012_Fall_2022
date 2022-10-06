package shapes;

//Super class / Parent Class
public class GeometricObject {
	
	protected String color = "white";
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
	//GeometricObject geo1, geo2;
	//geo1.equals(geo2);
	public boolean equals(Object obj) {
		//Make sure obj is not null
		if (obj == null) {
			return false;
		}
		
		//Verify data type of obj
		if(!(obj instanceof GeometricObject) ) {
			return false;
		}
		
		//Cast to the correct type
		GeometricObject temp = (GeometricObject)obj;
		
		boolean sameColor = this.color.equals(temp.color);
		boolean sameFilled = this.filled == temp.filled;
		boolean sameDate = this.dateCreated.equals(temp.dateCreated);
		
		return sameColor && sameFilled && sameDate;
	}
	
	
	
	
	
	
	
	@Override
	public String toString() {
		String result = "color:\t" + this.color + "\n";
		result += "filled:\t" + this.filled + "\n";
		result += "date:\t" + this.dateCreated;
	
		return result;
	}
	
	
	
	
	
	
	
	

}

