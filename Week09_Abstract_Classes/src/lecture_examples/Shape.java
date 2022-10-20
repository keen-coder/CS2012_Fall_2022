package lecture_examples;

import java.util.Date;

//Parent of all shapes
public abstract class Shape {
	private String color;
	private Date dateCreated;
	private boolean filled;
	
	protected Shape() {
		this.color = "grey";
		this.dateCreated = new Date();
		this.filled = false;
	}
	
	protected Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		this.dateCreated = new Date();
	}
	
	public abstract double area();
	
	public abstract double perimeter();
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public boolean isFilled() {
		return this.filled;
	}
	
	@Override
	public String toString() {
		return "Color: " + this.color + "\n" +
				"Date Created: " + this.dateCreated + "\n" +
				"filled: " + this.filled;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
