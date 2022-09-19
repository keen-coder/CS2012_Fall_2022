package book_examples;

/*
Demonstrates some basic concepts of Object-Oriented Programming.
 */

public class Circle {
	//Data Fields
    private double radius;

    /*Constructor to make a default circle with a radius of 1.*/
    public Circle() { //default constructor (no-arg constructor)
        this.radius = 1;
    }

    /*Constructor to make a circle with a given radius value.*/
    public Circle(double radius) {
    	//this.radius = radius;
    	this.setRadius(radius);
    }
    
    public double getRadius() {
    	return this.radius;
    }
   
    public void setRadius(double radius) {
    	
    	
    	if (radius < 1) {
    		System.out.println("ERROR: Radius cannot be <= 0.");
    		System.out.println("Radius set to default value of 1.");
    		this.radius = 1;
    	}
    	else {
    		this.radius = radius;
    	}
    }    

    /*Method to return the area of the circle, computed with its respective radius.*/
    public double area() {  	
        return this.radius * this.radius * Math.PI;
    }

    /*Method to return the perimeter of the circle, computed with its respective radius*/
    public double perimeter() {
        return 2 * this.radius * Math.PI;
    }
    
   
}